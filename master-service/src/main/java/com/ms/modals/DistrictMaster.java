package com.ms.modals;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection ="mst_district")
public class DistrictMaster {
	
	@Id
	@Field(value = "_id")
	private String _id;
	
	@Field(value = "district_id")
	private String districtId;
	
	@Field(value = "state_id")
	private String stateId;
	
	@Field(value = "district_name")
	private String districtName;
	
	@Field(value ="udise_district_code")
	private String udiseDistrictCode;
	
	@Field(value ="udise_state_code")
	private String udiseStateCode;
	
	@Field(value = "inityear")
	private String initYear;
	
	@Field(value = "lgd_district_id")
	private String lgdDistrictId;
	
	@Field(value = "lgd_state_id")
	private String lgdStateId;
	
	@Field(value = "is_active")
	private String isActive;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getDistrictId() {
		return districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getUdiseDistrictCode() {
		return udiseDistrictCode;
	}

	public void setUdiseDistrictCode(String udiseDistrictCode) {
		this.udiseDistrictCode = udiseDistrictCode;
	}

	public String getUdiseStateCode() {
		return udiseStateCode;
	}

	public void setUdiseStateCode(String udiseStateCode) {
		this.udiseStateCode = udiseStateCode;
	}

	public String getInitYear() {
		return initYear;
	}

	public void setInitYear(String initYear) {
		this.initYear = initYear;
	}

	public String getLgdDistrictId() {
		return lgdDistrictId;
	}

	public void setLgdDistrictId(String lgdDistrictId) {
		this.lgdDistrictId = lgdDistrictId;
	}

	public String getLgdStateId() {
		return lgdStateId;
	}

	public void setLgdStateId(String lgdStateId) {
		this.lgdStateId = lgdStateId;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	
}
