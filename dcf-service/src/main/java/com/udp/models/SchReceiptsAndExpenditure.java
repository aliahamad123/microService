package com.udp.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "")
public class SchReceiptsAndExpenditure {
	
	@Field(value ="_id")
	private String _id;
	
	@Field(value ="school_id")
	private Integer schoolId;
	
	@Field(value ="udise_sch_code")
	private String udiseSchCode;
	
	@Field(value ="ac_year")
	private String acYear;
	
	@Field(value ="dev_grt_r")
	private String devlopGrantReceipt;
	
	@Field(value ="dev_grt_e")
	private String devlopGrantExpenditure;
	
	@Field(value ="maint_grt_r")
	private String maintGrantReceipt;
	
	@Field(value ="maint_grt_e")
	private String mainGrantExpenditure;
	
	@Field(value ="tlm_grt_r")
	private String tlmGrantReceipt;
	
	@Field(value ="tlm_grt_e")
	private String tlmGrantExpenditure;
	
	@Field(value ="cw_grt_r")
	private String civilWorkGrantReceipt;
	
	@Field(value ="cw_grt_e")
	private String civilWorkGrantExpenditure;
	
	@Field(value ="anl_grt_r")
	private String annlGranrtReceipt;
	
	@Field(value ="anl_grt_e")
	private String annlGrantExpenditure;
	
	@Field(value ="minrep_grt_r")
	private String minRepaiGrantExpenditure;
	
	@Field(value ="minrep_grt_e")
	private String minRepaiGranrtReceipt;
	
	@Field(value ="labrep_grt_r")
	private String labRepaiGrantReceipt;

	@Field(value ="labrep_grt_e")
	private String labRepaiGrantExpenditure;
	
	@Field(value ="book_grt_r")
	private String bookGrantExpenditure;
	
	@Field(value ="book_grt_e")
	private String bookGranrtReceipt;
	
	@Field(value ="elec_grt_r")
	private String elecGrantReceipt;

	@Field(value ="elec_grt_e")
	private String elecGrantExpenditure;
	
	@Field(value ="oth_grt_r")
	private String othGrantExpenditure;
	
	@Field(value ="oth_grt_e")
	private String othGranrtReceipt;
	
	@Field(value ="compo_grt_r")
	private String compoGrantReceipt;

	@Field(value ="compo_grt_e")
	private String compoGrantExpenditure;
	
	@Field(value ="lib_grt_r")
	private String libGrantExpenditure;
	
	@Field(value ="lib_grt_e")
	private String libGranrtReceipt;
	
	@Field(value ="sport_grt_r")
	private String sportGrantReceipt;

	@Field(value ="sport_grt_e")
	private String sportGrantExpenditure;
	
	@Field(value ="media_grt_r")
	private String mediaGrantExpenditure;
	
	@Field(value ="media_grt_e")
	private String mediaGranrtReceipt;
	
	@Field(value ="smc_grt_r")
	private String smcGrantReceipt;

	@Field(value ="smc_grt_e")
	private String smcGrantExpenditure;
	
	@Field(value ="presch_grt_r")
	private String preschGrantExpenditure;
	
	@Field(value ="presch_grt_e")
	private String preschGranrtReceipt;
	
	@Field(value ="ngo_asst_yn")
	private String ngoAsstYn;

	@Field(value ="ngo_asst_name")
	private String ngoAsstName;
	
	@Field(value ="ngo_asst_rcvd")
	private String ngoAsstRcvd;
	
	@Field(value ="psu_asst_yn")
	private String psuAsstYn;
	
	@Field(value ="psu_asst_name")
	private String psuAsstName;

	@Field(value ="psu_asst_rcvd")
	private String psuAsstRcvd;
	
	@Field(value ="comm_asst_yn")
	private String commAsstYn;
	
	@Field(value ="comm_asst_rcvd")
	private String commAsstRcvd;
	
	@Field(value ="comm_asst_name")
	private String commAsstName;

	@Field(value ="oth_asst_yn")
	private String othAsstYn;
	
	@Field(value ="oth_asst_name")
	private String othAsstName;
	
	@Field(value ="oth_asst_rcvd")
	private String othAsstRcvd;
	
	@Field(value ="ict_reg_yn")
	private String ictRegYn;

	@Field(value ="sport_reg_yn")
	private String sportRegYn;
	
	@Field(value ="lib_reg_yn")
	private String libRegYn;

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

	public String getAcYear() {
		return acYear;
	}

	public void setAcYear(String acYear) {
		this.acYear = acYear;
	}

	public String getDevlopGrantReceipt() {
		return devlopGrantReceipt;
	}

	public void setDevlopGrantReceipt(String devlopGrantReceipt) {
		this.devlopGrantReceipt = devlopGrantReceipt;
	}

	public String getDevlopGrantExpenditure() {
		return devlopGrantExpenditure;
	}

	public void setDevlopGrantExpenditure(String devlopGrantExpenditure) {
		this.devlopGrantExpenditure = devlopGrantExpenditure;
	}

	public String getMaintGrantReceipt() {
		return maintGrantReceipt;
	}

	public void setMaintGrantReceipt(String maintGrantReceipt) {
		this.maintGrantReceipt = maintGrantReceipt;
	}

	public String getMainGrantExpenditure() {
		return mainGrantExpenditure;
	}

	public void setMainGrantExpenditure(String mainGrantExpenditure) {
		this.mainGrantExpenditure = mainGrantExpenditure;
	}

	public String getTlmGrantReceipt() {
		return tlmGrantReceipt;
	}

	public void setTlmGrantReceipt(String tlmGrantReceipt) {
		this.tlmGrantReceipt = tlmGrantReceipt;
	}

	public String getTlmGrantExpenditure() {
		return tlmGrantExpenditure;
	}

	public void setTlmGrantExpenditure(String tlmGrantExpenditure) {
		this.tlmGrantExpenditure = tlmGrantExpenditure;
	}

	public String getCivilWorkGrantReceipt() {
		return civilWorkGrantReceipt;
	}

	public void setCivilWorkGrantReceipt(String civilWorkGrantReceipt) {
		this.civilWorkGrantReceipt = civilWorkGrantReceipt;
	}

	public String getCivilWorkGrantExpenditure() {
		return civilWorkGrantExpenditure;
	}

	public void setCivilWorkGrantExpenditure(String civilWorkGrantExpenditure) {
		this.civilWorkGrantExpenditure = civilWorkGrantExpenditure;
	}

	public String getAnnlGranrtReceipt() {
		return annlGranrtReceipt;
	}

	public void setAnnlGranrtReceipt(String annlGranrtReceipt) {
		this.annlGranrtReceipt = annlGranrtReceipt;
	}

	public String getAnnlGrantExpenditure() {
		return annlGrantExpenditure;
	}

	public void setAnnlGrantExpenditure(String annlGrantExpenditure) {
		this.annlGrantExpenditure = annlGrantExpenditure;
	}

	public String getMinRepaiGrantExpenditure() {
		return minRepaiGrantExpenditure;
	}

	public void setMinRepaiGrantExpenditure(String minRepaiGrantExpenditure) {
		this.minRepaiGrantExpenditure = minRepaiGrantExpenditure;
	}

	public String getMinRepaiGranrtReceipt() {
		return minRepaiGranrtReceipt;
	}

	public void setMinRepaiGranrtReceipt(String minRepaiGranrtReceipt) {
		this.minRepaiGranrtReceipt = minRepaiGranrtReceipt;
	}

	public String getLabRepaiGrantReceipt() {
		return labRepaiGrantReceipt;
	}

	public void setLabRepaiGrantReceipt(String labRepaiGrantReceipt) {
		this.labRepaiGrantReceipt = labRepaiGrantReceipt;
	}

	public String getLabRepaiGrantExpenditure() {
		return labRepaiGrantExpenditure;
	}

	public void setLabRepaiGrantExpenditure(String labRepaiGrantExpenditure) {
		this.labRepaiGrantExpenditure = labRepaiGrantExpenditure;
	}

	public String getBookGrantExpenditure() {
		return bookGrantExpenditure;
	}

	public void setBookGrantExpenditure(String bookGrantExpenditure) {
		this.bookGrantExpenditure = bookGrantExpenditure;
	}

	public String getBookGranrtReceipt() {
		return bookGranrtReceipt;
	}

	public void setBookGranrtReceipt(String bookGranrtReceipt) {
		this.bookGranrtReceipt = bookGranrtReceipt;
	}

	public String getElecGrantReceipt() {
		return elecGrantReceipt;
	}

	public void setElecGrantReceipt(String elecGrantReceipt) {
		this.elecGrantReceipt = elecGrantReceipt;
	}

	public String getElecGrantExpenditure() {
		return elecGrantExpenditure;
	}

	public void setElecGrantExpenditure(String elecGrantExpenditure) {
		this.elecGrantExpenditure = elecGrantExpenditure;
	}

	public String getOthGrantExpenditure() {
		return othGrantExpenditure;
	}

	public void setOthGrantExpenditure(String othGrantExpenditure) {
		this.othGrantExpenditure = othGrantExpenditure;
	}

	public String getOthGranrtReceipt() {
		return othGranrtReceipt;
	}

	public void setOthGranrtReceipt(String othGranrtReceipt) {
		this.othGranrtReceipt = othGranrtReceipt;
	}

	public String getCompoGrantReceipt() {
		return compoGrantReceipt;
	}

	public void setCompoGrantReceipt(String compoGrantReceipt) {
		this.compoGrantReceipt = compoGrantReceipt;
	}

	public String getCompoGrantExpenditure() {
		return compoGrantExpenditure;
	}

	public void setCompoGrantExpenditure(String compoGrantExpenditure) {
		this.compoGrantExpenditure = compoGrantExpenditure;
	}

	public String getLibGrantExpenditure() {
		return libGrantExpenditure;
	}

	public void setLibGrantExpenditure(String libGrantExpenditure) {
		this.libGrantExpenditure = libGrantExpenditure;
	}

	public String getLibGranrtReceipt() {
		return libGranrtReceipt;
	}

	public void setLibGranrtReceipt(String libGranrtReceipt) {
		this.libGranrtReceipt = libGranrtReceipt;
	}

	public String getSportGrantReceipt() {
		return sportGrantReceipt;
	}

	public void setSportGrantReceipt(String sportGrantReceipt) {
		this.sportGrantReceipt = sportGrantReceipt;
	}

	public String getSportGrantExpenditure() {
		return sportGrantExpenditure;
	}

	public void setSportGrantExpenditure(String sportGrantExpenditure) {
		this.sportGrantExpenditure = sportGrantExpenditure;
	}

	public String getMediaGrantExpenditure() {
		return mediaGrantExpenditure;
	}

	public void setMediaGrantExpenditure(String mediaGrantExpenditure) {
		this.mediaGrantExpenditure = mediaGrantExpenditure;
	}

	public String getMediaGranrtReceipt() {
		return mediaGranrtReceipt;
	}

	public void setMediaGranrtReceipt(String mediaGranrtReceipt) {
		this.mediaGranrtReceipt = mediaGranrtReceipt;
	}

	public String getSmcGrantReceipt() {
		return smcGrantReceipt;
	}

	public void setSmcGrantReceipt(String smcGrantReceipt) {
		this.smcGrantReceipt = smcGrantReceipt;
	}

	public String getSmcGrantExpenditure() {
		return smcGrantExpenditure;
	}

	public void setSmcGrantExpenditure(String smcGrantExpenditure) {
		this.smcGrantExpenditure = smcGrantExpenditure;
	}

	public String getPreschGrantExpenditure() {
		return preschGrantExpenditure;
	}

	public void setPreschGrantExpenditure(String preschGrantExpenditure) {
		this.preschGrantExpenditure = preschGrantExpenditure;
	}

	public String getPreschGranrtReceipt() {
		return preschGranrtReceipt;
	}

	public void setPreschGranrtReceipt(String preschGranrtReceipt) {
		this.preschGranrtReceipt = preschGranrtReceipt;
	}

	public String getNgoAsstYn() {
		return ngoAsstYn;
	}

	public void setNgoAsstYn(String ngoAsstYn) {
		this.ngoAsstYn = ngoAsstYn;
	}

	public String getNgoAsstName() {
		return ngoAsstName;
	}

	public void setNgoAsstName(String ngoAsstName) {
		this.ngoAsstName = ngoAsstName;
	}

	public String getNgoAsstRcvd() {
		return ngoAsstRcvd;
	}

	public void setNgoAsstRcvd(String ngoAsstRcvd) {
		this.ngoAsstRcvd = ngoAsstRcvd;
	}

	public String getPsuAsstYn() {
		return psuAsstYn;
	}

	public void setPsuAsstYn(String psuAsstYn) {
		this.psuAsstYn = psuAsstYn;
	}

	public String getPsuAsstName() {
		return psuAsstName;
	}

	public void setPsuAsstName(String psuAsstName) {
		this.psuAsstName = psuAsstName;
	}

	public String getPsuAsstRcvd() {
		return psuAsstRcvd;
	}

	public void setPsuAsstRcvd(String psuAsstRcvd) {
		this.psuAsstRcvd = psuAsstRcvd;
	}

	public String getCommAsstYn() {
		return commAsstYn;
	}

	public void setCommAsstYn(String commAsstYn) {
		this.commAsstYn = commAsstYn;
	}

	public String getCommAsstRcvd() {
		return commAsstRcvd;
	}

	public void setCommAsstRcvd(String commAsstRcvd) {
		this.commAsstRcvd = commAsstRcvd;
	}

	public String getCommAsstName() {
		return commAsstName;
	}

	public void setCommAsstName(String commAsstName) {
		this.commAsstName = commAsstName;
	}

	public String getOthAsstYn() {
		return othAsstYn;
	}

	public void setOthAsstYn(String othAsstYn) {
		this.othAsstYn = othAsstYn;
	}

	public String getOthAsstName() {
		return othAsstName;
	}

	public void setOthAsstName(String othAsstName) {
		this.othAsstName = othAsstName;
	}

	public String getOthAsstRcvd() {
		return othAsstRcvd;
	}

	public void setOthAsstRcvd(String othAsstRcvd) {
		this.othAsstRcvd = othAsstRcvd;
	}

	public String getIctRegYn() {
		return ictRegYn;
	}

	public void setIctRegYn(String ictRegYn) {
		this.ictRegYn = ictRegYn;
	}

	public String getSportRegYn() {
		return sportRegYn;
	}

	public void setSportRegYn(String sportRegYn) {
		this.sportRegYn = sportRegYn;
	}

	public String getLibRegYn() {
		return libRegYn;
	}

	public void setLibRegYn(String libRegYn) {
		this.libRegYn = libRegYn;
	}
	
	
	
}
