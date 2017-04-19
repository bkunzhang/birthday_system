package com.tyb.birthdaySystem.bean;
import java.io.Serializable;


/**
 * 
 * 北辰不落雪
 * 
 **/
@SuppressWarnings("serial")
public class Info implements Serializable {

	/****/
	private String infoId;

	/****/
	private String infoName;

	/****/
	private String infoSex;

	/****/
	private java.util.Date infoBirthday;

	/****/
	private String infoCalendar;

	/****/
	private String infoPhoto;

	/****/
	private String infoRelation;

	/****/
	private String infoGid;

	/****/
	private String infoFid;

	/****/
	private String isDel;

	/****/
	private String infoDes;



	public void setInfoId(String infoId){
		this.infoId = infoId;
	}

	public String getInfoId(){
		return this.infoId;
	}

	public void setInfoName(String infoName){
		this.infoName = infoName;
	}

	public String getInfoName(){
		return this.infoName;
	}

	public void setInfoSex(String infoSex){
		this.infoSex = infoSex;
	}

	public String getInfoSex(){
		return this.infoSex;
	}

	public void setInfoBirthday(java.util.Date infoBirthday){
		this.infoBirthday = infoBirthday;
	}

	public java.util.Date getInfoBirthday(){
		return this.infoBirthday;
	}

	public void setInfoCalendar(String infoCalendar){
		this.infoCalendar = infoCalendar;
	}

	public String getInfoCalendar(){
		return this.infoCalendar;
	}

	public void setInfoPhoto(String infoPhoto){
		this.infoPhoto = infoPhoto;
	}

	public String getInfoPhoto(){
		return this.infoPhoto;
	}

	public void setInfoRelation(String infoRelation){
		this.infoRelation = infoRelation;
	}

	public String getInfoRelation(){
		return this.infoRelation;
	}

	public void setInfoGid(String infoGid){
		this.infoGid = infoGid;
	}

	public String getInfoGid(){
		return this.infoGid;
	}

	public void setInfoFid(String infoFid){
		this.infoFid = infoFid;
	}

	public String getInfoFid(){
		return this.infoFid;
	}

	public void setIsDel(String isDel){
		this.isDel = isDel;
	}

	public String getIsDel(){
		return this.isDel;
	}

	public void setInfoDes(String infoDes){
		this.infoDes = infoDes;
	}

	public String getInfoDes(){
		return this.infoDes;
	}

	@Override
	public String toString() {
		return "Info [infoId=" + infoId + ", infoName=" + infoName
				+ ", infoSex=" + infoSex + ", infoBirthday=" + infoBirthday
				+ ", infoCalendar=" + infoCalendar + ", infoPhoto=" + infoPhoto
				+ ", infoRelation=" + infoRelation + ", infoGid=" + infoGid
				+ ", infoFid=" + infoFid + ", isDel=" + isDel + ", infoDes="
				+ infoDes + "]";
	}
	
	

}
