package com.ms.modals;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection ="mst_loc_municipality")
public class MunicipalityMaster {
	
	@Id
	@Field(value = "_id")
	private String _id;
	
	@Field(value = "municipality_id")
	private String municipalityId;
	
	@Field(value = "district_id")
	private String districtId;
	
	@Field(value = "municipality_name")
	private String municipalityName;
	
	@Field(value ="udise_municipality_code")
	private String udiseMunicipalityCode;
	
	@Field(value = "udise_district_code")
	private String udiseDistrictCode;
	
	@Field(value = "inityear")
	private String inityear;
	
	@Field(value ="is_active")
	private String isActive;

	@Field(value = "school_count")
	private String schoolCount;
	
	@Field(value = "created_by")
	private String createdBy;
	
	@Field(value = "created_time")
	private String createdTime;
	
	@Field(value ="modified_by")
	private String modifiedBy;

	@Field(value = "modified_time")
	private String modifiedTime;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getMunicipalityId() {
		return municipalityId;
	}

	public void setMunicipalityId(String municipalityId) {
		this.municipalityId = municipalityId;
	}

	public String getDistrictId() {
		return districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getMunicipalityName() {
		return municipalityName;
	}

	public void setMunicipalityName(String municipalityName) {
		this.municipalityName = municipalityName;
	}

	public String getUdiseMunicipalityCode() {
		return udiseMunicipalityCode;
	}

	public void setUdiseMunicipalityCode(String udiseMunicipalityCode) {
		this.udiseMunicipalityCode = udiseMunicipalityCode;
	}

	public String getUdiseDistrictCode() {
		return udiseDistrictCode;
	}

	public void setUdiseDistrictCode(String udiseDistrictCode) {
		this.udiseDistrictCode = udiseDistrictCode;
	}

	public String getInityear() {
		return inityear;
	}

	public void setInityear(String inityear) {
		this.inityear = inityear;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getSchoolCount() {
		return schoolCount;
	}

	public void setSchoolCount(String schoolCount) {
		this.schoolCount = schoolCount;
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
