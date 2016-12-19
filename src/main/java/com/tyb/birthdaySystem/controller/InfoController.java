package com.tyb.birthdaySystem.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tyb.birthdaySystem.bean.Info;
import com.tyb.birthdaySystem.service.IInfoService;

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
	
	@RequestMapping(value = "/toIndex.love", method = {RequestMethod.POST, RequestMethod.GET})
	public String getInfos(HttpServletRequest request, Info info){
		String id = request.getSession().getAttribute("id") + "";
		info.setInfoFid(id);
		List<Info> data = infoService.getInfo(info);	
		request.setAttribute("data", data);
		return "/pages/birthdayManage/main_birthday"; 
	}
}
