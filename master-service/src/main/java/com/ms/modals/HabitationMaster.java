package com.ms.modals;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "mst_loc_habitation")
public class HabitationMaster {

	@Id
	@Field(value = "_id")
	private String _id;
	
	@Field(value = "habitation_id")
	private String habitationId;
	
	@Field(value = "block_id")
	private String blockId;
	
	@Field(value = "habitation_name")
	private String habitationName;
	
	@Field(value ="udise_habitation_code")
	private String udiseHabitationCode;
	
	@Field(value = "udise_block_code")
	private String udiseBlockCode;
	
	@Field(value = "inityear")
	private String inityear;
	
	@Field(value ="is_active")
	private String isActive;

	@Field(value = "school_count")
	private String schoolCount;
	
	@Field(value = "created_by")
	private String createdBy;
	
	@Field(value ="created_time")
	private String createdTime;

	@Field(value = "modified_by")
	private String modifiedBy;
	
	@Field(value = "modified_time")
	private String modifiedTime;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getHabitationId() {
		return habitationId;
	}

	public void setHabitationId(String habitationId) {
		this.habitationId = habitationId;
	}

	public String getBlockId() {
		return blockId;
	}

	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}

	public String getHabitationName() {
		return habitationName;
	}

	public void setHabitationName(String habitationName) {
		this.habitationName = habitationName;
	}

	public String getUdiseHabitationCode() {
		return udiseHabitationCode;
	}

	public void setUdiseHabitationCode(String udiseHabitationCode) {
		this.udiseHabitationCode = udiseHabitationCode;
	}

	public String getUdiseBlockCode() {
		return udiseBlockCode;
	}

	public void setUdiseBlockCode(String udiseBlockCode) {
		this.udiseBlockCode = udiseBlockCode;
	}

	public String getInityear() {
		return inityear;
	}

	public void setInityear(String inityear) {
		this.inityear = inityear;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getSchoolCount() {
		return schoolCount;
	}

	public void setSchoolCount(String schoolCount) {
		this.schoolCount = schoolCount;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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
