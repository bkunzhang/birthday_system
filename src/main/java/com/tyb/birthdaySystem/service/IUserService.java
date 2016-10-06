package com.tyb.birthdaySystem.service;

import com.tyb.birthdaySystem.bean.User;
/**
 * 用户服务
 * @author 北辰不落雪
 *
 */
public interface IUserService {
	public User getUserById(String userId);
	//登录
	public User loginUser(User user);
	//注销
	public int logoutUser(User user);
	//注册
	public int registerUser(User user);
	//修改用户信息
	public int updateUser(User user);
}
