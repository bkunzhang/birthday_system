package com.tyb.birthdaySystem.service;

import com.tyb.birthdaySystem.bean.Info;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * InfoMapper数据库操作接口类
 * 
 **/

public interface InfoMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	Info  selectByPrimaryKey ( @Param("id") Long id );

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey ( @Param("id") Long id );

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

}