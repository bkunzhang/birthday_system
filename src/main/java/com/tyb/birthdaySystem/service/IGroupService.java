package com.tyb.birthdaySystem.service;

import com.tyb.birthdaySystem.bean.Group;

/**
 * 分组服务
 * @author 北辰不落雪
 *
 */
public interface IGroupService {
	//获取分组信息
	public Group getGroup(Group group);
	//添加分组
	public int addGroup(Group group);
	//删除分组
	public int delGroup(Group group);
	//更新分组
	public int upGroup(Group group);
}
