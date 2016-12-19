package com.tyb.birthdaySystem.service.impl;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
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
	
	/**
	 * 登录
	 */
	@Override
	public User loginUser(User user) {
		LogCommonUtil.INFO.info("登录服务");
		User userS =userDao.findUserByName(user);
		if(userS!=null&&StringUtils.isNotEmpty(userS.getUPassword())){
			if(user.getUPassword().equals(userS.getUPassword()))
				return userS;
			return null;
		}
		return null;
	}

	@Override
	public int logoutUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int registerUser(User user) {
		return userDao.insert(user);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
