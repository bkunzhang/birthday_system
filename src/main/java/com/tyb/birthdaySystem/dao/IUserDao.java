package com.tyb.birthdaySystem.dao;

import com.tyb.birthdaySystem.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * UserMapper数据库操作接口类
 * 
 **/

public interface IUserDao{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	User  selectByPrimaryKey ( @Param("uId") String id );

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey ( @Param("uId") String id );

	/**
	 * 
	 * 添加
	 * 
	 **/
	int insert( User record );

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective( User record );

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective( User record );

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey ( User record );

}