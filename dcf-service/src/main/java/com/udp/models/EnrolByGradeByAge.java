package com.udp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "enrolByGradeByAge")
public class EnrolByGradeByAge {
	
	@Id
	@Field(value = "_id")
	private String _id;

	@Field(name = "school_id")
	private Integer schoolId;

	@Field(name = "udise_sch_code")
	private String udiseSchCode;

	@Field(name = "age_id")
	private String ageId;

	@Field(name = "caste_id")
	private String casteId;

	@Field(name = "cpp_b")
	private String cppBoys;

	@Field(name = "cpp_g")
	private String cppGirls;

	@Field(name = "c1_b")
	private String c1Boys;

	@Field(name = "c1_g")
	private String c1Girls;

	@Field(name = "c2_b")
	private String c2Boys;

	@Field(name = "c2_g")
	private String c2Girls;

	@Field(name = "c3_b")
	private String c3Boys;

	@Field(name = "c3_g")
	private String c3Girls;

	@Field(name = "c4_b")
	private String c4Boys;

	@Field(name = "c4_g")
	private String c4Girls;

	@Field(name = "c5_b")
	private String c5Boys;

	@Field(name = "c5_g")
	private String c5Girls;
	
	@Field(name = "c6_b")
	private String c6Boys;

	@Field(name = "c6_g")
	private String c6Girls;
	
	@Field(name = "c7_b")
	private String c7Boys;

	@Field(name = "c7_g")
	private String c7Girls;
	
	@Field(name = "c8_b")
	private String c8Boys;

	@Field(name = "c8_g")
	private String c8Girls;
	
	@Field(name = "c9_b")
	private String c9Boys;

	@Field(name = "c9_g")
	private String c9Girls;
	
	@Field(name = "c10_b")
	private String c10Boys;

	@Field(name = "c10_g")
	private String c10Girls;
	
	@Field(name = "c11_b")
	private String c11Boys;

	@Field(name = "c11_g")
	private String c11Girls;
	
	@Field(name = "c12_b")
	private String c12Boys;

	@Field(name = "c12_g")
	private String c12Girls;
	
	@Field(name = "modified_by")
	private String modifiedBy;
	
	@Field(name = "modified_time")
	private String modifiedTime;

	@Field(name = "ac_year")
	private String acYear;

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

	public String getAgeId() {
		return ageId;
	}

	public void setAgeId(String ageId) {
		this.ageId = ageId;
	}

	public String getCasteId() {
		return casteId;
	}

	public void setCasteId(String casteId) {
		this.casteId = casteId;
	}

	public String getCppBoys() {
		return cppBoys;
	}

	public void setCppBoys(String cppBoys) {
		this.cppBoys = cppBoys;
	}

	public String getCppGirls() {
		return cppGirls;
	}

	public void setCppGirls(String cppGirls) {
		this.cppGirls = cppGirls;
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

	public String getC2Boys() {
		return c2Boys;
	}

	public void setC2Boys(String c2Boys) {
		this.c2Boys = c2Boys;
	}

	public String getC2Girls() {
		return c2Girls;
	}

	public void setC2Girls(String c2Girls) {
		this.c2Girls = c2Girls;
	}

	public String getC3Boys() {
		return c3Boys;
	}

	public void setC3Boys(String c3Boys) {
		this.c3Boys = c3Boys;
	}

	public String getC3Girls() {
		return c3Girls;
	}

	public void setC3Girls(String c3Girls) {
		this.c3Girls = c3Girls;
	}

	public String getC4Boys() {
		return c4Boys;
	}

	public void setC4Boys(String c4Boys) {
		this.c4Boys = c4Boys;
	}

	public String getC4Girls() {
		return c4Girls;
	}

	public void setC4Girls(String c4Girls) {
		this.c4Girls = c4Girls;
	}

	public String getC5Boys() {
		return c5Boys;
	}

	public void setC5Boys(String c5Boys) {
		this.c5Boys = c5Boys;
	}

	public String getC5Girls() {
		return c5Girls;
	}

	public void setC5Girls(String c5Girls) {
		this.c5Girls = c5Girls;
	}

	public String getC6Boys() {
		return c6Boys;
	}

	public void setC6Boys(String c6Boys) {
		this.c6Boys = c6Boys;
	}

	public String getC6Girls() {
		return c6Girls;
	}

	public void setC6Girls(String c6Girls) {
		this.c6Girls = c6Girls;
	}

	public String getC7Boys() {
		return c7Boys;
	}

	public void setC7Boys(String c7Boys) {
		this.c7Boys = c7Boys;
	}

	public String getC7Girls() {
		return c7Girls;
	}

	public void setC7Girls(String c7Girls) {
		this.c7Girls = c7Girls;
	}

	public String getC8Boys() {
		return c8Boys;
	}

	public void setC8Boys(String c8Boys) {
		this.c8Boys = c8Boys;
	}

	public String getC8Girls() {
		return c8Girls;
	}

	public void setC8Girls(String c8Girls) {
		this.c8Girls = c8Girls;
	}

	public String getC9Boys() {
		return c9Boys;
	}

	public void setC9Boys(String c9Boys) {
		this.c9Boys = c9Boys;
	}

	public String getC9Girls() {
		return c9Girls;
	}

	public void setC9Girls(String c9Girls) {
		this.c9Girls = c9Girls;
	}

	public String getC10Boys() {
		return c10Boys;
	}

	public void setC10Boys(String c10Boys) {
		this.c10Boys = c10Boys;
	}

	public String getC10Girls() {
		return c10Girls;
	}

	public void setC10Girls(String c10Girls) {
		this.c10Girls = c10Girls;
	}

	public String getC11Boys() {
		return c11Boys;
	}

	public void setC11Boys(String c11Boys) {
		this.c11Boys = c11Boys;
	}

	public String getC11Girls() {
		return c11Girls;
	}

	public void setC11Girls(String c11Girls) {
		this.c11Girls = c11Girls;
	}

	public String getC12Boys() {
		return c12Boys;
	}

	public void setC12Boys(String c12Boys) {
		this.c12Boys = c12Boys;
	}

	public String getC12Girls() {
		return c12Girls;
	}

	public void setC12Girls(String c12Girls) {
		this.c12Girls = c12Girls;
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

	public String getAcYear() {
		return acYear;
	}

	public void setAcYear(String acYear) {
		this.acYear = acYear;
	}

	
}
