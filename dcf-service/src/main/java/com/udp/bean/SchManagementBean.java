package com.udp.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class SchManagementBean {
	
	private String _id;
	private String schoolId;
	private String udiseSchCode;
	private String acYear;
	private String smcYN;
	private String smcMemMale;
	private String smcMemFemale;
	private String smcParentMale;
	private String smcParentFemale;
	private String smcParentMinority;
	private String smcParentSC;
	private String smcParentST;
	private String smcParentEWS;
	private String smcLocalBodyMale;
	private String smcLocalBodyFemale;
	private String smcTeacherMale;
	private String smcTeacherFemale;
	private String smcTrainedMale;
	private String smcTrainedFemale;
	private String smcMeetings;
	private String smcSchdevelopementPlanYN;
	private String smcBankAcYN;
	private String smcBannkName;
	private String smcBankBranch;
	private String smcBankAcNo;
	private String smcBankAcIfsc;
	private String smcBankAcName;
	private String smdcSmcSameYN;
	private String smdcYN;
	private String smdcMemberMale;
	private String smdcMemberfemale;
	private String smdcParentMale;
	private String smdcParentFemale;
	private String smdcParentEwsMale;
	private String smdcParentEwsFemale;
	private String smdcLocalBodyMale;
	private String smdcLocalBodyFemale;
	private String smdcEducationBackWardMinorityCommMale;
	private String smdcEducationBackWardMinorityCommFemale;
	private String smdcWomenFemale;
	private String smdcScStMale;
	private String smdcScStFemale;
	private String smdcDistrcitEducationOfficerMale;
	private String smdcDistrcitEducationOfficerFemale;
	private String smdcAuditMale;
	private String smdcAuditFemale;
	private String smdcSubjectExpMale;
	private String smdcSubjectExpFemale;
	private String smdcTeacherMale;
	private String smdcTeacherFemale;
	private String smdcVicePrincipalMale;
	private String smdcVicePrincipalFemale;
	private String smdcPrincipalMale;
	private String smdcPrincipalFemal;
	private String smdcChairpersonPrincipalMale;
	private String smdcChairpersonPrincipalfemale;
	private String smdcTrainedMale;
	private String smdcTrainedFemale;
	private String smdcMeetings;
	private String smdcSchDevelopmentPlanYN;
	private String smdcBankAcYN;
	private String smdcBankName;
	private String smdcBankBranch;
	private String smdcBankAcNo;
	private String smdcBankAcIfsc;
	private String smdcBankAcName;
	private String smdcSchBuildingYN;
	private String smdcAcademicCommitteeYN;
	private String smdcParentTeacherYN;
	private String smdcParentTeacherMeeting;
	private String createdBy1819;
	private String createdTime;
	private String modifiedBy;
	private String modifiedTime;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(String schoolId) {
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
	public String getSmcYN() {
		return smcYN;
	}
	public void setSmcYN(String smcYN) {
		this.smcYN = smcYN;
	}
	public String getSmcMemMale() {
		return smcMemMale;
	}
	public void setSmcMemMale(String smcMemMale) {
		this.smcMemMale = smcMemMale;
	}
	public String getSmcMemFemale() {
		return smcMemFemale;
	}
	public void setSmcMemFemale(String smcMemFemale) {
		this.smcMemFemale = smcMemFemale;
	}
	public String getSmcParentMale() {
		return smcParentMale;
	}
	public void setSmcParentMale(String smcParentMale) {
		this.smcParentMale = smcParentMale;
	}
	public String getSmcParentFemale() {
		return smcParentFemale;
	}
	public void setSmcParentFemale(String smcParentFemale) {
		this.smcParentFemale = smcParentFemale;
	}
	public String getSmcParentMinority() {
		return smcParentMinority;
	}
	public void setSmcParentMinority(String smcParentMinority) {
		this.smcParentMinority = smcParentMinority;
	}
	public String getSmcParentSC() {
		return smcParentSC;
	}
	public void setSmcParentSC(String smcParentSC) {
		this.smcParentSC = smcParentSC;
	}
	public String getSmcParentST() {
		return smcParentST;
	}
	public void setSmcParentST(String smcParentST) {
		this.smcParentST = smcParentST;
	}
	public String getSmcParentEWS() {
		return smcParentEWS;
	}
	public void setSmcParentEWS(String smcParentEWS) {
		this.smcParentEWS = smcParentEWS;
	}
	public String getSmcLocalBodyMale() {
		return smcLocalBodyMale;
	}
	public void setSmcLocalBodyMale(String smcLocalBodyMale) {
		this.smcLocalBodyMale = smcLocalBodyMale;
	}
	public String getSmcLocalBodyFemale() {
		return smcLocalBodyFemale;
	}
	public void setSmcLocalBodyFemale(String smcLocalBodyFemale) {
		this.smcLocalBodyFemale = smcLocalBodyFemale;
	}
	public String getSmcTeacherMale() {
		return smcTeacherMale;
	}
	public void setSmcTeacherMale(String smcTeacherMale) {
		this.smcTeacherMale = smcTeacherMale;
	}
	public String getSmcTeacherFemale() {
		return smcTeacherFemale;
	}
	public void setSmcTeacherFemale(String smcTeacherFemale) {
		this.smcTeacherFemale = smcTeacherFemale;
	}
	public String getSmcTrainedMale() {
		return smcTrainedMale;
	}
	public void setSmcTrainedMale(String smcTrainedMale) {
		this.smcTrainedMale = smcTrainedMale;
	}
	public String getSmcTrainedFemale() {
		return smcTrainedFemale;
	}
	public void setSmcTrainedFemale(String smcTrainedFemale) {
		this.smcTrainedFemale = smcTrainedFemale;
	}
	public String getSmcMeetings() {
		return smcMeetings;
	}
	public void setSmcMeetings(String smcMeetings) {
		this.smcMeetings = smcMeetings;
	}
	public String getSmcSchdevelopementPlanYN() {
		return smcSchdevelopementPlanYN;
	}
	public void setSmcSchdevelopementPlanYN(String smcSchdevelopementPlanYN) {
		this.smcSchdevelopementPlanYN = smcSchdevelopementPlanYN;
	}
	public String getSmcBankAcYN() {
		return smcBankAcYN;
	}
	public void setSmcBankAcYN(String smcBankAcYN) {
		this.smcBankAcYN = smcBankAcYN;
	}
	public String getSmcBannkName() {
		return smcBannkName;
	}
	public void setSmcBannkName(String smcBannkName) {
		this.smcBannkName = smcBannkName;
	}
	public String getSmcBankBranch() {
		return smcBankBranch;
	}
	public void setSmcBankBranch(String smcBankBranch) {
		this.smcBankBranch = smcBankBranch;
	}
	public String getSmcBankAcNo() {
		return smcBankAcNo;
	}
	public void setSmcBankAcNo(String smcBankAcNo) {
		this.smcBankAcNo = smcBankAcNo;
	}
	public String getSmcBankAcIfsc() {
		return smcBankAcIfsc;
	}
	public void setSmcBankAcIfsc(String smcBankAcIfsc) {
		this.smcBankAcIfsc = smcBankAcIfsc;
	}
	public String getSmcBankAcName() {
		return smcBankAcName;
	}
	public void setSmcBankAcName(String smcBankAcName) {
		this.smcBankAcName = smcBankAcName;
	}
	public String getSmdcSmcSameYN() {
		return smdcSmcSameYN;
	}
	public void setSmdcSmcSameYN(String smdcSmcSameYN) {
		this.smdcSmcSameYN = smdcSmcSameYN;
	}
	public String getSmdcYN() {
		return smdcYN;
	}
	public void setSmdcYN(String smdcYN) {
		this.smdcYN = smdcYN;
	}
	public String getSmdcMemberMale() {
		return smdcMemberMale;
	}
	public void setSmdcMemberMale(String smdcMemberMale) {
		this.smdcMemberMale = smdcMemberMale;
	}
	public String getSmdcMemberfemale() {
		return smdcMemberfemale;
	}
	public void setSmdcMemberfemale(String smdcMemberfemale) {
		this.smdcMemberfemale = smdcMemberfemale;
	}
	public String getSmdcParentMale() {
		return smdcParentMale;
	}
	public void setSmdcParentMale(String smdcParentMale) {
		this.smdcParentMale = smdcParentMale;
	}
	public String getSmdcParentFemale() {
		return smdcParentFemale;
	}
	public void setSmdcParentFemale(String smdcParentFemale) {
		this.smdcParentFemale = smdcParentFemale;
	}
	public String getSmdcParentEwsMale() {
		return smdcParentEwsMale;
	}
	public void setSmdcParentEwsMale(String smdcParentEwsMale) {
		this.smdcParentEwsMale = smdcParentEwsMale;
	}
	public String getSmdcParentEwsFemale() {
		return smdcParentEwsFemale;
	}
	public void setSmdcParentEwsFemale(String smdcParentEwsFemale) {
		this.smdcParentEwsFemale = smdcParentEwsFemale;
	}
	public String getSmdcLocalBodyMale() {
		return smdcLocalBodyMale;
	}
	public void setSmdcLocalBodyMale(String smdcLocalBodyMale) {
		this.smdcLocalBodyMale = smdcLocalBodyMale;
	}
	public String getSmdcLocalBodyFemale() {
		return smdcLocalBodyFemale;
	}
	public void setSmdcLocalBodyFemale(String smdcLocalBodyFemale) {
		this.smdcLocalBodyFemale = smdcLocalBodyFemale;
	}
	public String getSmdcEducationBackWardMinorityCommMale() {
		return smdcEducationBackWardMinorityCommMale;
	}
	public void setSmdcEducationBackWardMinorityCommMale(String smdcEducationBackWardMinorityCommMale) {
		this.smdcEducationBackWardMinorityCommMale = smdcEducationBackWardMinorityCommMale;
	}
	public String getSmdcEducationBackWardMinorityCommFemale() {
		return smdcEducationBackWardMinorityCommFemale;
	}
	public void setSmdcEducationBackWardMinorityCommFemale(String smdcEducationBackWardMinorityCommFemale) {
		this.smdcEducationBackWardMinorityCommFemale = smdcEducationBackWardMinorityCommFemale;
	}
	public String getSmdcWomenFemale() {
		return smdcWomenFemale;
	}
	public void setSmdcWomenFemale(String smdcWomenFemale) {
		this.smdcWomenFemale = smdcWomenFemale;
	}
	public String getSmdcScStMale() {
		return smdcScStMale;
	}
	public void setSmdcScStMale(String smdcScStMale) {
		this.smdcScStMale = smdcScStMale;
	}
	public String getSmdcScStFemale() {
		return smdcScStFemale;
	}
	public void setSmdcScStFemale(String smdcScStFemale) {
		this.smdcScStFemale = smdcScStFemale;
	}
	public String getSmdcDistrcitEducationOfficerMale() {
		return smdcDistrcitEducationOfficerMale;
	}
	public void setSmdcDistrcitEducationOfficerMale(String smdcDistrcitEducationOfficerMale) {
		this.smdcDistrcitEducationOfficerMale = smdcDistrcitEducationOfficerMale;
	}
	public String getSmdcDistrcitEducationOfficerFemale() {
		return smdcDistrcitEducationOfficerFemale;
	}
	public void setSmdcDistrcitEducationOfficerFemale(String smdcDistrcitEducationOfficerFemale) {
		this.smdcDistrcitEducationOfficerFemale = smdcDistrcitEducationOfficerFemale;
	}
	public String getSmdcAuditMale() {
		return smdcAuditMale;
	}
	public void setSmdcAuditMale(String smdcAuditMale) {
		this.smdcAuditMale = smdcAuditMale;
	}
	public String getSmdcAuditFemale() {
		return smdcAuditFemale;
	}
	public void setSmdcAuditFemale(String smdcAuditFemale) {
		this.smdcAuditFemale = smdcAuditFemale;
	}
	public String getSmdcSubjectExpMale() {
		return smdcSubjectExpMale;
	}
	public void setSmdcSubjectExpMale(String smdcSubjectExpMale) {
		this.smdcSubjectExpMale = smdcSubjectExpMale;
	}
	public String getSmdcSubjectExpFemale() {
		return smdcSubjectExpFemale;
	}
	public void setSmdcSubjectExpFemale(String smdcSubjectExpFemale) {
		this.smdcSubjectExpFemale = smdcSubjectExpFemale;
	}
	public String getSmdcTeacherMale() {
		return smdcTeacherMale;
	}
	public void setSmdcTeacherMale(String smdcTeacherMale) {
		this.smdcTeacherMale = smdcTeacherMale;
	}
	public String getSmdcTeacherFemale() {
		return smdcTeacherFemale;
	}
	public void setSmdcTeacherFemale(String smdcTeacherFemale) {
		this.smdcTeacherFemale = smdcTeacherFemale;
	}
	public String getSmdcVicePrincipalMale() {
		return smdcVicePrincipalMale;
	}
	public void setSmdcVicePrincipalMale(String smdcVicePrincipalMale) {
		this.smdcVicePrincipalMale = smdcVicePrincipalMale;
	}
	public String getSmdcVicePrincipalFemale() {
		return smdcVicePrincipalFemale;
	}
	public void setSmdcVicePrincipalFemale(String smdcVicePrincipalFemale) {
		this.smdcVicePrincipalFemale = smdcVicePrincipalFemale;
	}
	public String getSmdcPrincipalMale() {
		return smdcPrincipalMale;
	}
	public void setSmdcPrincipalMale(String smdcPrincipalMale) {
		this.smdcPrincipalMale = smdcPrincipalMale;
	}
	public String getSmdcPrincipalFemal() {
		return smdcPrincipalFemal;
	}
	public void setSmdcPrincipalFemal(String smdcPrincipalFemal) {
		this.smdcPrincipalFemal = smdcPrincipalFemal;
	}
	public String getSmdcChairpersonPrincipalMale() {
		return smdcChairpersonPrincipalMale;
	}
	public void setSmdcChairpersonPrincipalMale(String smdcChairpersonPrincipalMale) {
		this.smdcChairpersonPrincipalMale = smdcChairpersonPrincipalMale;
	}
	public String getSmdcChairpersonPrincipalfemale() {
		return smdcChairpersonPrincipalfemale;
	}
	public void setSmdcChairpersonPrincipalfemale(String smdcChairpersonPrincipalfemale) {
		this.smdcChairpersonPrincipalfemale = smdcChairpersonPrincipalfemale;
	}
	public String getSmdcTrainedMale() {
		return smdcTrainedMale;
	}
	public void setSmdcTrainedMale(String smdcTrainedMale) {
		this.smdcTrainedMale = smdcTrainedMale;
	}
	public String getSmdcTrainedFemale() {
		return smdcTrainedFemale;
	}
	public void setSmdcTrainedFemale(String smdcTrainedFemale) {
		this.smdcTrainedFemale = smdcTrainedFemale;
	}
	public String getSmdcMeetings() {
		return smdcMeetings;
	}
	public void setSmdcMeetings(String smdcMeetings) {
		this.smdcMeetings = smdcMeetings;
	}
	public String getSmdcSchDevelopmentPlanYN() {
		return smdcSchDevelopmentPlanYN;
	}
	public void setSmdcSchDevelopmentPlanYN(String smdcSchDevelopmentPlanYN) {
		this.smdcSchDevelopmentPlanYN = smdcSchDevelopmentPlanYN;
	}
	public String getSmdcBankAcYN() {
		return smdcBankAcYN;
	}
	public void setSmdcBankAcYN(String smdcBankAcYN) {
		this.smdcBankAcYN = smdcBankAcYN;
	}
	public String getSmdcBankName() {
		return smdcBankName;
	}
	public void setSmdcBankName(String smdcBankName) {
		this.smdcBankName = smdcBankName;
	}
	public String getSmdcBankBranch() {
		return smdcBankBranch;
	}
	public void setSmdcBankBranch(String smdcBankBranch) {
		this.smdcBankBranch = smdcBankBranch;
	}
	public String getSmdcBankAcNo() {
		return smdcBankAcNo;
	}
	public void setSmdcBankAcNo(String smdcBankAcNo) {
		this.smdcBankAcNo = smdcBankAcNo;
	}
	public String getSmdcBankAcIfsc() {
		return smdcBankAcIfsc;
	}
	public void setSmdcBankAcIfsc(String smdcBankAcIfsc) {
		this.smdcBankAcIfsc = smdcBankAcIfsc;
	}
	public String getSmdcBankAcName() {
		return smdcBankAcName;
	}
	public void setSmdcBankAcName(String smdcBankAcName) {
		this.smdcBankAcName = smdcBankAcName;
	}
	public String getSmdcSchBuildingYN() {
		return smdcSchBuildingYN;
	}
	public void setSmdcSchBuildingYN(String smdcSchBuildingYN) {
		this.smdcSchBuildingYN = smdcSchBuildingYN;
	}
	public String getSmdcAcademicCommitteeYN() {
		return smdcAcademicCommitteeYN;
	}
	public void setSmdcAcademicCommitteeYN(String smdcAcademicCommitteeYN) {
		this.smdcAcademicCommitteeYN = smdcAcademicCommitteeYN;
	}
	public String getSmdcParentTeacherYN() {
		return smdcParentTeacherYN;
	}
	public void setSmdcParentTeacherYN(String smdcParentTeacherYN) {
		this.smdcParentTeacherYN = smdcParentTeacherYN;
	}
	public String getSmdcParentTeacherMeeting() {
		return smdcParentTeacherMeeting;
	}
	public void setSmdcParentTeacherMeeting(String smdcParentTeacherMeeting) {
		this.smdcParentTeacherMeeting = smdcParentTeacherMeeting;
	}
	public String getCreatedBy1819() {
		return createdBy1819;
	}
	public void setCreatedBy1819(String createdBy1819) {
		this.createdBy1819 = createdBy1819;
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
