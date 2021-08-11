package com.udiseservices.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


public class VocationalTrainingProviders {
	
	@Id
	@Field(value = "_id")
	private String _id;
	

	@Field(name = "udise_sch_code")
	private Integer udiseSchCode;

	@Field(name = "school_id")
	private Integer schoolId;
	
	@Field(name = "sector_no")
	private String sectorNo;
	
	@Field(name = "agency_name")
	private String agencyName;
	
	@Field(name = "ac_year")
	private String acYear;

	@Field(name = "cert_no")
	private String certificationNo;

	@Field(name = "cert_agency")
	private String certificationAgency;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Integer getUdiseSchCode() {
		return udiseSchCode;
	}

	public void setUdiseSchCode(Integer udiseSchCode) {
		this.udiseSchCode = udiseSchCode;
	}

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public String getSectorNo() {
		return sectorNo;
	}

	public void setSectorNo(String sectorNo) {
		this.sectorNo = sectorNo;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getAcYear() {
		return acYear;
	}

	public void setAcYear(String acYear) {
		this.acYear = acYear;
	}

	public String getCertificationNo() {
		return certificationNo;
	}

	public void setCertificationNo(String certificationNo) {
		this.certificationNo = certificationNo;
	}

	public String getCertificationAgency() {
		return certificationAgency;
	}

	public void setCertificationAgency(String certificationAgency) {
		this.certificationAgency = certificationAgency;
	}
	
	

}
