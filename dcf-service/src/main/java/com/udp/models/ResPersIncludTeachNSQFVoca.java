package com.udp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "")
public class ResPersIncludTeachNSQFVoca {

	@Id
	@Field(value = "_id")
	private String _id;

	@Field(name = "school_id")
	private Integer schoolId;
	
	@Field(name = "nsqf_faculty_id")
	private String nsqfFacultyId;
	
	@Field(name = "udise_sch_code")
	private String udiseSchCode;
	
	@Field(name = "ac_year")
	private String acYear;

	@Field(name = "faculty_code")
	private String facultyCode;

	@Field(name = "name")
	private String name;
	
	@Field(name = "gender")
	private String gender;
	
	@Field(name = "dob")
	private String dob;
	
	@Field(name = "soc_cat")
	private String socCategory;

	@Field(name = "nature_of_appt")
	private String natureOfAppt;

	@Field(name = "qual_acad")
	private String qualAcademic;
	
	@Field(name = "qual_prof")
	private String qualProfessional;
	
	@Field(name = "industry_exp")
	private String industryExperience;
	
	@Field(name = "training_exp")
	private String trainingExperience;

	@Field(name = "class_taught")
	private String classTaught;

	@Field(name = "appt_sec")
	private String appointedSector;
	
	@Field(name = "induc_trg_rcvd")
	private String inducTrgReceived;
	
	@Field(name = "inserv_trg_rcvd")
	private String inservTrgReceived;
	
	@Field(name = "mobile")
	private String mobile;

	@Field(name = "aadhar")
	private String aadhar;
	

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

	public String getNsqfFacultyId() {
		return nsqfFacultyId;
	}

	public void setNsqfFacultyId(String nsqfFacultyId) {
		this.nsqfFacultyId = nsqfFacultyId;
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

	public String getFacultyCode() {
		return facultyCode;
	}

	public void setFacultyCode(String facultyCode) {
		this.facultyCode = facultyCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSocCategory() {
		return socCategory;
	}

	public void setSocCategory(String socCategory) {
		this.socCategory = socCategory;
	}

	public String getNatureOfAppt() {
		return natureOfAppt;
	}

	public void setNatureOfAppt(String natureOfAppt) {
		this.natureOfAppt = natureOfAppt;
	}

	public String getQualAcademic() {
		return qualAcademic;
	}

	public void setQualAcademic(String qualAcademic) {
		this.qualAcademic = qualAcademic;
	}

	public String getQualProfessional() {
		return qualProfessional;
	}

	public void setQualProfessional(String qualProfessional) {
		this.qualProfessional = qualProfessional;
	}

	public String getIndustryExperience() {
		return industryExperience;
	}

	public void setIndustryExperience(String industryExperience) {
		this.industryExperience = industryExperience;
	}

	public String getTrainingExperience() {
		return trainingExperience;
	}

	public void setTrainingExperience(String trainingExperience) {
		this.trainingExperience = trainingExperience;
	}

	public String getClassTaught() {
		return classTaught;
	}

	public void setClassTaught(String classTaught) {
		this.classTaught = classTaught;
	}

	public String getAppointedSector() {
		return appointedSector;
	}

	public void setAppointedSector(String appointedSector) {
		this.appointedSector = appointedSector;
	}

	public String getInducTrgReceived() {
		return inducTrgReceived;
	}

	public void setInducTrgReceived(String inducTrgReceived) {
		this.inducTrgReceived = inducTrgReceived;
	}

	public String getInservTrgReceived() {
		return inservTrgReceived;
	}

	public void setInservTrgReceived(String inservTrgReceived) {
		this.inservTrgReceived = inservTrgReceived;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	
	

}
