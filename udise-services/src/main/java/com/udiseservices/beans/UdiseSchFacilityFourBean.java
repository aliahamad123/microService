package com.udiseservices.beans;

import com.udiseservices.utility.StaticMasterUtilityMethodes;

public class UdiseSchFacilityFourBean {
	
	private String _id;
	private Integer schoolId;
	private String udiseSchCode;
	private String acYear;
	private String ictImplYear;
	private String compLabType;
	private String ictlabFunYN;
	private String ictModelImpl;
	private String ictInstrType;
	private String laptopYN;
	private String laptopTotal;
	private String laptopFun;
	private String tabletsYN;
	private String tabletsTotal;
	private String tabletsFun;
	private String desktopYN;
	private String desktopTotal;
	private String desktopFun;
	private String teachdevYN;
	private String teachdevTotal;
	private String teachdevFun;
	private String digiBoardYN;
	private String digiBoardTotal;
	private String digiBoardFun;
	private String serverYN;
	private String serverTotal;
	private String serverFun;
	private String projectorYN;
	private String projectorTotal;
	private String projectorFun;
	private String ledYN;
	private String ledTotal;
	private String ledFun;
	private String printerYN;
	private String printerTotal;
	private String printerFun;
	private String scannerYN;
	private String scannerTotal;
	private String scannerFun;
	private String webcamYN;
	private String webcamTotal;
	private String webcamFun;
	private String internetYN;
	private String dthYN;
	private String generatorYN;
	private String digiResYN;
	private String techSolnYN;
	private String ictToolsYN;
	private String ictTeachHrs;
	private String generatorFun;
	private String calLabYN;
	private String ictLabYN;
	private String createdBy1819;
	private String createdTime;
	private String modifiedBy;
	private String modifiedTime;

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
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(ictlabFunYN);
	}

	public void setIctlabFunYN(String ictlabFunYN) {
		this.ictlabFunYN = ictlabFunYN;
	}

	public String getIctModelImpl() {
		return StaticMasterUtilityMethodes.checkIctModelImp(ictModelImpl);
	}

	public void setIctModelImpl(String ictModelImpl) {
		this.ictModelImpl = ictModelImpl;
	}

	public String getIctInstrType() {
		return StaticMasterUtilityMethodes.checkIctInstraction(ictInstrType);
	}

	public void setIctInstrType(String ictInstrType) {
		this.ictInstrType = ictInstrType;
	}

	public String getLaptopYN() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(laptopYN);
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
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(tabletsYN);
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
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(desktopYN);
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
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(teachdevYN);
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
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(digiBoardYN);
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
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(serverYN);
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
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(projectorYN);
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
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(ledYN);
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
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(printerYN);
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
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(scannerYN);
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
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(webcamYN);
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
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(internetYN);
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
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(techSolnYN);
	}

	public void setTechSolnYN(String techSolnYN) {
		this.techSolnYN = techSolnYN;
	}

	public String getIctToolsYN() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(ictToolsYN);
	}

	public void setIctToolsYN(String ictToolsYN) {
		this.ictToolsYN = ictToolsYN;
	}

	public String getIctTeachHrs() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(ictTeachHrs);
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
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(calLabYN);
	}

	public void setCalLabYN(String calLabYN) {
		this.calLabYN = calLabYN;
	}

	public String getIctLabYN() {
		return StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(ictLabYN);
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
