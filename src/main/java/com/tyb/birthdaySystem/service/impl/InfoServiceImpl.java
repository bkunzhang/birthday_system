package com.tyb.birthdaySystem.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.tyb.birthdaySystem.bean.Info;
import com.tyb.birthdaySystem.bean.User;
import com.tyb.birthdaySystem.dao.IInfoDao;
import com.tyb.birthdaySystem.dao.IUserDao;
import com.tyb.birthdaySystem.service.IInfoService;
import com.tyb.birthdaySystem.service.IUserService;
import com.tyb.utils.LogCommonUtil;

@Service("infoService")
public class InfoServiceImpl implements IInfoService{
	@Resource
	private IInfoDao infoDao;

	@Override
	public List<Info> getInfo(Info info) {
		return infoDao.getByUserId(info.getInfoFid(), info.getInfoGid());
	}

	@Override
	public int addInfo(Info info) {
		return infoDao.insertSelective(info);
	}

	@Override
	public int delInfo(Info info) {
		return infoDao.deleteByPrimaryKey(info.getInfoId());
	}

	@Override
	public int upInfo(Info info) {
		return infoDao.updateByPrimaryKey(info);
	}

}
