package com.udp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="MasterState")
public class StateMaster {
	
	@Id
	private String _id;
	private Integer stateId;
	private String yearId;
	private String stateName;
	private String udiseStateCode;
	
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
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
