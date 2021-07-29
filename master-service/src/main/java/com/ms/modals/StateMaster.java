package com.ms.modals;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection ="mst_state")
public class StateMaster {
	
	@Id
	@Field(value = "_id")
	private String _id;
	@Field(value = "state_id")
	private String stateId;
	@Field(value = "yearId")
	private String yearId;
	@Field(value = "state_name")
	private String stateName;
	@Field(value ="udise_state_code")
	private String udiseStateCode;
	
	@Field(value ="lgd_state_id")
	private String lgdStateId;
	
	@Field(value ="is_active")
	private String isActive;
	
	@Field(value ="status")
	private String status;
	
	@Field(value ="is_ut")
	private String isUT;
	
	
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIsUT() {
		return isUT;
	}
	public void setIsUT(String isUT) {
		this.isUT = isUT;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}

	public String getStateId() {
		return stateId;
	}
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	public String getYearId() {
		return yearId;
	}
	public void setYearId(String yearId) {
		this.yearId = yearId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getUdiseStateCode() {
		return udiseStateCode;
	}
	public void setUdiseStateCode(String udiseStateCode) {
		this.udiseStateCode = udiseStateCode;
	}
	

}
