package com.udiseservices.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class UdiseEnrolReptrByAcademicStreamBean {
	

	private String _id;
	private Integer schoolId;
	private String udiseSchCode;
	private String acYear;
	private String streamId;
	private String casteId;
	private String castevalue;
	private String ec11Boys;
	private String ec11Girls;
	private String ec12Boys;
	private String ec12Girls;
	private String rc11Boys;
	private String rc11Girls;
	private String rc12Boys;
	private String rc12Girls;
	private String modifiedBy;
	private String modifiedTime;
	private String createdTime;
	
	
	
	public String getCastevalue() {
		return castevalue;
	}
	public void setCastevalue(String castevalue) {
		this.castevalue = castevalue;
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
	public String getAcYear() {
		return acYear;
	}
	public void setAcYear(String acYear) {
		this.acYear = acYear;
	}
	public String getStreamId() {
		return streamId;
	}
	public void setStreamId(String streamId) {
		this.streamId = streamId;
	}
	public String getCasteId() {
		return casteId;
	}
	public void setCasteId(String casteId) {
		this.casteId = casteId;
	}
	public String getEc11Boys() {
		return ec11Boys;
	}
	public void setEc11Boys(String ec11Boys) {
		this.ec11Boys = ec11Boys;
	}
	public String getEc11Girls() {
		return ec11Girls;
	}
	public void setEc11Girls(String ec11Girls) {
		this.ec11Girls = ec11Girls;
	}
	public String getEc12Boys() {
		return ec12Boys;
	}
	public void setEc12Boys(String ec12Boys) {
		this.ec12Boys = ec12Boys;
	}
	public String getEc12Girls() {
		return ec12Girls;
	}
	public void setEc12Girls(String ec12Girls) {
		this.ec12Girls = ec12Girls;
	}
	public String getRc11Boys() {
		return rc11Boys;
	}
	public void setRc11Boys(String rc11Boys) {
		this.rc11Boys = rc11Boys;
	}
	public String getRc11Girls() {
		return rc11Girls;
	}
	public void setRc11Girls(String rc11Girls) {
		this.rc11Girls = rc11Girls;
	}
	public String getRc12Boys() {
		return rc12Boys;
	}
	public void setRc12Boys(String rc12Boys) {
		this.rc12Boys = rc12Boys;
	}
	public String getRc12Girls() {
		return rc12Girls;
	}
	public void setRc12Girls(String rc12Girls) {
		this.rc12Girls = rc12Girls;
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
	public String getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	
	
}
