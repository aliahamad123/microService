package com.udiseservices.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udiseservices.beans.CombineDCFData;
import com.udiseservices.beans.CommenResponseBean;
import com.udiseservices.beans.DataBean;
import com.udiseservices.beans.UdiseSchFacilityFourBean;
import com.udiseservices.beans.UdiseSchFacilityOneBean;
import com.udiseservices.beans.UdiseSchFacilityThreeBean;
import com.udiseservices.beans.UdiseSchFacilityTwoBean;
import com.udiseservices.models.SchFacilityFour;
import com.udiseservices.models.SchFacilityOne;
import com.udiseservices.models.SchFacilityThree;
import com.udiseservices.models.SchFacilityTwo;
import com.udiseservices.outerServices.ProfileOuterServices;
import com.udiseservices.utility.StaticMasterUtilityMethodes;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UdiseFacilityController {

	@Autowired
	ProfileOuterServices profileOuterServices;
	private SchFacilityOne schFacilityOne;
	private SchFacilityTwo schFacilityTwo;
	private SchFacilityThree schPhysicalFacilityObj;
	private SchFacilityFour schIctAndDigitalFacilityObj;

	@GetMapping(value = "/fetchSchFacilityToiletData/{schoolId}/{year}")
	public CommenResponseBean fetchSchFacilityToiletData(@PathVariable("schoolId") String schoolId,
			@PathVariable("year") String year) {

		UdiseSchFacilityTwoBean toiletObj = new UdiseSchFacilityTwoBean();
		CombineDCFData combineDCFData = new CombineDCFData();
		CommenResponseBean profileResponseBean = new CommenResponseBean();
		DataBean data = new DataBean();
		schFacilityTwo = profileOuterServices.fetchSchFacilityTwo(schoolId, year);

		if (schFacilityTwo != null) {
				toiletObj.setSchoolId(schFacilityTwo.getSchoolId());
				toiletObj.setUdiseSchCode(schFacilityTwo.getUdiseSchCode());
				toiletObj.setAcYear(schFacilityTwo.getAcYear());
				toiletObj.setToiletBoys(schFacilityTwo.getToiletBoys());
				toiletObj.setToiletBoysFun(schFacilityTwo.getToiletBoysFun());
				toiletObj.setToiletGirls(schFacilityTwo.getToiletGirls());
				toiletObj.setToiletGirlsFun(schFacilityTwo.getToiletGirlsFun());
				toiletObj.setToiletBoysCwsn(schFacilityTwo.getToiletBoysCwsn());
				toiletObj.setToiletBoysCwsnFun(schFacilityTwo.getToiletBoysCwsnFun());
				toiletObj.setToiletGirlsCwsn(schFacilityTwo.getToiletGirlsCwsn());
				toiletObj.setToiletGirlsCwsnFun(schFacilityTwo.getToiletGirlsCwsnFun());
				toiletObj.setToiletBoysFunWater(schFacilityTwo.getToiletBoysFunWater());
				toiletObj.setToiletGirlsFunWater(schFacilityTwo.getToiletGirlsFunWater());
				toiletObj.setUrinalsBoys(schFacilityTwo.getUrinalsBoys());
				toiletObj.setUrinalsGirls(schFacilityTwo.getUrinalsGirls());
				toiletObj.setUrinalsBoysWater(schFacilityTwo.getUrinalsBoysWater());
				toiletObj.setUrinalsGirlsWater(schFacilityTwo.getUrinalsGirlsWater());
				toiletObj.setHandWashYN1819(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getHandWashYN1819()));
				toiletObj.setIncineratorYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getIncineratorYN()));
				toiletObj.setDrinkWarerYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getDrinkWarerYN()));
				toiletObj.setHandPumpTot(schFacilityTwo.getHandPumpTot1819());
				toiletObj.setHandPunpFun(schFacilityTwo.getHandPunpFun1819());
				toiletObj.setWellProtTot(schFacilityTwo.getWellProtTot1819());
				toiletObj.setWellProtFun(schFacilityTwo.getWellProtFun1819());
				toiletObj.setTapTotal(schFacilityTwo.getTapTotal());
				toiletObj.setTapFun(schFacilityTwo.getTapFun());
				toiletObj.setOthSrcTotal(schFacilityTwo.getOthSrcTotal());
				toiletObj.setOthSrcFun(schFacilityTwo.getOthSrcFun());
				toiletObj.setOthsrcName(schFacilityTwo.getOthsrcName());
				toiletObj.setWaterPurifierYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getWaterPurifierYN()));
				toiletObj.setRainHarvestYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getRainHarvestYN()));
				toiletObj.setWaterTestedYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getWaterTestedYN()));
				toiletObj.setDustbinsYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getDustbinsYN()));
				toiletObj.setHandwashMealYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getHandwashMealYN()));
				toiletObj.setElectricityYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getElectricityYN()));
				toiletObj.setSolarPanelYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getSolarPanelYN()));
				toiletObj.setLibraryYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getLibraryYN()));
				toiletObj.setLibraryBooks(schFacilityTwo.getLibraryBooks());
				toiletObj.setLibBooksNcert(schFacilityTwo.getLibBooksNcert());
				toiletObj.setBookbankYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getBookbankYN()));
				toiletObj.setBkbankBooks(schFacilityTwo.getBkbankBooks());
				toiletObj.setBkbnkBooksCcert(schFacilityTwo.getBkbnkBooksCcert());
				toiletObj.setReadcornerYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getReadcornerYN()));
				toiletObj.setReadcornerBooks(schFacilityTwo.getReadcornerBooks());
				toiletObj
						.setLibrarianYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getLibrarianYN()));
				toiletObj
						.setNewsPaperYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getNewsPaperYN()));
				toiletObj.setPlayGroundYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getPlayGroundYN()));
				toiletObj.setPlayGroundAltYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getPlayGroundAltYN()));
				toiletObj.setMedicalcheckYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getMedicalcheckYN()));
				toiletObj.setMedicalcheckTot(schFacilityTwo.getMedicalcheckTot());
				toiletObj
						.setDewormtabYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getDewormtabYN()));
				toiletObj.setIrontabYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getIrontabYN()));
				toiletObj.setRampsYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getRampsYN()));
				toiletObj
						.setHandrailsYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getHandrailsYN()));
				toiletObj.setSplEducatorYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getSplEducatorYN()));
				toiletObj.setKitchenGardenYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getKitchenGardenYN()));
				toiletObj.setToiletYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getToiletYN()));
				toiletObj.setHandwashMealTot(schFacilityTwo.getHandwashMealTot());
				toiletObj.setDstbnClsrmsYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getDstbnClsrmsYN()));
				toiletObj.setDstbnToiletYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getDstbnToiletYN()));
				toiletObj.setDstbnKitchenYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getDstbnKitchenYN()));
				toiletObj.setStusHVFurnt(schFacilityTwo.getStusHVFurnt());
				toiletObj.setStusHVFurnt1819(schFacilityTwo.getStusHVFurnt1819());
				toiletObj.setUrinalsBoysFun(schFacilityTwo.getUrinalsBoysFun());
				toiletObj.setUrinalsGirlsFun(schFacilityTwo.getUrinalsGirlsFun());
				toiletObj.setHandPumpYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getHandPumpYN()));
				toiletObj.setHandPumpFunYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getHandPumpFunYN()));
				toiletObj.setWellProtYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getWellProtYN()));
				toiletObj.setWellUnProtTotal1819(schFacilityTwo.getWellUnProtTotal1819());
				toiletObj.setWellProtFunYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getWellProtFunYN()));
				toiletObj.setWellUNProtYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getWellUNProtYN()));
				toiletObj.setWellUNProtFunYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getWellUNProtFunYN()));
				toiletObj.setTapYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getTapYN()));
				toiletObj.setTapFunYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getTapFunYN()));
				toiletObj
						.setPackWaterYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getPackWaterYN()));
				toiletObj.setPackWaterFunYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getPackWaterFunYN()));
				toiletObj.setOthsrcYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getOthsrcYN()));
				toiletObj
						.setOthsrcFunYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityTwo.getOthsrcFunYN()));
				toiletObj.setCreatedBy1819(schFacilityTwo.getCreatedBy1819());
				toiletObj.setCreatedTime(schFacilityTwo.getCreatedTime());
				toiletObj.setModifiedBy(schFacilityTwo.getModifiedBy());
				toiletObj.setModifiedTime(schFacilityTwo.getModifiedTime());
				//toiletList.add(toiletObj);

			
		}

		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		profileResponseBean.setApiId("1234");
		profileResponseBean.setApiName("Profile One By School Id");
		profileResponseBean.setApiVersion("v1.0.0.1");
		profileResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		profileResponseBean.setMethod("GET");
		profileResponseBean.setReleasedDate(dateFormate.format(new Date()));
		profileResponseBean.setRequestedDate(dateFormate.format(new Date()));
		profileResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		profileResponseBean.setResponseId(rand.nextInt(100000));
		combineDCFData.setToilet(toiletObj);
		data.setRecords(combineDCFData);
		//data.setTotalSize(toiletList.size());
		profileResponseBean.setData(data);
		return profileResponseBean;
	}

	@GetMapping(value = "/fetchSchFacilityOneData/{schoolId}/{year}")
	public CommenResponseBean fetchSchFacilityOne(@PathVariable("schoolId") String schoolId,
			@PathVariable("year") String year) {

		UdiseSchFacilityOneBean classRoomObj = new UdiseSchFacilityOneBean();
		CombineDCFData combineDCFData = new CombineDCFData();
		CommenResponseBean profileResponseBean = new CommenResponseBean();
		DataBean data = new DataBean();
		try {

			schFacilityOne = profileOuterServices.fetchSchFacilityOne(schoolId, year);

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (schFacilityOne != null) {
				classRoomObj.setBndrywallType(StaticMasterUtilityMethodes.fetchBundryWall(schFacilityOne.getBndrywallType()));
				classRoomObj.setBuildBlk(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getBuildBlk()));
				classRoomObj.setBuildBlkDptd(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getBuildBlkDptd()));
				classRoomObj.setBuildBlkKuc(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getBuildBlkKuc()));
				classRoomObj.setBuildBlkPpu(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getBuildBlkPpu()));
				classRoomObj.setBuildBlkTnt(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getBuildBlkTnt()));
				classRoomObj.setBuildBlkTot(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getBuildBlkTot()));
				classRoomObj.setBuildBlkUndcons(
						StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getBuildBlkUndcons()));
				classRoomObj.setBuildStatus(StaticMasterUtilityMethodes.fetchSchlBuilStatus(schFacilityOne.getBuildStatus()));
				classRoomObj.setClsrmsDptd(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsDptd()));
				classRoomObj.setClsrmsEle(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsEle()));
				classRoomObj.setClsrmsGood(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsGood()));
				classRoomObj.setClsrmsGoodKuc(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsGoodKuc()));
				classRoomObj.setClsrmsGoodPpu(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsGoodPpu()));
				classRoomObj.setClsrmsGoodTnt(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsGoodTnt()));
				classRoomObj.setClsrmsHsec(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsHsec()));
				classRoomObj.setClsrmsInst(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsInst()));
				classRoomObj.setClsrmsMajer(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsMajer()));
				classRoomObj
						.setClsrmsMajerKuc(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsMajerKuc()));
				classRoomObj
						.setClsrmsMajerPpu(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsMajerPpu()));
				classRoomObj.setClsrmsMajTnt(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsMajTnt()));
				classRoomObj.setClsrmsMin(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsMin()));
				classRoomObj.setClsrmsMinKun(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsMinKun()));
				classRoomObj.setClsrmsMinPpu(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsMinPpu()));
				classRoomObj.setClsrmsMinTnt(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsMinTnt()));
				classRoomObj.setClsrmsPrePri(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsPrePri()));
				classRoomObj.setClsrmsPri(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsPri()));
				classRoomObj.setClsrmsSec(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsSec()));
				classRoomObj.setClsrmsUndCons(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsUndCons()));
				classRoomObj.setClsrmsUpr(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getClsrmsUpr()));
				classRoomObj
						.setFurntYN1819(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityOne.getFurntYN1819()));
				classRoomObj.setHmRoomYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityOne.getHmRoomYN()));
				classRoomObj.setLandAvlbleYN(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(schFacilityOne.getLandAvlbleYN()));
				classRoomObj.setOthRooms(StaticMasterUtilityMethodes.checkStringNullToZero(schFacilityOne.getOthRooms()));
				classRoomObj.setSchoolId(schFacilityOne.getSchoolId());
				classRoomObj.setUdiseSchCode(schFacilityOne.getUdiseSchCode());
				classRoomObj.setAcYear(schFacilityOne.getAcYear());
		
		}

		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		profileResponseBean.setApiId("1234");
		profileResponseBean.setApiName("Profile One By School Id");
		profileResponseBean.setApiVersion("v1.0.0.1");
		profileResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		profileResponseBean.setMethod("GET");
		profileResponseBean.setReleasedDate(dateFormate.format(new Date()));
		profileResponseBean.setRequestedDate(dateFormate.format(new Date()));
		profileResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		profileResponseBean.setResponseId(rand.nextInt(100000));
		combineDCFData.setClassRoom(classRoomObj);
//		combineDCFData.setToilet(toiletList);
		data.setRecords(combineDCFData);
		//data.setTotalSize(classRoomList.size());
		profileResponseBean.setData(data);
		return profileResponseBean;
	}

	@GetMapping(value = "/fetchSchPhysicalFacilityData/{schoolId}/{year}")
	public CommenResponseBean fetchSchPhysicalFacility(@PathVariable("schoolId") String schoolId,
			@PathVariable("year") String year) {
		
		UdiseSchFacilityThreeBean physicalFacilityobj = new UdiseSchFacilityThreeBean();
		CombineDCFData combineDCFData = new CombineDCFData();
		CommenResponseBean profileResponseBean = new CommenResponseBean();
		DataBean data = new DataBean();

		try {
			schPhysicalFacilityObj = profileOuterServices.fetchSchFacilityThree(schoolId, year);
			//schFacilityFour = profileOuterServices.fetchSchFacilityFour(schoolId, year);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (schPhysicalFacilityObj != null) {
				physicalFacilityobj.setSchoolId(schPhysicalFacilityObj.getSchoolId());
				physicalFacilityobj.setUdiseSchCode(schPhysicalFacilityObj.getUdiseSchCode());
				physicalFacilityobj.setAcYear(schPhysicalFacilityObj.getAcYear());
				physicalFacilityobj.setAhmvpRoomYN(schPhysicalFacilityObj.getAhmvpRoomYN());
				physicalFacilityobj.setComRoomGirlsYN(schPhysicalFacilityObj.getComRoomGirlsYN());
				physicalFacilityobj.setStaffRoomYN(schPhysicalFacilityObj.getStaffRoomYN());
				physicalFacilityobj.setCraftRoomYN(schPhysicalFacilityObj.getCraftRoomYN());
				physicalFacilityobj.setStaffQtrYN(schPhysicalFacilityObj.getStaffQtrYN());
				physicalFacilityobj.setIntegratedLabYN(schPhysicalFacilityObj.getIntegratedLabYN());
				physicalFacilityobj.setLibraryRoomYN(schPhysicalFacilityObj.getLibraryRoomYN());
				physicalFacilityobj.setTinkeringLabYN(schPhysicalFacilityObj.getTinkeringLabYN());
				physicalFacilityobj.setCompRoomYN(schPhysicalFacilityObj.getCompRoomYN());
				physicalFacilityobj.setPhyLabYN(schPhysicalFacilityObj.getPhyLabYN());
				physicalFacilityobj.setPhyLabCondition(schPhysicalFacilityObj.getPhyLabCondition());
				physicalFacilityobj.setChemLabYN(schPhysicalFacilityObj.getChemLabYN());
				physicalFacilityobj.setChemLabCond(schPhysicalFacilityObj.getChemLabCond());
				physicalFacilityobj.setBoiLabYN(schPhysicalFacilityObj.getBoiLabYN());
				physicalFacilityobj.setBioLabCond(schPhysicalFacilityObj.getBioLabCond());
				physicalFacilityobj.setMathLabYN(schPhysicalFacilityObj.getMathLabYN());
				physicalFacilityobj.setMathLabCond(schPhysicalFacilityObj.getMathLabCond());
				physicalFacilityobj.setLangLabYN(schPhysicalFacilityObj.getLangLabYN());
				physicalFacilityobj.setLangLabCond(schPhysicalFacilityObj.getLangLabCond());
				physicalFacilityobj.setGeoLabYN(schPhysicalFacilityObj.getGeoLabYN());
				physicalFacilityobj.setGeoLabCond(schPhysicalFacilityObj.getGeoLabCond());
				physicalFacilityobj.setHomescLabYN(schPhysicalFacilityObj.getHomescLabYN());
				physicalFacilityobj.setHomeSCLabCond(schPhysicalFacilityObj.getHomeSCLabCond());
				physicalFacilityobj.setPsychoLabYN(schPhysicalFacilityObj.getPsychoLabYN());
				physicalFacilityobj.setPsychoLabCond(schPhysicalFacilityObj.getPsychoLabCond());
				physicalFacilityobj.setCompLabYN(schPhysicalFacilityObj.getCompLabYN());
				physicalFacilityobj.setCompLabCond(schPhysicalFacilityObj.getCompLabCond());
				physicalFacilityobj.setAudioSystemYN(schPhysicalFacilityObj.getAudioSystemYN());
				physicalFacilityobj.setSciencekitYN(schPhysicalFacilityObj.getSciencekitYN());
				physicalFacilityobj.setMathkitYN(schPhysicalFacilityObj.getMathkitYN());
				physicalFacilityobj.setBiometricDevYN(schPhysicalFacilityObj.getBiometricDevYN());
				// physicalFacilityobj.setCreatedBy1819(obj.getCreatedBy1819());
				physicalFacilityobj.setCreatedTime(schPhysicalFacilityObj.getCreatedTime());
				physicalFacilityobj.setModifiedBy(schPhysicalFacilityObj.getModifiedBy());
				physicalFacilityobj.setModifiedTime(schPhysicalFacilityObj.getModifiedTime());

		}

		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		profileResponseBean.setApiId("1234");
		profileResponseBean.setApiName("Profile One By School Id");
		profileResponseBean.setApiVersion("v1.0.0.1");
		profileResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		profileResponseBean.setMethod("GET");
		profileResponseBean.setReleasedDate(dateFormate.format(new Date()));
		profileResponseBean.setRequestedDate(dateFormate.format(new Date()));
		profileResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		profileResponseBean.setResponseId(rand.nextInt(100000));
		combineDCFData.setPhysicalFacility(physicalFacilityobj);
		data.setRecords(combineDCFData);
		profileResponseBean.setData(data);
		return profileResponseBean;

	}
	
	@GetMapping(value = "/fetchSchIctAndDigitalFacilityTwoData/{schoolId}/{year}")
	public CommenResponseBean fetchSchIctAndDigitalFacility(@PathVariable("schoolId") String schoolId,
			@PathVariable("year") String year) {
		
		UdiseSchFacilityFourBean ictAndDigitalObj = new UdiseSchFacilityFourBean();
		CombineDCFData combineDCFData = new CombineDCFData();
		CommenResponseBean profileResponseBean = new CommenResponseBean();
		DataBean data = new DataBean();

		try {
			schIctAndDigitalFacilityObj = profileOuterServices.fetchSchFacilityFour(schoolId, year);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (schIctAndDigitalFacilityObj != null) {
				ictAndDigitalObj.setSchoolId(schIctAndDigitalFacilityObj.getSchoolId());
				ictAndDigitalObj.setUdiseSchCode(schIctAndDigitalFacilityObj.getUdiseSchCode());
				ictAndDigitalObj.setAcYear(schIctAndDigitalFacilityObj.getAcYear());
				ictAndDigitalObj.setIctImplYear(schIctAndDigitalFacilityObj.getIctImplYear());
				ictAndDigitalObj.setCompLabType(schIctAndDigitalFacilityObj.getCompLabType());
				ictAndDigitalObj.setIctlabFunYN(schIctAndDigitalFacilityObj.getIctlabFunYN());
				ictAndDigitalObj.setIctModelImpl(schIctAndDigitalFacilityObj.getIctModelImpl());
				ictAndDigitalObj.setIctInstrType(schIctAndDigitalFacilityObj.getIctInstrType());
				ictAndDigitalObj.setLaptopYN(schIctAndDigitalFacilityObj.getLaptopYN());
				ictAndDigitalObj.setLaptopTotal(schIctAndDigitalFacilityObj.getLaptopTotal());
				ictAndDigitalObj.setLaptopFun(schIctAndDigitalFacilityObj.getLaptopFun());
				ictAndDigitalObj.setTabletsYN(schIctAndDigitalFacilityObj.getTabletsYN());
				ictAndDigitalObj.setTabletsTotal(schIctAndDigitalFacilityObj.getTabletsTotal());
				ictAndDigitalObj.setTabletsFun(schIctAndDigitalFacilityObj.getTabletsFun());
				ictAndDigitalObj.setDesktopYN(schIctAndDigitalFacilityObj.getDesktopYN());
				ictAndDigitalObj.setDesktopTotal(schIctAndDigitalFacilityObj.getDesktopTotal());
				ictAndDigitalObj.setDesktopFun(schIctAndDigitalFacilityObj.getDesktopFun());
				ictAndDigitalObj.setTeachdevYN(schIctAndDigitalFacilityObj.getTeachdevYN());
				ictAndDigitalObj.setTeachdevTotal(schIctAndDigitalFacilityObj.getTeachdevTotal());
				ictAndDigitalObj.setTeachdevFun(schIctAndDigitalFacilityObj.getTeachdevFun());
				ictAndDigitalObj.setDigiBoardYN(schIctAndDigitalFacilityObj.getDigiBoardYN());
				ictAndDigitalObj.setDigiBoardTotal(schIctAndDigitalFacilityObj.getDigiBoardTotal());
				ictAndDigitalObj.setDigiBoardFun(schIctAndDigitalFacilityObj.getDigiBoardFun());
				ictAndDigitalObj.setServerYN(schIctAndDigitalFacilityObj.getServerYN());
				ictAndDigitalObj.setServerTotal(schIctAndDigitalFacilityObj.getServerTotal());
				ictAndDigitalObj.setServerFun(schIctAndDigitalFacilityObj.getServerFun());
				ictAndDigitalObj.setProjectorYN(schIctAndDigitalFacilityObj.getProjectorYN());
				ictAndDigitalObj.setProjectorTotal(schIctAndDigitalFacilityObj.getProjectorTotal());
				ictAndDigitalObj.setProjectorFun(schIctAndDigitalFacilityObj.getProjectorFun());
				ictAndDigitalObj.setLedYN(schIctAndDigitalFacilityObj.getLedYN());
				ictAndDigitalObj.setLedTotal(schIctAndDigitalFacilityObj.getLedTotal());
				ictAndDigitalObj.setLedFun(schIctAndDigitalFacilityObj.getLedFun());
				ictAndDigitalObj.setPrinterYN(schIctAndDigitalFacilityObj.getPrinterYN());
				ictAndDigitalObj.setPrinterTotal(schIctAndDigitalFacilityObj.getPrinterTotal());
				ictAndDigitalObj.setPrinterFun(schIctAndDigitalFacilityObj.getPrinterFun());
				ictAndDigitalObj.setScannerYN(schIctAndDigitalFacilityObj.getScannerYN());
				ictAndDigitalObj.setScannerTotal(schIctAndDigitalFacilityObj.getScannerTotal());
				ictAndDigitalObj.setScannerFun(schIctAndDigitalFacilityObj.getScannerFun());
				ictAndDigitalObj.setWebcamYN(schIctAndDigitalFacilityObj.getWebcamYN());
				ictAndDigitalObj.setWebcamTotal(schIctAndDigitalFacilityObj.getWebcamTotal());
				ictAndDigitalObj.setWebcamFun(schIctAndDigitalFacilityObj.getWebcamFun());
				ictAndDigitalObj.setInternetYN(schIctAndDigitalFacilityObj.getInternetYN());
				ictAndDigitalObj.setDthYN(schIctAndDigitalFacilityObj.getDthYN());
				ictAndDigitalObj.setGeneratorYN(schIctAndDigitalFacilityObj.getGeneratorYN());
				ictAndDigitalObj.setDigiResYN(schIctAndDigitalFacilityObj.getDigiResYN());
				ictAndDigitalObj.setTechSolnYN(schIctAndDigitalFacilityObj.getTechSolnYN());
				ictAndDigitalObj.setIctToolsYN(schIctAndDigitalFacilityObj.getIctToolsYN());
				ictAndDigitalObj.setIctTeachHrs(schIctAndDigitalFacilityObj.getIctTeachHrs());
				ictAndDigitalObj.setGeneratorFun(schIctAndDigitalFacilityObj.getGeneratorFun());
				ictAndDigitalObj.setCalLabYN(schIctAndDigitalFacilityObj.getCalLabYN());
				ictAndDigitalObj.setIctLabYN(schIctAndDigitalFacilityObj.getIctLabYN());
				ictAndDigitalObj.setCreatedBy1819(schIctAndDigitalFacilityObj.getCreatedBy1819());
				ictAndDigitalObj.setCreatedTime(schIctAndDigitalFacilityObj.getCreatedTime());
				ictAndDigitalObj.setModifiedBy(schIctAndDigitalFacilityObj.getModifiedBy());
				ictAndDigitalObj.setModifiedTime(schIctAndDigitalFacilityObj.getModifiedTime());
			
		}
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		profileResponseBean.setApiId("1234");
		profileResponseBean.setApiName("Profile One By School Id");
		profileResponseBean.setApiVersion("v1.0.0.1");
		profileResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		profileResponseBean.setMethod("GET");
		profileResponseBean.setReleasedDate(dateFormate.format(new Date()));
		profileResponseBean.setRequestedDate(dateFormate.format(new Date()));
		profileResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		profileResponseBean.setResponseId(rand.nextInt(100000));
		combineDCFData.setIctFacility(ictAndDigitalObj);
		data.setRecords(combineDCFData);
		profileResponseBean.setData(data);
		return profileResponseBean;

	}
	
	
	

}
