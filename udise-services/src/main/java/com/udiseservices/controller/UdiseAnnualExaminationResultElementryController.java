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
import com.udiseservices.models.AnnualExaminationResultElementryGrdV;
import com.udiseservices.models.AnnualExaminationResultElementryGrdVIII;
import com.udiseservices.outerServices.AnnualExaminationResultElementryOuterService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UdiseAnnualExaminationResultElementryController {
	
	@Autowired
	AnnualExaminationResultElementryOuterService annualExaminationResultElementryOuterService;
	
	
	@GetMapping(value = "/fetchAnnualExaminationResult/{schoolId}/{year}")
	public CommenResponseBean fetchAnnualExaminationResultElementryGrdV(@PathVariable("schoolId") Integer schoolId ,@PathVariable("year") String yearId) {
		
		AnnualExaminationResultElementryGrdV examRsltClass5Data = annualExaminationResultElementryOuterService.fetchAnnualExaminationResultElementryGrdV(schoolId, yearId);
		AnnualExaminationResultElementryGrdVIII examRsltClass8Data = annualExaminationResultElementryOuterService.fetchAnnualExaminationResultElementryGrdVIII(schoolId, yearId);
		
		
		List schExamRsltList = new ArrayList<>();
		CommenResponseBean examRsltClassResponseBean = new CommenResponseBean();
		DataBean data = new DataBean();
		schExamRsltList.add(examRsltClass5Data);
		schExamRsltList.add(examRsltClass8Data);
		
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		examRsltClassResponseBean.setApiId("1234");
		examRsltClassResponseBean.setApiName("Profile One By School Id");
		examRsltClassResponseBean.setApiVersion("v1.0.0.1");
		examRsltClassResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		examRsltClassResponseBean.setMethod("GET");
		examRsltClassResponseBean.setReleasedDate(dateFormate.format(new Date()));
		examRsltClassResponseBean.setRequestedDate(dateFormate.format(new Date()));
		examRsltClassResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		examRsltClassResponseBean.setResponseId(rand.nextInt(100000));
		data.setTotalSize(schExamRsltList.size());
		data.setRecords(schExamRsltList);
		examRsltClassResponseBean.setData(data);
		return examRsltClassResponseBean;
	}

}
