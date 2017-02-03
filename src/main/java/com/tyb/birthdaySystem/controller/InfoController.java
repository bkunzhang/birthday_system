package com.tyb.birthdaySystem.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.tyb.birthdaySystem.bean.Info;
import com.tyb.birthdaySystem.service.IInfoService;
import com.tyb.util.LogCommonUtil;

/**
 * 好友信息管理
 * @author 北辰不落雪
 *
 */
@Controller
@RequestMapping(value = "/info")
public class InfoController extends BaseServlet{
	@Resource
	private IInfoService infoService;
	
	/**
	 * 跳转亲友管理页面(文字)
	 * @param request
	 * @param info
	 * @return
	 */
	@RequestMapping(value = "/toIndex.love", method = {RequestMethod.POST, RequestMethod.GET})
	public String getInfos(HttpServletRequest request, Info info){
		LogCommonUtil.INFO.info("进入亲友管理"+this.getClass());
		String id = request.getSession().getAttribute("id") + "";
		info.setInfoFid(id);
		List<Info> data = infoService.getInfo(info);
		request.setAttribute("data", data);
		return "/pages/birthdayManage/main_birthday_simple"; 
	}
	
	/**
	 * 跳转亲友管理页面(图片)
	 * @param request
	 * @param info
	 * @return
	 */
	@RequestMapping(value = "/InfosPhoto.love", method = {RequestMethod.POST, RequestMethod.GET})
	public String getInfosPhoto(HttpServletRequest request, Info info){
		LogCommonUtil.INFO.info("进入亲友管理(图片)"+this.getClass());
		String id = request.getSession().getAttribute("id") + "";
		info.setInfoFid(id);
		List<Info> data = infoService.getInfo(info);
		request.setAttribute("data", data);
		return "/pages/birthdayManage/main_birthday"; 
	}
	
	@ResponseBody
	@RequestMapping(value = "/getInfo.love", method = {RequestMethod.POST, RequestMethod.GET})
	public Object getInfoById(HttpServletRequest request, String infoId){
		LogCommonUtil.INFO.info("获取亲友信息"+this.getClass());
		Info info = infoService.getInfoById(infoId);
		return JSON.toJSON(info);
	}
	
	@ResponseBody
	@RequestMapping(value = "/updateInfo.love", method = {RequestMethod.POST, RequestMethod.GET})
	public String updateInfoById(HttpServletRequest request, Info info){
		String id = request.getSession().getAttribute("id") + "";
		LogCommonUtil.INFO.info(id+"更新亲友信息"+this.getClass());
		return ""; 
	}
}
