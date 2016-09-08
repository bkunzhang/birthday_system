package com.tyb.birthdaySystem.bean;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class Group implements Serializable {

	/****/
	private String grId;

	/****/
	private String grName;

	/****/
	private String uId;

	/****/
	private String isDel;



	public void setGrId(String grId){
		this.grId = grId;
	}

	public String getGrId(){
		return this.grId;
	}

	public void setGrName(String grName){
		this.grName = grName;
	}

	public String getGrName(){
		return this.grName;
	}

	public void setUId(String uId){
		this.uId = uId;
	}

	public String getUId(){
		return this.uId;
	}

	public void setIsDel(String isDel){
		this.isDel = isDel;
	}

	public String getIsDel(){
		return this.isDel;
	}

}
