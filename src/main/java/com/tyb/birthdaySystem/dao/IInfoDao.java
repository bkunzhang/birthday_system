package com.tyb.birthdaySystem.dao;

import java.util.List;
import java.util.Map;

import com.tyb.birthdaySystem.bean.Info;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * InfoMapper数据库操作接口类
 * 
 **/

public interface IInfoDao{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	Info  selectByPrimaryKey ( @Param("infoId") String id );

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey ( @Param("infoId") String id );

	/**
	 * 
	 * 添加
	 * 
	 **/
	int insert( Info record );

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective( Info record );

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective( Info record );

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey ( Info record );
	
	
	/**
	 * 
	 * 根据所属用户、分组查询所有好友
	 * 
	 **/
	List<Info> getByUserId (@Param("infoFid") String userId, @Param("infoGid") String groupId);

}