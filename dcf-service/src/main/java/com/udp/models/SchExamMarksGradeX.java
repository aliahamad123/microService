package com.udp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "sch_Exam_Marks_Class10")
public class SchExamMarksGradeX {
	
	
//	When Item Id  = 1 Then Regular, When Item Id =2 then Non-Regular
//	When marks_range_id  = 1 Then up to 40% 
//	When marks_range_id  = 2 then 41-60%
//	When marks_range_id  = 3 then 61-80%
//	When marks_range_id  = 4 then Above 80%
	
	@Id
	@Field(value = "_id")
	private String _id;

	@Field(name = "school_id")
	private Integer schoolId;

	@Field(name = "udise_sch_code")
	private String udiseSchCode;

	@Field(name = "item_id")
	private String itemId;

	@Field(name = "ac_year")
	private String acYear;
	
	@Field(name = "marks_range_id")
	private String marksRangeId;

	@Field(name = "gen_b")
	private String genBoys;

	@Field(name = "gen_g")
	private String genGirls;
	
	@Field(name = "obc_b")
	private String obcBoys;

	@Field(name = "obc_g")
	private String obcGirls;

	@Field(name = "sc_b")
	private String scBoys;

	@Field(name = "sc_g")
	private String scGirls;
	
	@Field(name = "st_b")
	private String stBoys;

	@Field(name = "st_g")
	private String stGirls;
	

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

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getAcYear() {
		return acYear;
	}

	public void setAcYear(String acYear) {
		this.acYear = acYear;
	}

	public String getMarksRangeId() {
		return marksRangeId;
	}

	public void setMarksRangeId(String marksRangeId) {
		this.marksRangeId = marksRangeId;
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
	
	

}
