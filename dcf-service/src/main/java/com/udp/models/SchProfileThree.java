package com.udp.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "full_profile")
public class SchProfileThree {
	
	@Id
	@Field(value = "_id")
	private String _id;
	
	
	@Field(name="school_id")
	private Integer schoolId;

	@Field(name = "udise_sch_code")
	private String udiseSchCode;
	
	@Field(name = "ac_year")
	private String acYear;

	@Field(name = "mtongue_pri")
	private String mtonguePri;

	@Field(name = "medinstr1")
	private String medinstr1;

	@Field(name = "medinstr2")
	private String medinstr2;

	@Field(name = "medinstr3")
	private String medinstr3;

	@Field(name = "medinstr4")
	private String medinstr4;

	@Field(name = "medinstr_oth")
	private String medinstrOther;

	@Field(name = "lang1")
	private String lang1;

	@Field(name = "lang2")
	private String lang2;

	@Field(name = "lang3")
	private String lang3;

	@Field(name = "prevoc_yn")
	private String prevocYn;
	
	@Field(name="eduvoc_yn")
	private String eduvocYn;
	
	@Field(name="board_sec")
	private String boardSec;
	
	@Field(name="board_sec_no")
	private String boardSecNo;
	
	@Field(name="board_sec_oth")
	private String boardSecOth;
	
	@Field(name="board_hsec")
	private String boardHsec;
	
	@Field(name="board_hsec_no")
	private String boardHsecNo;
	
	@Field(name="board_hsec_oth")
	private String boardHsecOth;
	
	@Field(name="distance_pri")
	private String distancePri;
	
	@Field(name="distance_upr")
	private String distanceUpr;
	
	@Field(name="distance_sec")
	private String distanceSec;

	@Field(name="distance_hsec")
	private String distanceHsec;
	
	@Field(name="approach_road_yn")
	private String approachRoadYn;
	
	@Field(name="ppsec_yn")
	private String ppSecYN1819;
	
	@Field(name="ppsec_stu")
	private String ppSecStu1819;
	
	@Field(name="ppsec_tch")
	private String ppSecTch1819;
	
	@Field(name="anganwadi_yn")
	private String anganwadiYn;
	
	@Field(name="anganwadi_code")
	private String anganwadiCode;
	
	@Field(name="anganwadi_stu")
	private String anganwadiStu;
	
	@Field(name="anganwadi_tch_trained")
	private String anganwadiTchTrained;
	
	@Field(name="anganwadi_tch")
	private String anganwadiTch;
	
	@Field(name="workdays_pre_pri")
	private String workdaysPrePri1819;
	
	@Field(name="workdays_pri")
	private String workdaysPri;
	
	@Field(name="workdays_upr")
	private String workdaysUpr;
	
	@Field(name="workdays_sec")
	private String workdaysSec;
	
	@Field(name="workdays_hsec")
	private String workdaysHsec;
	
	@Field(name="sch_hrs_stu_pre_pri")
	private String schHrsStuPrePri1819;
	
	@Field(name="sch_hrs_stu_pri")
	private String schHrsStuPri;
	
	@Field(name="sch_hrs_stu_upr")
	private String schHrsStuUpr;
	
	@Field(name="sch_hrs_stu_sec")
	private String schHrsStuSec;
	
	@Field(name="sch_hrs_stu_hsec")
	private String schHrsStuHsec;
	
	@Field(name="sch_hrs_tch_pre_pri")
	private String schHrsTchPrePri1819;
	
	@Field(name="sch_hrs_tch_pri")
	private String schHrsTchPri;
	
	@Field(name="sch_hrs_tch_upr")
	private String schHrsTchUpr;
	
	@Field(name="sch_hrs_tch_sec")
	private String schHrsTchSec;
	
	@Field(name="sch_hrs_tch_hsec")
	private String schHrsTchHsec;
	
	@Field(name="anganwadi_stu_b")
	private String anganwadiStuBoys;
	
	@Field(name="anganwadi_stu_g")
	private String anganwadiStuGirls;
	
	@Field(name="ppstu_lkg_b")
	private String ppstuLkgBoys1819;
	
	@Field(name="ppstu_lkg_g")
	private String ppstuLkgGirls1819;
	
	@Field(name="ppstu_ukg_b")
	private String ppstuUkgBoys1819;
	
	@Field(name="ppstu_ukg_g")
	private String ppstuUkgGirls1819;
	
	@Field(name="created_by")
	private String createdBy1819;
	
	@Field(name="created_time")
	private String created_time;
	
	@Field(name="modified_by")
	private String modified_by;
	
	@Field(name="modified_time")
	private String modified_time;


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

	public String getMtonguePri() {
		return mtonguePri;
	}

	public void setMtonguePri(String mtonguePri) {
		this.mtonguePri = mtonguePri;
	}

	public String getMedinstr1() {
		return medinstr1;
	}

	public void setMedinstr1(String medinstr1) {
		this.medinstr1 = medinstr1;
	}

	public String getMedinstr2() {
		return medinstr2;
	}

	public void setMedinstr2(String medinstr2) {
		this.medinstr2 = medinstr2;
	}

	public String getMedinstr3() {
		return medinstr3;
	}

	public void setMedinstr3(String medinstr3) {
		this.medinstr3 = medinstr3;
	}

	public String getMedinstr4() {
		return medinstr4;
	}

	public void setMedinstr4(String medinstr4) {
		this.medinstr4 = medinstr4;
	}

	public String getMedinstrOther() {
		return medinstrOther;
	}

	public void setMedinstrOther(String medinstrOther) {
		this.medinstrOther = medinstrOther;
	}

	public String getLang1() {
		return lang1;
	}

	public void setLang1(String lang1) {
		this.lang1 = lang1;
	}

	public String getLang2() {
		return lang2;
	}

	public void setLang2(String lang2) {
		this.lang2 = lang2;
	}

	public String getLang3() {
		return lang3;
	}

	public void setLang3(String lang3) {
		this.lang3 = lang3;
	}

	public String getPrevocYn() {
		return prevocYn;
	}

	public void setPrevocYn(String prevocYn) {
		this.prevocYn = prevocYn;
	}


	public String getSchHrsStuPri() {
		return schHrsStuPri;
	}

	public void setSchHrsStuPri(String schHrsStuPri) {
		this.schHrsStuPri = schHrsStuPri;
	}

	public String getSchHrsStuUpr() {
		return schHrsStuUpr;
	}

	public void setSchHrsStuUpr(String schHrsStuUpr) {
		this.schHrsStuUpr = schHrsStuUpr;
	}

	public String getSchHrsStuSec() {
		return schHrsStuSec;
	}

	public void setSchHrsStuSec(String schHrsStuSec) {
		this.schHrsStuSec = schHrsStuSec;
	}

	public String getSchHrsStuHsec() {
		return schHrsStuHsec;
	}

	public void setSchHrsStuHsec(String schHrsStuHsec) {
		this.schHrsStuHsec = schHrsStuHsec;
	}

	public String getSchHrsTchPri() {
		return schHrsTchPri;
	}

	public void setSchHrsTchPri(String schHrsTchPri) {
		this.schHrsTchPri = schHrsTchPri;
	}

	public String getSchHrsTchUpr() {
		return schHrsTchUpr;
	}

	public void setSchHrsTchUpr(String schHrsTchUpr) {
		this.schHrsTchUpr = schHrsTchUpr;
	}

	public String getSchHrsTchSec() {
		return schHrsTchSec;
	}

	public void setSchHrsTchSec(String schHrsTchSec) {
		this.schHrsTchSec = schHrsTchSec;
	}

	public String getSchHrsTchHsec() {
		return schHrsTchHsec;
	}

	public void setSchHrsTchHsec(String schHrsTchHsec) {
		this.schHrsTchHsec = schHrsTchHsec;
	}

	public void setSchHrsTchPrePri1819(String schHrsTchPrePri1819) {
		this.schHrsTchPrePri1819 = schHrsTchPrePri1819;
	}

	public String getCreated_time() {
		return created_time;
	}

	public void setCreated_time(String created_time) {
		this.created_time = created_time;
	}

	public String getModified_time() {
		return modified_time;
	}

	public void setModified_time(String modified_time) {
		this.modified_time = modified_time;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}


	public String getSchHrsStuPrePri1819() {
		return schHrsStuPrePri1819;
	}

	public void setSchHrsStuPrePri1819(String schHrsStuPrePri1819) {
		this.schHrsStuPrePri1819 = schHrsStuPrePri1819;
	}

	public String getSchHrsTchPrePri1819() {
		return schHrsTchPrePri1819;
	}

	public String getCreatedBy1819() {
		return createdBy1819;
	}

	public void setCreatedBy1819(String createdBy1819) {
		this.createdBy1819 = createdBy1819;
	}

	public String getEduvocYn() {
		return eduvocYn;
	}

	public void setEduvocYn(String eduvocYn) {
		this.eduvocYn = eduvocYn;
	}

	public String getBoardSec() {
		return boardSec;
	}

	public void setBoardSec(String boardSec) {
		this.boardSec = boardSec;
	}

	public String getBoardSecNo() {
		return boardSecNo;
	}

	public void setBoardSecNo(String boardSecNo) {
		this.boardSecNo = boardSecNo;
	}

	public String getBoardSecOth() {
		return boardSecOth;
	}

	public void setBoardSecOth(String boardSecOth) {
		this.boardSecOth = boardSecOth;
	}

	public String getBoardHsec() {
		return boardHsec;
	}

	public void setBoardHsec(String boardHsec) {
		this.boardHsec = boardHsec;
	}

	public String getBoardHsecNo() {
		return boardHsecNo;
	}

	public void setBoardHsecNo(String boardHsecNo) {
		this.boardHsecNo = boardHsecNo;
	}

	public String getBoardHsecOth() {
		return boardHsecOth;
	}

	public void setBoardHsecOth(String boardHsecOth) {
		this.boardHsecOth = boardHsecOth;
	}

	public String getDistancePri() {
		return distancePri;
	}

	public void setDistancePri(String distancePri) {
		this.distancePri = distancePri;
	}

	public String getDistanceUpr() {
		return distanceUpr;
	}

	public void setDistanceUpr(String distanceUpr) {
		this.distanceUpr = distanceUpr;
	}

	public String getDistanceSec() {
		return distanceSec;
	}

	public void setDistanceSec(String distanceSec) {
		this.distanceSec = distanceSec;
	}

	public String getDistanceHsec() {
		return distanceHsec;
	}

	public void setDistanceHsec(String distanceHsec) {
		this.distanceHsec = distanceHsec;
	}

	public String getApproachRoadYn() {
		return approachRoadYn;
	}

	public void setApproachRoadYn(String approachRoadYn) {
		this.approachRoadYn = approachRoadYn;
	}

	public String getPpSecYN1819() {
		return ppSecYN1819;
	}

	public void setPpSecYN1819(String ppSecYN1819) {
		this.ppSecYN1819 = ppSecYN1819;
	}

	public String getPpSecStu1819() {
		return ppSecStu1819;
	}

	public void setPpSecStu1819(String ppSecStu1819) {
		this.ppSecStu1819 = ppSecStu1819;
	}

	public String getPpSecTch1819() {
		return ppSecTch1819;
	}

	public void setPpSecTch1819(String ppSecTch1819) {
		this.ppSecTch1819 = ppSecTch1819;
	}

	public String getAnganwadiYn() {
		return anganwadiYn;
	}

	public void setAnganwadiYn(String anganwadiYn) {
		this.anganwadiYn = anganwadiYn;
	}

	public String getAnganwadiCode() {
		return anganwadiCode;
	}

	public void setAnganwadiCode(String anganwadiCode) {
		this.anganwadiCode = anganwadiCode;
	}

	public String getAnganwadiStu() {
		return anganwadiStu;
	}

	public void setAnganwadiStu(String anganwadiStu) {
		this.anganwadiStu = anganwadiStu;
	}

	public String getAnganwadiTchTrained() {
		return anganwadiTchTrained;
	}

	public void setAnganwadiTchTrained(String anganwadiTchTrained) {
		this.anganwadiTchTrained = anganwadiTchTrained;
	}

	public String getAnganwadiTch() {
		return anganwadiTch;
	}

	public void setAnganwadiTch(String anganwadiTch) {
		this.anganwadiTch = anganwadiTch;
	}

	public String getWorkdaysPrePri1819() {
		return workdaysPrePri1819;
	}

	public void setWorkdaysPrePri1819(String workdaysPrePri1819) {
		this.workdaysPrePri1819 = workdaysPrePri1819;
	}

	public String getWorkdaysPri() {
		return workdaysPri;
	}

	public void setWorkdaysPri(String workdaysPri) {
		this.workdaysPri = workdaysPri;
	}

	public String getWorkdaysUpr() {
		return workdaysUpr;
	}

	public void setWorkdaysUpr(String workdaysUpr) {
		this.workdaysUpr = workdaysUpr;
	}

	public String getWorkdaysSec() {
		return workdaysSec;
	}

	public void setWorkdaysSec(String workdaysSec) {
		this.workdaysSec = workdaysSec;
	}

	public String getWorkdaysHsec() {
		return workdaysHsec;
	}

	public void setWorkdaysHsec(String workdaysHsec) {
		this.workdaysHsec = workdaysHsec;
	}

	public String getAnganwadiStuBoys() {
		return anganwadiStuBoys;
	}

	public void setAnganwadiStuBoys(String anganwadiStuBoys) {
		this.anganwadiStuBoys = anganwadiStuBoys;
	}

	public String getAnganwadiStuGirls() {
		return anganwadiStuGirls;
	}

	public void setAnganwadiStuGirls(String anganwadiStuGirls) {
		this.anganwadiStuGirls = anganwadiStuGirls;
	}

	public String getPpstuLkgBoys1819() {
		return ppstuLkgBoys1819;
	}

	public void setPpstuLkgBoys1819(String ppstuLkgBoys1819) {
		this.ppstuLkgBoys1819 = ppstuLkgBoys1819;
	}

	public String getPpstuLkgGirls1819() {
		return ppstuLkgGirls1819;
	}

	public void setPpstuLkgGirls1819(String ppstuLkgGirls1819) {
		this.ppstuLkgGirls1819 = ppstuLkgGirls1819;
	}

	public String getPpstuUkgBoys1819() {
		return ppstuUkgBoys1819;
	}

	public void setPpstuUkgBoys1819(String ppstuUkgBoys1819) {
		this.ppstuUkgBoys1819 = ppstuUkgBoys1819;
	}

	public String getPpstuUkgGirls1819() {
		return ppstuUkgGirls1819;
	}

	public void setPpstuUkgGirls1819(String ppstuUkgGirls1819) {
		this.ppstuUkgGirls1819 = ppstuUkgGirls1819;
	}
	
	

}
