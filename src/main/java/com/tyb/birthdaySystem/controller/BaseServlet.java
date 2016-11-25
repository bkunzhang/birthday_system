package com.tyb.birthdaySystem.controller;

import javax.servlet.http.HttpServletRequest;

/**
 * 所有控制器父类
 * <p>提供公用方法
 * @author 北辰不落雪
 *
 */
public class BaseServlet {
	
	private static final String polarisToken = "polarisToken";
	
	/**
	 * 防重复提交
	 * @return
	 */
	protected boolean isValidate(HttpServletRequest request) {
		String token = request.getParameter(polarisToken)==null?"":request.getParameter(polarisToken);
		String oldToken  = (String) request.getSession().getAttribute(polarisToken);
		if(token.equals(oldToken)){
			return false;
		}
		request.getSession().setAttribute(polarisToken, token);
		return true;
	}
}
