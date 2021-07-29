package com.udiseservices.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "sch_profile_1")
public class SchProfileOne {

	@Id
	@Field(value = "_id")
	private String _id;

	@Field(name = "school_id")
	private String schoolId;

	@Field(name = "udise_sch_code")
	private String udiseSchCode;

	@Field(name = "address")
	private String address;

	@Field(name = "stdcode")
	private String stdcode;

	@Field(name = "phone")
	private String phone;

	@Field(name = "mobile")
	private String mobile;

	@Field(name = "stdcode_resp")
	private String stdcodeResp;

	@Field(name = "phone_resp")
	private String phoneResp;

	@Field(name = "mobile_resp")
	private String mobileResp;

	@Field(name = "website")
	private String website;

	@Field(name = "email")
	private String email;

	@Field(name = "created_by")
	private String createdBy1819;

	@Field(name = "created_time")
	private String createdTime;

	@Field(name = "modified_by")
	private String modifiedBy;

	@Field(name = "modified_time")
	private String modifiedTime;

	@Field(name = "resp_name")
	private String respName;
	
	@Field(name = "ac_year")
	private String acYear;
	
	@Transient
	private String SchName;
	

	public String getSchName() {
		return SchName;
	}

	public void setSchName(String schName) {
		SchName = schName;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}


	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getUdiseSchCode() {
		return udiseSchCode;
	}

	public void setUdiseSchCode(String udiseSchCode) {
		this.udiseSchCode = udiseSchCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStdcode() {
		return stdcode;
	}

	public void setStdcode(String stdcode) {
		this.stdcode = stdcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getStdcodeResp() {
		return stdcodeResp;
	}

	public void setStdcodeResp(String stdcodeResp) {
		this.stdcodeResp = stdcodeResp;
	}

	public String getPhoneResp() {
		return phoneResp;
	}

	public void setPhoneResp(String phoneResp) {
		this.phoneResp = phoneResp;
	}

	public String getMobileResp() {
		return mobileResp;
	}

	public void setMobileResp(String mobileResp) {
		this.mobileResp = mobileResp;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getCreatedBy1819() {
		return createdBy1819;
	}

	public void setCreatedBy1819(String createdBy1819) {
		this.createdBy1819 = createdBy1819;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getRespName() {
		return respName;
	}

	public void setRespName(String respName) {
		this.respName = respName;
	}

	public String getAcYear() {
		return acYear;
	}

	public void setAcYear(String acYear) {
		this.acYear = acYear;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

}
