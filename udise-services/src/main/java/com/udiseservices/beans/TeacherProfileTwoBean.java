package com.udiseservices.beans;

import com.udiseservices.utility.StaticMasterUtilityMethodes;

public class TeacherProfileTwoBean {
	
	private Integer schoolId;
	private String udiseSchCode;
	private String teacherId;
	private String tchCodeState;
	private String tchCode;
	private String name;
	private String gender;
	private String dob;
	private String socialCategory;
	private String tchType;
	private String natureOfAppointment;
	private String dateOfjoiningService;
	private String qualificationAcad;
	private String qualificationProf;
	private String classTaught;
	private String appointedSub;
	private String subTaught1;
	private String subTaught2;
	private String trnBrc;
	private String trnCrc;
	private String trnDiet;
	private String trnOther;
	private String trngNeeded;
	private String nonTeacherWorkingDays;
	private String mathUpto;
	private String scienceUpto;
	private String englishUpto;
	private String socStudyUpto;
	private String yearOfjoiningPresentSch;
	private String disabilityType;
	private String trainedCwsn;
	private String trainedComp;
	private String email;
	private String mobile;
	private String trngRcvd;
	private String langStudyUpto;
	private String isValid;
	private String addRecordFlag;
	private String dojService2;
	private String tchTypeNational;
	private String stateId;
	private String createdBy;
	private String createdTime;
	private String modifiedBy;
	private String modifiedTime;



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
		return StaticMasterUtilityMethodes.fetchGenderData(gender);
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
		return StaticMasterUtilityMethodes.fetchSocailCategoryData(socialCategory);
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
		return StaticMasterUtilityMethodes.fetchNatureAppointData(natureOfAppointment);
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
		return StaticMasterUtilityMethodes.fetchAcadmicQualiData(qualificationAcad);
	}

	public void setQualificationAcad(String qualificationAcad) {
		this.qualificationAcad = qualificationAcad;
	}

	public String getQualificationProf() {
		return StaticMasterUtilityMethodes.fetchProfQualiData(qualificationProf);
	}

	public void setQualificationProf(String qualificationProf) {
		this.qualificationProf = qualificationProf;
	}

	public String getClassTaught() {
		return StaticMasterUtilityMethodes.fetchClassTaughtData(classTaught);
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
		return StaticMasterUtilityMethodes.fetchDisableData(disabilityType);
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
