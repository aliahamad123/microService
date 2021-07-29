package com.ms.modals;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "mst_block")
public class BlockMaster {

	@Id
	@Field(value = "_id")
	private String _id;

	@Field(value = "block_id")
	private String blockId;

	@Field(value = "district_id")
	private String districtId;

	@Field(value = "block_name")
	private String blockName;

	@Field(value = "udise_block_code")
	private String udiseBlockCode;

	@Field(value = "udise_dist_code")
	private String udiseDistCode;

	@Field(value = "udise_state_code")
	private String udiseStateCode;

	@Field(value = "inityear")
	private String initYear;

	@Field(value = "lgd_district_id")
	private String lgdDistrictId;

	@Field(value = "state_id")
	private String stateId;

	@Field(value = "is_active")
	private String isActive;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getBlockId() {
		return blockId;
	}

	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}

	public String getDistrictId() {
		return districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public String getUdiseBlockCode() {
		return udiseBlockCode;
	}

	public void setUdiseBlockCode(String udiseBlockCode) {
		this.udiseBlockCode = udiseBlockCode;
	}

	public String getUdiseDistCode() {
		return udiseDistCode;
	}

	public void setUdiseDistCode(String udiseDistCode) {
		this.udiseDistCode = udiseDistCode;
	}

	public String getUdiseStateCode() {
		return udiseStateCode;
	}

	public void setUdiseStateCode(String udiseStateCode) {
		this.udiseStateCode = udiseStateCode;
	}

	public String getInitYear() {
		return initYear;
	}

	public void setInitYear(String initYear) {
		this.initYear = initYear;
	}

	public String getLgdDistrictId() {
		return lgdDistrictId;
	}

	public void setLgdDistrictId(String lgdDistrictId) {
		this.lgdDistrictId = lgdDistrictId;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

}
