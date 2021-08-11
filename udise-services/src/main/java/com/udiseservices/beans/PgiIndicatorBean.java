package com.udiseservices.beans;

import org.springframework.data.mongodb.core.mapping.Field;

public class PgiIndicatorBean {
	
	private Integer schoolId;
	private String udiseSchCode;
	private String acYear;
	private String tchAdhrSeed;
	private String stuAtndncYn;
	private String tchAtndncYn;
	private String schEvalYn;
	private String improvPlanYn;
	private String schPfmsYn;
	
	
	public Integer getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
	public String getUdiseSchCode() {
		return udiseSchCode;
	}
	public void setUdiseSchCode(String udiseSchCode) {
		this.udiseSchCode = udiseSchCode;
	}
	public String getAcYear() {
		return acYear;
	}
	public void setAcYear(String acYear) {
		this.acYear = acYear;
	}
	public String getTchAdhrSeed() {
		return tchAdhrSeed;
	}
	public void setTchAdhrSeed(String tchAdhrSeed) {
		this.tchAdhrSeed = tchAdhrSeed;
	}
	public String getStuAtndncYn() {
		return stuAtndncYn;
	}
	public void setStuAtndncYn(String stuAtndncYn) {
		this.stuAtndncYn = stuAtndncYn;
	}
	public String getTchAtndncYn() {
		return tchAtndncYn;
	}
	public void setTchAtndncYn(String tchAtndncYn) {
		this.tchAtndncYn = tchAtndncYn;
	}
	public String getSchEvalYn() {
		return schEvalYn;
	}
	public void setSchEvalYn(String schEvalYn) {
		this.schEvalYn = schEvalYn;
	}
	public String getImprovPlanYn() {
		return improvPlanYn;
	}
	public void setImprovPlanYn(String improvPlanYn) {
		this.improvPlanYn = improvPlanYn;
	}
	public String getSchPfmsYn() {
		return schPfmsYn;
	}
	public void setSchPfmsYn(String schPfmsYn) {
		this.schPfmsYn = schPfmsYn;
	}
	
	
	
	

}
