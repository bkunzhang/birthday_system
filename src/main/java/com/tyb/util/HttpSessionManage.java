package com.tyb.util;

import javax.servlet.http.HttpSession;

import com.tyb.birthdaySystem.bean.User;
/**
 * 用户session的管理
 * @author 北辰不落雪
 *
 */
public class HttpSessionManage {
	private static HttpSession session;
	
	private HttpSessionManage(){
		
	}
	
	public static User getSessionUser(String sessionId){
		if(null!=session.getAttribute(sessionId)){
			return (User) session.getAttribute(sessionId);
		}
		return null;
	}
	
	public static HttpSession putSessionUser(String sessionId,User user){
		session.setAttribute(sessionId,user);
		return session;
	}
}
