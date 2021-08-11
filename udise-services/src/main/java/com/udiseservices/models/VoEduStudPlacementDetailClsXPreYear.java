package com.udiseservices.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class VoEduStudPlacementDetailClsXPreYear {
	
	@Id
	@Field(value = "_id")
	private String _id;

	@Field(name = "school_id")
	private Integer schoolId;
	
	@Field(name = "ac_year")
	private String acYear;

	@Field(name = "opt_plcmnt_b")
	private String NoStudOptedPlacementBoys;

	@Field(name = "opt_plcmnt_g")
	private String NoStudOptedPlacementGirls;

	@Field(name = "placed_b")
	private String NoStudPlacedBoys;

	@Field(name = "placed_g")
	private String NoStudPlacedGirls;

	@Field(name = "voc_hs_b")
	private String vocatHighSecBoys;

	@Field(name = "voc_hs_g")
	private String vocatHighSecGirls;

	@Field(name = "nonvoc_hs_b")
	private String nonVocatHighSecBoys;

	@Field(name = "nonvoc_hs_g")
	private String nonVocatHighSecGirls;

	@Field(name = "self_emp_b")
	private String numStudSelfEmplBoys;

	@Field(name = "self_emp_g")
	private String numStudSelfEmplGirls;

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

	public String getAcYear() {
		return acYear;
	}

	public void setAcYear(String acYear) {
		this.acYear = acYear;
	}

	public String getNoStudOptedPlacementBoys() {
		return NoStudOptedPlacementBoys;
	}

	public void setNoStudOptedPlacementBoys(String noStudOptedPlacementBoys) {
		NoStudOptedPlacementBoys = noStudOptedPlacementBoys;
	}

	public String getNoStudOptedPlacementGirls() {
		return NoStudOptedPlacementGirls;
	}

	public void setNoStudOptedPlacementGirls(String noStudOptedPlacementGirls) {
		NoStudOptedPlacementGirls = noStudOptedPlacementGirls;
	}

	public String getNoStudPlacedBoys() {
		return NoStudPlacedBoys;
	}

	public void setNoStudPlacedBoys(String noStudPlacedBoys) {
		NoStudPlacedBoys = noStudPlacedBoys;
	}

	public String getNoStudPlacedGirls() {
		return NoStudPlacedGirls;
	}

	public void setNoStudPlacedGirls(String noStudPlacedGirls) {
		NoStudPlacedGirls = noStudPlacedGirls;
	}

	public String getVocatHighSecBoys() {
		return vocatHighSecBoys;
	}

	public void setVocatHighSecBoys(String vocatHighSecBoys) {
		this.vocatHighSecBoys = vocatHighSecBoys;
	}

	public String getVocatHighSecGirls() {
		return vocatHighSecGirls;
	}

	public void setVocatHighSecGirls(String vocatHighSecGirls) {
		this.vocatHighSecGirls = vocatHighSecGirls;
	}

	public String getNonVocatHighSecBoys() {
		return nonVocatHighSecBoys;
	}

	public void setNonVocatHighSecBoys(String nonVocatHighSecBoys) {
		this.nonVocatHighSecBoys = nonVocatHighSecBoys;
	}

	public String getNonVocatHighSecGirls() {
		return nonVocatHighSecGirls;
	}

	public void setNonVocatHighSecGirls(String nonVocatHighSecGirls) {
		this.nonVocatHighSecGirls = nonVocatHighSecGirls;
	}

	public String getNumStudSelfEmplBoys() {
		return numStudSelfEmplBoys;
	}

	public void setNumStudSelfEmplBoys(String numStudSelfEmplBoys) {
		this.numStudSelfEmplBoys = numStudSelfEmplBoys;
	}

	public String getNumStudSelfEmplGirls() {
		return numStudSelfEmplGirls;
	}

	public void setNumStudSelfEmplGirls(String numStudSelfEmplGirls) {
		this.numStudSelfEmplGirls = numStudSelfEmplGirls;
	}
	
	

}
