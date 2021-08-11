package com.udiseservices.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.bouncycastle.pqc.math.linearalgebra.GoppaCode.MaMaPe;
import org.slf4j.impl.StaticMarkerBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.ManagedArray;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udiseservices.beans.CombineDCFData;
import com.udiseservices.beans.CommenResponseBean;
import com.udiseservices.beans.DataBean;
import com.udiseservices.beans.UdiseSchManagementBean;
import com.udiseservices.beans.UdiseSchProfileFourBean;
import com.udiseservices.beans.UdiseSchProfileOneBean;
import com.udiseservices.beans.UdiseSchProfileThreeBean;
import com.udiseservices.beans.UdiseSchProfileTwoBean;
import com.udiseservices.models.SchManagement;
import com.udiseservices.models.SchProfileFour;
import com.udiseservices.models.SchProfileOne;
import com.udiseservices.models.SchProfileThree;
import com.udiseservices.models.SchProfileTwo;
import com.udiseservices.models.SchoolMaster;
import com.udiseservices.models.VillageWardMaster;
import com.udiseservices.outerServices.ProfileOuterServices;
import com.udiseservices.outerServices.MasterOuterService;
import com.udiseservices.utility.StaticMasterUtilityMethodes;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UdiseProfileOneController {

	@Autowired
	MasterOuterService masterOuterService;
	@Autowired
	ProfileOuterServices profileOuterServices;

	private SchoolMaster schMasterdata;
	private VillageWardMaster schVillagedata;
	private SchProfileOne profileData;
	private SchManagement schManagementData;
	private SchProfileTwo profileTwoData;
	private SchProfileThree profileThreeData;
	private SchProfileFour profileFourData;
	private String schoolName = "";
	private String location = "";
	private String latitude = "";
	private String longitude = "";
	private String villageName = "";
	private String clusterName;
	private String pinCode;
	private String gramPanchayat;
	private String block1;
	private String HabitationName;
	private String block2;
	private String AssemblyConstituency;
	private String municipalityName;
	private String cityName;
	private String address;
	private String categoryName;
	private String lowestClass;
	private String highestClass;
	private String schType;

	@GetMapping(value = "/getSchProfileOneData/{schoolId}/{year}")
	public CommenResponseBean fetchSchProfileOne(@PathVariable("schoolId") Integer schoolId,
			@PathVariable("year") String year) {
		System.out.println("Ali..................................................");
		System.out.println("School Id is " + schoolId + " year is " + year);

		List<UdiseSchProfileOneBean> ProfileOneList = new ArrayList<UdiseSchProfileOneBean>();
		CommenResponseBean profileResponseBean = new CommenResponseBean();
		UdiseSchProfileOneBean profile1 = new UdiseSchProfileOneBean();
		DataBean data = new DataBean();
		try {

			schMasterdata = masterOuterService.fetchSchMasterBySchoolId(schoolId);
			//System.out.println("School master is " + schMasterdata);
			
			//System.out.println("School Profile is " + profileData);
			try {
				if (schMasterdata != null) {
					String villaId = schMasterdata.getVillWardId();
					System.out.println("Village Id is " + villaId);
					System.out.println("Village Id is " + schMasterdata.getSchoolId());
					schVillagedata = masterOuterService.fetchVillMasterByVillageId(villaId);
					if (schVillagedata != null) {
						villageName = schVillagedata.getVillageWardName();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			profileData = profileOuterServices.fetchSchProfileOne(schoolId, year);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (schMasterdata != null) {
			schoolName = schMasterdata.getSchoolName();
			location = StaticMasterUtilityMethodes.fetchSchoolLocation(schMasterdata.getSchLocRuralUrban());
			// villageName = schMasterdata.getVillWardId();
			clusterName = schMasterdata.getClusterId();
			pinCode = schMasterdata.getPincode();
			block1 = schMasterdata.getBlockId();
			block2 = schMasterdata.getBlockId2();
			latitude = schMasterdata.getLatitude();
			longitude = schMasterdata.getLongitude();

		}

		if (profileData != null) {
				profile1.setSchoolId(profileData.getSchoolId());
				profile1.setUdiseSchCode(profileData.getUdiseSchCode());
				profile1.setAddress(profileData.getAddress());
				profile1.setStdcode(profileData.getStdcode());
				profile1.setPhone(profileData.getPhone());
				profile1.setMobile(profileData.getMobile());
				profile1.setStdcodeResp(profileData.getStdcodeResp());
				profile1.setPhoneResp(profileData.getPhoneResp());
				profile1.setMobileResp(profileData.getMobileResp());
				profile1.setWebsite(profileData.getWebsite());
				profile1.setEmail(profileData.getEmail());
				profile1.setAcYear(profileData.getAcYear());
				profile1.setRespName(profileData.getRespName());
				profile1.setBlock1(profileData.getBlock1());
				profile1.setBlock2(profileData.getBlock2());
		}
		profile1.setSchName(schoolName);
		profile1.setLocation(location);
		profile1.setVillageName(villageName);
		profile1.setClusterName(clusterName);
		profile1.setPinCode(pinCode);
		profile1.setBlock1(block1);
		profile1.setBlock2(block2);
		profile1.setLatitude(latitude);
		profile1.setLongitude(longitude);
		ProfileOneList.add(profile1);
		
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
		data.setTotalSize(ProfileOneList.size());
		data.setRecords(ProfileOneList);
		profileResponseBean.setData(data);
		return profileResponseBean;
	}

	@GetMapping(value = "/getSchProfileThreeData/{schoolId}/{year}")
	public CommenResponseBean fetchSchProfileThree(@PathVariable("schoolId") Integer schoolId,
			@PathVariable("year") String year) {
		UdiseSchProfileThreeBean language = new UdiseSchProfileThreeBean();
		CommenResponseBean profileResponseBean = new CommenResponseBean();
		CombineDCFData combineDCFData = new CombineDCFData();
		DataBean data = new DataBean();
		profileThreeData = profileOuterServices.fetchSchProfileThree(schoolId, year);

		if (profileThreeData != null) {
				language.setMtonguePri(profileThreeData.getMtonguePri());
				language.setMedinstr1(StaticMasterUtilityMethodes.fetchMediumAvailability(profileThreeData.getMedinstr1()));
				language.setMedinstr2(StaticMasterUtilityMethodes.fetchMediumAvailability(profileThreeData.getMedinstr2()));
				language.setMedinstr3(StaticMasterUtilityMethodes.fetchMediumAvailability(profileThreeData.getMedinstr3()));
				language.setMedinstr4(StaticMasterUtilityMethodes.fetchMediumAvailability(profileThreeData.getMedinstr4()));
				language.setMedinstrOther(StaticMasterUtilityMethodes.fetchMediumAvailability(profileThreeData.getMedinstrOther()));
				language.setLang1(StaticMasterUtilityMethodes.fetchLanuageAvailability(profileThreeData.getLang1()));
				language.setLang2(StaticMasterUtilityMethodes.fetchLanuageAvailability(profileThreeData.getLang2()));
				language.setLang3(StaticMasterUtilityMethodes.fetchLanuageAvailability(profileThreeData.getLang3()));
				language.setPrevocYn(profileThreeData.getPrevocYn());
				language.setEduvocYn(profileThreeData.getEduvocYn());
				language.setBoardSec(profileThreeData.getBoardSec());
				language.setBoardSecNo(profileThreeData.getBoardSecNo());
				language.setBoardSecOth(profileThreeData.getBoardSecOth());
				language.setBoardHsec(profileThreeData.getBoardHsec());
				language.setBoardHsecNo(profileThreeData.getBoardHsecNo());
				language.setBoardHsecOth(profileThreeData.getBoardHsecOth());
				language.setDistancePri(profileThreeData.getDistancePri());
				language.setDistanceSec(profileThreeData.getDistanceSec());
				language.setDistanceUpr(profileThreeData.getDistanceUpr());
				language.setDistanceHsec(profileThreeData.getDistanceHsec());
				language.setApproachRoadYn(profileThreeData.getApproachRoadYn());
				language.setAnganwadiYn(profileThreeData.getAnganwadiYn());
				language.setAnganwadiCode(profileThreeData.getAnganwadiCode());
				language.setAnganwadiStu(profileThreeData.getAnganwadiStu());
				language.setAnganwadiStuBoys(profileThreeData.getAnganwadiStuBoys());
				language.setAnganwadiStuGirls(profileThreeData.getAnganwadiStuGirls());
				language.setAnganwadiTchTrained(profileThreeData.getAnganwadiTchTrained());
				language.setAnganwadiTch(profileThreeData.getAnganwadiTch());
				language.setWorkdaysPri(profileThreeData.getWorkdaysPri());
				// language.setWorkdaysPrePri1819(profileThreeData.getWorkdaysPrePri1819());
				language.setWorkdaysSec(profileThreeData.getWorkdaysSec());
				language.setWorkdaysUpr(profileThreeData.getWorkdaysUpr());
				language.setWorkdaysHsec(profileThreeData.getWorkdaysHsec());
				language.setSchHrsStuPri(profileThreeData.getSchHrsStuPri());
				language.setSchHrsStuSec(profileThreeData.getSchHrsStuSec());
				language.setSchHrsStuUpr(profileThreeData.getSchHrsStuUpr());
				language.setSchHrsStuHsec(profileThreeData.getSchHrsStuHsec());

				language.setSchHrsTchPrePri1819(profileThreeData.getSchHrsStuPrePri1819());
				language.setSchHrsTchPri(profileThreeData.getSchHrsTchPri());
				language.setSchHrsTchSec(profileThreeData.getSchHrsStuSec());
				language.setSchHrsTchUpr(profileThreeData.getSchHrsTchUpr());
				language.setSchHrsTchHsec(profileThreeData.getSchHrsTchHsec());

				language.setPpSecStu1819(profileThreeData.getPpSecStu1819());
				language.setPpSecTch1819(profileThreeData.getPpSecTch1819());
				language.setPpSecYN1819(profileThreeData.getPpSecYN1819());
				language.setPpstuLkgBoys1819(profileThreeData.getPpstuLkgBoys1819());
				language.setPpstuLkgGirls1819(profileThreeData.getPpstuLkgGirls1819());
				language.setPpstuUkgBoys1819(profileThreeData.getPpstuUkgBoys1819());
				language.setPpstuUkgGirls1819(profileThreeData.getPpstuUkgGirls1819());
				//language.add(language);
			
		}
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		profileResponseBean.setApiId("1234");
		profileResponseBean.setApiName("Profile Two By School Id");
		profileResponseBean.setApiVersion("v1.0.0.1");
		profileResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		profileResponseBean.setMethod("GET");
		profileResponseBean.setReleasedDate(dateFormate.format(new Date()));
		profileResponseBean.setRequestedDate(dateFormate.format(new Date()));
		profileResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		profileResponseBean.setResponseId(rand.nextInt(100000));
		combineDCFData.setLanguage(language);
		data.setRecords(combineDCFData);
		//data.setTotalSize(language.size());
		profileResponseBean.setData(data);
		return profileResponseBean;
	}

	@GetMapping(value = "/getSchProfileTwoData/{schoolId}/{year}")
	public CommenResponseBean fetchSchProfileTwo(@PathVariable("schoolId") Integer schoolId,
			@PathVariable("year") String year) {
		UdiseSchProfileTwoBean categoryObj = new UdiseSchProfileTwoBean();
		CommenResponseBean profileResponseBean = new CommenResponseBean();
		CombineDCFData combineDCFData = new CombineDCFData();
		String schoolName = "";
		DataBean data = new DataBean();
		try {
			profileTwoData = profileOuterServices.fetchSchProfileTwo(schoolId, year);
			schMasterdata = masterOuterService.fetchSchMasterBySchoolId(schoolId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (schMasterdata != null) {
			schoolName = schMasterdata.getSchoolName();
			categoryName = StaticMasterUtilityMethodes.fetchSchoolCategoryDetails(schMasterdata.getSchCategoryId());
			lowestClass = schMasterdata.getClassFrm();
			highestClass = schMasterdata.getClassTo();
			schType = StaticMasterUtilityMethodes.fetchSchType(schMasterdata.getSchType());
		}

		if (profileTwoData != null) {
				categoryObj.setUdiseSchCode(profileTwoData.getUdiseSchCode());
				categoryObj.setSchoolId(profileTwoData.getSchoolId());
				categoryObj.setAcYear(profileTwoData.getAcYear());
				categoryObj.setC0Sec(profileTwoData.getC0Sec());
				categoryObj.setC1Sec(profileTwoData.getC1Sec());
				categoryObj.setC2Sec(profileTwoData.getC2Sec());
				categoryObj.setC3Sec(profileTwoData.getC3Sec());
				categoryObj.setC4Sec(profileTwoData.getC4Sec());
				categoryObj.setC5Sec(profileTwoData.getC5Sec());
				categoryObj.setC6Sec(profileTwoData.getC6Sec());
				categoryObj.setC7Sec(profileTwoData.getC7Sec());
				categoryObj.setC8Sec(profileTwoData.getC8Sec());
				categoryObj.setC9Sec(profileTwoData.getC9Sec());
				categoryObj.setC10Sec(profileTwoData.getC10Sec());
				categoryObj.setC11Sec(profileTwoData.getC11Sec());
				categoryObj.setC12Sec(profileTwoData.getC12Sec());
				categoryObj.setEstdYear(profileTwoData.getEstdYear());
				categoryObj.setRecogYearEle(profileTwoData.getRecogYearEle());
				categoryObj.setRecogYearPri(profileTwoData.getRecogYearPri());
				categoryObj.setRecogYearSec(profileTwoData.getRecogYearSec());
				categoryObj.setRecogYearUpr(profileTwoData.getRecogYearUpr());
				categoryObj.setRecogYearHsec(profileTwoData.getRecogYearHsec());
				categoryObj.setUpgrdYearEle(profileTwoData.getUpgrdYearEle());
				categoryObj.setUpgrdYearSec(profileTwoData.getUpgrdYearSec());
				categoryObj.setUpgrdYearHsec(profileTwoData.getUpgrdYearHsec());
				categoryObj.setCwsnSchYn(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileTwoData.getCwsnSchYn()));
				categoryObj.setShiftSchYn(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileTwoData.getShiftSchYn()));
				categoryObj.setResiSchType(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileTwoData.getResiSchType()));
				categoryObj.setResiSchYn(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileTwoData.getResiSchYn()));
				categoryObj.setMinorityYn(profileTwoData.getMinorityYn());
				categoryObj.setMinorityType(profileTwoData.getMinorityType());
				categoryObj.setBoardingPriYn(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileTwoData.getBoardingPriYn()));
				categoryObj.setBoardingPriBoys(profileTwoData.getBoardingPriBoys());
				categoryObj.setBoardingPriBoys(profileTwoData.getBoardingPriGirls());
				categoryObj.setBoardingPriYn(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileTwoData.getBoardingSecYn()));
				categoryObj.setBoardingSecBoys(profileTwoData.getBoardingSecBoys());
				categoryObj.setBoardingSecGirls(profileTwoData.getBoardingSecGirls());
				categoryObj.setBoardingUprYn(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileTwoData.getBoardingUprYn()));
				categoryObj.setBoardingUprBoys(profileTwoData.getBoardingUprBoys());
				categoryObj.setBoardingUprGirls(profileTwoData.getBoardingUprGirls());
				categoryObj.setBoardingHsecYn(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileTwoData.getBoardingHsecYn()));
				categoryObj.setBoardingHsecBoys(profileTwoData.getBoardingHsecBoys());
				categoryObj.setBoardingHsecGirls(profileTwoData.getBoardingHsecGirls());
				categoryObj.setLowestClass(lowestClass);
				categoryObj.setHighestClass(highestClass);
				categoryObj.setCategoryName(categoryName);
				categoryObj.setSchType(schType);
				categoryObj.setPpSecYN(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileTwoData.getPpSecYN()));
				//category.add(categoryObj);
			
		}
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		profileResponseBean.setApiId("1234");
		profileResponseBean.setApiName("Profile Two By School Id");
		profileResponseBean.setApiVersion("v1.0.0.1");
		profileResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		profileResponseBean.setMethod("GET");
		profileResponseBean.setReleasedDate(dateFormate.format(new Date()));
		profileResponseBean.setRequestedDate(dateFormate.format(new Date()));
		profileResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		profileResponseBean.setResponseId(rand.nextInt(100000));
		combineDCFData.setCategory(categoryObj);
		data.setRecords(combineDCFData);
		//data.setTotalSize(category.size());
		profileResponseBean.setData(data);
		return profileResponseBean;
	}

	@GetMapping(value = "/getschManagementData/{schoolId}/{year}")
	public CommenResponseBean fetchschManagement(@PathVariable("schoolId") Integer schoolId,
			@PathVariable("year") String year) {
		System.out.println("Ali..................................................");

//		List<UdiseSchProfileFourBean> rtNormsList = new ArrayList<UdiseSchProfileFourBean>();
		UdiseSchManagementBean management = new UdiseSchManagementBean();
		CombineDCFData combineDCFData = new CombineDCFData();
		CommenResponseBean profileResponseBean = new CommenResponseBean();
		DataBean data = new DataBean();
		schManagementData = profileOuterServices.fetchSchManagement(schoolId, year);

		if (schManagementData != null) {;
				management.setSmcYN(schManagementData.getSmcYN());
				management.setSmcMemMale(schManagementData.getSmcMemMale());
				management.setSmcMemFemale(schManagementData.getSmcMemFemale());
				management.setSmcParentMale(schManagementData.getSmcParentMale());
				management.setSmcParentFemale(schManagementData.getSmcParentFemale());
				management.setSmcParentSC(schManagementData.getSmcParentSC());
				management.setSmcParentST(schManagementData.getSmcParentST());
				management.setSmcParentEWS(schManagementData.getSmcParentEWS());
				management.setSmcLocalBodyMale(schManagementData.getSmcLocalBodyMale());
				management.setSmcLocalBodyFemale(schManagementData.getSmcLocalBodyFemale());
				management.setSmcTeacherMale(schManagementData.getSmcTeacherMale());
				management.setSmcTeacherFemale(schManagementData.getSmcTeacherFemale());
				management.setSmcTrainedMale(schManagementData.getSmcTrainedMale());
				management.setSmcTrainedFemale(schManagementData.getSmcTrainedFemale());
				management.setSmcMeetings(schManagementData.getSmcMeetings());
				management.setSmcSchdevelopementPlanYN(schManagementData.getSmcSchdevelopementPlanYN());
				management.setSmcBankAcYN(schManagementData.getSmcBankAcYN());
				management.setSmcBannkName(schManagementData.getSmcBannkName());
				management.setSmcBankBranch(schManagementData.getSmcBankBranch());
				management.setSmcBankAcNo(schManagementData.getSmcBankAcNo());
				management.setSmcBankAcIfsc(schManagementData.getSmcBankAcIfsc());
				management.setSmcBankAcName(schManagementData.getSmcBankAcName());
				management.setSmdcSmcSameYN(schManagementData.getSmdcSmcSameYN());
				management.setSmdcYN(schManagementData.getSmdcYN());
				management.setSmdcMemberMale(schManagementData.getSmdcMemberMale());
				management.setSmdcMemberfemale(schManagementData.getSmdcMemberfemale());
				management.setSmdcParentMale(schManagementData.getSmdcParentMale());
				management.setSmdcParentFemale(schManagementData.getSmdcParentFemale());
				management.setSmdcParentEwsMale(schManagementData.getSmdcParentEwsMale());
				management.setSmdcParentEwsFemale(schManagementData.getSmdcParentEwsFemale());
				management.setSmdcLocalBodyMale(schManagementData.getSmdcLocalBodyMale());
				management.setSmdcLocalBodyFemale(schManagementData.getSmdcLocalBodyFemale());
				management.setSmdcEducationBackWardMinorityCommMale(schManagementData.getSmdcEducationBackWardMinorityCommMale());
				management
						.setSmdcEducationBackWardMinorityCommFemale(schManagementData.getSmdcEducationBackWardMinorityCommFemale());
				management.setSmdcAuditMale(schManagementData.getSmdcAuditMale());
				management.setSmdcAuditFemale(schManagementData.getSmdcAuditFemale());
				management.setSmdcSubjectExpMale(schManagementData.getSmdcSubjectExpMale());
				management.setSmdcSubjectExpFemale(schManagementData.getSmdcSubjectExpFemale());
				management.setSmdcTeacherMale(schManagementData.getSmdcTeacherMale());
				management.setSmdcTeacherFemale(schManagementData.getSmdcTeacherFemale());
				management.setSmdcVicePrincipalMale(schManagementData.getSmdcVicePrincipalMale());
				management.setSmdcVicePrincipalFemale(schManagementData.getSmdcVicePrincipalFemale());
				management.setSmdcPrincipalMale(schManagementData.getSmdcPrincipalMale());
				management.setSmdcPrincipalFemal(schManagementData.getSmdcPrincipalFemal());
				management.setSmdcChairpersonPrincipalMale(schManagementData.getSmdcChairpersonPrincipalMale());
				management.setSmdcChairpersonPrincipalfemale(schManagementData.getSmdcChairpersonPrincipalfemale());
				management.setSmdcTrainedMale(schManagementData.getSmdcTrainedMale());
				management.setSmdcTrainedFemale(schManagementData.getSmdcTrainedFemale());
				management.setSmdcMeetings(schManagementData.getSmdcMeetings());
				management.setSmdcSchDevelopmentPlanYN(schManagementData.getSmdcSchDevelopmentPlanYN());
				management.setSmdcBankAcYN(schManagementData.getSmdcBankAcYN());
				management.setSmdcBankName(schManagementData.getSmdcBankName());
				management.setSmdcBankBranch(schManagementData.getSmdcBankBranch());
				management.setSmdcBankAcNo(schManagementData.getSmdcBankAcNo());
				management.setSmdcBankAcIfsc(schManagementData.getSmdcBankAcIfsc());
				management.setSmdcBankAcName(schManagementData.getSmdcBankAcName());
				management.setSmdcSchBuildingYN(schManagementData.getSmdcSchBuildingYN());
				management.setSmdcAcademicCommitteeYN(schManagementData.getSmdcAcademicCommitteeYN());
				management.setSmdcParentTeacherYN(schManagementData.getSmdcParentTeacherYN());
				management.setSmdcParentTeacherMeeting(schManagementData.getSmdcParentTeacherMeeting());
				//managementList.add(manamtBeanschManagementData);
			
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
//		combineDCFData.setRteNorms(rtNormsList);
		combineDCFData.setManagement(management);
		data.setRecords(combineDCFData);
		//data.setTotalSize(managementList.size());
		data.setRecords(combineDCFData);
		profileResponseBean.setData(data);
		return profileResponseBean;
	}

	@GetMapping(value = "/getSchProfileFourData/{schoolId}/{year}")
	public CommenResponseBean fetchSchProfileFour(@PathVariable("schoolId") Integer schoolId,
			@PathVariable("year") String year) {
		System.out.println("Ali..................................................");

		UdiseSchProfileFourBean rtNormsList = new UdiseSchProfileFourBean();
		CombineDCFData combineDCFData = new CombineDCFData();
		CommenResponseBean profileResponseBean = new CommenResponseBean();

		String schoolName = "";
		DataBean data = new DataBean();
		try {
			profileFourData = profileOuterServices.fetchSchProfileFour(schoolId, year);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (schMasterdata != null)
			schoolName = schMasterdata.getSchoolName();

		if (profileFourData != null ) {
				rtNormsList.set_id(profileFourData.get_id());
				rtNormsList.setSchoolId(profileFourData.getSchoolId());
				rtNormsList.setUdiseSchCode(profileFourData.getUdiseSchCode());
				rtNormsList.setAcYear(profileFourData.getAcYear());
				rtNormsList.setCceYnEle1819(profileFourData.getCceYnEle1819());
				rtNormsList.setCceYnSec(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getCceYnSec()));
				rtNormsList.setCceYnHsec(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getCceYnHsec()));
				rtNormsList.setPcrMaintainedYn(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getPcrMaintainedYn()));
				rtNormsList.setPcrSharedYn(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getPcrSharedYn()));
				rtNormsList.setRte25pApplied(profileFourData.getRte25pApplied());
				rtNormsList.setRte25pEnrolled(profileFourData.getRte25pEnrolled());
				rtNormsList.setRtePvtC0Boys(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC0Boys()));
				rtNormsList.setRtePvtC0Girls(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC0Girls()));
				rtNormsList.setRtePvtC1Boys(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC1Boys()));
				rtNormsList.setRtePvtC1Girls(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC1Girls()));
				rtNormsList.setRtePvtC2Boys(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC2Boys()));
				rtNormsList.setRtePvtC2Girls(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC2Girls()));
				rtNormsList.setRtePvtC3Boys(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC3Boys()));
				rtNormsList.setRtePvtC3Girls(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC3Girls()));
				rtNormsList.setRtePvtC4Boys(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC4Boys()));
				rtNormsList.setRtePvtC4Girls(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC4Girls()));
				rtNormsList.setRtePvtC5Boys(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC5Boys()));
				rtNormsList.setRtePvtC5Girls(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC5Girls()));
				rtNormsList.setRtePvtC6Boys(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC6Boys()));
				rtNormsList.setRtePvtC6Girls(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC6Girls()));
				rtNormsList.setRtePvtC7Boys(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC7Boys()));
				rtNormsList.setRtePvtC7Girls(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC7Girls()));
				rtNormsList.setRtePvtC8Boys(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC8Boys()));
				rtNormsList.setRtePvtC8Girls(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRtePvtC8Girls()));
				rtNormsList.setRteEwsC0Boy(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC0Boy()));
				rtNormsList.setRteEwsC0Girl(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC0Girl()));
				rtNormsList.setRteEwsC1Boy(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC1Boy()));
				rtNormsList.setRteEwsC1Girl(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC1Girl()));
				rtNormsList.setRteEwsC2Boy(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC2Boy()));
				rtNormsList.setRteEwsC2Girl(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC2Girl()));
				rtNormsList.setRteEwsC3Boy(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC3Boy()));
				rtNormsList.setRteEwsC3Girl(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC3Girl()));
				rtNormsList.setRteEwsC4Boy(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC4Boy()));
				rtNormsList.setRteEwsC4Girl(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC4Girl()));
				rtNormsList.setRteEwsC5Boy(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC5Boy()));
				rtNormsList.setRteEwsC5Girl(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC5Girl()));
				rtNormsList.setRteEwsC6Boy(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC6Boy()));
				rtNormsList.setRteEwsC6Girl(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC6Girl()));
				rtNormsList.setRteEwsC7Boy(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC7Boy()));
				rtNormsList.setRteEwsC7Girl(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC7Girl()));
				rtNormsList.setRteEwsC8Boy(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC8Boy()));
				rtNormsList.setRteEwsC8Girl(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC8Girl()));
				rtNormsList.setRteEwsC9Boy(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC9Boy()));
				rtNormsList.setRteEwsC9Girl(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC9Girl()));
				rtNormsList.setRteEwsC10Boy(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC10Boy()));
				rtNormsList.setRteEwsC10Girl(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC10Girl()));
				rtNormsList.setRteEwsC11Boy(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC11Boy()));
				rtNormsList.setRteEwsC11Girl(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC11Girl()));
				rtNormsList.setRteEwsC12Boy(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC12Boy()));
				rtNormsList.setRteEwsC12Girl(StaticMasterUtilityMethodes.checkStringNullToZero(profileFourData.getRteEwsC12Girl()));
				rtNormsList.setSpltrgYn(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getSpltrgYn()));
				rtNormsList.setSpltrgCyProvGirls(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getSpltrgCyProvGirls()));
				rtNormsList.setSpltrgCyProvBoys(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getSpltrgCyProvBoys()));
				rtNormsList.setSpltrgPyEnrolBoys(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getSpltrgPyEnrolBoys()));
				rtNormsList.setSpltrgPyEnrolGirls(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getSpltrgPyEnrolGirls()));
				rtNormsList.setSpltrgPyProvBoys(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getSpltrgPyProvBoys()));
				rtNormsList.setSpltrgPyProvGirls(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getSpltrgPyProvGirls()));
				rtNormsList.setSpltrgBy(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getSpltrgBy()));
				rtNormsList.setSpltrgPlace(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getSpltrgPlace()));
				rtNormsList.setSpltrgType(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getSpltrgType()));
				rtNormsList.setRemedialTchEnrol(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getRemedialTchEnrol()));
				rtNormsList.setSessionStartMon(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getSessionStartMon()));
				rtNormsList.setTxtbkRecdYn(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getTxtbkRecdYn()));
				rtNormsList.setTxtbkRecdMon(profileFourData.getTxtbkRecdMon());
				rtNormsList.setTxtbkRecdYear1819(profileFourData.getTxtbkRecdYear1819());
				rtNormsList.setSuppMatRecdYn(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getSuppMatRecdYn()));
				rtNormsList.setTxtbkPrePriYn1819(profileFourData.getTxtbkPrePriYn1819());
				rtNormsList.setTxtbkPriYn(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getTxtbkPriYn()));
				rtNormsList.setTxtbkUprYn(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getTxtbkUprYn()));
				rtNormsList.setTxtbkSecYn(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getTxtbkSecYn()));
				rtNormsList.setTxtbkHsecYn(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getTxtbkHsecYn()));
				rtNormsList.setTlePrePriYn1819(profileFourData.getTlePrePriYn1819());
				rtNormsList.setTlePriYn(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getTlePriYn()));
				rtNormsList.setTleUprYn(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getTleUprYn()));
				rtNormsList.setTleSecYn(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getTleSecYn()));
				rtNormsList.setTleHsecYn(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getTleHsecYn()));
				rtNormsList.setPlaymatPrePriYn1819(profileFourData.getPlaymatPrePriYn1819());
				rtNormsList.setPlaymatPriYn(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getPlaymatPriYn()));
				rtNormsList.setPlaymatUprYn(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getPlaymatUprYn()));
				rtNormsList.setPlaymatSecYn(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getPlaymatSecYn()));
				rtNormsList.setPlaymatHsecYn(
						StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getPlaymatHsecYn()));
				rtNormsList.setNoInspect(profileFourData.getNoInspect());
				rtNormsList.setNoVisitCrc(profileFourData.getNoVisitCrc());
				rtNormsList.setNoVisitBrc(profileFourData.getNoVisitBrc());
				rtNormsList.setNoVisitDis(profileFourData.getNoVisitDis());
				rtNormsList.setCceYnPri(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getCceYnPri()));
				rtNormsList.setCceYnUpr(StaticMasterUtilityMethodes.checkResComLabPlayGCWSNYesNo(profileFourData.getCceYnUpr()));
				rtNormsList.setCreatedBy1819(profileFourData.getCreatedBy1819());
				rtNormsList.setCreated_time(profileFourData.getCreated_time());
				rtNormsList.setModified_by(profileFourData.getModified_by());
				rtNormsList.setModified_time(profileFourData.getModified_time());
				//rtNormsList.add(rtNormsList);
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
		combineDCFData.setRteNorms(rtNormsList);
		data.setRecords(combineDCFData);
		//data.setTotalSize(rtNormsList.size());
		data.setRecords(combineDCFData);
		profileResponseBean.setData(data);
		return profileResponseBean;
	}

}
