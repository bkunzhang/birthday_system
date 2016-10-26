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
@RequestMapping(value = "/user")
public class UserController extends BaseServlet{
	
	  @Resource
	  private IUserService userService;
	  
	  @RequestMapping(value = "toIndex.love", method = {RequestMethod.POST, RequestMethod.GET})
	  public String toIndex(HttpServletRequest request,Model model){
		  LogCommonUtil.INFO.info("进入登录请求"+this.getClass());
			String id = request.getParameter("id");
		    User user = userService.getUserById(id);
		    model.addAttribute("user", user);
		    request.setAttribute("u", user);
		    return "/showUser";
	  }
	  
	  @RequestMapping(value = "login.love")
	  public String login(HttpServletRequest request,User user){
		  LogCommonUtil.INFO.info("进入登录请求");
		  if(isValidate(request)){
			  User userS = userService.loginUser(user);
			  if(userS!=null){
				  request.setAttribute("nickName",userS.getUNick());
				  return "/main";
			  }
		  }
		  else{
			  System.err.println("重复提交");
		  }
		 
		  return "redirect:/pages/userLogin.jsp";
	  }



}
