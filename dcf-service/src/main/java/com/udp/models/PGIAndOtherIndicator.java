package com.udp.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "sch_pgi_details")
public class PGIAndOtherIndicator {
	
	@Field(value ="_id")
	private String _id;
	
	@Field(value ="school_id")
	private Integer schoolId;
	
	@Field(value ="udise_sch_code")
	private String udiseSchCode;
	
	@Field(value ="ac_year")
	private String acYear;
	
	@Field(value ="tch_adhr_seed")
	private String tchAdhrSeed;
	
	@Field(value ="stu_atndnc_yn")
	private String stuAtndncYn;
	
	@Field(value ="tch_atndnc_yn")
	private String tchAtndncYn;
	
	@Field(value ="sch_eval_yn")
	private String schEvalYn;
	
	@Field(value ="improv_plan_yn")
	private String improvPlanYn;
	
	@Field(value ="sch_pfms_yn")
	private String schPfmsYn;
	

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

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
