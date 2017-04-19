package com.tyb.birthdaySystem.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.tyb.birthdaySystem.dao.IInfoDao;
import com.tyb.birthdaySystem.service.IInfoService;
import com.tyb.birthdaySystem.service.PollScheduService;

/**
 * 轮询调度实现
 * @author 北辰不落雪
 *
 */
@Service("pollScheduService")
public class PollScheduServiceImpl implements PollScheduService{
	
	@Resource
	IInfoDao dao;
	
	@Override
	public void SendBirthdayEmail(Date date) {
		if(date == null){
			throw new NullPointerException();
		}
		/*获取所需要发送的邮件*/
		dao.getInfoByDate(date.getYear()+date.getMonth()+date.getDate()+"");
		/*调用邮件发送工具*/
		
	}
	
}
