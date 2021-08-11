package com.udiseservices.models;

import org.springframework.data.mongodb.core.mapping.Field;


public class NsqfEnrCasteByTradeAndByJobRole {
	
	@Field(value ="_id")
	private String _id;
	
	@Field(value ="school_id")
	private Integer schoolId;
	
	@Field(value ="udise_sch_code")
	private String udiseSchCode;
	
	@Field(value ="ac_year")
	private String acYear;
	
	@Field(value ="sub_sector_id")
	private String subSectorId;
	
	@Field(value ="sector_no")
	private String sectorNo;
	
	@Field(value ="c9_b")
	private String c9Boys;
	
	@Field(value ="c9_g")
	private String c9Girls;
	
	@Field(value ="c10_b")
	private String c10Boys;
	
	@Field(value ="c10_g")
	private String c10Girls;
	
	@Field(value ="c11_b")
	private String c11Boys;
	
	@Field(value ="c11_g")
	private String c11Girls;
	
	@Field(value ="c12_b")
	private String c12Boys;
	
	@Field(value ="c12_g")
	private String c12Girls;

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

	public String getSubSectorId() {
		return subSectorId;
	}

	public void setSubSectorId(String subSectorId) {
		this.subSectorId = subSectorId;
	}

	public String getSectorNo() {
		return sectorNo;
	}

	public void setSectorNo(String sectorNo) {
		this.sectorNo = sectorNo;
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
	
	


}
