package com.tyb.birthdaySystem.service;

import java.util.Date;

/**
 * 轮询调度
 * @author 北辰不落雪
 *
 */
public interface PollScheduService {
	
	public void SendBirthdayEmail(Date date);
}
