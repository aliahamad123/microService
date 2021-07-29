package com.ms.modals;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document(collection ="mst_village_ward")
public class VillageWardMaster {
	
	
	@Id
	@Field(value = "_id")
	private String _id;
	
	@Field(value = "village_ward_id")
	private String villageWardId;
	
	@Field(value = "block_id")
	private String blockId;
	
	@Field(value = "village_ward_name")
	private String villageWardName;
	
	@Field(value ="udise_village_ward_code")
	private String udiseVillageWardCode;
	
	@Field(value = "udise_block_code")
	private String udiseBlockCode;
	
	@Field(value = "inityear")
	private String inityear;
	
	@Field(value ="pincode")
	private String pincode;

	@Field(value = "lgd_code")
	private String lgdCode;
	
	@Field(value = "is_tribal")
	private String isTribal;
	
	@Field(value = "is_active")
	private String isActive;
	
	@Field(value = "school_count")
	private String schoolCount;
	
	@Field(value ="created_time")
	private String createdTime;
	
	@Field(value = "modified_by")
	private String modifiedBy;
	
	@Field(value = "modified_time")
	private String modifiedTime;
	
	@Field(value ="sch_code")
	private String schCode;
	
	@Field(value = "vill_ward_location_type")
	private String villWardLocationType;
	
	@Field(value ="name_update_counter")
	private String nameUpdateCounter;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getVillageWardId() {
		return villageWardId;
	}

	public void setVillageWardId(String villageWardId) {
		this.villageWardId = villageWardId;
	}

	public String getBlockId() {
		return blockId;
	}

	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}

	public String getVillageWardName() {
		return villageWardName;
	}

	public void setVillageWardName(String villageWardName) {
		this.villageWardName = villageWardName;
	}

	public String getUdiseVillageWardCode() {
		return udiseVillageWardCode;
	}

	public void setUdiseVillageWardCode(String udiseVillageWardCode) {
		this.udiseVillageWardCode = udiseVillageWardCode;
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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getLgdCode() {
		return lgdCode;
	}

	public void setLgdCode(String lgdCode) {
		this.lgdCode = lgdCode;
	}

	public String getIsTribal() {
		return isTribal;
	}

	public void setIsTribal(String isTribal) {
		this.isTribal = isTribal;
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

	public String getSchCode() {
		return schCode;
	}

	public void setSchCode(String schCode) {
		this.schCode = schCode;
	}

	public String getVillWardLocationType() {
		return villWardLocationType;
	}

	public void setVillWardLocationType(String villWardLocationType) {
		this.villWardLocationType = villWardLocationType;
	}

	public String getNameUpdateCounter() {
		return nameUpdateCounter;
	}

	public void setNameUpdateCounter(String nameUpdateCounter) {
		this.nameUpdateCounter = nameUpdateCounter;
	}
	
}
