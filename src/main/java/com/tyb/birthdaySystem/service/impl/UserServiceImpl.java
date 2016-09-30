package com.tyb.birthdaySystem.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tyb.birthdaySystem.bean.User;
import com.tyb.birthdaySystem.dao.IUserDao;
import com.tyb.birthdaySystem.service.IUserService;
import com.tyb.utils.LogCommonUtil;

@Service("userService")
public class UserServiceImpl implements IUserService{
	@Resource
	private IUserDao userDao;
	
	@Override
	public User getUserById(String userId) {
		return userDao.selectByPrimaryKey(userId);
	}

	@Override
	public int loginUser(User user) {
		LogCommonUtil.INFO.info("登录中.....");
		return userDao.insert(user);
	}

	@Override
	public int logoutUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int registerUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
