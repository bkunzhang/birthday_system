package com.tyb.birthdaySystem.service;

import java.util.List;

import com.tyb.birthdaySystem.bean.Info;

/**
 * 联系人服务
 * @author 北辰不落雪
 *
 */
public interface IInfoService {
	//获取好友信息
	public List<Info> getInfo(Info info);
	//添加好友信息
	public int addInfo(Info info);
	//删除好友信息
	public int delInfo(Info info);
	//更新好友信息
	public int upInfo(Info info);
}
