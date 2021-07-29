package com.udiseservices.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "sch_profile_2")
public class SchProfileTwo {
	
	@Id
	@Field(value = "_id")
	private String _id;
	
	@Field(name="school_id")
	private String schoolId;

	@Field(name = "udise_sch_code")
	private String udiseSchCode;
	
	@Field(name = "ac_year")
	private String acYear;

	@Field(name="c0_sec")
	private String c0Sec;
	
	@Field(name="c1_sec")
	private String c1Sec;
	
	@Field(name="c2_sec")
	private String c2Sec;
	
	@Field(name="c3_sec")
	private String c3Sec;
	
	@Field(name="c4_sec")
	private String c4Sec;
	
	@Field(name="c5_sec")
	private String c5Sec;
	
	@Field(name="c6_sec")
	private String c6Sec;
	
	@Field(name="c7_sec")
	private String c7Sec;
	
	@Field(name="c8_sec")
	private String c8Sec;
	
	@Field(name="c9_sec")
	private String c9Sec;

	@Field(name="c10_sec")
	private String c10Sec;
	
	@Field(name="c11_sec")
	private String c11Sec;
	
	@Field(name="c12_sec")
	private String c12Sec;
	
	@Field(name="estd_year")
	private String estdYear;
	
	@Field(name="recog_year_ele")
	private String recogYearEle;
	
	@Field(name="recog_year_pri")
	private String recogYearPri;
	  
	@Field(name="recog_year_upr")
	private String recogYearUpr;
	
	@Field(name="recog_year_sec")
	private String recogYearSec;
	
	@Field(name="recog_year_hsec")
	private String recogYearHsec;
	
	@Field(name="upgrd_year_ele")
	private String upgrdYearEle;
	
	@Field(name="upgrd_year_sec")
	private String upgrdYearSec;
	
	@Field(name="upgrd_year_hsec")
	private String upgrdYearHsec;
	
	@Field(name="cwsn_sch_yn")
	private String cwsnSchYn;
	
	@Field(name="shift_sch_yn")
	private String shiftSchYn;
	
	@Field(name="resi_sch_yn")
	private String resiSchYn;
	
	@Field(name="resi_sch_type")
	private String resiSchType;
	
	@Field(name="minority_yn")
	private String minorityYn;
	
	@Field(name="minority_type")
	private String minorityType;
	
	@Field(name="boarding_pri_yn")
	private String boardingPriYn;
	
	@Field(name="boarding_pri_b")
	private String boardingPriBoys;
	
	@Field(name="boarding_pri_g")
	private String boardingPriGirls;
	
	@Field(name="boarding_upr_yn")
	private String boardingUprYn;
	
	@Field(name="boarding_upr_b")
	private String boardingUprBoys;
	
	@Field(name="boarding_upr_g")
	private String boardingUprGirls;
	
	@Field(name="boarding_sec_yn")
	private String boardingSecYn;
	
	@Field(name="boarding_sec_b")
	private String boardingSecBoys;
	
	@Field(name="boarding_sec_g")
	private String boardingSecGirls;
	
	@Field(name="boarding_hsec_yn")
	private String boardingHsecYn;
	
	@Field(name="boarding_hsec_b")
	private String boardingHsecBoys;
	
	@Field(name="boarding_hsec_g")
	private String boardingHsecGirls;
	
	@Field(name="ppsec_yn")
	private String ppSecYN;
	
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

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getC0Sec() {
		return c0Sec;
	}

	public void setC0Sec(String c0Sec) {
		this.c0Sec = c0Sec;
	}

	public String getC1Sec() {
		return c1Sec;
	}

	public void setC1Sec(String c1Sec) {
		this.c1Sec = c1Sec;
	}

	public String getC2Sec() {
		return c2Sec;
	}

	public void setC2Sec(String c2Sec) {
		this.c2Sec = c2Sec;
	}

	public String getC3Sec() {
		return c3Sec;
	}

	public void setC3Sec(String c3Sec) {
		this.c3Sec = c3Sec;
	}

	public String getC4Sec() {
		return c4Sec;
	}

	public void setC4Sec(String c4Sec) {
		this.c4Sec = c4Sec;
	}

	public String getC5Sec() {
		return c5Sec;
	}

	public void setC5Sec(String c5Sec) {
		this.c5Sec = c5Sec;
	}

	public String getC6Sec() {
		return c6Sec;
	}

	public void setC6Sec(String c6Sec) {
		this.c6Sec = c6Sec;
	}

	public String getC7Sec() {
		return c7Sec;
	}

	public void setC7Sec(String c7Sec) {
		this.c7Sec = c7Sec;
	}

	public String getC8Sec() {
		return c8Sec;
	}

	public void setC8Sec(String c8Sec) {
		this.c8Sec = c8Sec;
	}

	public String getC9Sec() {
		return c9Sec;
	}

	public void setC9Sec(String c9Sec) {
		this.c9Sec = c9Sec;
	}

	public String getC10Sec() {
		return c10Sec;
	}

	public void setC10Sec(String c10Sec) {
		this.c10Sec = c10Sec;
	}

	public String getC11Sec() {
		return c11Sec;
	}

	public void setC11Sec(String c11Sec) {
		this.c11Sec = c11Sec;
	}

	public String getC12Sec() {
		return c12Sec;
	}

	public void setC12Sec(String c12Sec) {
		this.c12Sec = c12Sec;
	}

	public String getEstdYear() {
		return estdYear;
	}

	public void setEstdYear(String estdYear) {
		this.estdYear = estdYear;
	}

	public String getRecogYearEle() {
		return recogYearEle;
	}

	public void setRecogYearEle(String recogYearEle) {
		this.recogYearEle = recogYearEle;
	}

	public String getRecogYearPri() {
		return recogYearPri;
	}

	public void setRecogYearPri(String recogYearPri) {
		this.recogYearPri = recogYearPri;
	}

	public String getRecogYearUpr() {
		return recogYearUpr;
	}

	public void setRecogYearUpr(String recogYearUpr) {
		this.recogYearUpr = recogYearUpr;
	}

	public String getRecogYearSec() {
		return recogYearSec;
	}

	public void setRecogYearSec(String recogYearSec) {
		this.recogYearSec = recogYearSec;
	}

	public String getRecogYearHsec() {
		return recogYearHsec;
	}

	public void setRecogYearHsec(String recogYearHsec) {
		this.recogYearHsec = recogYearHsec;
	}

	public String getUpgrdYearEle() {
		return upgrdYearEle;
	}

	public void setUpgrdYearEle(String upgrdYearEle) {
		this.upgrdYearEle = upgrdYearEle;
	}

	public String getUpgrdYearSec() {
		return upgrdYearSec;
	}

	public void setUpgrdYearSec(String upgrdYearSec) {
		this.upgrdYearSec = upgrdYearSec;
	}

	public String getUpgrdYearHsec() {
		return upgrdYearHsec;
	}

	public void setUpgrdYearHsec(String upgrdYearHsec) {
		this.upgrdYearHsec = upgrdYearHsec;
	}

	public String getCwsnSchYn() {
		return cwsnSchYn;
	}

	public void setCwsnSchYn(String cwsnSchYn) {
		this.cwsnSchYn = cwsnSchYn;
	}

	public String getShiftSchYn() {
		return shiftSchYn;
	}

	public void setShiftSchYn(String shiftSchYn) {
		this.shiftSchYn = shiftSchYn;
	}

	public String getResiSchYn() {
		return resiSchYn;
	}

	public void setResiSchYn(String resiSchYn) {
		this.resiSchYn = resiSchYn;
	}

	public String getResiSchType() {
		return resiSchType;
	}

	public void setResiSchType(String resiSchType) {
		this.resiSchType = resiSchType;
	}

	public String getMinorityYn() {
		return minorityYn;
	}

	public void setMinorityYn(String minorityYn) {
		this.minorityYn = minorityYn;
	}

	public String getMinorityType() {
		return minorityType;
	}

	public void setMinorityType(String minorityType) {
		this.minorityType = minorityType;
	}

	public String getBoardingPriYn() {
		return boardingPriYn;
	}

	public void setBoardingPriYn(String boardingPriYn) {
		this.boardingPriYn = boardingPriYn;
	}

	public String getBoardingPriBoys() {
		return boardingPriBoys;
	}

	public void setBoardingPriBoys(String boardingPriBoys) {
		this.boardingPriBoys = boardingPriBoys;
	}

	public String getBoardingPriGirls() {
		return boardingPriGirls;
	}

	public void setBoardingPriGirls(String boardingPriGirls) {
		this.boardingPriGirls = boardingPriGirls;
	}

	public String getBoardingUprYn() {
		return boardingUprYn;
	}

	public void setBoardingUprYn(String boardingUprYn) {
		this.boardingUprYn = boardingUprYn;
	}

	public String getBoardingUprBoys() {
		return boardingUprBoys;
	}

	public void setBoardingUprBoys(String boardingUprBoys) {
		this.boardingUprBoys = boardingUprBoys;
	}

	public String getBoardingUprGirls() {
		return boardingUprGirls;
	}

	public void setBoardingUprGirls(String boardingUprGirls) {
		this.boardingUprGirls = boardingUprGirls;
	}

	public String getBoardingSecYn() {
		return boardingSecYn;
	}

	public void setBoardingSecYn(String boardingSecYn) {
		this.boardingSecYn = boardingSecYn;
	}

	public String getBoardingSecBoys() {
		return boardingSecBoys;
	}

	public void setBoardingSecBoys(String boardingSecBoys) {
		this.boardingSecBoys = boardingSecBoys;
	}

	public String getBoardingSecGirls() {
		return boardingSecGirls;
	}

	public void setBoardingSecGirls(String boardingSecGirls) {
		this.boardingSecGirls = boardingSecGirls;
	}

	public String getBoardingHsecYn() {
		return boardingHsecYn;
	}

	public void setBoardingHsecYn(String boardingHsecYn) {
		this.boardingHsecYn = boardingHsecYn;
	}

	public String getBoardingHsecBoys() {
		return boardingHsecBoys;
	}

	public void setBoardingHsecBoys(String boardingHsecBoys) {
		this.boardingHsecBoys = boardingHsecBoys;
	}

	public String getBoardingHsecGirls() {
		return boardingHsecGirls;
	}

	public void setBoardingHsecGirls(String boardingHsecGirls) {
		this.boardingHsecGirls = boardingHsecGirls;
	}

	public String getPpSecYN() {
		return ppSecYN;
	}

	public void setPpSecYN(String ppSecYN) {
		this.ppSecYN = ppSecYN;
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
