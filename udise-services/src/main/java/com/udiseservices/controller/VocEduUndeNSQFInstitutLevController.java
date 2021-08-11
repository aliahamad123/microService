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
import com.udiseservices.beans.CommenResponseBean;
import com.udiseservices.beans.DataBean;
import com.udiseservices.beans.SchsafetyBean;
import com.udiseservices.beans.VoEduStudPlacementDetailClsXPreYearBean;
import com.udiseservices.beans.VocaEduResultStudentBean;
import com.udiseservices.models.VoEduStudPlacementDetailClsXPreYear;
import com.udiseservices.models.VocaEduResultStudent;
import com.udiseservices.outerServices.VocEduUnderNSQFOuterService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VocEduUndeNSQFInstitutLevController {

	@Autowired
	VocEduUnderNSQFOuterService vocEduUnderNSQFOuterService;
	VoEduStudPlacementDetailClsXPreYear voEduStudPlacDetailClsXPreYearModel;
	VocaEduResultStudent  vocaEduResultStudentModel;

	@GetMapping(value = "/StudPlacementDetailClsXPreYear/{schoolId}/{year}")
	public CommenResponseBean fetchStudPlacementDetailClsXPreYear(@PathVariable("schoolId") String schoolId,
			String year) {

		System.out.println("Ali" + schoolId + "year" + year);

		VoEduStudPlacementDetailClsXPreYearBean VoEduStudPlacBeanData = new VoEduStudPlacementDetailClsXPreYearBean();
		DataBean data = new DataBean();
		CommenResponseBean responseBean = new CommenResponseBean();
		List<VoEduStudPlacementDetailClsXPreYearBean> VoEduStudPlacBeanList = new ArrayList<VoEduStudPlacementDetailClsXPreYearBean>();
		try {

			voEduStudPlacDetailClsXPreYearModel = vocEduUnderNSQFOuterService
					.fetchStudPlacementDetailClsXPreYear(schoolId, year);

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (voEduStudPlacDetailClsXPreYearModel != null) {
			VoEduStudPlacBeanData
					.setNoStudOptedPlacementBoys(voEduStudPlacDetailClsXPreYearModel.getNoStudOptedPlacementBoys());
			VoEduStudPlacBeanData
					.setNoStudOptedPlacementGirls(voEduStudPlacDetailClsXPreYearModel.getNoStudOptedPlacementGirls());
			VoEduStudPlacBeanData.setNoStudPlacedBoys(voEduStudPlacDetailClsXPreYearModel.getNoStudPlacedBoys());
			VoEduStudPlacBeanData.setNoStudPlacedGirls(voEduStudPlacDetailClsXPreYearModel.getNoStudPlacedGirls());
			VoEduStudPlacBeanData.setVocatHighSecBoys(voEduStudPlacDetailClsXPreYearModel.getVocatHighSecBoys());
			VoEduStudPlacBeanData.setVocatHighSecGirls(voEduStudPlacDetailClsXPreYearModel.getVocatHighSecGirls());
			VoEduStudPlacBeanData.setNonVocatHighSecBoys(voEduStudPlacDetailClsXPreYearModel.getNonVocatHighSecBoys());
			VoEduStudPlacBeanData.setVocatHighSecGirls(voEduStudPlacDetailClsXPreYearModel.getVocatHighSecGirls());

		}
		VoEduStudPlacBeanList.add(VoEduStudPlacBeanData);
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		responseBean.setApiId("1234");
		responseBean.setApiName("Profile One By School Id");
		responseBean.setApiVersion("v1.0.0.1");
		responseBean.setDevelopedBy("UDISE Plus Team, NIC");
		responseBean.setMethod("GET");
		responseBean.setReleasedDate(dateFormate.format(new Date()));
		responseBean.setRequestedDate(dateFormate.format(new Date()));
		responseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		responseBean.setResponseId(rand.nextInt(100000));
		data.setTotalSize(VoEduStudPlacBeanList.size());
		data.setRecords(VoEduStudPlacBeanList);
		responseBean.setData(data);

		return responseBean;

	}
	
	@GetMapping(value = "/fetchVocaEduResultStu/{schoolId}/{year}")
	public CommenResponseBean fetchVoEduResultStu(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year) {

		System.out.println("Ali" + schoolId + "year" + year);

		VocaEduResultStudentBean VoEduStudPlacBeanData = new VocaEduResultStudentBean();
		DataBean data = new DataBean();
		CommenResponseBean responseBean = new CommenResponseBean();
		List<VocaEduResultStudentBean> vocaEduResultStudentbeannList = new ArrayList<VocaEduResultStudentBean>();
		try {

			vocaEduResultStudentModel = vocEduUnderNSQFOuterService.fetchVoEduResultStu(schoolId, year);

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (vocaEduResultStudentModel != null) {
			
			VoEduStudPlacBeanData.setAcYear(vocaEduResultStudentModel.getAcYear());
			VoEduStudPlacBeanData.setGenenralBoys(vocaEduResultStudentModel.getGenenralBoys());
			VoEduStudPlacBeanData.setGenenralGirls(vocaEduResultStudentModel.getGenenralGirls());
			VoEduStudPlacBeanData.setObcBoys(vocaEduResultStudentModel.getObcBoys());
			VoEduStudPlacBeanData.setObcGirls(vocaEduResultStudentModel.getObcGirls());
			VoEduStudPlacBeanData.setScBoys(vocaEduResultStudentModel.getScBoys());
			VoEduStudPlacBeanData.setScGirls(vocaEduResultStudentModel.getScGirls());
			VoEduStudPlacBeanData.setStBoys(vocaEduResultStudentModel.getStBoys());
			VoEduStudPlacBeanData.setStGirls(vocaEduResultStudentModel.getStGirls());
			VoEduStudPlacBeanData.setItemId(vocaEduResultStudentModel.getItemId());
			VoEduStudPlacBeanData.setMarksRangeId(vocaEduResultStudentModel.getMarksRangeId());

		}
		vocaEduResultStudentbeannList.add(VoEduStudPlacBeanData);
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		responseBean.setApiId("1234");
		responseBean.setApiName("Profile One By School Id");
		responseBean.setApiVersion("v1.0.0.1");
		responseBean.setDevelopedBy("UDISE Plus Team, NIC");
		responseBean.setMethod("GET");
		responseBean.setReleasedDate(dateFormate.format(new Date()));
		responseBean.setRequestedDate(dateFormate.format(new Date()));
		responseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		responseBean.setResponseId(rand.nextInt(100000));
		data.setTotalSize(vocaEduResultStudentbeannList.size());
		data.setRecords(vocaEduResultStudentbeannList);
		responseBean.setData(data);

		return responseBean;

	}


}
