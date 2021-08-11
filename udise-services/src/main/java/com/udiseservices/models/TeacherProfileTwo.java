package com.udiseservices.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//@Document(collection = "teacher_profile_2")
@Document(collection = "full_teacher")
public class TeacherProfileTwo {
	
	@Id
	@Field(value = "_id")
	private String _id;

	@Field(name = "school_id")
	private Integer schoolId;
	
	@Field(name = "ac_year")
	private String acYear;

	@Field(name = "udise_sch_code")
	private String udiseSchCode;

	@Field(name = "teacher_id")
	private String teacherId;

	@Field(name = "tch_code_state")
	private String tchCodeState;

	@Field(name = "tch_code")
	private String tchCode;

	@Field(name = "name")
	private String name;

	@Field(name = "gender")
	private String gender;

	@Field(name = "dob")
	private String dob;

	@Field(name = "social_cat")
	private String socialCategory;

	@Field(name = "tch_type")
	private String tchType;

	@Field(name = "nature_of_appt")
	private String natureOfAppointment;

	@Field(name = "doj_service")
	private String dateOfjoiningService;

	@Field(name = "qual_acad")
	private String qualificationAcad;

	@Field(name = "qual_prof")
	private String qualificationProf;

	@Field(name = "class_taught")
	private String classTaught;

	@Field(name = "appt_sub")
	private String appointedSub;

	@Field(name = "sub_taught1")
	private String subTaught1;

	@Field(name = "sub_taught2")
	private String subTaught2;

	@Field(name = "trn_brc")
	private String trnBrc;

	@Field(name = "trn_crc")
	private String trnCrc;

	@Field(name = "trn_diet")
	private String trnDiet;

	@Field(name = "trn_other")
	private String trnOther;

	@Field(name = "trng_needed")
	private String trngNeeded;

	@Field(name = "nontch_days")
	private String nonTeacherWorkingDays;

	@Field(name = "math_upto")
	private String mathUpto;

	@Field(name = "science_upto")
	private String scienceUpto;

	@Field(name = "english_upto")
	private String englishUpto;

	@Field(name = "soc_study_upto")
	private String socStudyUpto;

	@Field(name = "yoj_pres_sch")
	private String yearOfjoiningPresentSch;

	@Field(name = "disability_type")
	private String disabilityType;

	@Field(name = "trained_cwsn")
	private String trainedCwsn;

	@Field(name = "trained_comp")
	private String trainedComp;

	@Field(name = "email")
	private String email;

	@Field(name = "mobile")
	private String mobile;

	@Field(name = "trng_rcvd")
	private String trngRcvd;

	@Field(name = "lang_study_upto")
	private String langStudyUpto;

	@Field(name = "is_valid")
	private String isValid;

	@Field(name = "add_record_flag")
	private String addRecordFlag;

	@Field(name = "doj_service_2")
	private String dojService2;

	@Field(name = "tch_type_national")
	private String tchTypeNational;

	@Field(name = "state_id")
	private String stateId;
	
	@Field(name = "created_by")
	private String createdBy;

	@Field(name = "created_time")
	private String createdTime;

	@Field(name = "modified_by")
	private String modifiedBy;

	@Field(name = "modified_time")
	private String modifiedTime;
	
	

	public String getAcYear() {
		return acYear;
	}

	public void setAcYear(String acYear) {
		this.acYear = acYear;
	}

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

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getTchCodeState() {
		return tchCodeState;
	}

	public void setTchCodeState(String tchCodeState) {
		this.tchCodeState = tchCodeState;
	}

	public String getTchCode() {
		return tchCode;
	}

	public void setTchCode(String tchCode) {
		this.tchCode = tchCode;
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

	public String getSocialCategory() {
		return socialCategory;
	}

	public void setSocialCategory(String socialCategory) {
		this.socialCategory = socialCategory;
	}

	public String getTchType() {
		return tchType;
	}

	public void setTchType(String tchType) {
		this.tchType = tchType;
	}

	public String getNatureOfAppointment() {
		return natureOfAppointment;
	}

	public void setNatureOfAppointment(String natureOfAppointment) {
		this.natureOfAppointment = natureOfAppointment;
	}

	public String getDateOfjoiningService() {
		return dateOfjoiningService;
	}

	public void setDateOfjoiningService(String dateOfjoiningService) {
		this.dateOfjoiningService = dateOfjoiningService;
	}

	public String getQualificationAcad() {
		return qualificationAcad;
	}

	public void setQualificationAcad(String qualificationAcad) {
		this.qualificationAcad = qualificationAcad;
	}

	public String getQualificationProf() {
		return qualificationProf;
	}

	public void setQualificationProf(String qualificationProf) {
		this.qualificationProf = qualificationProf;
	}

	public String getClassTaught() {
		return classTaught;
	}

	public void setClassTaught(String classTaught) {
		this.classTaught = classTaught;
	}

	public String getAppointedSub() {
		return appointedSub;
	}

	public void setAppointedSub(String appointedSub) {
		this.appointedSub = appointedSub;
	}

	public String getSubTaught1() {
		return subTaught1;
	}

	public void setSubTaught1(String subTaught1) {
		this.subTaught1 = subTaught1;
	}

	public String getSubTaught2() {
		return subTaught2;
	}

	public void setSubTaught2(String subTaught2) {
		this.subTaught2 = subTaught2;
	}

	public String getTrnBrc() {
		return trnBrc;
	}

	public void setTrnBrc(String trnBrc) {
		this.trnBrc = trnBrc;
	}

	public String getTrnCrc() {
		return trnCrc;
	}

	public void setTrnCrc(String trnCrc) {
		this.trnCrc = trnCrc;
	}

	public String getTrnDiet() {
		return trnDiet;
	}

	public void setTrnDiet(String trnDiet) {
		this.trnDiet = trnDiet;
	}

	public String getTrnOther() {
		return trnOther;
	}

	public void setTrnOther(String trnOther) {
		this.trnOther = trnOther;
	}

	public String getTrngNeeded() {
		return trngNeeded;
	}

	public void setTrngNeeded(String trngNeeded) {
		this.trngNeeded = trngNeeded;
	}

	public String getNonTeacherWorkingDays() {
		return nonTeacherWorkingDays;
	}

	public void setNonTeacherWorkingDays(String nonTeacherWorkingDays) {
		this.nonTeacherWorkingDays = nonTeacherWorkingDays;
	}

	public String getMathUpto() {
		return mathUpto;
	}

	public void setMathUpto(String mathUpto) {
		this.mathUpto = mathUpto;
	}

	public String getScienceUpto() {
		return scienceUpto;
	}

	public void setScienceUpto(String scienceUpto) {
		this.scienceUpto = scienceUpto;
	}

	public String getEnglishUpto() {
		return englishUpto;
	}

	public void setEnglishUpto(String englishUpto) {
		this.englishUpto = englishUpto;
	}

	public String getSocStudyUpto() {
		return socStudyUpto;
	}

	public void setSocStudyUpto(String socStudyUpto) {
		this.socStudyUpto = socStudyUpto;
	}

	public String getYearOfjoiningPresentSch() {
		return yearOfjoiningPresentSch;
	}

	public void setYearOfjoiningPresentSch(String yearOfjoiningPresentSch) {
		this.yearOfjoiningPresentSch = yearOfjoiningPresentSch;
	}

	public String getDisabilityType() {
		return disabilityType;
	}

	public void setDisabilityType(String disabilityType) {
		this.disabilityType = disabilityType;
	}

	public String getTrainedCwsn() {
		return trainedCwsn;
	}

	public void setTrainedCwsn(String trainedCwsn) {
		this.trainedCwsn = trainedCwsn;
	}

	public String getTrainedComp() {
		return trainedComp;
	}

	public void setTrainedComp(String trainedComp) {
		this.trainedComp = trainedComp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTrngRcvd() {
		return trngRcvd;
	}

	public void setTrngRcvd(String trngRcvd) {
		this.trngRcvd = trngRcvd;
	}

	public String getLangStudyUpto() {
		return langStudyUpto;
	}

	public void setLangStudyUpto(String langStudyUpto) {
		this.langStudyUpto = langStudyUpto;
	}

	public String getIsValid() {
		return isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	public String getAddRecordFlag() {
		return addRecordFlag;
	}

	public void setAddRecordFlag(String addRecordFlag) {
		this.addRecordFlag = addRecordFlag;
	}

	public String getDojService2() {
		return dojService2;
	}

	public void setDojService2(String dojService2) {
		this.dojService2 = dojService2;
	}

	public String getTchTypeNational() {
		return tchTypeNational;
	}

	public void setTchTypeNational(String tchTypeNational) {
		this.tchTypeNational = tchTypeNational;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

}
