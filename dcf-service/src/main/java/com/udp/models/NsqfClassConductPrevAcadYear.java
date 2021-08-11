package com.udp.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "")
public class NsqfClassConductPrevAcadYear {
	
	@Field(value ="_id")
	private String _id;
	
	@Field(value ="school_id")
	private Integer schoolId;
	
	@Field(value ="udise_sch_code")
	private String udiseSchCode;
	
	@Field(value ="ac_year")
	private String acYear;
	
	@Field(value ="class_type_id")
	private String classTypeId;
	
	@Field(value ="sector_no")
	private String sectorNo;
	
	@Field(value ="c9")
	private String c9;
	
	@Field(value ="c10")
	private String c10;
	
	@Field(value ="c11")
	private String c11;
	
	@Field(value ="c12")
	private String c12;

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

	public String getClassTypeId() {
		return classTypeId;
	}

	public void setClassTypeId(String classTypeId) {
		this.classTypeId = classTypeId;
	}

	public String getSectorNo() {
		return sectorNo;
	}

	public void setSectorNo(String sectorNo) {
		this.sectorNo = sectorNo;
	}

	public String getC9() {
		return c9;
	}

	public void setC9(String c9) {
		this.c9 = c9;
	}

	public String getC10() {
		return c10;
	}

	public void setC10(String c10) {
		this.c10 = c10;
	}

	public String getC11() {
		return c11;
	}

	public void setC11(String c11) {
		this.c11 = c11;
	}

	public String getC12() {
		return c12;
	}

	public void setC12(String c12) {
		this.c12 = c12;
	}
	
	
	
	

}
