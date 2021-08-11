package com.udiseservices.models;

import org.springframework.data.mongodb.core.mapping.Field;

import com.udiseservices.utility.StaticMasterUtilityMethodes;

public class SchSafety {
	
	@Field(value ="_id")
	private String _id;
	
	@Field(value ="school_id")
	private Integer schoolId;
	
	@Field(value ="udise_sch_code")
	private String udiseSchCode;
	
	@Field(value ="ac_year")
	private String acYear;
	
	@Field(value ="sdmp_plan_yn")
	private String sdmpPlanYn;
	
	@Field(value ="struct_safaud_yn")
	private String structSafaudYn;
	
	@Field(value ="nonstr_safaud_yn")
	private String nonstrSafaudYn;
	
	@Field(value ="fire_ext_yn")
	private String fireExtYn;
	
	@Field(value ="safty_trng_yn")
	private String saftyTrngYn;
	
	@Field(value ="dismgmt_taug_yn")
	private String dismgmtTaugYn;
	
	@Field(value ="slfdef_grt_yn")
	private String slfdefGrtYn;
	
	@Field(value ="slfdef_trained")
	private String slfdefTrained;
	
	@Field(value ="extra_column_1")
	private String extraColumn1;
	
	@Field(value ="created_time")
	private String createdTime;
	
	@Field(value ="modified_by")
	private String modifiedBy;
	
	@Field(value ="modified_time")
	private String modifiedTime;
	
	@Field(value ="cctv_cam_yn")
	private String cctvCamYn;
	
	@Field(value ="nodal_tch_yn")
	private String nodalTchYn;
	
	@Field(value ="guide_display_yn")
	private String guideDisplayYn;
	
	@Field(value ="tch_rcvd_grant_yn")
	private String tchRcvdGrantYn;
	
	@Field(value ="guidance_yn")
	private String guidanceYn;
	
	@Field(value ="sensitize_yn")
	private String sensitizeYn;
	
	@Field(value ="stu_awareness_yn")
	private String stuAwarenessYn;
	
	@Field(value ="stu_feedback_yn")
	private String stuFeedbackYn;
	
	@Field(value ="comp_box_yn")
	private String compBoxYn;
	
	@Field(value ="guide_to_stu_yn")
	private String guideToStuYn;

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
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(udiseSchCode);
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

	public String getSdmpPlanYn() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(sdmpPlanYn);
	}

	public void setSdmpPlanYn(String sdmpPlanYn) {
		this.sdmpPlanYn = sdmpPlanYn;
	}

	public String getStructSafaudYn() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(structSafaudYn);
	}

	public void setStructSafaudYn(String structSafaudYn) {
		this.structSafaudYn = structSafaudYn;
	}

	public String getNonstrSafaudYn() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(nonstrSafaudYn);
	}

	public void setNonstrSafaudYn(String nonstrSafaudYn) {
		this.nonstrSafaudYn = nonstrSafaudYn;
	}

	public String getFireExtYn() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(fireExtYn);
	}

	public void setFireExtYn(String fireExtYn) {
		this.fireExtYn = fireExtYn;
	}

	public String getSaftyTrngYn() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(saftyTrngYn);
	}

	public void setSaftyTrngYn(String saftyTrngYn) {
		this.saftyTrngYn = saftyTrngYn;
	}

	public String getDismgmtTaugYn() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(dismgmtTaugYn);
	}

	public void setDismgmtTaugYn(String dismgmtTaugYn) {
		this.dismgmtTaugYn = dismgmtTaugYn;
	}

	public String getSlfdefGrtYn() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(slfdefGrtYn);
	}

	public void setSlfdefGrtYn(String slfdefGrtYn) {
		this.slfdefGrtYn = slfdefGrtYn;
	}

	public String getSlfdefTrained() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(slfdefTrained);
	}

	public void setSlfdefTrained(String slfdefTrained) {
		this.slfdefTrained = slfdefTrained;
	}

	public String getExtraColumn1() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(extraColumn1);
	}

	public void setExtraColumn1(String extraColumn1) {
		this.extraColumn1 = extraColumn1;
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

	public String getCctvCamYn() {
		return  StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(cctvCamYn);
	}

	public void setCctvCamYn(String cctvCamYn) {
		this.cctvCamYn = cctvCamYn;
	}

	public String getNodalTchYn() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(nodalTchYn);
	}

	public void setNodalTchYn(String nodalTchYn) {
		this.nodalTchYn = nodalTchYn;
	}

	public String getGuideDisplayYn() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(guideDisplayYn);
	}

	public void setGuideDisplayYn(String guideDisplayYn) {
		this.guideDisplayYn = guideDisplayYn;
	}

	public String getTchRcvdGrantYn() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(tchRcvdGrantYn);
	}

	public void setTchRcvdGrantYn(String tchRcvdGrantYn) {
		this.tchRcvdGrantYn = tchRcvdGrantYn;
	}

	public String getGuidanceYn() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(guidanceYn);
	}

	public void setGuidanceYn(String guidanceYn) {
		this.guidanceYn = guidanceYn;
	}

	public String getSensitizeYn() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(sensitizeYn);
	}

	public void setSensitizeYn(String sensitizeYn) {
		this.sensitizeYn = sensitizeYn;
	}

	public String getStuAwarenessYn() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(stuAwarenessYn);
	}

	public void setStuAwarenessYn(String stuAwarenessYn) {
		this.stuAwarenessYn = stuAwarenessYn;
	}

	public String getStuFeedbackYn() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(stuFeedbackYn);
	}

	public void setStuFeedbackYn(String stuFeedbackYn) {
		this.stuFeedbackYn = stuFeedbackYn;
	}

	public String getCompBoxYn() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(compBoxYn);
	}

	public void setCompBoxYn(String compBoxYn) {
		this.compBoxYn = compBoxYn;
	}

	public String getGuideToStuYn() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(guideToStuYn);
	}

	public void setGuideToStuYn(String guideToStuYn) {
		this.guideToStuYn = guideToStuYn;
	}
	
	

}
