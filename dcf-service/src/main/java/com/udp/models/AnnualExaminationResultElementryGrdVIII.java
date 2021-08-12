package com.udp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "sch_Exam_Result_Class8")
public class AnnualExaminationResultElementryGrdVIII {
	
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
	private String genAppearBoysClassVIII;

	@Field(name = "gen_app_g")
	private String genAppearGirlsClassVIII;
	
	@Field(name = "obc_app_b")
	private String obcAppearBoysClassVIII;

	@Field(name = "obc_app_g")
	private String obcAppearGirlsClassVIII;

	@Field(name = "sc_app_b")
	private String scAppearBoysClassVIII;

	@Field(name = "sc_app_g")
	private String scAppearGirlsClassVIII;
	
	@Field(name = "st_app_b")
	private String stAppearBoysClassVIII;

	@Field(name = "st_app_g")
	private String stAppearGirlsClassVIII;

	@Field(name = "gen_pass_b")
	private String genPassedBoysClassVIII;

	@Field(name = "gen_pass_g")
	private String genPassedGirlsClassVIII;
	
	@Field(name = "obc_pass_b")
	private String obcPassedBoysClassVIII;

	@Field(name = "obc_pass_g")
	private String obcPassedGirlsClassVIII;

	@Field(name = "sc_pass_b")
	private String scPassedBoysClassVIII;

	@Field(name = "sc_pass_g")
	private String scPassedGirlsClassVIII;
	
	@Field(name = "st_pass_b")
	private String stPassedBoysClassVIII;

	@Field(name = "st_pass_g")
	private String stPassedGirlsClassVIII;
	
	@Field(name = "gen_60p_b")
	private String genStudMoreThan60PassedBoysClassVIII;

	@Field(name = "gen_60p_g")
	private String genStudMoreThan60PassedGirlsClassVIII;
	
	@Field(name = "obc_60p_b")
	private String obcStudMoreThan60PassedBoysClassVIII;

	@Field(name = "obc_60p_g")
	private String obcStudMoreThan60PassedGirlsClassVIII;
	
	@Field(name = "sc_60p_b")
	private String scStudMoreThan60PassedBoysClassVIII;

	@Field(name = "sc_60p_g")
	private String scStudMoreThan60PassedGirlsClassVIII;
	
	@Field(name = "st_60p_b")
	private String stStudMoreThan60PassedBoysClassVIII;

	@Field(name = "st_60p_g")
	private String stStudMoreThan60PassedGirlsClassVIII;

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

	public String getGenAppearBoysClassVIII() {
		return genAppearBoysClassVIII;
	}

	public void setGenAppearBoysClassVIII(String genAppearBoysClassVIII) {
		this.genAppearBoysClassVIII = genAppearBoysClassVIII;
	}

	public String getGenAppearGirlsClassVIII() {
		return genAppearGirlsClassVIII;
	}

	public void setGenAppearGirlsClassVIII(String genAppearGirlsClassVIII) {
		this.genAppearGirlsClassVIII = genAppearGirlsClassVIII;
	}

	public String getObcAppearBoysClassVIII() {
		return obcAppearBoysClassVIII;
	}

	public void setObcAppearBoysClassVIII(String obcAppearBoysClassVIII) {
		this.obcAppearBoysClassVIII = obcAppearBoysClassVIII;
	}

	public String getObcAppearGirlsClassVIII() {
		return obcAppearGirlsClassVIII;
	}

	public void setObcAppearGirlsClassVIII(String obcAppearGirlsClassVIII) {
		this.obcAppearGirlsClassVIII = obcAppearGirlsClassVIII;
	}

	public String getScAppearBoysClassVIII() {
		return scAppearBoysClassVIII;
	}

	public void setScAppearBoysClassVIII(String scAppearBoysClassVIII) {
		this.scAppearBoysClassVIII = scAppearBoysClassVIII;
	}

	public String getScAppearGirlsClassVIII() {
		return scAppearGirlsClassVIII;
	}

	public void setScAppearGirlsClassVIII(String scAppearGirlsClassVIII) {
		this.scAppearGirlsClassVIII = scAppearGirlsClassVIII;
	}

	public String getStAppearBoysClassVIII() {
		return stAppearBoysClassVIII;
	}

	public void setStAppearBoysClassVIII(String stAppearBoysClassVIII) {
		this.stAppearBoysClassVIII = stAppearBoysClassVIII;
	}

	public String getStAppearGirlsClassVIII() {
		return stAppearGirlsClassVIII;
	}

	public void setStAppearGirlsClassVIII(String stAppearGirlsClassVIII) {
		this.stAppearGirlsClassVIII = stAppearGirlsClassVIII;
	}

	public String getGenPassedBoysClassVIII() {
		return genPassedBoysClassVIII;
	}

	public void setGenPassedBoysClassVIII(String genPassedBoysClassVIII) {
		this.genPassedBoysClassVIII = genPassedBoysClassVIII;
	}

	public String getGenPassedGirlsClassVIII() {
		return genPassedGirlsClassVIII;
	}

	public void setGenPassedGirlsClassVIII(String genPassedGirlsClassVIII) {
		this.genPassedGirlsClassVIII = genPassedGirlsClassVIII;
	}

	public String getObcPassedBoysClassVIII() {
		return obcPassedBoysClassVIII;
	}

	public void setObcPassedBoysClassVIII(String obcPassedBoysClassVIII) {
		this.obcPassedBoysClassVIII = obcPassedBoysClassVIII;
	}

	public String getObcPassedGirlsClassVIII() {
		return obcPassedGirlsClassVIII;
	}

	public void setObcPassedGirlsClassVIII(String obcPassedGirlsClassVIII) {
		this.obcPassedGirlsClassVIII = obcPassedGirlsClassVIII;
	}

	public String getScPassedBoysClassVIII() {
		return scPassedBoysClassVIII;
	}

	public void setScPassedBoysClassVIII(String scPassedBoysClassVIII) {
		this.scPassedBoysClassVIII = scPassedBoysClassVIII;
	}

	public String getScPassedGirlsClassVIII() {
		return scPassedGirlsClassVIII;
	}

	public void setScPassedGirlsClassVIII(String scPassedGirlsClassVIII) {
		this.scPassedGirlsClassVIII = scPassedGirlsClassVIII;
	}

	public String getStPassedBoysClassVIII() {
		return stPassedBoysClassVIII;
	}

	public void setStPassedBoysClassVIII(String stPassedBoysClassVIII) {
		this.stPassedBoysClassVIII = stPassedBoysClassVIII;
	}

	public String getStPassedGirlsClassVIII() {
		return stPassedGirlsClassVIII;
	}

	public void setStPassedGirlsClassVIII(String stPassedGirlsClassVIII) {
		this.stPassedGirlsClassVIII = stPassedGirlsClassVIII;
	}

	public String getGenStudMoreThan60PassedBoysClassVIII() {
		return genStudMoreThan60PassedBoysClassVIII;
	}

	public void setGenStudMoreThan60PassedBoysClassVIII(String genStudMoreThan60PassedBoysClassVIII) {
		this.genStudMoreThan60PassedBoysClassVIII = genStudMoreThan60PassedBoysClassVIII;
	}

	public String getGenStudMoreThan60PassedGirlsClassVIII() {
		return genStudMoreThan60PassedGirlsClassVIII;
	}

	public void setGenStudMoreThan60PassedGirlsClassVIII(String genStudMoreThan60PassedGirlsClassVIII) {
		this.genStudMoreThan60PassedGirlsClassVIII = genStudMoreThan60PassedGirlsClassVIII;
	}

	public String getObcStudMoreThan60PassedBoysClassVIII() {
		return obcStudMoreThan60PassedBoysClassVIII;
	}

	public void setObcStudMoreThan60PassedBoysClassVIII(String obcStudMoreThan60PassedBoysClassVIII) {
		this.obcStudMoreThan60PassedBoysClassVIII = obcStudMoreThan60PassedBoysClassVIII;
	}

	public String getObcStudMoreThan60PassedGirlsClassVIII() {
		return obcStudMoreThan60PassedGirlsClassVIII;
	}

	public void setObcStudMoreThan60PassedGirlsClassVIII(String obcStudMoreThan60PassedGirlsClassVIII) {
		this.obcStudMoreThan60PassedGirlsClassVIII = obcStudMoreThan60PassedGirlsClassVIII;
	}

	public String getScStudMoreThan60PassedBoysClassVIII() {
		return scStudMoreThan60PassedBoysClassVIII;
	}

	public void setScStudMoreThan60PassedBoysClassVIII(String scStudMoreThan60PassedBoysClassVIII) {
		this.scStudMoreThan60PassedBoysClassVIII = scStudMoreThan60PassedBoysClassVIII;
	}

	public String getScStudMoreThan60PassedGirlsClassVIII() {
		return scStudMoreThan60PassedGirlsClassVIII;
	}

	public void setScStudMoreThan60PassedGirlsClassVIII(String scStudMoreThan60PassedGirlsClassVIII) {
		this.scStudMoreThan60PassedGirlsClassVIII = scStudMoreThan60PassedGirlsClassVIII;
	}

	public String getStStudMoreThan60PassedBoysClassVIII() {
		return stStudMoreThan60PassedBoysClassVIII;
	}

	public void setStStudMoreThan60PassedBoysClassVIII(String stStudMoreThan60PassedBoysClassVIII) {
		this.stStudMoreThan60PassedBoysClassVIII = stStudMoreThan60PassedBoysClassVIII;
	}

	public String getStStudMoreThan60PassedGirlsClassVIII() {
		return stStudMoreThan60PassedGirlsClassVIII;
	}

	public void setStStudMoreThan60PassedGirlsClassVIII(String stStudMoreThan60PassedGirlsClassVIII) {
		this.stStudMoreThan60PassedGirlsClassVIII = stStudMoreThan60PassedGirlsClassVIII;
	}
	
	

}
