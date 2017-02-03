package com.tyb.birthdaySystem.service;

import java.util.Date;
import java.util.List;

import com.tyb.birthdaySystem.bean.Info;

/**
 * 联系人服务
 * @author 北辰不落雪
 *
 */
public interface IInfoService {
	//获取亲友信息
	public List<Info> getInfo(Info info);
	//添加亲友信息
	public int addInfo(Info info);
	//删除亲友信息
	public int delInfo(Info info);
	//更新亲友信息
	public int upInfo(Info info);
	
	//按照日期获取所有亲友的信息
	public int getInfoByDate(Date date);
	//按照id获取亲友的信息
	Info getInfoById(String infoId);
		
}
