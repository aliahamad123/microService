package com.udiseservices.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "sch_facility_4")
public class SchFacilityFour {
	

	@Id
	@Field(value = "_id")
	private String _id;
	
	@Field(value = "school_id")
	private String schoolId;
	
	@Field(value = "udise_sch_code")
	private String udiseSchCode;
	
	@Field(value = "ac_year")
	private String acYear;
	
	@Field(value = "ict_impl_year")
	private String ictImplYear;
	
	@Field(value = "comp_lab_type")
	private String compLabType;
	
	@Field(value = "ictlab_fun_yn")
	private String ictlabFunYN;
	
	@Field(value = "ict_model_impl")
	private String ictModelImpl;
	
	@Field(value = "ict_instr_type")
	private String ictInstrType;
	
	@Field(value = "laptop_yn")
	private String laptopYN;
	
	@Field(value = "laptop_tot")
	private String laptopTotal;
	
	@Field(value = "laptop_fun")
	private String laptopFun;
	
	@Field(value = "tablets_yn")
	private String tabletsYN;
	
	@Field(value = "tablets_tot")
	private String tabletsTotal;
	
	@Field(value = "tablets_fun")
	private String tabletsFun;
	
	@Field(value = "desktop_yn")
	private String desktopYN;
	
	@Field(value = "desktop_tot")
	private String desktopTotal;
	
	@Field(value = "desktop_fun")
	private String desktopFun;
	
	@Field(value = "teachdev_yn")
	private String teachdevYN;
	
	@Field(value = "teachdev_tot")
	private String teachdevTotal;
	
	@Field(value = "teachdev_fun")
	private String teachdevFun;
	
	@Field(value = "digi_board_yn")
	private String digiBoardYN;
	
	@Field(value = "digi_board_tot")
	private String digiBoardTotal;
	
	@Field(value = "digi_board_fun")
	private String digiBoardFun;
	
	@Field(value = "server_yn")
	private String serverYN;
	
	@Field(value = "server_tot")
	private String serverTotal;
	
	@Field(value = "server_fun")
	private String serverFun;
	
	@Field(value = "projector_yn")
	private String projectorYN;
	
	@Field(value = "projector_tot")
	private String projectorTotal;
	
	@Field(value = "projector_fun")
	private String projectorFun;
	
	@Field(value = "led_yn")
	private String ledYN;
	
	@Field(value = "led_tot")
	private String ledTotal;
	
	@Field(value = "led_fun")
	private String ledFun;
	
	@Field(value = "printer_yn")
	private String printerYN;
	
	@Field(value = "printer_tot")
	private String printerTotal;
	
	@Field(value = "printer_fun")
	private String printerFun;
	
	@Field(value = "scanner_yn")
	private String scannerYN;
	
	@Field(value = "scanner_tot")
	private String scannerTotal;
	
	@Field(value = "scanner_fun")
	private String scannerFun;
	
	@Field(value = "webcam_yn")
	private String webcamYN;
	
	@Field(value = "webcam_tot")
	private String webcamTotal;
	
	@Field(value = "webcam_fun")
	private String webcamFun;
	
	@Field(value = "internet_yn")
	private String internetYN;
	
	@Field(value = "dth_yn")
	private String dthYN;
	
	@Field(value = "generator_yn")
	private String generatorYN;
	
	@Field(value = "digi_res_yn")
	private String digiResYN;
	
	@Field(value = "tech_soln_yn")
	private String techSolnYN;
	
	@Field(value = "ict_tools_yn")
	private String ictToolsYN;
	
	@Field(value = "ict_teach_hrs")
	private String ictTeachHrs;
	
	@Field(value = "generator_fun")
	private String generatorFun;
	
	@Field(value = "cal_lab_yn")
	private String calLabYN;
	
	@Field(value = "ict_lab_yn")
	private String ictLabYN;
	
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

	public String getIctImplYear() {
		return ictImplYear;
	}

	public void setIctImplYear(String ictImplYear) {
		this.ictImplYear = ictImplYear;
	}

	public String getCompLabType() {
		return compLabType;
	}

	public void setCompLabType(String compLabType) {
		this.compLabType = compLabType;
	}

	public String getIctlabFunYN() {
		return ictlabFunYN;
	}

	public void setIctlabFunYN(String ictlabFunYN) {
		this.ictlabFunYN = ictlabFunYN;
	}

	public String getIctModelImpl() {
		return ictModelImpl;
	}

	public void setIctModelImpl(String ictModelImpl) {
		this.ictModelImpl = ictModelImpl;
	}

	public String getIctInstrType() {
		return ictInstrType;
	}

	public void setIctInstrType(String ictInstrType) {
		this.ictInstrType = ictInstrType;
	}

	public String getLaptopYN() {
		return laptopYN;
	}

	public void setLaptopYN(String laptopYN) {
		this.laptopYN = laptopYN;
	}

	public String getLaptopTotal() {
		return laptopTotal;
	}

	public void setLaptopTotal(String laptopTotal) {
		this.laptopTotal = laptopTotal;
	}

	public String getLaptopFun() {
		return laptopFun;
	}

	public void setLaptopFun(String laptopFun) {
		this.laptopFun = laptopFun;
	}

	public String getTabletsYN() {
		return tabletsYN;
	}

	public void setTabletsYN(String tabletsYN) {
		this.tabletsYN = tabletsYN;
	}

	public String getTabletsTotal() {
		return tabletsTotal;
	}

	public void setTabletsTotal(String tabletsTotal) {
		this.tabletsTotal = tabletsTotal;
	}

	public String getTabletsFun() {
		return tabletsFun;
	}

	public void setTabletsFun(String tabletsFun) {
		this.tabletsFun = tabletsFun;
	}

	public String getDesktopYN() {
		return desktopYN;
	}

	public void setDesktopYN(String desktopYN) {
		this.desktopYN = desktopYN;
	}

	public String getDesktopTotal() {
		return desktopTotal;
	}

	public void setDesktopTotal(String desktopTotal) {
		this.desktopTotal = desktopTotal;
	}

	public String getDesktopFun() {
		return desktopFun;
	}

	public void setDesktopFun(String desktopFun) {
		this.desktopFun = desktopFun;
	}

	public String getTeachdevYN() {
		return teachdevYN;
	}

	public void setTeachdevYN(String teachdevYN) {
		this.teachdevYN = teachdevYN;
	}

	public String getTeachdevTotal() {
		return teachdevTotal;
	}

	public void setTeachdevTotal(String teachdevTotal) {
		this.teachdevTotal = teachdevTotal;
	}

	public String getTeachdevFun() {
		return teachdevFun;
	}

	public void setTeachdevFun(String teachdevFun) {
		this.teachdevFun = teachdevFun;
	}

	public String getDigiBoardYN() {
		return digiBoardYN;
	}

	public void setDigiBoardYN(String digiBoardYN) {
		this.digiBoardYN = digiBoardYN;
	}

	public String getDigiBoardTotal() {
		return digiBoardTotal;
	}

	public void setDigiBoardTotal(String digiBoardTotal) {
		this.digiBoardTotal = digiBoardTotal;
	}

	public String getDigiBoardFun() {
		return digiBoardFun;
	}

	public void setDigiBoardFun(String digiBoardFun) {
		this.digiBoardFun = digiBoardFun;
	}

	public String getServerYN() {
		return serverYN;
	}

	public void setServerYN(String serverYN) {
		this.serverYN = serverYN;
	}

	public String getServerTotal() {
		return serverTotal;
	}

	public void setServerTotal(String serverTotal) {
		this.serverTotal = serverTotal;
	}

	public String getServerFun() {
		return serverFun;
	}

	public void setServerFun(String serverFun) {
		this.serverFun = serverFun;
	}

	public String getProjectorYN() {
		return projectorYN;
	}

	public void setProjectorYN(String projectorYN) {
		this.projectorYN = projectorYN;
	}

	public String getProjectorTotal() {
		return projectorTotal;
	}

	public void setProjectorTotal(String projectorTotal) {
		this.projectorTotal = projectorTotal;
	}

	public String getProjectorFun() {
		return projectorFun;
	}

	public void setProjectorFun(String projectorFun) {
		this.projectorFun = projectorFun;
	}

	public String getLedYN() {
		return ledYN;
	}

	public void setLedYN(String ledYN) {
		this.ledYN = ledYN;
	}

	public String getLedTotal() {
		return ledTotal;
	}

	public void setLedTotal(String ledTotal) {
		this.ledTotal = ledTotal;
	}

	public String getLedFun() {
		return ledFun;
	}

	public void setLedFun(String ledFun) {
		this.ledFun = ledFun;
	}

	public String getPrinterYN() {
		return printerYN;
	}

	public void setPrinterYN(String printerYN) {
		this.printerYN = printerYN;
	}

	public String getPrinterTotal() {
		return printerTotal;
	}

	public void setPrinterTotal(String printerTotal) {
		this.printerTotal = printerTotal;
	}

	public String getPrinterFun() {
		return printerFun;
	}

	public void setPrinterFun(String printerFun) {
		this.printerFun = printerFun;
	}

	public String getScannerYN() {
		return scannerYN;
	}

	public void setScannerYN(String scannerYN) {
		this.scannerYN = scannerYN;
	}

	public String getScannerTotal() {
		return scannerTotal;
	}

	public void setScannerTotal(String scannerTotal) {
		this.scannerTotal = scannerTotal;
	}

	public String getScannerFun() {
		return scannerFun;
	}

	public void setScannerFun(String scannerFun) {
		this.scannerFun = scannerFun;
	}

	public String getWebcamYN() {
		return webcamYN;
	}

	public void setWebcamYN(String webcamYN) {
		this.webcamYN = webcamYN;
	}

	public String getWebcamTotal() {
		return webcamTotal;
	}

	public void setWebcamTotal(String webcamTotal) {
		this.webcamTotal = webcamTotal;
	}

	public String getWebcamFun() {
		return webcamFun;
	}

	public void setWebcamFun(String webcamFun) {
		this.webcamFun = webcamFun;
	}

	public String getInternetYN() {
		return internetYN;
	}

	public void setInternetYN(String internetYN) {
		this.internetYN = internetYN;
	}

	public String getDthYN() {
		return dthYN;
	}

	public void setDthYN(String dthYN) {
		this.dthYN = dthYN;
	}

	public String getGeneratorYN() {
		return generatorYN;
	}

	public void setGeneratorYN(String generatorYN) {
		this.generatorYN = generatorYN;
	}

	public String getDigiResYN() {
		return digiResYN;
	}

	public void setDigiResYN(String digiResYN) {
		this.digiResYN = digiResYN;
	}

	public String getTechSolnYN() {
		return techSolnYN;
	}

	public void setTechSolnYN(String techSolnYN) {
		this.techSolnYN = techSolnYN;
	}

	public String getIctToolsYN() {
		return ictToolsYN;
	}

	public void setIctToolsYN(String ictToolsYN) {
		this.ictToolsYN = ictToolsYN;
	}

	public String getIctTeachHrs() {
		return ictTeachHrs;
	}

	public void setIctTeachHrs(String ictTeachHrs) {
		this.ictTeachHrs = ictTeachHrs;
	}

	public String getGeneratorFun() {
		return generatorFun;
	}

	public void setGeneratorFun(String generatorFun) {
		this.generatorFun = generatorFun;
	}

	public String getCalLabYN() {
		return calLabYN;
	}

	public void setCalLabYN(String calLabYN) {
		this.calLabYN = calLabYN;
	}

	public String getIctLabYN() {
		return ictLabYN;
	}

	public void setIctLabYN(String ictLabYN) {
		this.ictLabYN = ictLabYN;
	}

	public String getCreatedBy1819() {
		return createdBy1819;
	}

	public void setCreatedBy1819(String createdBy1819) {
		this.createdBy1819 = createdBy1819;
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
