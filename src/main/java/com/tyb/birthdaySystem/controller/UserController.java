package com.tyb.birthdaySystem.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tyb.birthdaySystem.bean.User;
import com.tyb.birthdaySystem.service.IUserService;
import com.tyb.util.Encryption;
import com.tyb.util.LogCommonUtil;

@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseServlet{
	
	  @Resource
	  private IUserService userService;
	  
	  /**
	   * 跳转首页(个人信息)
	   * @param request
	   * @param model
	   * @param httpSession
	   * @return
	   */
	  @RequestMapping(value = "toIndex.love", method = {RequestMethod.POST, RequestMethod.GET})
	  public String toIndex(HttpServletRequest request,Model model,HttpSession httpSession){
		  LogCommonUtil.INFO.info("用户信息"+this.getClass());
		  try{
			  /*if(null==httpSession.getAttribute("id")){
				  return "/pages/userLogin";
			  }*/
			  User user = userService.getUserById(httpSession.getAttribute("id").toString());
			  model.addAttribute("bean", user);
			 // request.setAttribute("bean", user);
		  }catch(Exception e){
			  model.addAttribute("message", "重新登录吧！！！");
			  return "/public/error";
		  }
		  return "/pages/userManage/showUser";
	  }
	  
	  /**
	   * 登录请求
	   * @param request
	   * @param user
	   * @param httpSession
	   * @return
	   */
	  @RequestMapping(value = "login.love")
	  public String login(HttpServletRequest request,User user,HttpSession httpSession, Model model){
		  LogCommonUtil.INFO.info("进入登录请求");
		  /*如果登录直接跳转首页*/
		  String userSession =  (String) httpSession.getAttribute("id");
		  if(userSession!=null){
			  request.setAttribute("nickName",userService.getUserById(userSession)!=null?userService.getUserById(userSession).getUNick():"黑户");
			  return "/pages/main";
		  }
		  //检测是否存在密码
		  try {
			user.setUPassword(Encryption.Encoder(user.getUPassword(), Encryption.algorithm_SHA256));
		  } catch (NoSuchAlgorithmException | UnsupportedEncodingException | NullPointerException e) {
			 request.setAttribute("message", "密码出错了");
			 return "/pages/userLogin";
		  }
		  
		  //防重复提交
		  if(isValidate(request)){
			  User userS = userService.loginUser(user);
			  if(userS!=null){
				  request.setAttribute("nickName",userS.getUNick());
				  httpSession.setAttribute("id", userS.getUId());
				  return "/pages/main";
			  }
			  else return "/pages/userLogin";
		  }
		  else{
			  request.setAttribute("message", "慢一点，仔细观察世界");
			  return "/public/error";
		  }
		  
	  }
	  
	  /**
	   * 个人信息查询
	   * @param request
	   * @param user
	   * @return
	   */
	  @RequestMapping(value = "userInfo.love")
	  public String userInfo(HttpServletRequest request,User user){
		  LogCommonUtil.INFO.info("个人信息查询...");
		  User userS = userService.loginUser(user);
		  if(userS!=null){
			  request.setAttribute("nickName",userS.getUNick());
			  return "/pages/main";
		  }
	 
		  return "/public/error";
	  }


}
