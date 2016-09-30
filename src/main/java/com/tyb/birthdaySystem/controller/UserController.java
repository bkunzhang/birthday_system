package com.tyb.birthdaySystem.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tyb.birthdaySystem.bean.User;
import com.tyb.birthdaySystem.service.IUserService;
import com.tyb.utils.LogCommonUtil;

@Controller
@RequestMapping(value = "/polaris/user")
public class UserController extends BaseServlet{
	
	  @Resource
	  private IUserService userService;
	  
	  @RequestMapping(value = "toIndex", method = {RequestMethod.POST, RequestMethod.GET})
	  public String toIndex(HttpServletRequest request,Model model){
		  LogCommonUtil.INFO.info("进入登录请求"+this.getClass());
			String id = request.getParameter("id");
		    User user = userService.getUserById(id);
		    model.addAttribute("user", user);
		    request.setAttribute("u", user);
		    return "/showUser";
	  }
	  
	  public String login(HttpServletRequest request,User user){
		  LogCommonUtil.INFO.info("进入登录请求");
		  if(1==userService.loginUser(user)){
			  return "/main";
		  }
		  return "";
	  }

}
