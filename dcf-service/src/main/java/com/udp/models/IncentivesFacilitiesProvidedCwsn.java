package com.udp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "")
public class IncentivesFacilitiesProvidedCwsn {

	@Id
	@Field(value = "_id")
	private String _id;
	
	@Field(value = "school_id")
	private Integer schoolId;
	
	@Field(value = "udise_sch_code")
	private String udiseSchCode;
	
	@Field(value = "ac_year")
	private String acYear;
	
	@Field(value = "item_id")
	private String itemId;
	
	@Field(value = "tot_ele_b")
	private String totElementaryBoys;
	
	@Field(value = "tot_ele_g")
	private String totElementaryGirls;
	
	@Field(value = "tot_sec_b")
	private String totSecondaryBoys;
	
	@Field(value = "tot_sec_g")
	private String totSecondaryGirls;
	
	@Field(value = "tot_hsec_b")
	private String totHighSecondaryBoys;
	
	@Field(value = "tot_hsec_g")
	private String totHighSecondaryGirls;
	
	@Field(value = "tot_pry_b")
	private String totPrimaryBoys;
	
	@Field(value = "tot_pry_g")
	private String totPrimaryGirls;
	
	@Field(value = "tot_upr_b")
	private String totUpperBoys;
	
	@Field(value = "tot_upr_g")
	private String totUpperrGirls;

	@Field(value = "tot_pre_pri_b")
	private String totPrePrimaryBoys;
	
	@Field(value = "tot_pre_pri_g")
	private String totPrePrimaryGirls;

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

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getTotElementaryBoys() {
		return totElementaryBoys;
	}

	public void setTotElementaryBoys(String totElementaryBoys) {
		this.totElementaryBoys = totElementaryBoys;
	}

	public String getTotElementaryGirls() {
		return totElementaryGirls;
	}

	public void setTotElementaryGirls(String totElementaryGirls) {
		this.totElementaryGirls = totElementaryGirls;
	}

	public String getTotSecondaryBoys() {
		return totSecondaryBoys;
	}

	public void setTotSecondaryBoys(String totSecondaryBoys) {
		this.totSecondaryBoys = totSecondaryBoys;
	}

	public String getTotSecondaryGirls() {
		return totSecondaryGirls;
	}

	public void setTotSecondaryGirls(String totSecondaryGirls) {
		this.totSecondaryGirls = totSecondaryGirls;
	}

	public String getTotHighSecondaryBoys() {
		return totHighSecondaryBoys;
	}

	public void setTotHighSecondaryBoys(String totHighSecondaryBoys) {
		this.totHighSecondaryBoys = totHighSecondaryBoys;
	}

	public String getTotHighSecondaryGirls() {
		return totHighSecondaryGirls;
	}

	public void setTotHighSecondaryGirls(String totHighSecondaryGirls) {
		this.totHighSecondaryGirls = totHighSecondaryGirls;
	}

	public String getTotPrimaryBoys() {
		return totPrimaryBoys;
	}

	public void setTotPrimaryBoys(String totPrimaryBoys) {
		this.totPrimaryBoys = totPrimaryBoys;
	}

	public String getTotPrimaryGirls() {
		return totPrimaryGirls;
	}

	public void setTotPrimaryGirls(String totPrimaryGirls) {
		this.totPrimaryGirls = totPrimaryGirls;
	}

	public String getTotUpperBoys() {
		return totUpperBoys;
	}

	public void setTotUpperBoys(String totUpperBoys) {
		this.totUpperBoys = totUpperBoys;
	}

	public String getTotUpperrGirls() {
		return totUpperrGirls;
	}

	public void setTotUpperrGirls(String totUpperrGirls) {
		this.totUpperrGirls = totUpperrGirls;
	}

	public String getTotPrePrimaryBoys() {
		return totPrePrimaryBoys;
	}

	public void setTotPrePrimaryBoys(String totPrePrimaryBoys) {
		this.totPrePrimaryBoys = totPrePrimaryBoys;
	}

	public String getTotPrePrimaryGirls() {
		return totPrePrimaryGirls;
	}

	public void setTotPrePrimaryGirls(String totPrePrimaryGirls) {
		this.totPrePrimaryGirls = totPrePrimaryGirls;
	}
	
	
	

}
