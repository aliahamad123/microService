package com.udiseservices.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "sch_facility_3")
public class UdiseSchFacilityThree {
	
	@Id
	@Field(value = "_id")
	private String _id;
	
	@Field(value = "school_id")
	private String schoolId;
	
	@Field(value = "udise_sch_code")
	private String udiseSchCode;
	
	@Field(value = "ac_year")
	private String acYear;
	
	@Field(value = "ahmvp_room_yn")
	private String ahmvpRoomYN;
	
	@Field(value = "comroom_g_yn")
	private String comRoomGirlsYN;
	
	@Field(value = "staff_room_yn")
	private String staffRoomYN;
	
	@Field(value = "craft_room_yn")
	private String craftRoomYN;
	
	@Field(value = "staff_qtr_yn")
	private String staffQtrYN;
	
	@Field(value = "integrated_lab_yn")
	private String integratedLabYN;
	
	@Field(value = "library_room_yn")
	private String libraryRoomYN;
	
	@Field(value = "tinkering_lab_yn")
	private String tinkeringLabYN;
	
	@Field(value = "comp_room_yn")
	private String compRoomYN;
	
	@Field(value = "phy_lab_yn")
	private String phyLabYN;
	
	@Field(value = "phy_lab_cond")
	private String phyLabCondition;
	
	@Field(value = "chem_lab_yn")
	private String chemLabYN;
	
	@Field(value = "chem_lab_cond")
	private String chemLabCond;
	
	@Field(value = "boi_lab_yn")
	private String boiLabYN;
	
	@Field(value = "bio_lab_cond")
	private String bioLabCond;
	
	@Field(value = "math_lab_yn")
	private String mathLabYN;
	
	@Field(value = "math_lab_cond")
	private String mathLabCond;
	
	@Field(value = "lang_lab_yn")
	private String langLabYN;
	
	@Field(value = "lang_lab_cond")
	private String langLabCond;
	
	@Field(value = "geo_lab_yn")
	private String geoLabYN;
	
	@Field(value = "geo_lab_cond")
	private String geoLabCond;
	
	@Field(value = "homesc_lab_yn")
	private String homescLabYN;
	
	@Field(value = "home_sc_lab_cond")
	private String homeSCLabCond;
	
	@Field(value = "psycho_lab_yn")
	private String psychoLabYN;
	
	@Field(value = "psycho_lab_cond")
	private String psychoLabCond;
	
	@Field(value = "comp_lab_yn")
	private String compLabYN;
	
	@Field(value = "comp_lab_cond")
	private String compLabCond;
	
	@Field(value = "audio_system_yn")
	private String audioSystemYN;
	
	@Field(value = "sciencekit_yn")
	private String sciencekitYN;
	
	@Field(value = "mathkit_yn")
	private String mathkitYN;
	
	@Field(value = "biometric_dev_yn")
	private String biometricDevYN;
	
	@Field(value = "created_by")
	private String createdBy1819;
	
	@Field(value = "created_time")
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

	public String getAcYear() {
		return acYear;
	}

	public void setAcYear(String acYear) {
		this.acYear = acYear;
	}

	public String getAhmvpRoomYN() {
		return ahmvpRoomYN;
	}

	public void setAhmvpRoomYN(String ahmvpRoomYN) {
		this.ahmvpRoomYN = ahmvpRoomYN;
	}

	public String getComRoomGirlsYN() {
		return comRoomGirlsYN;
	}

	public void setComRoomGirlsYN(String comRoomGirlsYN) {
		this.comRoomGirlsYN = comRoomGirlsYN;
	}

	public String getStaffRoomYN() {
		return staffRoomYN;
	}

	public void setStaffRoomYN(String staffRoomYN) {
		this.staffRoomYN = staffRoomYN;
	}

	public String getCraftRoomYN() {
		return craftRoomYN;
	}

	public void setCraftRoomYN(String craftRoomYN) {
		this.craftRoomYN = craftRoomYN;
	}

	public String getStaffQtrYN() {
		return staffQtrYN;
	}

	public void setStaffQtrYN(String staffQtrYN) {
		this.staffQtrYN = staffQtrYN;
	}

	public String getIntegratedLabYN() {
		return integratedLabYN;
	}

	public void setIntegratedLabYN(String integratedLabYN) {
		this.integratedLabYN = integratedLabYN;
	}

	public String getLibraryRoomYN() {
		return libraryRoomYN;
	}

	public void setLibraryRoomYN(String libraryRoomYN) {
		this.libraryRoomYN = libraryRoomYN;
	}

	public String getTinkeringLabYN() {
		return tinkeringLabYN;
	}

	public void setTinkeringLabYN(String tinkeringLabYN) {
		this.tinkeringLabYN = tinkeringLabYN;
	}

	public String getCompRoomYN() {
		return compRoomYN;
	}

	public void setCompRoomYN(String compRoomYN) {
		this.compRoomYN = compRoomYN;
	}

	public String getPhyLabYN() {
		return phyLabYN;
	}

	public void setPhyLabYN(String phyLabYN) {
		this.phyLabYN = phyLabYN;
	}

	public String getPhyLabCondition() {
		return phyLabCondition;
	}

	public void setPhyLabCondition(String phyLabCondition) {
		this.phyLabCondition = phyLabCondition;
	}

	public String getChemLabYN() {
		return chemLabYN;
	}

	public void setChemLabYN(String chemLabYN) {
		this.chemLabYN = chemLabYN;
	}

	public String getChemLabCond() {
		return chemLabCond;
	}

	public void setChemLabCond(String chemLabCond) {
		this.chemLabCond = chemLabCond;
	}

	public String getBoiLabYN() {
		return boiLabYN;
	}

	public void setBoiLabYN(String boiLabYN) {
		this.boiLabYN = boiLabYN;
	}

	public String getBioLabCond() {
		return bioLabCond;
	}

	public void setBioLabCond(String bioLabCond) {
		this.bioLabCond = bioLabCond;
	}

	public String getMathLabYN() {
		return mathLabYN;
	}

	public void setMathLabYN(String mathLabYN) {
		this.mathLabYN = mathLabYN;
	}

	public String getMathLabCond() {
		return mathLabCond;
	}

	public void setMathLabCond(String mathLabCond) {
		this.mathLabCond = mathLabCond;
	}

	public String getLangLabYN() {
		return langLabYN;
	}

	public void setLangLabYN(String langLabYN) {
		this.langLabYN = langLabYN;
	}

	public String getLangLabCond() {
		return langLabCond;
	}

	public void setLangLabCond(String langLabCond) {
		this.langLabCond = langLabCond;
	}

	public String getGeoLabYN() {
		return geoLabYN;
	}

	public void setGeoLabYN(String geoLabYN) {
		this.geoLabYN = geoLabYN;
	}

	public String getGeoLabCond() {
		return geoLabCond;
	}

	public void setGeoLabCond(String geoLabCond) {
		this.geoLabCond = geoLabCond;
	}

	public String getHomescLabYN() {
		return homescLabYN;
	}

	public void setHomescLabYN(String homescLabYN) {
		this.homescLabYN = homescLabYN;
	}

	public String getHomeSCLabCond() {
		return homeSCLabCond;
	}

	public void setHomeSCLabCond(String homeSCLabCond) {
		this.homeSCLabCond = homeSCLabCond;
	}

	public String getPsychoLabYN() {
		return psychoLabYN;
	}

	public void setPsychoLabYN(String psychoLabYN) {
		this.psychoLabYN = psychoLabYN;
	}

	public String getPsychoLabCond() {
		return psychoLabCond;
	}

	public void setPsychoLabCond(String psychoLabCond) {
		this.psychoLabCond = psychoLabCond;
	}

	public String getCompLabYN() {
		return compLabYN;
	}

	public void setCompLabYN(String compLabYN) {
		this.compLabYN = compLabYN;
	}

	public String getCompLabCond() {
		return compLabCond;
	}

	public void setCompLabCond(String compLabCond) {
		this.compLabCond = compLabCond;
	}

	public String getAudioSystemYN() {
		return audioSystemYN;
	}

	public void setAudioSystemYN(String audioSystemYN) {
		this.audioSystemYN = audioSystemYN;
	}

	public String getSciencekitYN() {
		return sciencekitYN;
	}

	public void setSciencekitYN(String sciencekitYN) {
		this.sciencekitYN = sciencekitYN;
	}

	public String getMathkitYN() {
		return mathkitYN;
	}

	public void setMathkitYN(String mathkitYN) {
		this.mathkitYN = mathkitYN;
	}

	public String getBiometricDevYN() {
		return biometricDevYN;
	}

	public void setBiometricDevYN(String biometricDevYN) {
		this.biometricDevYN = biometricDevYN;
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
