package com.udiseservices.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection ="admissionGradeOne")
public class AdmissionGradeOne {
	
	@Id
	@Field(value = "_id")
	private String _id;

	@Field(name = "school_id")
	private Integer schoolId;

	@Field(name = "udise_sch_code")
	private String udiseSchCode;
	
	@Field(name = "ac_year")
	private String acYear;

	@Field(name = "age4_b")
	private String age4Boys;

	@Field(name = "age4_g")
	private String age4Girls;

	@Field(name = "age5_b")
	private String age5Boys;

	@Field(name = "age5_g")
	private String age5Girls;

	@Field(name = "age6_b")
	private String age6Boys;

	@Field(name = "age6_g")
	private String age6Girls;

	@Field(name = "age7_b")
	private String age7Boys;

	@Field(name = "age7_g")
	private String age7Girls;

	@Field(name = "age8_b")
	private String age8Boys;

	@Field(name = "age8_g")
	private String age8Girls;

	@Field(name = "same_sch_b")
	private String sameSchBoys;
	
	@Field(name = "same_sch_g")
	private String sameSchGirls;

	@Field(name = "oth_sch_b")
	private String othSchBoys;

	@Field(name = "oth_sch_g")
	private String othSchGirls;
	
	@Field(name = "tot_admit")
	private String totAdmit;
	
	@Field(name = "c1_b")
	private String c1Boys;
	
	@Field(name = "c1_g")
	private String c1Girls;
	
	@Field(name = "c1_b_r")
	private String c1BoysRept;
	
	@Field(name = "c1_g_r")
	private String c1GirlsRept;

	@Field(name = "anganwadi_b")
	private String anganwadiBoys;

	@Field(name = "anganwadi_g")
	private String anganwadiGirls;
	
	@Field(name = "ppstu_lkg_b")
	private String ppstuLkgBoys;

	@Field(name = "ppstu_lkg_g")
	private String ppstuLkgGirls;
	
	@Field(name = "ppstu_ukg_b")
	private String ppstuUkgBoys;

	@Field(name = "ppstu_ukg_g")
	private String ppstuUkgGirls;
	
	@Field(name = "created_by")
	private String createdBy;

	@Field(name = "created_time")
	private String createdTime;

	@Field(name = "modified_by")
	private String modifiedBy;

	@Field(name = "modified_time")
	private String modifiedTime;
	
	

	
	public String getAcYear() {
		return acYear;
	}

	public void setAcYear(String acYear) {
		this.acYear = acYear;
	}

	public String getTotAdmit() {
		return totAdmit;
	}

	public void setTotAdmit(String totAdmit) {
		this.totAdmit = totAdmit;
	}

	public String getC1Boys() {
		return c1Boys;
	}

	public void setC1Boys(String c1Boys) {
		this.c1Boys = c1Boys;
	}

	public String getC1Girls() {
		return c1Girls;
	}

	public void setC1Girls(String c1Girls) {
		this.c1Girls = c1Girls;
	}

	public String getC1BoysRept() {
		return c1BoysRept;
	}

	public void setC1BoysRept(String c1BoysRept) {
		this.c1BoysRept = c1BoysRept;
	}

	public String getC1GirlsRept() {
		return c1GirlsRept;
	}

	public void setC1GirlsRept(String c1GirlsRept) {
		this.c1GirlsRept = c1GirlsRept;
	}

	public String getPpstuLkgBoys() {
		return ppstuLkgBoys;
	}

	public void setPpstuLkgBoys(String ppstuLkgBoys) {
		this.ppstuLkgBoys = ppstuLkgBoys;
	}

	public String getPpstuLkgGirls() {
		return ppstuLkgGirls;
	}

	public void setPpstuLkgGirls(String ppstuLkgGirls) {
		this.ppstuLkgGirls = ppstuLkgGirls;
	}

	public String getPpstuUkgBoys() {
		return ppstuUkgBoys;
	}

	public void setPpstuUkgBoys(String ppstuUkgBoys) {
		this.ppstuUkgBoys = ppstuUkgBoys;
	}

	public String getPpstuUkgGirls() {
		return ppstuUkgGirls;
	}

	public void setPpstuUkgGirls(String ppstuUkgGirls) {
		this.ppstuUkgGirls = ppstuUkgGirls;
	}

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

	public String getAge4Boys() {
		return age4Boys;
	}

	public void setAge4Boys(String age4Boys) {
		this.age4Boys = age4Boys;
	}

	public String getAge4Girls() {
		return age4Girls;
	}

	public void setAge4Girls(String age4Girls) {
		this.age4Girls = age4Girls;
	}

	public String getAge5Boys() {
		return age5Boys;
	}

	public void setAge5Boys(String age5Boys) {
		this.age5Boys = age5Boys;
	}

	public String getAge5Girls() {
		return age5Girls;
	}

	public void setAge5Girls(String age5Girls) {
		this.age5Girls = age5Girls;
	}

	public String getAge6Boys() {
		return age6Boys;
	}

	public void setAge6Boys(String age6Boys) {
		this.age6Boys = age6Boys;
	}

	public String getAge6Girls() {
		return age6Girls;
	}

	public void setAge6Girls(String age6Girls) {
		this.age6Girls = age6Girls;
	}

	public String getAge7Boys() {
		return age7Boys;
	}

	public void setAge7Boys(String age7Boys) {
		this.age7Boys = age7Boys;
	}

	public String getAge7Girls() {
		return age7Girls;
	}

	public void setAge7Girls(String age7Girls) {
		this.age7Girls = age7Girls;
	}

	public String getAge8Boys() {
		return age8Boys;
	}

	public void setAge8Boys(String age8Boys) {
		this.age8Boys = age8Boys;
	}

	public String getAge8Girls() {
		return age8Girls;
	}

	public void setAge8Girls(String age8Girls) {
		this.age8Girls = age8Girls;
	}

	public String getSameSchBoys() {
		return sameSchBoys;
	}

	public void setSameSchBoys(String sameSchBoys) {
		this.sameSchBoys = sameSchBoys;
	}

	public String getSameSchGirls() {
		return sameSchGirls;
	}

	public void setSameSchGirls(String sameSchGirls) {
		this.sameSchGirls = sameSchGirls;
	}

	public String getOthSchBoys() {
		return othSchBoys;
	}

	public void setOthSchBoys(String othSchBoys) {
		this.othSchBoys = othSchBoys;
	}

	public String getOthSchGirls() {
		return othSchGirls;
	}

	public void setOthSchGirls(String othSchGirls) {
		this.othSchGirls = othSchGirls;
	}

	public String getAnganwadiBoys() {
		return anganwadiBoys;
	}

	public void setAnganwadiBoys(String anganwadiBoys) {
		this.anganwadiBoys = anganwadiBoys;
	}

	public String getAnganwadiGirls() {
		return anganwadiGirls;
	}

	public void setAnganwadiGirls(String anganwadiGirls) {
		this.anganwadiGirls = anganwadiGirls;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	
	

}
