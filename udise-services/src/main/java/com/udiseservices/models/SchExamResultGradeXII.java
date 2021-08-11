package com.udiseservices.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "")
public class SchExamResultGradeXII {
	
//  When Item Id  = 3 Then Regular, When Item Id =4 then Non-Regular
//	When stream_id= 121 then Arts
//	When stream_id= 122 then Science
//	When stream_id= 123 then Commerce
//	When stream_id= 124 then Vocational
//	When stream_id= 125 then Other Streams

	@Id
	@Field(value = "_id")
	private String _id;

	@Field(name = "school_id")
	private Integer schoolId;

	@Field(name = "udise_sch_code")
	private String udiseSchCode;

	@Field(name = "item_id")
	private String itemId;

	@Field(name = "ac_year")
	private String acYear;
	
	@Field(name = "stream_id")
	private String streamId;

	@Field(name = "gen_app_b")
	private String genAppearBoys;

	@Field(name = "gen_app_g")
	private String genAppearGirls;
	
	@Field(name = "obc_app_b")
	private String obcAppearBoys;

	@Field(name = "obc_app_g")
	private String obcAppearGirls;

	@Field(name = "sc_app_b")
	private String scAppearBoys;

	@Field(name = "sc_app_g")
	private String scAppearGirls;
	
	@Field(name = "st_app_b")
	private String stAppearBoys;

	@Field(name = "st_app_g")
	private String stAppearGirls;

	@Field(name = "gen_pass_b")
	private String genPassedBoys;

	@Field(name = "gen_pass_g")
	private String genPassedGirls;
	
	@Field(name = "obc_pass_b")
	private String obcPassedBoys;

	@Field(name = "obc_pass_g")
	private String obcPassedGirls;

	@Field(name = "sc_pass_b")
	private String scPassedBoys;

	@Field(name = "sc_pass_g")
	private String scPassedGirls;
	
	@Field(name = "st_pass_b")
	private String stPassedBoys;

	@Field(name = "st_pass_g")
	private String stPassedGirls;

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

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getAcYear() {
		return acYear;
	}

	public void setAcYear(String acYear) {
		this.acYear = acYear;
	}

	public String getStreamId() {
		return streamId;
	}

	public void setStreamId(String streamId) {
		this.streamId = streamId;
	}

	public String getGenAppearBoys() {
		return genAppearBoys;
	}

	public void setGenAppearBoys(String genAppearBoys) {
		this.genAppearBoys = genAppearBoys;
	}

	public String getGenAppearGirls() {
		return genAppearGirls;
	}

	public void setGenAppearGirls(String genAppearGirls) {
		this.genAppearGirls = genAppearGirls;
	}

	public String getObcAppearBoys() {
		return obcAppearBoys;
	}

	public void setObcAppearBoys(String obcAppearBoys) {
		this.obcAppearBoys = obcAppearBoys;
	}

	public String getObcAppearGirls() {
		return obcAppearGirls;
	}

	public void setObcAppearGirls(String obcAppearGirls) {
		this.obcAppearGirls = obcAppearGirls;
	}

	public String getScAppearBoys() {
		return scAppearBoys;
	}

	public void setScAppearBoys(String scAppearBoys) {
		this.scAppearBoys = scAppearBoys;
	}

	public String getScAppearGirls() {
		return scAppearGirls;
	}

	public void setScAppearGirls(String scAppearGirls) {
		this.scAppearGirls = scAppearGirls;
	}

	public String getStAppearBoys() {
		return stAppearBoys;
	}

	public void setStAppearBoys(String stAppearBoys) {
		this.stAppearBoys = stAppearBoys;
	}

	public String getStAppearGirls() {
		return stAppearGirls;
	}

	public void setStAppearGirls(String stAppearGirls) {
		this.stAppearGirls = stAppearGirls;
	}

	public String getGenPassedBoys() {
		return genPassedBoys;
	}

	public void setGenPassedBoys(String genPassedBoys) {
		this.genPassedBoys = genPassedBoys;
	}

	public String getGenPassedGirls() {
		return genPassedGirls;
	}

	public void setGenPassedGirls(String genPassedGirls) {
		this.genPassedGirls = genPassedGirls;
	}

	public String getObcPassedBoys() {
		return obcPassedBoys;
	}

	public void setObcPassedBoys(String obcPassedBoys) {
		this.obcPassedBoys = obcPassedBoys;
	}

	public String getObcPassedGirls() {
		return obcPassedGirls;
	}

	public void setObcPassedGirls(String obcPassedGirls) {
		this.obcPassedGirls = obcPassedGirls;
	}

	public String getScPassedBoys() {
		return scPassedBoys;
	}

	public void setScPassedBoys(String scPassedBoys) {
		this.scPassedBoys = scPassedBoys;
	}

	public String getScPassedGirls() {
		return scPassedGirls;
	}

	public void setScPassedGirls(String scPassedGirls) {
		this.scPassedGirls = scPassedGirls;
	}

	public String getStPassedBoys() {
		return stPassedBoys;
	}

	public void setStPassedBoys(String stPassedBoys) {
		this.stPassedBoys = stPassedBoys;
	}

	public String getStPassedGirls() {
		return stPassedGirls;
	}

	public void setStPassedGirls(String stPassedGirls) {
		this.stPassedGirls = stPassedGirls;
	}
	
	
}
