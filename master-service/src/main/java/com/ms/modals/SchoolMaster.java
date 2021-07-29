package com.ms.modals;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection ="school_master")
public class SchoolMaster {
	
@Id
@Field(value = "_id")
private String _id;
	
@Field(value = "school_id")
private String schoolId;
	
@Field(value = "udise_sch_code")
private String udiseSchCode;
	
@Field(value = "school_name")
private String schoolName;
	
@Field(value ="udise_plus_code")
private String udisePlusCode;
	
@Field(value ="state_cd")
private String stateCode;
	
@Field(value ="district_cd")
private String districtCode;
	
@Field(value ="block_cd")
private String blockCode;
	
@Field(value ="vill_ward_cd")
private String villWardCode;

@Field(value = "cluster_cd")
private String clusterCode;
	
@Field(value = "state_id")
private String stateId;
	
@Field(value = "district_id")
private String districtId;
	
@Field(value = "block_id")
private String blockId;
	
@Field(value ="vill_ward_id")
private String villWardId;
	
@Field(value ="cluster_id")
private String clusterId;
	
@Field(value ="pincode")
private String pincode;
	
@Field(value ="sch_loc_r_u")
private String schLocRuralUrban;
	
@Field(value ="sch_category_id")
private String schCategoryId;
	
@Field(value = "sch_type")
private String schType;
	
@Field(value = "sch_mgmt_id")
private String schMgmtId;
	
@Field(value = "class_frm")
private String classFrm;
	
@Field(value = "class_to")
private String classTo;
	
@Field(value ="inityear")
private String initYear;
	
@Field(value ="sch_mgmt_center_id")
private String schMgmtCenterId;
	
@Field(value ="school_status")
private String schoolStatus;
	
@Field(value ="sch_id_merged")
private String schIdMerged;
	
@Field(value ="sch_merged_year")
private String schMergedYear;

@Field(value = "remarks_any")
private String remarksAny;
	
@Field(value = "is_modified")
private String isModified;
	
@Field(value = "created_by")
private String createdBy;
	
@Field(value = "created_time")
private String createdTime;
	
@Field(value ="modified_by")
private String modifiedBy;
	
@Field(value ="modified_time")
private String modifiedTime;
	
@Field(value ="modified_by_label")
private String modifiedByLabel;
	
@Field(value ="sch_cat_ly")
private String schCatLastYear;
	
@Field(value ="sch_mgmt_ly")
private String schMgmtLastYear;

@Field(value = "sch_type_ly")
private String schTypeLastYear;

@Field(value = "sch_status_ly")
private String schStatusLastYear;

@Field(value = "udise_sch_code_ly")
private String udiseSchCodeLastYear;

@Field(value = "added_from_flag")
private String addedFromFlag;

@Field(value ="is_nsqf")
private String isNsqf;

@Field(value ="latitude")
private String latitude;

@Field(value ="longitude")
private String longitude;

@Field(value ="service_req_id")
private String serviceReqId;

@Field(value ="ppsec_yn")
private String ppsecYN;

@Field(value = "cluster_id_2")
private String clusterId2;

@Field(value = "vill_ward_id_2")
private String villWardId2;

@Field(value = "block_id_2")
private String blockId2;

@Field(value = "merge_teacher")
private String mergeTeacher;

@Field(value ="merged_sch_udise_cd")
private String mergedSchUdiseCode;

@Field(value ="merged_sch_id")
private String mergedSchId;

public String get_id() {
	return _id;
}

public void set_id(String _id) {
	this._id = _id;
}

public String getSchoolId() {
	return schoolId;
}

public void setSchoolId(String schoolId) {
	this.schoolId = schoolId;
}

public String getUdiseSchCode() {
	return udiseSchCode;
}

public void setUdiseSchCode(String udiseSchCode) {
	this.udiseSchCode = udiseSchCode;
}

public String getSchoolName() {
	return schoolName;
}

public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}

public String getUdisePlusCode() {
	return udisePlusCode;
}

public void setUdisePlusCode(String udisePlusCode) {
	this.udisePlusCode = udisePlusCode;
}

public String getStateCode() {
	return stateCode;
}

public void setStateCode(String stateCode) {
	this.stateCode = stateCode;
}

public String getDistrictCode() {
	return districtCode;
}

public void setDistrictCode(String districtCode) {
	this.districtCode = districtCode;
}

public String getBlockCode() {
	return blockCode;
}

public void setBlockCode(String blockCode) {
	this.blockCode = blockCode;
}

public String getVillWardCode() {
	return villWardCode;
}

public void setVillWardCode(String villWardCode) {
	this.villWardCode = villWardCode;
}

public String getClusterCode() {
	return clusterCode;
}

public void setClusterCode(String clusterCode) {
	this.clusterCode = clusterCode;
}

public String getStateId() {
	return stateId;
}

public void setStateId(String stateId) {
	this.stateId = stateId;
}

public String getDistrictId() {
	return districtId;
}

public void setDistrictId(String districtId) {
	this.districtId = districtId;
}

public String getBlockId() {
	return blockId;
}

public void setBlockId(String blockId) {
	this.blockId = blockId;
}

public String getVillWardId() {
	return villWardId;
}

public void setVillWardId(String villWardId) {
	this.villWardId = villWardId;
}

public String getClusterId() {
	return clusterId;
}

public void setClusterId(String clusterId) {
	this.clusterId = clusterId;
}

public String getPincode() {
	return pincode;
}

public void setPincode(String pincode) {
	this.pincode = pincode;
}

public String getSchLocRuralUrban() {
	return schLocRuralUrban;
}

public void setSchLocRuralUrban(String schLocRuralUrban) {
	this.schLocRuralUrban = schLocRuralUrban;
}

public String getSchCategoryId() {
	return schCategoryId;
}

public void setSchCategoryId(String schCategoryId) {
	this.schCategoryId = schCategoryId;
}

public String getSchType() {
	return schType;
}

public void setSchType(String schType) {
	this.schType = schType;
}

public String getSchMgmtId() {
	return schMgmtId;
}

public void setSchMgmtId(String schMgmtId) {
	this.schMgmtId = schMgmtId;
}

public String getClassFrm() {
	return classFrm;
}

public void setClassFrm(String classFrm) {
	this.classFrm = classFrm;
}

public String getClassTo() {
	return classTo;
}

public void setClassTo(String classTo) {
	this.classTo = classTo;
}

public String getInitYear() {
	return initYear;
}

public void setInitYear(String initYear) {
	this.initYear = initYear;
}

public String getSchMgmtCenterId() {
	return schMgmtCenterId;
}

public void setSchMgmtCenterId(String schMgmtCenterId) {
	this.schMgmtCenterId = schMgmtCenterId;
}

public String getSchoolStatus() {
	return schoolStatus;
}

public void setSchoolStatus(String schoolStatus) {
	this.schoolStatus = schoolStatus;
}

public String getSchIdMerged() {
	return schIdMerged;
}

public void setSchIdMerged(String schIdMerged) {
	this.schIdMerged = schIdMerged;
}

public String getSchMergedYear() {
	return schMergedYear;
}

public void setSchMergedYear(String schMergedYear) {
	this.schMergedYear = schMergedYear;
}

public String getRemarksAny() {
	return remarksAny;
}

public void setRemarksAny(String remarksAny) {
	this.remarksAny = remarksAny;
}

public String getIsModified() {
	return isModified;
}

public void setIsModified(String isModified) {
	this.isModified = isModified;
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

public String getModifiedByLabel() {
	return modifiedByLabel;
}

public void setModifiedByLabel(String modifiedByLabel) {
	this.modifiedByLabel = modifiedByLabel;
}

public String getSchCatLastYear() {
	return schCatLastYear;
}

public void setSchCatLastYear(String schCatLastYear) {
	this.schCatLastYear = schCatLastYear;
}

public String getSchMgmtLastYear() {
	return schMgmtLastYear;
}

public void setSchMgmtLastYear(String schMgmtLastYear) {
	this.schMgmtLastYear = schMgmtLastYear;
}

public String getSchTypeLastYear() {
	return schTypeLastYear;
}

public void setSchTypeLastYear(String schTypeLastYear) {
	this.schTypeLastYear = schTypeLastYear;
}

public String getSchStatusLastYear() {
	return schStatusLastYear;
}

public void setSchStatusLastYear(String schStatusLastYear) {
	this.schStatusLastYear = schStatusLastYear;
}

public String getUdiseSchCodeLastYear() {
	return udiseSchCodeLastYear;
}

public void setUdiseSchCodeLastYear(String udiseSchCodeLastYear) {
	this.udiseSchCodeLastYear = udiseSchCodeLastYear;
}

public String getAddedFromFlag() {
	return addedFromFlag;
}

public void setAddedFromFlag(String addedFromFlag) {
	this.addedFromFlag = addedFromFlag;
}

public String getIsNsqf() {
	return isNsqf;
}

public void setIsNsqf(String isNsqf) {
	this.isNsqf = isNsqf;
}

public String getLatitude() {
	return latitude;
}

public void setLatitude(String latitude) {
	this.latitude = latitude;
}

public String getLongitude() {
	return longitude;
}

public void setLongitude(String longitude) {
	this.longitude = longitude;
}

public String getServiceReqId() {
	return serviceReqId;
}

public void setServiceReqId(String serviceReqId) {
	this.serviceReqId = serviceReqId;
}

public String getPpsecYN() {
	return ppsecYN;
}

public void setPpsecYN(String ppsecYN) {
	this.ppsecYN = ppsecYN;
}

public String getClusterId2() {
	return clusterId2;
}

public void setClusterId2(String clusterId2) {
	this.clusterId2 = clusterId2;
}

public String getVillWardId2() {
	return villWardId2;
}

public void setVillWardId2(String villWardId2) {
	this.villWardId2 = villWardId2;
}

public String getBlockId2() {
	return blockId2;
}

public void setBlockId2(String blockId2) {
	this.blockId2 = blockId2;
}

public String getMergeTeacher() {
	return mergeTeacher;
}

public void setMergeTeacher(String mergeTeacher) {
	this.mergeTeacher = mergeTeacher;
}

public String getMergedSchUdiseCode() {
	return mergedSchUdiseCode;
}

public void setMergedSchUdiseCode(String mergedSchUdiseCode) {
	this.mergedSchUdiseCode = mergedSchUdiseCode;
}

public String getMergedSchId() {
	return mergedSchId;
}

public void setMergedSchId(String mergedSchId) {
	this.mergedSchId = mergedSchId;
}	

}
