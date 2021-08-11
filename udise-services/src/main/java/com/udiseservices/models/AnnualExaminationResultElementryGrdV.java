package com.udiseservices.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "")
public class AnnualExaminationResultElementryGrdV {
	
	@Id
	@Field(value = "_id")
	private String _id;

	@Field(name = "school_id")
	private Integer schoolId;

	@Field(name = "udise_sch_code")
	private String udiseSchCode;

	@Field(name = "ac_year")
	private String acYear;

	@Field(name = "gen_app_b")
	private String genAppearBoysClassV;

	@Field(name = "gen_app_g")
	private String genAppearGirlsClassV;
	
	@Field(name = "obc_app_b")
	private String obcAppearBoysClassV;

	@Field(name = "obc_app_g")
	private String obcAppearGirlsClassV;

	@Field(name = "sc_app_b")
	private String scAppearBoysClassV;

	@Field(name = "sc_app_g")
	private String scAppearGirlsClassV;
	
	@Field(name = "st_app_b")
	private String stAppearBoysClassV;

	@Field(name = "st_app_g")
	private String stAppearGirlsClassV;

	@Field(name = "gen_pass_b")
	private String genPassedBoysClassV;

	@Field(name = "gen_pass_g")
	private String genPassedGirlsClassV;
	
	@Field(name = "obc_pass_b")
	private String obcPassedBoysClassV;

	@Field(name = "obc_pass_g")
	private String obcPassedGirlsClassV;

	@Field(name = "sc_pass_b")
	private String scPassedBoysClassV;

	@Field(name = "sc_pass_g")
	private String scPassedGirlsClassV;
	
	@Field(name = "st_pass_b")
	private String stPassedBoysClassV;

	@Field(name = "st_pass_g")
	private String stPassedGirlsClassV;
	
	@Field(name = "gen_60p_b")
	private String genStudMoreThan60PassedBoysClassV;

	@Field(name = "gen_60p_g")
	private String genStudMoreThan60PassedGirlsClassV;
	
	@Field(name = "obc_60p_b")
	private String obcStudMoreThan60PassedBoysClassV;

	@Field(name = "obc_60p_g")
	private String obcStudMoreThan60PassedGirlsClassV;
	
	@Field(name = "sc_60p_b")
	private String scStudMoreThan60PassedBoysClassV;

	@Field(name = "sc_60p_g")
	private String scStudMoreThan60PassedGirlsClassV;
	
	@Field(name = "st_60p_b")
	private String stStudMoreThan60PassedBoysClassV;

	@Field(name = "st_60p_g")
	private String stStudMoreThan60PassedGirlsClassV;

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

	public String getGenAppearBoysClassV() {
		return genAppearBoysClassV;
	}

	public void setGenAppearBoysClassV(String genAppearBoysClassV) {
		this.genAppearBoysClassV = genAppearBoysClassV;
	}

	public String getGenAppearGirlsClassV() {
		return genAppearGirlsClassV;
	}

	public void setGenAppearGirlsClassV(String genAppearGirlsClassV) {
		this.genAppearGirlsClassV = genAppearGirlsClassV;
	}

	public String getObcAppearBoysClassV() {
		return obcAppearBoysClassV;
	}

	public void setObcAppearBoysClassV(String obcAppearBoysClassV) {
		this.obcAppearBoysClassV = obcAppearBoysClassV;
	}

	public String getObcAppearGirlsClassV() {
		return obcAppearGirlsClassV;
	}

	public void setObcAppearGirlsClassV(String obcAppearGirlsClassV) {
		this.obcAppearGirlsClassV = obcAppearGirlsClassV;
	}

	public String getScAppearBoysClassV() {
		return scAppearBoysClassV;
	}

	public void setScAppearBoysClassV(String scAppearBoysClassV) {
		this.scAppearBoysClassV = scAppearBoysClassV;
	}

	public String getScAppearGirlsClassV() {
		return scAppearGirlsClassV;
	}

	public void setScAppearGirlsClassV(String scAppearGirlsClassV) {
		this.scAppearGirlsClassV = scAppearGirlsClassV;
	}

	public String getStAppearBoysClassV() {
		return stAppearBoysClassV;
	}

	public void setStAppearBoysClassV(String stAppearBoysClassV) {
		this.stAppearBoysClassV = stAppearBoysClassV;
	}

	public String getStAppearGirlsClassV() {
		return stAppearGirlsClassV;
	}

	public void setStAppearGirlsClassV(String stAppearGirlsClassV) {
		this.stAppearGirlsClassV = stAppearGirlsClassV;
	}

	public String getGenPassedBoysClassV() {
		return genPassedBoysClassV;
	}

	public void setGenPassedBoysClassV(String genPassedBoysClassV) {
		this.genPassedBoysClassV = genPassedBoysClassV;
	}

	public String getGenPassedGirlsClassV() {
		return genPassedGirlsClassV;
	}

	public void setGenPassedGirlsClassV(String genPassedGirlsClassV) {
		this.genPassedGirlsClassV = genPassedGirlsClassV;
	}

	public String getObcPassedBoysClassV() {
		return obcPassedBoysClassV;
	}

	public void setObcPassedBoysClassV(String obcPassedBoysClassV) {
		this.obcPassedBoysClassV = obcPassedBoysClassV;
	}

	public String getObcPassedGirlsClassV() {
		return obcPassedGirlsClassV;
	}

	public void setObcPassedGirlsClassV(String obcPassedGirlsClassV) {
		this.obcPassedGirlsClassV = obcPassedGirlsClassV;
	}

	public String getScPassedBoysClassV() {
		return scPassedBoysClassV;
	}

	public void setScPassedBoysClassV(String scPassedBoysClassV) {
		this.scPassedBoysClassV = scPassedBoysClassV;
	}

	public String getScPassedGirlsClassV() {
		return scPassedGirlsClassV;
	}

	public void setScPassedGirlsClassV(String scPassedGirlsClassV) {
		this.scPassedGirlsClassV = scPassedGirlsClassV;
	}

	public String getStPassedBoysClassV() {
		return stPassedBoysClassV;
	}

	public void setStPassedBoysClassV(String stPassedBoysClassV) {
		this.stPassedBoysClassV = stPassedBoysClassV;
	}

	public String getStPassedGirlsClassV() {
		return stPassedGirlsClassV;
	}

	public void setStPassedGirlsClassV(String stPassedGirlsClassV) {
		this.stPassedGirlsClassV = stPassedGirlsClassV;
	}

	public String getGenStudMoreThan60PassedBoysClassV() {
		return genStudMoreThan60PassedBoysClassV;
	}

	public void setGenStudMoreThan60PassedBoysClassV(String genStudMoreThan60PassedBoysClassV) {
		this.genStudMoreThan60PassedBoysClassV = genStudMoreThan60PassedBoysClassV;
	}

	public String getGenStudMoreThan60PassedGirlsClassV() {
		return genStudMoreThan60PassedGirlsClassV;
	}

	public void setGenStudMoreThan60PassedGirlsClassV(String genStudMoreThan60PassedGirlsClassV) {
		this.genStudMoreThan60PassedGirlsClassV = genStudMoreThan60PassedGirlsClassV;
	}

	public String getObcStudMoreThan60PassedBoysClassV() {
		return obcStudMoreThan60PassedBoysClassV;
	}

	public void setObcStudMoreThan60PassedBoysClassV(String obcStudMoreThan60PassedBoysClassV) {
		this.obcStudMoreThan60PassedBoysClassV = obcStudMoreThan60PassedBoysClassV;
	}

	public String getObcStudMoreThan60PassedGirlsClassV() {
		return obcStudMoreThan60PassedGirlsClassV;
	}

	public void setObcStudMoreThan60PassedGirlsClassV(String obcStudMoreThan60PassedGirlsClassV) {
		this.obcStudMoreThan60PassedGirlsClassV = obcStudMoreThan60PassedGirlsClassV;
	}

	public String getScStudMoreThan60PassedBoysClassV() {
		return scStudMoreThan60PassedBoysClassV;
	}

	public void setScStudMoreThan60PassedBoysClassV(String scStudMoreThan60PassedBoysClassV) {
		this.scStudMoreThan60PassedBoysClassV = scStudMoreThan60PassedBoysClassV;
	}

	public String getScStudMoreThan60PassedGirlsClassV() {
		return scStudMoreThan60PassedGirlsClassV;
	}

	public void setScStudMoreThan60PassedGirlsClassV(String scStudMoreThan60PassedGirlsClassV) {
		this.scStudMoreThan60PassedGirlsClassV = scStudMoreThan60PassedGirlsClassV;
	}

	public String getStStudMoreThan60PassedBoysClassV() {
		return stStudMoreThan60PassedBoysClassV;
	}

	public void setStStudMoreThan60PassedBoysClassV(String stStudMoreThan60PassedBoysClassV) {
		this.stStudMoreThan60PassedBoysClassV = stStudMoreThan60PassedBoysClassV;
	}

	public String getStStudMoreThan60PassedGirlsClassV() {
		return stStudMoreThan60PassedGirlsClassV;
	}

	public void setStStudMoreThan60PassedGirlsClassV(String stStudMoreThan60PassedGirlsClassV) {
		this.stStudMoreThan60PassedGirlsClassV = stStudMoreThan60PassedGirlsClassV;
	}


}
