package com.udp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "sch_staff_posn")
public class TeacherOne {
	
		@Id
		@Field(value = "_id")
		private String _id;

		@Field(name = "school_id")
		private Integer schoolId;
		
		@Field(name = "ac_year")
		private String acYear;

		@Field(name = "udise_sch_code")
		private String udiseSchCode;

		@Field(name = "tch_regular")
		private String tchRegular;

		@Field(name = "tch_contract")
		private String tchContract;

		@Field(name = "tch_part_time")
		private String tchPartTime;

		@Field(name = "nontch_accnt")
		private String nontchAccnt;

		@Field(name = "nontch_lib_asst")
		private String nontchLibAsst;

		@Field(name = "nontch_lab_asst")
		private String nontchLabAsst;
	
		@Field(name = "nontch_udc")
		private String nonTchUdc;

		@Field(name = "nontch_ldc")
		private String nonTchLdc;

		@Field(name = "nontch_peon")
		private String nonTchPeon;

		@Field(name = "nontch_watchman")
		private String nonTchWatchman;

		@Field(name = "tch_hav_adhr")
		private String tchHavAdhr;
		
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

		public String getTchRegular() {
			return tchRegular;
		}

		public void setTchRegular(String tchRegular) {
			this.tchRegular = tchRegular;
		}

		public String getTchContract() {
			return tchContract;
		}

		public void setTchContract(String tchContract) {
			this.tchContract = tchContract;
		}

		public String getTchPartTime() {
			return tchPartTime;
		}

		public void setTchPartTime(String tchPartTime) {
			this.tchPartTime = tchPartTime;
		}

		public String getNontchAccnt() {
			return nontchAccnt;
		}

		public void setNontchAccnt(String nontchAccnt) {
			this.nontchAccnt = nontchAccnt;
		}

		public String getNontchLibAsst() {
			return nontchLibAsst;
		}

		public void setNontchLibAsst(String nontchLibAsst) {
			this.nontchLibAsst = nontchLibAsst;
		}

		public String getNontchLabAsst() {
			return nontchLabAsst;
		}

		public void setNontchLabAsst(String nontchLabAsst) {
			this.nontchLabAsst = nontchLabAsst;
		}

		public String getNonTchUdc() {
			return nonTchUdc;
		}

		public void setNonTchUdc(String nonTchUdc) {
			this.nonTchUdc = nonTchUdc;
		}

		public String getNonTchLdc() {
			return nonTchLdc;
		}

		public void setNonTchLdc(String nonTchLdc) {
			this.nonTchLdc = nonTchLdc;
		}

		public String getNonTchPeon() {
			return nonTchPeon;
		}

		public void setNonTchPeon(String nonTchPeon) {
			this.nonTchPeon = nonTchPeon;
		}

		public String getNonTchWatchman() {
			return nonTchWatchman;
		}

		public void setNonTchWatchman(String nonTchWatchman) {
			this.nonTchWatchman = nonTchWatchman;
		}

		public String getTchHavAdhr() {
			return tchHavAdhr;
		}

		public void setTchHavAdhr(String tchHavAdhr) {
			this.tchHavAdhr = tchHavAdhr;
		}

		public String getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

		public String getModifiedBy() {
			return modifiedBy;
		}

		public void setModifiedBy(String modifiedBy) {
			this.modifiedBy = modifiedBy;
		}

		public String getCreatedTime() {
			return createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getModifiedTime() {
			return modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		
}
