package com.udp.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "")
public class NsqfBasicInfo {

	@Field(value ="_id")
	private String _id;
	
	@Field(value ="school_id")
	private Integer schoolId;
	
	@Field(value ="udise_sch_code")
	private String udiseSchCode;
	
	@Field(value ="ac_year")
	private String acYear;
	
	@Field(value ="nsqf_yn")
	private String nsqfYn;
	
	@Field(value ="voc_course_yn")
	private String vocCourseYn;
	
	@Field(value ="sec1_sub")
	private String sec1Subject;
	
	@Field(value ="sec1_year")
	private String sec1Year;
	
	@Field(value ="sec2_sub")
	private String sec2Subject;
	
	@Field(value ="sec2_year")
	private String sec2Year;

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

	public String getNsqfYn() {
		return nsqfYn;
	}

	public void setNsqfYn(String nsqfYn) {
		this.nsqfYn = nsqfYn;
	}

	public String getVocCourseYn() {
		return vocCourseYn;
	}

	public void setVocCourseYn(String vocCourseYn) {
		this.vocCourseYn = vocCourseYn;
	}

	public String getSec1Subject() {
		return sec1Subject;
	}

	public void setSec1Subject(String sec1Subject) {
		this.sec1Subject = sec1Subject;
	}

	public String getSec1Year() {
		return sec1Year;
	}

	public void setSec1Year(String sec1Year) {
		this.sec1Year = sec1Year;
	}

	public String getSec2Subject() {
		return sec2Subject;
	}

	public void setSec2Subject(String sec2Subject) {
		this.sec2Subject = sec2Subject;
	}

	public String getSec2Year() {
		return sec2Year;
	}

	public void setSec2Year(String sec2Year) {
		this.sec2Year = sec2Year;
	}
	
	
}
