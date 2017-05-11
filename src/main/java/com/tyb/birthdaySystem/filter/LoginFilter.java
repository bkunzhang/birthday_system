package com.tyb.birthdaySystem.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.binary.StringUtils;

import com.tyb.util.LogCommonUtil;

public class LoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		LogCommonUtil.INFO.info("登录过滤启动.........");

	}
	
	/**
	 * 登录过滤
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpSession httpSession = req.getSession();
		String userSession = (String) httpSession.getAttribute("id");
		String path = req.getServletPath()+"";
		
		if (userSession != null) chain.doFilter(request, response); //成功登录
		else if(path.endsWith("userLogin.jsp") || path.endsWith("login.love")) chain.doFilter(request, response);   //登录请求
		else resp.sendRedirect("/polaris/pages/userLogin.jsp");
		
	}

	@Override
	public void destroy() {
		LogCommonUtil.INFO.info("登录过滤销毁.........");
	}

}
