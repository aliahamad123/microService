package com.udiseservices.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

public class SchFacilityOne {
	@Id
	@Field(value = "_id")
	private String _id;
	
	@Field(value = "school_id")
	private Integer schoolId;
	
	@Field(value = "udise_sch_code")
	private String udiseSchCode;
	
	@Field(value = "ac_year")
	private String acYear;
	
	@Field(value = "bld_status")
	private String buildStatus;
	
	@Field(value = "bld_blk_tot")
	private String buildBlkTot;
	
	@Field(value = "bld_blk")
	private String buildBlk;
	
	@Field(value = "bld_blk_ppu")
	private String buildBlkPpu;
	
	@Field(value = "bld_blk_kuc")
	private String buildBlkKuc;
	
	@Field(value = "bld_blk_tnt")
	private String buildBlkTnt;
	
	@Field(value = "bndrywall_type")
	private String bndrywallType;
	
	@Field(value = "clsrms_inst")
	private String clsrmsInst;
	
	@Field(value = "clsrms_und_cons")
	private String clsrmsUndCons;
	
	@Field(value = "clsrms_dptd")
	private String clsrmsDptd;
	
	@Field(value = "furnt_yn")
	private String furntYN1819;
	
	@Field(value = "clsrms_pre_pri")
	private String clsrmsPrePri;
	
	@Field(value = "clsrms_pri")
	private String clsrmsPri;
	
	@Field(value = "clsrms_upr")
	private String clsrmsUpr;
	
	@Field(value = "clsrms_ele")
	private String clsrmsEle;
	
	@Field(value = "clsrms_sec")
	private String clsrmsSec;
	
	@Field(value = "clsrms_hsec")
	private String clsrmsHsec;
	
	@Field(value = "othrooms")
	private String othRooms;
	
	@Field(value = "clsrms_gd")
	private String clsrmsGood;
	
	@Field(value = "clsrms_gd_ppu")
	private String clsrmsGoodPpu;
	
	@Field(value = "clsrms_gd_kuc")
	private String clsrmsGoodKuc;
	
	@Field(value = "clsrms_gd_tnt")
	private String clsrmsGoodTnt;
	
	@Field(value = "clsrms_min")
	private String clsrmsMin;
	
	@Field(value = "clsrms_min_ppu")
	private String clsrmsMinPpu;
	
	@Field(value = "clsrms_min_kun")
	private String clsrmsMinKun;
	
	@Field(value = "clsrms_min_tnt")
	private String clsrmsMinTnt;
	
	@Field(value = "clsrms_maj")
	private String clsrmsMajer;
	
	@Field(value = "clsrms_maj_ppu")
	private String clsrmsMajerPpu;
	
	@Field(value = "clsrms_maj_kuc")
	private String clsrmsMajerKuc;
	
	@Field(value = "clsrms_maj_tnt")
	private String clsrmsMajTnt;
	
	@Field(value = "land_avl_yn")
	private String landAvlbleYN;
	
	@Field(value = "hm_room_yn")
	private String hmRoomYN;
	
	@Field(value = "created_by")
	private String createdBy1819;
	
	@Field(value = "created_time")
	private String createdTime;
	
	@Field(value = "modified_by")
	private String modifiedBy;
	
	@Field(value = "modified_time")
	private String modifiedTime;
	
	@Field(value = "bld_blk_dptd")
	private String buildBlkDptd;
	
	@Field(value = "bld_blk_undcons")
	private String buildBlkUndcons;
	

	public String getFurntYN1819() {
		return furntYN1819;
	}

	public void setFurntYN1819(String furntYN1819) {
		this.furntYN1819 = furntYN1819;
	}

	public String getClsrmsEle() {
		return clsrmsEle;
	}

	public void setClsrmsEle(String clsrmsEle) {
		this.clsrmsEle = clsrmsEle;
	}

	public String getCreatedBy1819() {
		return createdBy1819;
	}

	public void setCreatedBy1819(String createdBy1819) {
		this.createdBy1819 = createdBy1819;
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

	public String getAcYear() {
		return acYear;
	}

	public void setAcYear(String acYear) {
		this.acYear = acYear;
	}

	public String getBuildStatus() {
		return buildStatus;
	}

	public void setBuildStatus(String buildStatus) {
		this.buildStatus = buildStatus;
	}

	public String getBuildBlkTot() {
		return buildBlkTot;
	}

	public void setBuildBlkTot(String buildBlkTot) {
		this.buildBlkTot = buildBlkTot;
	}

	public String getBuildBlk() {
		return buildBlk;
	}

	public void setBuildBlk(String buildBlk) {
		this.buildBlk = buildBlk;
	}

	public String getBuildBlkPpu() {
		return buildBlkPpu;
	}

	public void setBuildBlkPpu(String buildBlkPpu) {
		this.buildBlkPpu = buildBlkPpu;
	}

	public String getBuildBlkKuc() {
		return buildBlkKuc;
	}

	public void setBuildBlkKuc(String buildBlkKuc) {
		this.buildBlkKuc = buildBlkKuc;
	}

	public String getBuildBlkTnt() {
		return buildBlkTnt;
	}

	public void setBuildBlkTnt(String buildBlkTnt) {
		this.buildBlkTnt = buildBlkTnt;
	}

	public String getBndrywallType() {
		return bndrywallType;
	}

	public void setBndrywallType(String bndrywallType) {
		this.bndrywallType = bndrywallType;
	}

	public String getClsrmsInst() {
		return clsrmsInst;
	}

	public void setClsrmsInst(String clsrmsInst) {
		this.clsrmsInst = clsrmsInst;
	}

	public String getClsrmsUndCons() {
		return clsrmsUndCons;
	}

	public void setClsrmsUndCons(String clsrmsUndCons) {
		this.clsrmsUndCons = clsrmsUndCons;
	}

	public String getClsrmsDptd() {
		return clsrmsDptd;
	}

	public void setClsrmsDptd(String clsrmsDptd) {
		this.clsrmsDptd = clsrmsDptd;
	}

	public String getClsrmsPrePri() {
		return clsrmsPrePri;
	}

	public void setClsrmsPrePri(String clsrmsPrePri) {
		this.clsrmsPrePri = clsrmsPrePri;
	}

	public String getClsrmsPri() {
		return clsrmsPri;
	}

	public void setClsrmsPri(String clsrmsPri) {
		this.clsrmsPri = clsrmsPri;
	}

	public String getClsrmsUpr() {
		return clsrmsUpr;
	}

	public void setClsrmsUpr(String clsrmsUpr) {
		this.clsrmsUpr = clsrmsUpr;
	}

	public String getClsrmsSec() {
		return clsrmsSec;
	}

	public void setClsrmsSec(String clsrmsSec) {
		this.clsrmsSec = clsrmsSec;
	}

	public String getClsrmsHsec() {
		return clsrmsHsec;
	}

	public void setClsrmsHsec(String clsrmsHsec) {
		this.clsrmsHsec = clsrmsHsec;
	}

	public String getOthRooms() {
		return othRooms;
	}

	public void setOthRooms(String othRooms) {
		this.othRooms = othRooms;
	}

	public String getClsrmsGood() {
		return clsrmsGood;
	}

	public void setClsrmsGood(String clsrmsGood) {
		this.clsrmsGood = clsrmsGood;
	}

	public String getClsrmsGoodPpu() {
		return clsrmsGoodPpu;
	}

	public void setClsrmsGoodPpu(String clsrmsGoodPpu) {
		this.clsrmsGoodPpu = clsrmsGoodPpu;
	}

	public String getClsrmsGoodKuc() {
		return clsrmsGoodKuc;
	}

	public void setClsrmsGoodKuc(String clsrmsGoodKuc) {
		this.clsrmsGoodKuc = clsrmsGoodKuc;
	}

	public String getClsrmsGoodTnt() {
		return clsrmsGoodTnt;
	}

	public void setClsrmsGoodTnt(String clsrmsGoodTnt) {
		this.clsrmsGoodTnt = clsrmsGoodTnt;
	}

	public String getClsrmsMin() {
		return clsrmsMin;
	}

	public void setClsrmsMin(String clsrmsMin) {
		this.clsrmsMin = clsrmsMin;
	}

	public String getClsrmsMinPpu() {
		return clsrmsMinPpu;
	}

	public void setClsrmsMinPpu(String clsrmsMinPpu) {
		this.clsrmsMinPpu = clsrmsMinPpu;
	}

	public String getClsrmsMinKun() {
		return clsrmsMinKun;
	}

	public void setClsrmsMinKun(String clsrmsMinKun) {
		this.clsrmsMinKun = clsrmsMinKun;
	}

	public String getClsrmsMinTnt() {
		return clsrmsMinTnt;
	}

	public void setClsrmsMinTnt(String clsrmsMinTnt) {
		this.clsrmsMinTnt = clsrmsMinTnt;
	}

	public String getClsrmsMajer() {
		return clsrmsMajer;
	}

	public void setClsrmsMajer(String clsrmsMajer) {
		this.clsrmsMajer = clsrmsMajer;
	}

	public String getClsrmsMajerPpu() {
		return clsrmsMajerPpu;
	}

	public void setClsrmsMajerPpu(String clsrmsMajerPpu) {
		this.clsrmsMajerPpu = clsrmsMajerPpu;
	}

	public String getClsrmsMajerKuc() {
		return clsrmsMajerKuc;
	}

	public void setClsrmsMajerKuc(String clsrmsMajerKuc) {
		this.clsrmsMajerKuc = clsrmsMajerKuc;
	}

	public String getClsrmsMajTnt() {
		return clsrmsMajTnt;
	}

	public void setClsrmsMajTnt(String clsrmsMajTnt) {
		this.clsrmsMajTnt = clsrmsMajTnt;
	}

	public String getLandAvlbleYN() {
		return landAvlbleYN;
	}

	public void setLandAvlbleYN(String landAvlbleYN) {
		this.landAvlbleYN = landAvlbleYN;
	}

	public String getHmRoomYN() {
		return hmRoomYN;
	}

	public void setHmRoomYN(String hmRoomYN) {
		this.hmRoomYN = hmRoomYN;
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

	public String getBuildBlkDptd() {
		return buildBlkDptd;
	}

	public void setBuildBlkDptd(String buildBlkDptd) {
		this.buildBlkDptd = buildBlkDptd;
	}

	public String getBuildBlkUndcons() {
		return buildBlkUndcons;
	}

	public void setBuildBlkUndcons(String buildBlkUndcons) {
		this.buildBlkUndcons = buildBlkUndcons;
	}

}
