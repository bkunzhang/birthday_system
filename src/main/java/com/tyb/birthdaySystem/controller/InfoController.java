package com.tyb.birthdaySystem.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String getInfos(HttpServletRequest request, Info info){
		infoService.getInfo(info);	
		return "";
	}
}
