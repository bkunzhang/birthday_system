package com.tyb.birthdaySystem.bean;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class User implements Serializable {

	/****/
	private String uId;

	/****/
	private String uPhoto;

	/****/
	private String uName;

	/****/
	private String uNick;

	/****/
	private String uPassword;

	/****/
	private String uEmail;

	/****/
	private String uTel;

	/****/
	private String isDel;



	public void setUId(String uId){
		this.uId = uId;
	}

	public String getUId(){
		return this.uId;
	}

	public void setUPhoto(String uPhoto){
		this.uPhoto = uPhoto;
	}

	public String getUPhoto(){
		return this.uPhoto;
	}

	public void setUName(String uName){
		this.uName = uName;
	}

	public String getUName(){
		return this.uName;
	}

	public void setUNick(String uNick){
		this.uNick = uNick;
	}

	public String getUNick(){
		return this.uNick;
	}

	public void setUPassword(String uPassword){
		this.uPassword = uPassword;
	}

	public String getUPassword(){
		return this.uPassword;
	}

	public void setUEmail(String uEmail){
		this.uEmail = uEmail;
	}

	public String getUEmail(){
		return this.uEmail;
	}

	public void setUTel(String uTel){
		this.uTel = uTel;
	}

	public String getUTel(){
		return this.uTel;
	}

	public void setIsDel(String isDel){
		this.isDel = isDel;
	}

	public String getIsDel(){
		return this.isDel;
	}

}
