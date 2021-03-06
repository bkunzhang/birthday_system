package com.tyb.birthdaySystem.dao;

import com.tyb.birthdaySystem.bean.Group;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * GroupMapper数据库操作接口类
 * 
 **/

public interface IGroupDao{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	Group  selectByPrimaryKey ( @Param("grId") String id );

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey ( @Param("grId") String id );

	/**
	 * 
	 * 添加
	 * 
	 **/
	int insert( Group record );

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective( Group record );

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective( Group record );

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey ( Group record );

}