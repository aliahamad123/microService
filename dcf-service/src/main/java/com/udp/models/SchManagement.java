package com.udp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "sch_profile_5")
public class SchManagement {

	@Id
	@Field(value = "_id")
	private String _id;

	@Field(name = "school_id")
	private String schoolId;

	@Field(name = "udise_sch_code")
	private String udiseSchCode;
	
	@Field(name = "ac_year")
	private String acYear;

	@Field(name = "smc_yn")
	private String smcYN;

	@Field(name = "smc_mem_m")
	private String smcMemMale;

	@Field(name = "smc_mem_f")
	private String smcMemFemale;

	@Field(name = "smc_par_m")
	private String smcParentMale;

	@Field(name = "smc_par_f")
	private String smcParentFemale;

	@Field(name = "smc_par_min")
	private String smcParentMinority;

	@Field(name = "smc_par_sc")
	private String smcParentSC;

	@Field(name = "smc_par_st")
	private String smcParentST;

	@Field(name = "smc_par_ews")
	private String smcParentEWS;
	
	@Field(name = "smc_lgb_m")
	private String smcLocalBodyMale;

	@Field(name = "smc_lgb_f")
	private String smcLocalBodyFemale;
	
	@Field(name = "smc_tch_m")
	private String smcTeacherMale;

	@Field(name = "smc_tch_f")
	private String smcTeacherFemale;

	@Field(name = "smc_trained_m")
	private String smcTrainedMale;

	@Field(name = "smc_trained_f")
	private String smcTrainedFemale;

	@Field(name = "smc_meetings")
	private String smcMeetings;

	@Field(name = "smc_sdp_yn")
	private String smcSchdevelopementPlanYN;

	@Field(name = "smc_bnkac_yn")
	private String smcBankAcYN;

	@Field(name = "smc_bnk_name")
	private String smcBannkName;

	@Field(name = "smc_bnk_br")
	private String smcBankBranch;

	@Field(name = "smc_bnkac_no")
	private String smcBankAcNo;

	@Field(name = "smc_bnkac_ifsc")
	private String smcBankAcIfsc;

	@Field(name = "smc_bnkac_name")
	private String smcBankAcName;
	
	@Field(name = "smdc_smc_same_yn")
	private String smdcSmcSameYN;

	@Field(name = "smdc_yn")
	private String smdcYN;

	@Field(name = "smdc_mem_m")
	private String smdcMemberMale;

	@Field(name = "smdc_mem_f")
	private String smdcMemberfemale;

	@Field(name = "smdc_par_m")
	private String smdcParentMale;

	@Field(name = "smdc_par_f")
	private String smdcParentFemale;

	@Field(name = "smdc_par_ews_m")
	private String smdcParentEwsMale;

	@Field(name = "smdc_par_ews_f")
	private String smdcParentEwsFemale;

	@Field(name = "smdc_lgb_m")
	private String smdcLocalBodyMale;

	@Field(name = "smdc_lgb_f")
	private String smdcLocalBodyFemale;
	
	@Field(name = "smdc_ebmc_m")
	private String smdcEducationBackWardMinorityCommMale;

	@Field(name = "smdc_ebmc_f")
	private String smdcEducationBackWardMinorityCommFemale;
	
	@Field(name = "smdc_women_f")
	private String smdcWomenFemale;

	@Field(name = "smdc_scst_m")
	private String smdcScStMale;

	@Field(name = "smdc_scst_f")
	private String smdcScStFemale;

	@Field(name = "smdc_deo_m")
	private String smdcDistrcitEducationOfficerMale;

	@Field(name = "smdc_deo_f")
	private String smdcDistrcitEducationOfficerFemale;

	@Field(name = "smdc_audit_m")
	private String smdcAuditMale;

	@Field(name = "smdc_audit_f")
	private String smdcAuditFemale;

	@Field(name = "smdc_subexp_m")
	private String smdcSubjectExpMale;

	@Field(name = "smdc_subexp_f")
	private String smdcSubjectExpFemale;

	@Field(name = "smdc_tch_m")
	private String smdcTeacherMale;

	@Field(name = "smdc_tch_f")
	private String smdcTeacherFemale;

	@Field(name = "smdc_vp_m")
	private String smdcVicePrincipalMale;

	@Field(name = "smdc_vp_f")
	private String smdcVicePrincipalFemale;

	@Field(name = "smdc_prin_m")
	private String smdcPrincipalMale;

	@Field(name = "smdc_prin_f")
	private String smdcPrincipalFemal;

	@Field(name = "smdc_cp_m")
	private String smdcChairpersonPrincipalMale;

	@Field(name = "smdc_cp_f")
	private String smdcChairpersonPrincipalfemale;

	@Field(name = "smdc_trained_m")
	private String smdcTrainedMale;

	@Field(name = "smdc_trained_f")
	private String smdcTrainedFemale;

	@Field(name = "smdc_meetings")
	private String smdcMeetings;

	@Field(name = "smdc_sdp_yn")
	private String smdcSchDevelopmentPlanYN;

	@Field(name = "smdc_bnkac_yn")
	private String smdcBankAcYN;

	@Field(name = "smdc_bnk_name")
	private String smdcBankName;

	@Field(name = "smdc_bnk_br")
	private String smdcBankBranch;

	@Field(name = "smdc_bnkac_no")
	private String smdcBankAcNo;

	@Field(name = "smdc_bnkac_ifsc")
	private String smdcBankAcIfsc;

	@Field(name = "smdc_bnkac_name")
	private String smdcBankAcName;

	@Field(name = "smdc_sbc_yn")
	private String smdcSchBuildingYN;

	@Field(name = "smdc_acadcom_yn")
	private String smdcAcademicCommitteeYN;

	@Field(name = "smdc_pta_yn")
	private String smdcParentTeacherYN;
	
	@Field(name = "smdc_pta_meeting")
	private String smdcParentTeacherMeeting;

	@Field(name = "created_by")
	private String createdBy1819;

	@Field(name = "created_time")
	private String createdTime;

	@Field(name = "modified_by")
	private String modifiedBy;

	@Field(name = "modified_time")
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
