package com.udp.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection ="mst_block")
public class BlockMaster {
	
	@Field(value ="_id")
	private String _id;
	
	@Field(value ="block_id")
	private Integer blockId;
	
	@Field(value ="year_id")
	private String yearId;
	
	@Field(value ="districtId")
	private Integer district_id;
	
	@Field(value ="block_name")
	private String blockName;
	
	@Field(value ="udiseBlockCode")
	private Integer udise_block_code;
	
	@Field(value ="udise_dist_code")
	private Integer udiseDistCode;
	
	@Field(value ="inityear")
	private String inityear;
	
	@Field(value ="is_active")
	private Integer isActive;
	
	@Field(value ="checkbit")
	private Integer checkbit;
	
	

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Integer getBlockId() {
		return blockId;
	}

	public void setBlockId(Integer blockId) {
		this.blockId = blockId;
	}

	public String getYearId() {
		return yearId;
	}

	public void setYearId(String yearId) {
		this.yearId = yearId;
	}

	public Integer getDistrict_id() {
		return district_id;
	}

	public void setDistrict_id(Integer district_id) {
		this.district_id = district_id;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public Integer getUdise_block_code() {
		return udise_block_code;
	}

	public void setUdise_block_code(Integer udise_block_code) {
		this.udise_block_code = udise_block_code;
	}

	public Integer getUdiseDistCode() {
		return udiseDistCode;
	}

	public void setUdiseDistCode(Integer udiseDistCode) {
		this.udiseDistCode = udiseDistCode;
	}

	public String getInityear() {
		return inityear;
	}

	public void setInityear(String inityear) {
		this.inityear = inityear;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public Integer getCheckbit() {
		return checkbit;
	}

	public void setCheckbit(Integer checkbit) {
		this.checkbit = checkbit;
	}	
	

}
