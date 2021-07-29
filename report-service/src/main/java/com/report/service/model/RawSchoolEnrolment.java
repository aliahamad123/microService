package com.report.service.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name = "raw_school_enrolment_fresh")
public class RawSchoolEnrolment {

	@Column(name = "udise_sch_code")
	public String udiseSchCode;

	@Column(name = "ac_year")
	public String Acyear;

	@Column(name = "sch_type")
	public String schType;

	@Column(name = "state_cd")
	public String stateCd;

	@Column(name = "district_cd")
	public String districtCd;

	@Column(name = "block_cd")
	public String blockCd;

	@Column(name = "state_id")
	public Integer stateId;

	@Column(name = "district_id")
	public Integer districtId;

	@Column(name = "block_id")
	public Integer blockId;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "school_id")
	public Integer schoolId;

	@Column(name = "school_name")
	public String schoolName;

	@Column(name = "sch_category_id")
	public Integer schCategoryId;

	@Column(name = "sch_mgmt_id")
	public Integer schMgmtId;

	
	@Column(name = "item_id")
	public Integer itemId;

	@Column(name = "item_group")
	public Integer itemGroup;

	@Column(name = "tot_b_c0")
	public Integer totBoysC0;

	@Column(name = "tot_g_c0")
	public Integer totGirlsC0;

	@Column(name = "tot_b_c1")
	public Integer totBoysC1;

	@Column(name = "tot_g_c1")
	public Integer totGirlsC1;

	@Column(name = "tot_b_c2")
	public Integer totBoysC2;

	@Column(name = "tot_g_c2")
	public Integer totGirlsC2;

	@Column(name = "tot_b_c3")
	public Integer totBoysC3;

	@Column(name = "tot_g_c3")
	public Integer totGirlsC3;

	@Column(name = "tot_b_c4")
	public Integer totBoysC4;

	@Column(name = "tot_g_c4")
	public Integer totGirlsC4;

	@Column(name = "tot_b_c5")
	public Integer totBoysC5;

	@Column(name = "tot_g_c5")
	public Integer totGirlsC5;

	@Column(name = "tot_b_c6")
	public Integer totBoysC6;

	@Column(name = "tot_g_c6")
	public Integer totGirlsC6;

	@Column(name = "tot_b_c7")
	public Integer totBoysC7;

	@Column(name = "tot_g_c7")
	public Integer totGirlsC7;

	@Column(name = "tot_b_c8")
	public Integer totBoysC8;

	@Column(name = "tot_g_c8")
	public Integer totGirlsC8;

	@Column(name = "tot_b_c9")
	public Integer totBoysC9;

	@Column(name = "tot_g_c9")
	public Integer totGirlsC9;

	@Column(name = "tot_b_c10")
	public Integer totBoysC10;

	@Column(name = "tot_g_c10")
	public Integer totGirlsC10;

	@Column(name = "tot_b_c11")
	public Integer totBoysC11;

	@Column(name = "tot_g_c11")
	public Integer totGirlsC11;

	@Column(name = "tot_b_c12")
	public Integer totBoysC12;

	@Column(name = "tot_g_c12")
	public Integer totGirlsC12;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_on", nullable = false)
	@LastModifiedDate
	private Date updatedAt;

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUdiseSchCode() {
		return udiseSchCode;
	}

	public void setUdiseSchCode(String udiseSchCode) {
		this.udiseSchCode = udiseSchCode;
	}

	public String getAcyear() {
		return Acyear;
	}

	public void setAcyear(String acyear) {
		Acyear = acyear;
	}

	public String getSchType() {
		return schType;
	}

	public void setSchType(String schType) {
		this.schType = schType;
	}

	public String getStateCd() {
		return stateCd;
	}

	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}

	public String getDistrictCd() {
		return districtCd;
	}

	public void setDistrictCd(String districtCd) {
		this.districtCd = districtCd;
	}

	public String getBlockCd() {
		return blockCd;
	}

	public void setBlockCd(String blockCd) {
		this.blockCd = blockCd;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public Integer getBlockId() {
		return blockId;
	}

	public void setBlockId(Integer blockId) {
		this.blockId = blockId;
	}

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Integer getSchCategoryId() {
		return schCategoryId;
	}

	public void setSchCategoryId(Integer schCategoryId) {
		this.schCategoryId = schCategoryId;
	}

	public Integer getSchMgmtId() {
		return schMgmtId;
	}

	public void setSchMgmtId(Integer schMgmtId) {
		this.schMgmtId = schMgmtId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(Integer itemGroup) {
		this.itemGroup = itemGroup;
	}

	public Integer getTotBoysC0() {
		return totBoysC0;
	}

	public void setTotBoysC0(Integer totBoysC0) {
		this.totBoysC0 = totBoysC0;
	}

	public Integer getTotGirlsC0() {
		return totGirlsC0;
	}

	public void setTotGirlsC0(Integer totGirlsC0) {
		this.totGirlsC0 = totGirlsC0;
	}

	public Integer getTotBoysC1() {
		return totBoysC1;
	}

	public void setTotBoysC1(Integer totBoysC1) {
		this.totBoysC1 = totBoysC1;
	}

	public Integer getTotGirlsC1() {
		return totGirlsC1;
	}

	public void setTotGirlsC1(Integer totGirlsC1) {
		this.totGirlsC1 = totGirlsC1;
	}

	public Integer getTotBoysC2() {
		return totBoysC2;
	}

	public void setTotBoysC2(Integer totBoysC2) {
		this.totBoysC2 = totBoysC2;
	}

	public Integer getTotGirlsC2() {
		return totGirlsC2;
	}

	public void setTotGirlsC2(Integer totGirlsC2) {
		this.totGirlsC2 = totGirlsC2;
	}

	public Integer getTotBoysC3() {
		return totBoysC3;
	}

	public void setTotBoysC3(Integer totBoysC3) {
		this.totBoysC3 = totBoysC3;
	}

	public Integer getTotGirlsC3() {
		return totGirlsC3;
	}

	public void setTotGirlsC3(Integer totGirlsC3) {
		this.totGirlsC3 = totGirlsC3;
	}

	public Integer getTotBoysC4() {
		return totBoysC4;
	}

	public void setTotBoysC4(Integer totBoysC4) {
		this.totBoysC4 = totBoysC4;
	}

	public Integer getTotGirlsC4() {
		return totGirlsC4;
	}

	public void setTotGirlsC4(Integer totGirlsC4) {
		this.totGirlsC4 = totGirlsC4;
	}

	public Integer getTotBoysC5() {
		return totBoysC5;
	}

	public void setTotBoysC5(Integer totBoysC5) {
		this.totBoysC5 = totBoysC5;
	}

	public Integer getTotGirlsC5() {
		return totGirlsC5;
	}

	public void setTotGirlsC5(Integer totGirlsC5) {
		this.totGirlsC5 = totGirlsC5;
	}

	public Integer getTotBoysC6() {
		return totBoysC6;
	}

	public void setTotBoysC6(Integer totBoysC6) {
		this.totBoysC6 = totBoysC6;
	}

	public Integer getTotGirlsC6() {
		return totGirlsC6;
	}

	public void setTotGirlsC6(Integer totGirlsC6) {
		this.totGirlsC6 = totGirlsC6;
	}

	public Integer getTotBoysC7() {
		return totBoysC7;
	}

	public void setTotBoysC7(Integer totBoysC7) {
		this.totBoysC7 = totBoysC7;
	}

	public Integer getTotGirlsC7() {
		return totGirlsC7;
	}

	public void setTotGirlsC7(Integer totGirlsC7) {
		this.totGirlsC7 = totGirlsC7;
	}

	public Integer getTotBoysC8() {
		return totBoysC8;
	}

	public void setTotBoysC8(Integer totBoysC8) {
		this.totBoysC8 = totBoysC8;
	}

	public Integer getTotGirlsC8() {
		return totGirlsC8;
	}

	public void setTotGirlsC8(Integer totGirlsC8) {
		this.totGirlsC8 = totGirlsC8;
	}

	public Integer getTotBoysC9() {
		return totBoysC9;
	}

	public void setTotBoysC9(Integer totBoysC9) {
		this.totBoysC9 = totBoysC9;
	}

	public Integer getTotGirlsC9() {
		return totGirlsC9;
	}

	public void setTotGirlsC9(Integer totGirlsC9) {
		this.totGirlsC9 = totGirlsC9;
	}

	public Integer getTotBoysC10() {
		return totBoysC10;
	}

	public void setTotBoysC10(Integer totBoysC10) {
		this.totBoysC10 = totBoysC10;
	}

	public Integer getTotGirlsC10() {
		return totGirlsC10;
	}

	public void setTotGirlsC10(Integer totGirlsC10) {
		this.totGirlsC10 = totGirlsC10;
	}

	public Integer getTotBoysC11() {
		return totBoysC11;
	}

	public void setTotBoysC11(Integer totBoysC11) {
		this.totBoysC11 = totBoysC11;
	}

	public Integer getTotGirlsC11() {
		return totGirlsC11;
	}

	public void setTotGirlsC11(Integer totGirlsC11) {
		this.totGirlsC11 = totGirlsC11;
	}

	public Integer getTotBoysC12() {
		return totBoysC12;
	}

	public void setTotBoysC12(Integer totBoysC12) {
		this.totBoysC12 = totBoysC12;
	}

	public Integer getTotGirlsC12() {
		return totGirlsC12;
	}

	public void setTotGirlsC12(Integer totGirlsC12) {
		this.totGirlsC12 = totGirlsC12;
	}

}
