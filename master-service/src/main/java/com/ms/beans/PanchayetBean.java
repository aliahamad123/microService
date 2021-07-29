package com.ms.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class PanchayetBean {
	
	private String _id;
	private String panchayetId;
	private String blockId;
	private String panchayetName;
	private String udisePanchayetCode;
	private String udiseBlockCode;
	private String inityear;
	private String isActive;
	private String schoolCount;
	private String createdBy;
	private String createdTime;
	private String modifiedBy;
	private String modifiedTime;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getPanchayetId() {
		return panchayetId;
	}
	public void setPanchayetId(String panchayetId) {
		this.panchayetId = panchayetId;
	}
	public String getBlockId() {
		return blockId;
	}
	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}
	public String getPanchayetName() {
		return panchayetName;
	}
	public void setPanchayetName(String panchayetName) {
		this.panchayetName = panchayetName;
	}
	public String getUdisePanchayetCode() {
		return udisePanchayetCode;
	}
	public void setUdisePanchayetCode(String udisePanchayetCode) {
		this.udisePanchayetCode = udisePanchayetCode;
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
