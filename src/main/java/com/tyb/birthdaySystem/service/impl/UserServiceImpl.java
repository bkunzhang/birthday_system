package com.tyb.birthdaySystem.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tyb.birthdaySystem.bean.User;
import com.tyb.birthdaySystem.dao.IUserDao;
import com.tyb.birthdaySystem.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	@Resource
	private IUserDao userDao;
	
	@Override
	public User getUserById(String userId) {
		return userDao.selectByPrimaryKey(userId);
	}

}
