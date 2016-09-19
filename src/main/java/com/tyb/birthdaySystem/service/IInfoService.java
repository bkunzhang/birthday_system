package com.tyb.birthdaySystem.service;

import com.tyb.birthdaySystem.bean.Info;

/**
 * 联系人服务
 * @author 北辰不落雪
 *
 */
public interface IInfoService {
	//获取分组信息
	public Info getInfo(Info group);
	//添加分组
	public int addInfo(Info group);
	//删除分组
	public int delInfo(Info group);
	//更新分组
	public int upInfo(Info group);
}
