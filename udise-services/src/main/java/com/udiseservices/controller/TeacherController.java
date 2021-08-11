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
import com.udiseservices.beans.TeacherOneBean;
import com.udiseservices.beans.TeacherProfileTwoBean;
import com.udiseservices.beans.UdiseSchFacilityOneBean;
import com.udiseservices.beans.UdiseSchFacilityTwoBean;
import com.udiseservices.outerServices.ProfileOuterServices;
import com.udiseservices.models.TeacherOne;
import com.udiseservices.models.TeacherProfileTwo;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TeacherController {

	@Autowired
	ProfileOuterServices profileOuterService;
	private TeacherOne teacherOneData;
	private List<TeacherProfileTwo> teacherTwoData;

	@GetMapping(value = "/fetchSchTeacherOneData/{schoolId}/{year}")
	public CommenResponseBean fetchSchTeacherOne(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year) {
		
		TeacherOneBean techAndNonTechStaff = new TeacherOneBean();
		List<TeacherProfileTwoBean> teacherInstr = new ArrayList<TeacherProfileTwoBean>();
		CombineDCFData combineDCFData = new CombineDCFData();
		CommenResponseBean profileResponseBean = new CommenResponseBean();
		String tempId = "3202937";
		DataBean data = new DataBean();

		try {
			teacherOneData = profileOuterService.fetchSchTeacherOne(schoolId,year);
			System.out.println("Teacher Object " + teacherOneData);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			teacherTwoData = profileOuterService.fetchSchTeacherProfile(schoolId,year);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (teacherOneData != null) {
				techAndNonTechStaff.setNontchAccnt(teacherOneData.getNontchAccnt());
				techAndNonTechStaff.setNontchLabAsst(teacherOneData.getNontchLabAsst());
				techAndNonTechStaff.setNonTchLdc(teacherOneData.getNonTchLdc());
				techAndNonTechStaff.setNontchLibAsst(teacherOneData.getNontchLibAsst());
				techAndNonTechStaff.setNonTchPeon(teacherOneData.getNonTchPeon());
				techAndNonTechStaff.setNonTchUdc(teacherOneData.getNonTchUdc());
				techAndNonTechStaff.setNonTchWatchman(teacherOneData.getNonTchWatchman());
				techAndNonTechStaff.setSchoolId(teacherOneData.getSchoolId());
				techAndNonTechStaff.setTchContract(teacherOneData.getTchContract());
				techAndNonTechStaff.setTchHavAdhr(teacherOneData.getTchHavAdhr());
				techAndNonTechStaff.setTchPartTime(teacherOneData.getTchPartTime());
				techAndNonTechStaff.setTchRegular(teacherOneData.getTchRegular());
				techAndNonTechStaff.setUdiseSchCode(teacherOneData.getUdiseSchCode());
				//techAndNonTechStaff.add(techObj);
				System.out.println("School Id is " + teacherOneData.getSchoolId());
		
		}
		
		if(teacherTwoData != null && teacherTwoData.size()>0) {
			for(TeacherProfileTwo obj : teacherTwoData) {
				TeacherProfileTwoBean teacherTwoObj= new TeacherProfileTwoBean();
				teacherTwoObj.setSchoolId(obj.getSchoolId());
				teacherTwoObj.setUdiseSchCode(obj.getUdiseSchCode());
				teacherTwoObj.setTeacherId(obj.getTeacherId());
				teacherTwoObj.setTchCodeState(obj.getTchCodeState());
				teacherTwoObj.setTchCode(obj.getTchCode());
				teacherTwoObj.setName(obj.getName());
				teacherTwoObj.setGender(obj.getGender());
				teacherTwoObj.setDob(obj.getDob());
				teacherTwoObj.setSocialCategory(obj.getSocialCategory());
				teacherTwoObj.setTchType(obj.getTchType());
				teacherTwoObj.setNatureOfAppointment(obj.getNatureOfAppointment());
				teacherTwoObj.setDateOfjoiningService(obj.getDateOfjoiningService());
				teacherTwoObj.setQualificationAcad(obj.getQualificationAcad());
				teacherTwoObj.setQualificationProf(obj.getQualificationProf());
				teacherTwoObj.setClassTaught(obj.getClassTaught());
				teacherTwoObj.setAppointedSub(obj.getAppointedSub());
				teacherTwoObj.setSubTaught1(obj.getSubTaught1());
				teacherTwoObj.setSubTaught2(obj.getSubTaught2());
				teacherTwoObj.setTrnBrc(obj.getTrnBrc());
				teacherTwoObj.setTrnCrc(obj.getTrnCrc());
				teacherTwoObj.setTrnDiet(obj.getTrnDiet());
				teacherTwoObj.setTrnOther(obj.getTrnOther());
				teacherTwoObj.setTrngRcvd(obj.getTrngRcvd());
				teacherTwoObj.setTrngNeeded(obj.getTrngNeeded());
				teacherTwoObj.setNonTeacherWorkingDays(obj.getNonTeacherWorkingDays());
				teacherTwoObj.setMathUpto(obj.getMathUpto());
				teacherTwoObj.setScienceUpto(obj.getScienceUpto());
				teacherTwoObj.setEnglishUpto(obj.getEnglishUpto());
				teacherTwoObj.setLangStudyUpto(obj.getLangStudyUpto());
				teacherTwoObj.setSocStudyUpto(obj.getSocStudyUpto());
				teacherTwoObj.setYearOfjoiningPresentSch(obj.getYearOfjoiningPresentSch());
				teacherTwoObj.setDisabilityType(obj.getDisabilityType());
				teacherTwoObj.setTrainedCwsn(obj.getTrainedCwsn());
				teacherTwoObj.setTrainedComp(obj.getTrainedComp());
				teacherTwoObj.setEmail(obj.getEmail());
				teacherTwoObj.setMobile(obj.getMobile());
				teacherTwoObj.setTrngRcvd(obj.getTrngRcvd());
				teacherTwoObj.setIsValid(obj.getIsValid());
				teacherTwoObj.setAddRecordFlag(obj.getAddRecordFlag());
				teacherTwoObj.setDojService2(obj.getDojService2());
				teacherTwoObj.setTchTypeNational(obj.getTchTypeNational());
				teacherTwoObj.setStateId(obj.getStateId());
				teacherInstr.add(teacherTwoObj);

				
			}
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
		combineDCFData.setTeachingNonTeachingStaff(techAndNonTechStaff);
		combineDCFData.setTeachersInstructors(teacherInstr);
		data.setRecords(combineDCFData);
		//data.setTotalSize(techAndNonTechStaff.size()+teacherInstr.size());
		data.setRecords(combineDCFData);
		profileResponseBean.setData(data);
		return profileResponseBean;
	}

}
