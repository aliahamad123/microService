package com.udp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "full_profile")
public class SchProfileFour {

	@Id
	@Field(value = "_id")
	private String _id;

	@Field(name = "school_id")
	private String schoolId;

	@Field(name = "udise_sch_code")
	private String udiseSchCode;

	@Field(name = "ac_year")
	private String acYear;

	@Field(name = "cce_yn_ele")
	private String cceYnEle1819;

	@Field(name = "cce_yn_sec")
	private String cceYnSec;

	@Field(name = "cce_yn_hsec")
	private String cceYnHsec;

	@Field(name = "pcr_maintained_yn")
	private String pcrMaintainedYn;

	@Field(name = "pcr_shared_yn")
	private String pcrSharedYn;

	@Field(name = "rte_25p_applied")
	private String rte25pApplied;

	@Field(name = "rte_25p_enrolled")
	private String rte25pEnrolled;

	@Field(name = "rte_pvt_c0_b")
	private String rtePvtC0Boys;

	@Field(name = "rte_pvt_c0_g")
	private String rtePvtC0Girls;

	@Field(name = "rte_pvt_c1_b")
	private String rtePvtC1Boys;

	@Field(name = "rte_pvt_c1_g")
	private String rtePvtC1Girls;

	@Field(name = "rte_pvt_c2_b")
	private String rtePvtC2Boys;

	@Field(name = "rte_pvt_c2_g")
	private String rtePvtC2Girls;

	@Field(name = "rte_pvt_c3_b")
	private String rtePvtC3Boys;

	@Field(name = "rte_pvt_c3_g")
	private String rtePvtC3Girls;

	@Field(name = "rte_pvt_c4_b")
	private String rtePvtC4Boys;

	@Field(name = "rte_pvt_c4_g")
	private String rtePvtC4Girls;

	@Field(name = "rte_pvt_c5_b")
	private String rtePvtC5Boys;

	@Field(name = "rte_pvt_c5_g")
	private String rtePvtC5Girls;

	@Field(name = "rte_pvt_c6_b")
	private String rtePvtC6Boys;

	@Field(name = "rte_pvt_c6_g")
	private String rtePvtC6Girls;

	@Field(name = "rte_pvt_c7_b")
	private String rtePvtC7Boys;

	@Field(name = "rte_pvt_c7_g")
	private String rtePvtC7Girls;

	@Field(name = "rte_pvt_c8_b")
	private String rtePvtC8Boys;

	@Field(name = "rte_pvt_c8_g")
	private String rtePvtC8Girls;

	@Field(name = "rte_ews_c0_b")
	private String rteEwsC0Boy;

	@Field(name = "rte_ews_c0_g")
	private String rteEwsC0Girl;

	@Field(name = "rte_ews_c1_b")
	private String rteEwsC1Boy;

	@Field(name = "rte_ews_c1_g")
	private String rteEwsC1Girl;

	@Field(name = "rte_ews_c2_b")
	private String rteEwsC2Boy;

	@Field(name = "rte_ews_c2_g")
	private String rteEwsC2Girl;

	@Field(name = "rte_ews_c3_b")
	private String rteEwsC3Boy;

	@Field(name = "rte_ews_c3_g")
	private String rteEwsC3Girl;

	@Field(name = "rte_ews_c4_b")
	private String rteEwsC4Boy;

	@Field(name = "rte_ews_c4_g")
	private String rteEwsC4Girl;

	@Field(name = "rte_ews_c5_b")
	private String rteEwsC5Boy;

	@Field(name = "rte_ews_c5_g")
	private String rteEwsC5Girl;

	@Field(name = "rte_ews_c6_b")
	private String rteEwsC6Boy;

	@Field(name = "rte_ews_c6_g")
	private String rteEwsC6Girl;

	@Field(name = "rte_ews_c7_b")
	private String rteEwsC7Boy;

	@Field(name = "rte_ews_c7_g")
	private String rteEwsC7Girl;

	@Field(name = "rte_ews_c8_b")
	private String rteEwsC8Boy;

	@Field(name = "rte_ews_c8_g")
	private String rteEwsC8Girl;

	@Field(name = "rte_ews_c9_b")
	private String rteEwsC9Boy;

	@Field(name = "rte_ews_c9_g")
	private String rteEwsC9Girl;

	@Field(name = "rte_ews_c10_b")
	private String rteEwsC10Boy;

	@Field(name = "rte_ews_c10_g")
	private String rteEwsC10Girl;

	@Field(name = "rte_ews_c11_b")
	private String rteEwsC11Boy;

	@Field(name = "rte_ews_c11_g")
	private String rteEwsC11Girl;

	@Field(name = "rte_ews_c12_b")
	private String rteEwsC12Boy;

	@Field(name = "rte_ews_c12_g")
	private String rteEwsC12Girl;

	@Field(name = "spltrg_yn")
	private String spltrgYn;

	@Field(name = "spltrg_cy_prov_g")
	private String spltrgCyProvGirls;

	@Field(name = "spltrg_cy_prov_b")
	private String spltrgCyProvBoys;

	@Field(name = "spltrg_py_enrol_b")
	private String spltrgPyEnrolBoys;

	@Field(name = "spltrg_py_enrol_g")
	private String spltrgPyEnrolGirls;

	@Field(name = "spltrg_py_prov_b")
	private String spltrgPyProvBoys;

	@Field(name = "spltrg_py_prov_g")
	private String spltrgPyProvGirls;

	@Field(name = "spltrg_by")
	private String spltrgBy;

	@Field(name = "spltrg_place")
	private String spltrgPlace;

	@Field(name = "spltrg_type")
	private String spltrgType;

	@Field(name = "remedial_tch_enrol")
	private String remedialTchEnrol;

	@Field(name = "session_start_mon")
	private String sessionStartMon;

	@Field(name = "txtbk_recd_yn")
	private String txtbkRecdYn;

	@Field(name = "txtbk_recd_mon")
	private String txtbkRecdMon;

	@Field(name = "txtbk_recd_year")
	private String txtbkRecdYear1819;

	@Field(name = "supp_mat_recd_yn")
	private String suppMatRecdYn;

	@Field(name = "txtbk_pre_pri_yn")
	private String txtbkPrePriYn1819;

	@Field(name = "txtbk_pri_yn")
	private String txtbkPriYn;

	@Field(name = "txtbk_upr_yn")
	private String txtbkUprYn;

	@Field(name = "txtbk_sec_yn")
	private String txtbkSecYn;

	@Field(name = "txtbk_hsec_yn")
	private String txtbkHsecYn;

	@Field(name = "tle_pre_pri_yn")
	private String tlePrePriYn1819;

	@Field(name = "tle_pri_yn")
	private String tlePriYn;

	@Field(name = "tle_upr_yn")
	private String tleUprYn;

	@Field(name = "tle_sec_yn")
	private String tleSecYn;

	@Field(name = "tle_hsec_yn")
	private String tleHsecYn;

	@Field(name = "playmat_pre_pri_yn")
	private String playmatPrePriYn1819;

	@Field(name = "playmat_pri_yn")
	private String playmatPriYn;

	@Field(name = "playmat_upr_yn")
	private String playmatUprYn;

	@Field(name = "playmat_sec_yn")
	private String playmatSecYn;

	@Field(name = "playmat_hsec_yn")
	private String playmatHsecYn;

	@Field(name = "no_inspect")
	private String noInspect;

	@Field(name = "no_visit_crc")
	private String noVisitCrc;

	@Field(name = "no_visit_brc")
	private String noVisitBrc;

	@Field(name = "no_visit_dis")
	private String noVisitDis;

	@Field(name = "cce_yn_pri")
	private String cceYnPri;

	@Field(name = "cce_yn_upr")
	private String cceYnUpr;

	@Field(name = "created_by")
	private String createdBy1819;

	@Field(name = "created_time")
	private String created_time;

	@Field(name = "modified_by")
	private String modified_by;

	@Field(name = "modified_time")
	private String modified_time;

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

	public String getCceYnEle1819() {
		return cceYnEle1819;
	}

	public void setCceYnEle1819(String cceYnEle1819) {
		this.cceYnEle1819 = cceYnEle1819;
	}

	public String getCceYnSec() {
		return cceYnSec;
	}

	public void setCceYnSec(String cceYnSec) {
		this.cceYnSec = cceYnSec;
	}

	public String getCceYnHsec() {
		return cceYnHsec;
	}

	public void setCceYnHsec(String cceYnHsec) {
		this.cceYnHsec = cceYnHsec;
	}

	public String getPcrMaintainedYn() {
		return pcrMaintainedYn;
	}

	public void setPcrMaintainedYn(String pcrMaintainedYn) {
		this.pcrMaintainedYn = pcrMaintainedYn;
	}

	public String getPcrSharedYn() {
		return pcrSharedYn;
	}

	public void setPcrSharedYn(String pcrSharedYn) {
		this.pcrSharedYn = pcrSharedYn;
	}

	public String getRte25pApplied() {
		return rte25pApplied;
	}

	public void setRte25pApplied(String rte25pApplied) {
		this.rte25pApplied = rte25pApplied;
	}

	public String getRte25pEnrolled() {
		return rte25pEnrolled;
	}

	public void setRte25pEnrolled(String rte25pEnrolled) {
		this.rte25pEnrolled = rte25pEnrolled;
	}

	public String getRtePvtC0Boys() {
		return rtePvtC0Boys;
	}

	public void setRtePvtC0Boys(String rtePvtC0Boys) {
		this.rtePvtC0Boys = rtePvtC0Boys;
	}

	public String getRtePvtC0Girls() {
		return rtePvtC0Girls;
	}

	public void setRtePvtC0Girls(String rtePvtC0Girls) {
		this.rtePvtC0Girls = rtePvtC0Girls;
	}

	public String getRtePvtC1Boys() {
		return rtePvtC1Boys;
	}

	public void setRtePvtC1Boys(String rtePvtC1Boys) {
		this.rtePvtC1Boys = rtePvtC1Boys;
	}

	public String getRtePvtC1Girls() {
		return rtePvtC1Girls;
	}

	public void setRtePvtC1Girls(String rtePvtC1Girls) {
		this.rtePvtC1Girls = rtePvtC1Girls;
	}

	public String getRtePvtC2Boys() {
		return rtePvtC2Boys;
	}

	public void setRtePvtC2Boys(String rtePvtC2Boys) {
		this.rtePvtC2Boys = rtePvtC2Boys;
	}

	public String getRtePvtC2Girls() {
		return rtePvtC2Girls;
	}

	public void setRtePvtC2Girls(String rtePvtC2Girls) {
		this.rtePvtC2Girls = rtePvtC2Girls;
	}

	public String getRtePvtC3Boys() {
		return rtePvtC3Boys;
	}

	public void setRtePvtC3Boys(String rtePvtC3Boys) {
		this.rtePvtC3Boys = rtePvtC3Boys;
	}

	public String getRtePvtC3Girls() {
		return rtePvtC3Girls;
	}

	public void setRtePvtC3Girls(String rtePvtC3Girls) {
		this.rtePvtC3Girls = rtePvtC3Girls;
	}

	public String getRtePvtC4Boys() {
		return rtePvtC4Boys;
	}

	public void setRtePvtC4Boys(String rtePvtC4Boys) {
		this.rtePvtC4Boys = rtePvtC4Boys;
	}

	public String getRtePvtC4Girls() {
		return rtePvtC4Girls;
	}

	public void setRtePvtC4Girls(String rtePvtC4Girls) {
		this.rtePvtC4Girls = rtePvtC4Girls;
	}

	public String getRtePvtC5Boys() {
		return rtePvtC5Boys;
	}

	public void setRtePvtC5Boys(String rtePvtC5Boys) {
		this.rtePvtC5Boys = rtePvtC5Boys;
	}

	public String getRtePvtC5Girls() {
		return rtePvtC5Girls;
	}

	public void setRtePvtC5Girls(String rtePvtC5Girls) {
		this.rtePvtC5Girls = rtePvtC5Girls;
	}

	public String getRtePvtC6Boys() {
		return rtePvtC6Boys;
	}

	public void setRtePvtC6Boys(String rtePvtC6Boys) {
		this.rtePvtC6Boys = rtePvtC6Boys;
	}

	public String getRtePvtC6Girls() {
		return rtePvtC6Girls;
	}

	public void setRtePvtC6Girls(String rtePvtC6Girls) {
		this.rtePvtC6Girls = rtePvtC6Girls;
	}

	public String getRtePvtC7Boys() {
		return rtePvtC7Boys;
	}

	public void setRtePvtC7Boys(String rtePvtC7Boys) {
		this.rtePvtC7Boys = rtePvtC7Boys;
	}

	public String getRtePvtC7Girls() {
		return rtePvtC7Girls;
	}

	public void setRtePvtC7Girls(String rtePvtC7Girls) {
		this.rtePvtC7Girls = rtePvtC7Girls;
	}

	public String getRtePvtC8Boys() {
		return rtePvtC8Boys;
	}

	public void setRtePvtC8Boys(String rtePvtC8Boys) {
		this.rtePvtC8Boys = rtePvtC8Boys;
	}

	public String getRtePvtC8Girls() {
		return rtePvtC8Girls;
	}

	public void setRtePvtC8Girls(String rtePvtC8Girls) {
		this.rtePvtC8Girls = rtePvtC8Girls;
	}

	public String getRteEwsC0Boy() {
		return rteEwsC0Boy;
	}

	public void setRteEwsC0Boy(String rteEwsC0Boy) {
		this.rteEwsC0Boy = rteEwsC0Boy;
	}

	public String getRteEwsC0Girl() {
		return rteEwsC0Girl;
	}

	public void setRteEwsC0Girl(String rteEwsC0Girl) {
		this.rteEwsC0Girl = rteEwsC0Girl;
	}

	public String getRteEwsC1Boy() {
		return rteEwsC1Boy;
	}

	public void setRteEwsC1Boy(String rteEwsC1Boy) {
		this.rteEwsC1Boy = rteEwsC1Boy;
	}

	public String getRteEwsC1Girl() {
		return rteEwsC1Girl;
	}

	public void setRteEwsC1Girl(String rteEwsC1Girl) {
		this.rteEwsC1Girl = rteEwsC1Girl;
	}

	public String getRteEwsC2Boy() {
		return rteEwsC2Boy;
	}

	public void setRteEwsC2Boy(String rteEwsC2Boy) {
		this.rteEwsC2Boy = rteEwsC2Boy;
	}

	public String getRteEwsC2Girl() {
		return rteEwsC2Girl;
	}

	public void setRteEwsC2Girl(String rteEwsC2Girl) {
		this.rteEwsC2Girl = rteEwsC2Girl;
	}

	public String getRteEwsC3Boy() {
		return rteEwsC3Boy;
	}

	public void setRteEwsC3Boy(String rteEwsC3Boy) {
		this.rteEwsC3Boy = rteEwsC3Boy;
	}

	public String getRteEwsC3Girl() {
		return rteEwsC3Girl;
	}

	public void setRteEwsC3Girl(String rteEwsC3Girl) {
		this.rteEwsC3Girl = rteEwsC3Girl;
	}

	public String getRteEwsC4Boy() {
		return rteEwsC4Boy;
	}

	public void setRteEwsC4Boy(String rteEwsC4Boy) {
		this.rteEwsC4Boy = rteEwsC4Boy;
	}

	public String getRteEwsC4Girl() {
		return rteEwsC4Girl;
	}

	public void setRteEwsC4Girl(String rteEwsC4Girl) {
		this.rteEwsC4Girl = rteEwsC4Girl;
	}

	public String getRteEwsC5Boy() {
		return rteEwsC5Boy;
	}

	public void setRteEwsC5Boy(String rteEwsC5Boy) {
		this.rteEwsC5Boy = rteEwsC5Boy;
	}

	public String getRteEwsC5Girl() {
		return rteEwsC5Girl;
	}

	public void setRteEwsC5Girl(String rteEwsC5Girl) {
		this.rteEwsC5Girl = rteEwsC5Girl;
	}

	public String getRteEwsC6Boy() {
		return rteEwsC6Boy;
	}

	public void setRteEwsC6Boy(String rteEwsC6Boy) {
		this.rteEwsC6Boy = rteEwsC6Boy;
	}

	public String getRteEwsC6Girl() {
		return rteEwsC6Girl;
	}

	public void setRteEwsC6Girl(String rteEwsC6Girl) {
		this.rteEwsC6Girl = rteEwsC6Girl;
	}

	public String getRteEwsC7Boy() {
		return rteEwsC7Boy;
	}

	public void setRteEwsC7Boy(String rteEwsC7Boy) {
		this.rteEwsC7Boy = rteEwsC7Boy;
	}

	public String getRteEwsC7Girl() {
		return rteEwsC7Girl;
	}

	public void setRteEwsC7Girl(String rteEwsC7Girl) {
		this.rteEwsC7Girl = rteEwsC7Girl;
	}

	public String getRteEwsC8Boy() {
		return rteEwsC8Boy;
	}

	public void setRteEwsC8Boy(String rteEwsC8Boy) {
		this.rteEwsC8Boy = rteEwsC8Boy;
	}

	public String getRteEwsC8Girl() {
		return rteEwsC8Girl;
	}

	public void setRteEwsC8Girl(String rteEwsC8Girl) {
		this.rteEwsC8Girl = rteEwsC8Girl;
	}

	public String getRteEwsC9Boy() {
		return rteEwsC9Boy;
	}

	public void setRteEwsC9Boy(String rteEwsC9Boy) {
		this.rteEwsC9Boy = rteEwsC9Boy;
	}

	public String getRteEwsC9Girl() {
		return rteEwsC9Girl;
	}

	public void setRteEwsC9Girl(String rteEwsC9Girl) {
		this.rteEwsC9Girl = rteEwsC9Girl;
	}

	public String getRteEwsC10Boy() {
		return rteEwsC10Boy;
	}

	public void setRteEwsC10Boy(String rteEwsC10Boy) {
		this.rteEwsC10Boy = rteEwsC10Boy;
	}

	public String getRteEwsC10Girl() {
		return rteEwsC10Girl;
	}

	public void setRteEwsC10Girl(String rteEwsC10Girl) {
		this.rteEwsC10Girl = rteEwsC10Girl;
	}

	public String getRteEwsC11Boy() {
		return rteEwsC11Boy;
	}

	public void setRteEwsC11Boy(String rteEwsC11Boy) {
		this.rteEwsC11Boy = rteEwsC11Boy;
	}

	public String getRteEwsC11Girl() {
		return rteEwsC11Girl;
	}

	public void setRteEwsC11Girl(String rteEwsC11Girl) {
		this.rteEwsC11Girl = rteEwsC11Girl;
	}

	public String getRteEwsC12Boy() {
		return rteEwsC12Boy;
	}

	public void setRteEwsC12Boy(String rteEwsC12Boy) {
		this.rteEwsC12Boy = rteEwsC12Boy;
	}

	public String getRteEwsC12Girl() {
		return rteEwsC12Girl;
	}

	public void setRteEwsC12Girl(String rteEwsC12Girl) {
		this.rteEwsC12Girl = rteEwsC12Girl;
	}

	public String getSpltrgYn() {
		return spltrgYn;
	}

	public void setSpltrgYn(String spltrgYn) {
		this.spltrgYn = spltrgYn;
	}

	public String getSpltrgCyProvGirls() {
		return spltrgCyProvGirls;
	}

	public void setSpltrgCyProvGirls(String spltrgCyProvGirls) {
		this.spltrgCyProvGirls = spltrgCyProvGirls;
	}

	public String getSpltrgCyProvBoys() {
		return spltrgCyProvBoys;
	}

	public void setSpltrgCyProvBoys(String spltrgCyProvBoys) {
		this.spltrgCyProvBoys = spltrgCyProvBoys;
	}

	public String getSpltrgPyEnrolBoys() {
		return spltrgPyEnrolBoys;
	}

	public void setSpltrgPyEnrolBoys(String spltrgPyEnrolBoys) {
		this.spltrgPyEnrolBoys = spltrgPyEnrolBoys;
	}

	public String getSpltrgPyEnrolGirls() {
		return spltrgPyEnrolGirls;
	}

	public void setSpltrgPyEnrolGirls(String spltrgPyEnrolGirls) {
		this.spltrgPyEnrolGirls = spltrgPyEnrolGirls;
	}

	public String getSpltrgPyProvBoys() {
		return spltrgPyProvBoys;
	}

	public void setSpltrgPyProvBoys(String spltrgPyProvBoys) {
		this.spltrgPyProvBoys = spltrgPyProvBoys;
	}

	public String getSpltrgPyProvGirls() {
		return spltrgPyProvGirls;
	}

	public void setSpltrgPyProvGirls(String spltrgPyProvGirls) {
		this.spltrgPyProvGirls = spltrgPyProvGirls;
	}

	public String getSpltrgBy() {
		return spltrgBy;
	}

	public void setSpltrgBy(String spltrgBy) {
		this.spltrgBy = spltrgBy;
	}

	public String getSpltrgPlace() {
		return spltrgPlace;
	}

	public void setSpltrgPlace(String spltrgPlace) {
		this.spltrgPlace = spltrgPlace;
	}

	public String getSpltrgType() {
		return spltrgType;
	}

	public void setSpltrgType(String spltrgType) {
		this.spltrgType = spltrgType;
	}

	public String getRemedialTchEnrol() {
		return remedialTchEnrol;
	}

	public void setRemedialTchEnrol(String remedialTchEnrol) {
		this.remedialTchEnrol = remedialTchEnrol;
	}

	public String getSessionStartMon() {
		return sessionStartMon;
	}

	public void setSessionStartMon(String sessionStartMon) {
		this.sessionStartMon = sessionStartMon;
	}

	public String getTxtbkRecdYn() {
		return txtbkRecdYn;
	}

	public void setTxtbkRecdYn(String txtbkRecdYn) {
		this.txtbkRecdYn = txtbkRecdYn;
	}

	public String getTxtbkRecdMon() {
		return txtbkRecdMon;
	}

	public void setTxtbkRecdMon(String txtbkRecdMon) {
		this.txtbkRecdMon = txtbkRecdMon;
	}

	public String getTxtbkRecdYear1819() {
		return txtbkRecdYear1819;
	}

	public void setTxtbkRecdYear1819(String txtbkRecdYear1819) {
		this.txtbkRecdYear1819 = txtbkRecdYear1819;
	}

	public String getSuppMatRecdYn() {
		return suppMatRecdYn;
	}

	public void setSuppMatRecdYn(String suppMatRecdYn) {
		this.suppMatRecdYn = suppMatRecdYn;
	}

	public String getTxtbkPrePriYn1819() {
		return txtbkPrePriYn1819;
	}

	public void setTxtbkPrePriYn1819(String txtbkPrePriYn1819) {
		this.txtbkPrePriYn1819 = txtbkPrePriYn1819;
	}

	public String getTxtbkPriYn() {
		return txtbkPriYn;
	}

	public void setTxtbkPriYn(String txtbkPriYn) {
		this.txtbkPriYn = txtbkPriYn;
	}

	public String getTxtbkUprYn() {
		return txtbkUprYn;
	}

	public void setTxtbkUprYn(String txtbkUprYn) {
		this.txtbkUprYn = txtbkUprYn;
	}

	public String getTxtbkSecYn() {
		return txtbkSecYn;
	}

	public void setTxtbkSecYn(String txtbkSecYn) {
		this.txtbkSecYn = txtbkSecYn;
	}

	public String getTxtbkHsecYn() {
		return txtbkHsecYn;
	}

	public void setTxtbkHsecYn(String txtbkHsecYn) {
		this.txtbkHsecYn = txtbkHsecYn;
	}

	public String getTlePrePriYn1819() {
		return tlePrePriYn1819;
	}

	public void setTlePrePriYn1819(String tlePrePriYn1819) {
		this.tlePrePriYn1819 = tlePrePriYn1819;
	}

	public String getTlePriYn() {
		return tlePriYn;
	}

	public void setTlePriYn(String tlePriYn) {
		this.tlePriYn = tlePriYn;
	}

	public String getTleUprYn() {
		return tleUprYn;
	}

	public void setTleUprYn(String tleUprYn) {
		this.tleUprYn = tleUprYn;
	}

	public String getTleSecYn() {
		return tleSecYn;
	}

	public void setTleSecYn(String tleSecYn) {
		this.tleSecYn = tleSecYn;
	}

	public String getTleHsecYn() {
		return tleHsecYn;
	}

	public void setTleHsecYn(String tleHsecYn) {
		this.tleHsecYn = tleHsecYn;
	}

	public String getPlaymatPrePriYn1819() {
		return playmatPrePriYn1819;
	}

	public void setPlaymatPrePriYn1819(String playmatPrePriYn1819) {
		this.playmatPrePriYn1819 = playmatPrePriYn1819;
	}

	public String getPlaymatPriYn() {
		return playmatPriYn;
	}

	public void setPlaymatPriYn(String playmatPriYn) {
		this.playmatPriYn = playmatPriYn;
	}

	public String getPlaymatUprYn() {
		return playmatUprYn;
	}

	public void setPlaymatUprYn(String playmatUprYn) {
		this.playmatUprYn = playmatUprYn;
	}

	public String getPlaymatSecYn() {
		return playmatSecYn;
	}

	public void setPlaymatSecYn(String playmatSecYn) {
		this.playmatSecYn = playmatSecYn;
	}

	public String getPlaymatHsecYn() {
		return playmatHsecYn;
	}

	public void setPlaymatHsecYn(String playmatHsecYn) {
		this.playmatHsecYn = playmatHsecYn;
	}

	public String getNoInspect() {
		return noInspect;
	}

	public void setNoInspect(String noInspect) {
		this.noInspect = noInspect;
	}

	public String getNoVisitCrc() {
		return noVisitCrc;
	}

	public void setNoVisitCrc(String noVisitCrc) {
		this.noVisitCrc = noVisitCrc;
	}

	public String getNoVisitBrc() {
		return noVisitBrc;
	}

	public void setNoVisitBrc(String noVisitBrc) {
		this.noVisitBrc = noVisitBrc;
	}

	public String getNoVisitDis() {
		return noVisitDis;
	}

	public void setNoVisitDis(String noVisitDis) {
		this.noVisitDis = noVisitDis;
	}

	public String getCceYnPri() {
		return cceYnPri;
	}

	public void setCceYnPri(String cceYnPri) {
		this.cceYnPri = cceYnPri;
	}

	public String getCceYnUpr() {
		return cceYnUpr;
	}

	public void setCceYnUpr(String cceYnUpr) {
		this.cceYnUpr = cceYnUpr;
	}

	public String getCreatedBy1819() {
		return createdBy1819;
	}

	public void setCreatedBy1819(String createdBy1819) {
		this.createdBy1819 = createdBy1819;
	}

	public String getCreated_time() {
		return created_time;
	}

	public void setCreated_time(String created_time) {
		this.created_time = created_time;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	public String getModified_time() {
		return modified_time;
	}

	public void setModified_time(String modified_time) {
		this.modified_time = modified_time;
	}

}
