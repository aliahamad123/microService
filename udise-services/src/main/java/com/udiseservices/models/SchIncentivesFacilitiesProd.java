package com.udiseservices.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection  = "")
public class SchIncentivesFacilitiesProd {
	

	@Id
	@Field(value = "_id")
	private String _id;
	
	@Field(value = "school_id")
	private Integer schoolId;
	
	@Field(value = "udise_sch_code")
	private String udiseSchCode;
	
	@Field(value = "ac_year")
	private String acYear;
	
	@Field(value = "grade_pri_upr")
	private String gradePriUpr;
	
	@Field(value = "incentive_type")
	private String incentiveType;
	
	@Field(value = "gen_b")
	private String genBoys;
	
	@Field(value = "gen_g")
	private String genGirls;
	
	@Field(value = "sc_b")
	private String scBoys;
	
	@Field(value = "sc_g")
	private String scGirls;
	
	@Field(value = "st_b")
	private String stBoys;
	
	@Field(value = "st_g")
	private String stGirls;
	
	@Field(value = "obc_b")
	private String obcBoys;
	
	@Field(value = "obc_g")
	private String obcGirls;
	
	@Field(value = "min_muslim_b")
	private String minMuslimBoys;

	@Field(value = "min_muslim_g")
	private String minMuslimGirls;
	
	@Field(value = "min_oth_b")
	private String minOtherBoys;
	
	@Field(value = "min_oth_g")
	private String minOtherGirls;

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

	public String getGradePriUpr() {
		return gradePriUpr;
	}

	public void setGradePriUpr(String gradePriUpr) {
		this.gradePriUpr = gradePriUpr;
	}

	public String getIncentiveType() {
		return incentiveType;
	}

	public void setIncentiveType(String incentiveType) {
		this.incentiveType = incentiveType;
	}

	public String getGenBoys() {
		return genBoys;
	}

	public void setGenBoys(String genBoys) {
		this.genBoys = genBoys;
	}

	public String getGenGirls() {
		return genGirls;
	}

	public void setGenGirls(String genGirls) {
		this.genGirls = genGirls;
	}

	public String getScBoys() {
		return scBoys;
	}

	public void setScBoys(String scBoys) {
		this.scBoys = scBoys;
	}

	public String getScGirls() {
		return scGirls;
	}

	public void setScGirls(String scGirls) {
		this.scGirls = scGirls;
	}

	public String getStBoys() {
		return stBoys;
	}

	public void setStBoys(String stBoys) {
		this.stBoys = stBoys;
	}

	public String getStGirls() {
		return stGirls;
	}

	public void setStGirls(String stGirls) {
		this.stGirls = stGirls;
	}

	public String getObcBoys() {
		return obcBoys;
	}

	public void setObcBoys(String obcBoys) {
		this.obcBoys = obcBoys;
	}

	public String getObcGirls() {
		return obcGirls;
	}

	public void setObcGirls(String obcGirls) {
		this.obcGirls = obcGirls;
	}

	public String getMinMuslimBoys() {
		return minMuslimBoys;
	}

	public void setMinMuslimBoys(String minMuslimBoys) {
		this.minMuslimBoys = minMuslimBoys;
	}

	public String getMinMuslimGirls() {
		return minMuslimGirls;
	}

	public void setMinMuslimGirls(String minMuslimGirls) {
		this.minMuslimGirls = minMuslimGirls;
	}

	public String getMinOtherBoys() {
		return minOtherBoys;
	}

	public void setMinOtherBoys(String minOtherBoys) {
		this.minOtherBoys = minOtherBoys;
	}

	public String getMinOtherGirls() {
		return minOtherGirls;
	}

	public void setMinOtherGirls(String minOtherGirls) {
		this.minOtherGirls = minOtherGirls;
	}


}
