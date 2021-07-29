package com.udp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection ="mstDistrict")
public class DistrictMaster {
	
	@Id
	@Field(value ="_id")
	private String _id;
	
	@Field(value ="districtId")
	private Integer districtId;
	
	@Field(value ="yearId")
	private String yearId;
	
	@Field(value ="stateId")
	private Integer stateId;
	
	@Field(value ="districtName")
	private String districtName;
	
	@Field(value ="udiseDistrictCode")
	private Integer udiseDistrictCode;
	
	@Field(value ="udiseStateCode")
	private Integer udiseStateCode;
	
	@Field(value ="inityear")
	private String inityear;
	
	@Field(value ="lgdDistrictId")
	private Integer lgdDistrictId;
	
	@Field(value ="lgdStateId")
	private Integer lgdStateId;
	
	@Field(value ="isActive")
	private Integer isActive;
	
	
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public Integer getDistrictId() {
		return districtId;
	}
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}
	public String getYearId() {
		return yearId;
	}
	public void setYearId(String yearId) {
		this.yearId = yearId;
	}
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public Integer getUdiseDistrictCode() {
		return udiseDistrictCode;
	}
	public void setUdiseDistrictCode(Integer udiseDistrictCode) {
		this.udiseDistrictCode = udiseDistrictCode;
	}
	public Integer getUdiseStateCode() {
		return udiseStateCode;
	}
	public void setUdiseStateCode(Integer udiseStateCode) {
		this.udiseStateCode = udiseStateCode;
	}
	public String getInityear() {
		return inityear;
	}
	public void setInityear(String inityear) {
		this.inityear = inityear;
	}
	public Integer getLgdDistrictId() {
		return lgdDistrictId;
	}
	public void setLgdDistrictId(Integer lgdDistrictId) {
		this.lgdDistrictId = lgdDistrictId;
	}
	public Integer getLgdStateId() {
		return lgdStateId;
	}
	public void setLgdStateId(Integer lgdStateId) {
		this.lgdStateId = lgdStateId;
	}
	public Integer getIsActive() {
		return isActive;
	}
	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	} 
	
	
	
	

}
