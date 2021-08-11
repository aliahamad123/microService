package com.udiseservices.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class VocaEduResultStudent {
	
	@Id
	@Field(value = "_id")
	private String _id;

	@Field(name = "school_id")
	private Integer schoolId;
	
	@Field(name = "sector_no")
	private String sectorNo;
	
	@Field(name = "item_id")
	private String itemId;
	
	@Field(name = "ac_year")
	private String acYear;

	@Field(name = "marks_range_id")
	private String marksRangeId;

	@Field(name = "gen_b")
	private String genenralBoys;

	@Field(name = "gen_g")
	private String genenralGirls;

	@Field(name = "obc_b")
	private String obcBoys;

	@Field(name = "obc_g")
	private String obcGirls;

	@Field(name = "sc_b")
	private String scBoys;

	@Field(name = "sc_g")
	private String scGirls;
	
	@Field(name = "st_b")
	private String stBoys;

	@Field(name = "st_g")
	private String stGirls;
	
	
	

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

	public String getSectorNo() {
		return sectorNo;
	}

	public void setSectorNo(String sectorNo) {
		this.sectorNo = sectorNo;
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

	public String getMarksRangeId() {
		return marksRangeId;
	}

	public void setMarksRangeId(String marksRangeId) {
		this.marksRangeId = marksRangeId;
	}

	public String getGenenralBoys() {
		return genenralBoys;
	}

	public void setGenenralBoys(String genenralBoys) {
		this.genenralBoys = genenralBoys;
	}

	public String getGenenralGirls() {
		return genenralGirls;
	}

	public void setGenenralGirls(String genenralGirls) {
		this.genenralGirls = genenralGirls;
	}

	public String getObcBoys() {
		return obcBoys;
	}

	public void setObcBoys(String obcBoys) {
		this.obcBoys = obcBoys;
	}

	public String getObcGirls() {
		return obcGirls;
	}

	public void setObcGirls(String obcGirls) {
		this.obcGirls = obcGirls;
	}

	public String getScBoys() {
		return scBoys;
	}

	public void setScBoys(String scBoys) {
		this.scBoys = scBoys;
	}

	public String getScGirls() {
		return scGirls;
	}

	public void setScGirls(String scGirls) {
		this.scGirls = scGirls;
	}

	public String getStBoys() {
		return stBoys;
	}

	public void setStBoys(String stBoys) {
		this.stBoys = stBoys;
	}

	public String getStGirls() {
		return stGirls;
	}

	public void setStGirls(String stGirls) {
		this.stGirls = stGirls;
	}


}
