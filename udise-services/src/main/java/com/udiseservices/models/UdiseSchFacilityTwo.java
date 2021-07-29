package com.udiseservices.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "sch_facility_2")
public class UdiseSchFacilityTwo {
	
	@Id
	@Field(value = "_id")
	private String _id;
	
	@Field(value = "school_id")
	private String schoolId;
	
	@Field(value = "udise_sch_code")
	private String udiseSchCode;
	
	@Field(value = "ac_year")
	private String acYear;
	
	@Field(value = "toiletb")
	private String toiletBoys;
	
	@Field(value = "toiletb_fun")
	private String toiletBoysFun;
	
	@Field(value = "toiletg")
	private String toiletGirls;
	
	@Field(value = "toiletg_fun")
	private String toiletGirlsFun;
	
	@Field(value = "toiletb_cwsn")
	private String toiletBoysCwsn;
	
	@Field(value = "toiletb_cwsn_fun")
	private String toiletBoysCwsnFun;
	
	@Field(value = "toiletg_cwsn")
	private String toiletGirlsCwsn;
	
	@Field(value = "toiletg_cwsn_fun")
	private String toiletGirlsCwsnFun;
	
	@Field(value = "toiletb_fun_water")
	private String toiletBoysFunWater;
	
	@Field(value = "toiletg_fun_water")
	private String toiletGirlsFunWater;
	
	@Field(value = "urinalsb")
	private String urinalsBoys;
	
	@Field(value = "urinalsg")
	private String urinalsGirls;
	
	@Field(value = "urinalsb_water")
	private String urinalsBoysWater;
	
	@Field(value = "urinalsg_water")
	private String urinalsGirlsWater;
	
	@Field(value = "handwash_yn")
	private String handWashYN1819;
	
	@Field(value = "incinerator_yn")
	private String incineratorYN;
	
	@Field(value = "drink_warer_yn")
	private String drinkWarerYN;
	
	@Field(value = "hand_pump_tot")
	private String handPumpTot1819;
	
	@Field(value = "hand_punp_fun")
	private String handPunpFun1819;
	
	@Field(value = "well_prot_tot")
	private String wellProtTot1819;
	
	@Field(value = "well_prot_fun")
	private String wellProtFun1819;
	
	@Field(value = "tap_tot")
	private String tapTotal;
	
	@Field(value = "tap_fun")
	private String tapFun;
	
	@Field(value = "othsrc_tot")
	private String othSrcTotal;
	
	@Field(value = "othsrc_fun")
	private String othSrcFun;
	
	@Field(value = "othsrc_name")
	private String othsrcName;
	
	@Field(value = "water_purifier_yn")
	private String waterPurifierYN;
	
	@Field(value = "rain_harvest_yn")
	private String rainHarvestYN;
	
	@Field(value = "water_tested_yn")
	private String waterTestedYN;
	
	@Field(value = "dustbins_yn")
	private String dustbinsYN;
	
	@Field(value = "handwash_meal_yn")
	private String handwashMealYN;
	
	@Field(value = "electricity_yn")
	private String electricityYN;
	
	@Field(value = "solarpanel_yn")
	private String solarPanelYN;
	
	@Field(value = "library_yn")
	private String libraryYN;
	
	@Field(value = "lib_books")
	private String libraryBooks;
	
	@Field(value = "lib_books_ncert")
	private String libBooksNcert;
	
	@Field(value = "bookbank_yn")
	private String bookbankYN;
	
	@Field(value = "bkbnk_books")
	private String bkbankBooks;
	
	@Field(value = "bkbnk_books_ncert")
	private String bkbnkBooksCcert;
	
	@Field(value = "readcorner_yn")
	private String readcornerYN;
	
	@Field(value = "readcorner_books")
	private String readcornerBooks;
	
	@Field(value = "librarian_yn")
	private String librarianYN;
	
	@Field(value = "newspaper_yn")
	private String newsPaperYN;
	
	@Field(value = "playground_yn")
	private String playGroundYN;
	
	@Field(value = "playground_alt_yn")
	private String playGroundAltYN;
	
	@Field(value = "medchk_yn")
	private String medicalcheckYN;
	
	@Field(value = "medchk_tot")
	private String medicalcheckTot;
	
	@Field(value = "dewormtab_yn")
	private String dewormtabYN;
	
	@Field(value = "irontab_yn")
	private String irontabYN;
	
	@Field(value = "ramps_yn")
	private String rampsYN;
	
	@Field(value = "handrails_yn")
	private String handrailsYN;
	
	@Field(value = "spl_educator_yn")
	private String splEducatorYN;
	
	@Field(value = "kitchen_garden_yn")
	private String kitchenGardenYN;
	
	@Field(value = "toilet_yn")
	private String toiletYN;
	
	@Field(value = "handwash_meal_tot")
	private String handwashMealTot;
	
	@Field(value = "dstbn_clsrms_yn")
	private String dstbnClsrmsYN;
	
	@Field(value = "dstbn_toilet_yn")
	private String dstbnToiletYN;
	
	@Field(value = "dstbn_kitchen_yn")
	private String dstbnKitchenYN;
	
	@Field(value = "stus_hv_furnt")
	private String stusHVFurnt;
	
	@Field(value = "stus_hv_furnt_2")
	private String stusHVFurnt1819;
	
	@Field(value = "urinalsb_fun")
	private String urinalsBoysFun;
	
	@Field(value = "urinalsg_fun")
	private String urinalsGirlsFun;
	
	@Field(value = "hand_pump_yn")
	private String handPumpYN;
	
	@Field(value = "hand_pump_fun_yn")
	private String handPumpFunYN;
	
	@Field(value = "well_prot_yn")
	private String wellProtYN;
	
	@Field(value = "well_unprot_tot")
	private String wellUnProtTotal1819;
	
	@Field(value = "well_prot_fun_yn")
	private String wellProtFunYN;
	
	@Field(value = "well_unprot_yn")
	private String wellUNProtYN;
	
	@Field(value = "well_unprot_fun_yn")
	private String wellUNProtFunYN;
	
	@Field(value = "tap_yn")
	private String tapYN;
	
	@Field(value = "tap_fun_yn")
	private String tapFunYN;
	
	@Field(value = "pack_water_yn")
	private String packWaterYN;
	
	@Field(value = "pack_water_fun_yn")
	private String packWaterFunYN;
	
	@Field(value = "othsrc_yn")
	private String othsrcYN;
	
	@Field(value = "othsrc_fun_yn")
	private String othsrcFunYN;
	
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

	public String getToiletBoys() {
		return toiletBoys;
	}

	public void setToiletBoys(String toiletBoys) {
		this.toiletBoys = toiletBoys;
	}

	public String getToiletBoysFun() {
		return toiletBoysFun;
	}

	public void setToiletBoysFun(String toiletBoysFun) {
		this.toiletBoysFun = toiletBoysFun;
	}

	public String getToiletGirls() {
		return toiletGirls;
	}

	public void setToiletGirls(String toiletGirls) {
		this.toiletGirls = toiletGirls;
	}

	public String getToiletGirlsFun() {
		return toiletGirlsFun;
	}

	public void setToiletGirlsFun(String toiletGirlsFun) {
		this.toiletGirlsFun = toiletGirlsFun;
	}

	public String getToiletBoysCwsn() {
		return toiletBoysCwsn;
	}

	public void setToiletBoysCwsn(String toiletBoysCwsn) {
		this.toiletBoysCwsn = toiletBoysCwsn;
	}

	public String getToiletBoysCwsnFun() {
		return toiletBoysCwsnFun;
	}

	public void setToiletBoysCwsnFun(String toiletBoysCwsnFun) {
		this.toiletBoysCwsnFun = toiletBoysCwsnFun;
	}

	public String getToiletGirlsCwsn() {
		return toiletGirlsCwsn;
	}

	public void setToiletGirlsCwsn(String toiletGirlsCwsn) {
		this.toiletGirlsCwsn = toiletGirlsCwsn;
	}

	public String getToiletGirlsCwsnFun() {
		return toiletGirlsCwsnFun;
	}

	public void setToiletGirlsCwsnFun(String toiletGirlsCwsnFun) {
		this.toiletGirlsCwsnFun = toiletGirlsCwsnFun;
	}

	public String getToiletBoysFunWater() {
		return toiletBoysFunWater;
	}

	public void setToiletBoysFunWater(String toiletBoysFunWater) {
		this.toiletBoysFunWater = toiletBoysFunWater;
	}

	public String getToiletGirlsFunWater() {
		return toiletGirlsFunWater;
	}

	public void setToiletGirlsFunWater(String toiletGirlsFunWater) {
		this.toiletGirlsFunWater = toiletGirlsFunWater;
	}

	public String getUrinalsBoys() {
		return urinalsBoys;
	}

	public void setUrinalsBoys(String urinalsBoys) {
		this.urinalsBoys = urinalsBoys;
	}

	public String getUrinalsGirls() {
		return urinalsGirls;
	}

	public void setUrinalsGirls(String urinalsGirls) {
		this.urinalsGirls = urinalsGirls;
	}

	public String getUrinalsBoysWater() {
		return urinalsBoysWater;
	}

	public void setUrinalsBoysWater(String urinalsBoysWater) {
		this.urinalsBoysWater = urinalsBoysWater;
	}

	public String getUrinalsGirlsWater() {
		return urinalsGirlsWater;
	}

	public void setUrinalsGirlsWater(String urinalsGirlsWater) {
		this.urinalsGirlsWater = urinalsGirlsWater;
	}

	public String getHandWashYN1819() {
		return handWashYN1819;
	}

	public void setHandWashYN1819(String handWashYN1819) {
		this.handWashYN1819 = handWashYN1819;
	}

	public String getIncineratorYN() {
		return incineratorYN;
	}

	public void setIncineratorYN(String incineratorYN) {
		this.incineratorYN = incineratorYN;
	}

	public String getDrinkWarerYN() {
		return drinkWarerYN;
	}

	public void setDrinkWarerYN(String drinkWarerYN) {
		this.drinkWarerYN = drinkWarerYN;
	}

	public String getHandPumpTot1819() {
		return handPumpTot1819;
	}

	public void setHandPumpTot1819(String handPumpTot1819) {
		this.handPumpTot1819 = handPumpTot1819;
	}

	public String getHandPunpFun1819() {
		return handPunpFun1819;
	}

	public void setHandPunpFun1819(String handPunpFun1819) {
		this.handPunpFun1819 = handPunpFun1819;
	}

	public String getWellProtTot1819() {
		return wellProtTot1819;
	}

	public void setWellProtTot1819(String wellProtTot1819) {
		this.wellProtTot1819 = wellProtTot1819;
	}

	public String getWellProtFun1819() {
		return wellProtFun1819;
	}

	public void setWellProtFun1819(String wellProtFun1819) {
		this.wellProtFun1819 = wellProtFun1819;
	}

	public String getTapTotal() {
		return tapTotal;
	}

	public void setTapTotal(String tapTotal) {
		this.tapTotal = tapTotal;
	}

	public String getTapFun() {
		return tapFun;
	}

	public void setTapFun(String tapFun) {
		this.tapFun = tapFun;
	}

	public String getOthSrcTotal() {
		return othSrcTotal;
	}

	public void setOthSrcTotal(String othSrcTotal) {
		this.othSrcTotal = othSrcTotal;
	}

	public String getOthSrcFun() {
		return othSrcFun;
	}

	public void setOthSrcFun(String othSrcFun) {
		this.othSrcFun = othSrcFun;
	}

	public String getOthsrcName() {
		return othsrcName;
	}

	public void setOthsrcName(String othsrcName) {
		this.othsrcName = othsrcName;
	}

	public String getWaterPurifierYN() {
		return waterPurifierYN;
	}

	public void setWaterPurifierYN(String waterPurifierYN) {
		this.waterPurifierYN = waterPurifierYN;
	}

	public String getRainHarvestYN() {
		return rainHarvestYN;
	}

	public void setRainHarvestYN(String rainHarvestYN) {
		this.rainHarvestYN = rainHarvestYN;
	}

	public String getWaterTestedYN() {
		return waterTestedYN;
	}

	public void setWaterTestedYN(String waterTestedYN) {
		this.waterTestedYN = waterTestedYN;
	}

	public String getDustbinsYN() {
		return dustbinsYN;
	}

	public void setDustbinsYN(String dustbinsYN) {
		this.dustbinsYN = dustbinsYN;
	}

	public String getHandwashMealYN() {
		return handwashMealYN;
	}

	public void setHandwashMealYN(String handwashMealYN) {
		this.handwashMealYN = handwashMealYN;
	}

	public String getElectricityYN() {
		return electricityYN;
	}

	public void setElectricityYN(String electricityYN) {
		this.electricityYN = electricityYN;
	}

	public String getSolarPanelYN() {
		return solarPanelYN;
	}

	public void setSolarPanelYN(String solarPanelYN) {
		this.solarPanelYN = solarPanelYN;
	}

	public String getLibraryYN() {
		return libraryYN;
	}

	public void setLibraryYN(String libraryYN) {
		this.libraryYN = libraryYN;
	}

	public String getLibraryBooks() {
		return libraryBooks;
	}

	public void setLibraryBooks(String libraryBooks) {
		this.libraryBooks = libraryBooks;
	}

	public String getLibBooksNcert() {
		return libBooksNcert;
	}

	public void setLibBooksNcert(String libBooksNcert) {
		this.libBooksNcert = libBooksNcert;
	}

	public String getBookbankYN() {
		return bookbankYN;
	}

	public void setBookbankYN(String bookbankYN) {
		this.bookbankYN = bookbankYN;
	}

	public String getBkbankBooks() {
		return bkbankBooks;
	}

	public void setBkbankBooks(String bkbankBooks) {
		this.bkbankBooks = bkbankBooks;
	}

	public String getBkbnkBooksCcert() {
		return bkbnkBooksCcert;
	}

	public void setBkbnkBooksCcert(String bkbnkBooksCcert) {
		this.bkbnkBooksCcert = bkbnkBooksCcert;
	}

	public String getReadcornerYN() {
		return readcornerYN;
	}

	public void setReadcornerYN(String readcornerYN) {
		this.readcornerYN = readcornerYN;
	}

	public String getReadcornerBooks() {
		return readcornerBooks;
	}

	public void setReadcornerBooks(String readcornerBooks) {
		this.readcornerBooks = readcornerBooks;
	}

	public String getLibrarianYN() {
		return librarianYN;
	}

	public void setLibrarianYN(String librarianYN) {
		this.librarianYN = librarianYN;
	}

	public String getNewsPaperYN() {
		return newsPaperYN;
	}

	public void setNewsPaperYN(String newsPaperYN) {
		this.newsPaperYN = newsPaperYN;
	}

	public String getPlayGroundYN() {
		return playGroundYN;
	}

	public void setPlayGroundYN(String playGroundYN) {
		this.playGroundYN = playGroundYN;
	}

	public String getPlayGroundAltYN() {
		return playGroundAltYN;
	}

	public void setPlayGroundAltYN(String playGroundAltYN) {
		this.playGroundAltYN = playGroundAltYN;
	}

	public String getMedicalcheckYN() {
		return medicalcheckYN;
	}

	public void setMedicalcheckYN(String medicalcheckYN) {
		this.medicalcheckYN = medicalcheckYN;
	}

	public String getMedicalcheckTot() {
		return medicalcheckTot;
	}

	public void setMedicalcheckTot(String medicalcheckTot) {
		this.medicalcheckTot = medicalcheckTot;
	}

	public String getDewormtabYN() {
		return dewormtabYN;
	}

	public void setDewormtabYN(String dewormtabYN) {
		this.dewormtabYN = dewormtabYN;
	}

	public String getIrontabYN() {
		return irontabYN;
	}

	public void setIrontabYN(String irontabYN) {
		this.irontabYN = irontabYN;
	}

	public String getRampsYN() {
		return rampsYN;
	}

	public void setRampsYN(String rampsYN) {
		this.rampsYN = rampsYN;
	}

	public String getHandrailsYN() {
		return handrailsYN;
	}

	public void setHandrailsYN(String handrailsYN) {
		this.handrailsYN = handrailsYN;
	}

	public String getSplEducatorYN() {
		return splEducatorYN;
	}

	public void setSplEducatorYN(String splEducatorYN) {
		this.splEducatorYN = splEducatorYN;
	}

	public String getKitchenGardenYN() {
		return kitchenGardenYN;
	}

	public void setKitchenGardenYN(String kitchenGardenYN) {
		this.kitchenGardenYN = kitchenGardenYN;
	}

	public String getToiletYN() {
		return toiletYN;
	}

	public void setToiletYN(String toiletYN) {
		this.toiletYN = toiletYN;
	}

	public String getHandwashMealTot() {
		return handwashMealTot;
	}

	public void setHandwashMealTot(String handwashMealTot) {
		this.handwashMealTot = handwashMealTot;
	}

	public String getDstbnClsrmsYN() {
		return dstbnClsrmsYN;
	}

	public void setDstbnClsrmsYN(String dstbnClsrmsYN) {
		this.dstbnClsrmsYN = dstbnClsrmsYN;
	}

	public String getDstbnToiletYN() {
		return dstbnToiletYN;
	}

	public void setDstbnToiletYN(String dstbnToiletYN) {
		this.dstbnToiletYN = dstbnToiletYN;
	}

	public String getDstbnKitchenYN() {
		return dstbnKitchenYN;
	}

	public void setDstbnKitchenYN(String dstbnKitchenYN) {
		this.dstbnKitchenYN = dstbnKitchenYN;
	}

	public String getStusHVFurnt() {
		return stusHVFurnt;
	}

	public void setStusHVFurnt(String stusHVFurnt) {
		this.stusHVFurnt = stusHVFurnt;
	}

	public String getStusHVFurnt1819() {
		return stusHVFurnt1819;
	}

	public void setStusHVFurnt1819(String stusHVFurnt1819) {
		this.stusHVFurnt1819 = stusHVFurnt1819;
	}

	public String getUrinalsBoysFun() {
		return urinalsBoysFun;
	}

	public void setUrinalsBoysFun(String urinalsBoysFun) {
		this.urinalsBoysFun = urinalsBoysFun;
	}

	public String getUrinalsGirlsFun() {
		return urinalsGirlsFun;
	}

	public void setUrinalsGirlsFun(String urinalsGirlsFun) {
		this.urinalsGirlsFun = urinalsGirlsFun;
	}

	public String getHandPumpYN() {
		return handPumpYN;
	}

	public void setHandPumpYN(String handPumpYN) {
		this.handPumpYN = handPumpYN;
	}

	public String getHandPumpFunYN() {
		return handPumpFunYN;
	}

	public void setHandPumpFunYN(String handPumpFunYN) {
		this.handPumpFunYN = handPumpFunYN;
	}

	public String getWellProtYN() {
		return wellProtYN;
	}

	public void setWellProtYN(String wellProtYN) {
		this.wellProtYN = wellProtYN;
	}

	public String getWellUnProtTotal1819() {
		return wellUnProtTotal1819;
	}

	public void setWellUnProtTotal1819(String wellUnProtTotal1819) {
		this.wellUnProtTotal1819 = wellUnProtTotal1819;
	}

	public String getWellProtFunYN() {
		return wellProtFunYN;
	}

	public void setWellProtFunYN(String wellProtFunYN) {
		this.wellProtFunYN = wellProtFunYN;
	}

	public String getWellUNProtYN() {
		return wellUNProtYN;
	}

	public void setWellUNProtYN(String wellUNProtYN) {
		this.wellUNProtYN = wellUNProtYN;
	}

	public String getWellUNProtFunYN() {
		return wellUNProtFunYN;
	}

	public void setWellUNProtFunYN(String wellUNProtFunYN) {
		this.wellUNProtFunYN = wellUNProtFunYN;
	}

	public String getTapYN() {
		return tapYN;
	}

	public void setTapYN(String tapYN) {
		this.tapYN = tapYN;
	}

	public String getTapFunYN() {
		return tapFunYN;
	}

	public void setTapFunYN(String tapFunYN) {
		this.tapFunYN = tapFunYN;
	}

	public String getPackWaterYN() {
		return packWaterYN;
	}

	public void setPackWaterYN(String packWaterYN) {
		this.packWaterYN = packWaterYN;
	}

	public String getPackWaterFunYN() {
		return packWaterFunYN;
	}

	public void setPackWaterFunYN(String packWaterFunYN) {
		this.packWaterFunYN = packWaterFunYN;
	}

	public String getOthsrcYN() {
		return othsrcYN;
	}

	public void setOthsrcYN(String othsrcYN) {
		this.othsrcYN = othsrcYN;
	}

	public String getOthsrcFunYN() {
		return othsrcFunYN;
	}

	public void setOthsrcFunYN(String othsrcFunYN) {
		this.othsrcFunYN = othsrcFunYN;
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
