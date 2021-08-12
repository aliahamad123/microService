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
import com.udiseservices.models.SchExamMarksGradeX;
import com.udiseservices.models.SchExamMarksGradeXII;
import com.udiseservices.models.SchExamResultGradeX;
import com.udiseservices.models.SchExamResultGradeXII;
import com.udiseservices.outerServices.BoardExaminationResultOuterService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UdiseBoardExamResultController {
	
	@Autowired
	BoardExaminationResultOuterService boardExaminationResultOuterService;
	SchExamResultGradeX schExamResultGradeX;
	SchExamMarksGradeX schExamMarksGradeX;
	SchExamResultGradeXII schExamResultGradeXII;
	SchExamMarksGradeXII schExamMarksGradeXII;
	
	
	@GetMapping(value = "/SchBoardExamResult/{schoolId}/{year}")
	public CommenResponseBean  fetchSchBoardExamResult(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year) {
		
		
		schExamResultGradeX = boardExaminationResultOuterService.fetchSchExamResultGradeX(schoolId, year);
		schExamMarksGradeX = boardExaminationResultOuterService.fetchSchExamMarksGradeX(schoolId, year);
		schExamResultGradeXII = boardExaminationResultOuterService.fetchSchExamResultGradeXII(schoolId, year);
		schExamMarksGradeXII = boardExaminationResultOuterService.fetchSchExamMarksGradeXII(schoolId, year);
		
		List boardSchExamRsltList = new ArrayList<>();
		CommenResponseBean boardSchExamRsltResponseBean = new CommenResponseBean();
		DataBean data = new DataBean();
		boardSchExamRsltList.add(schExamResultGradeX);
		boardSchExamRsltList.add(schExamMarksGradeX);
		boardSchExamRsltList.add(schExamResultGradeXII);
		boardSchExamRsltList.add(schExamMarksGradeXII);
		
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		boardSchExamRsltResponseBean.setApiId("1234");
		boardSchExamRsltResponseBean.setApiName("Profile One By School Id");
		boardSchExamRsltResponseBean.setApiVersion("v1.0.0.1");
		boardSchExamRsltResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		boardSchExamRsltResponseBean.setMethod("GET");
		boardSchExamRsltResponseBean.setReleasedDate(dateFormate.format(new Date()));
		boardSchExamRsltResponseBean.setRequestedDate(dateFormate.format(new Date()));
		boardSchExamRsltResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		boardSchExamRsltResponseBean.setResponseId(rand.nextInt(100000));
		data.setTotalSize(boardSchExamRsltList.size());
		data.setRecords(boardSchExamRsltList);
		boardSchExamRsltResponseBean.setData(data);
		return boardSchExamRsltResponseBean;

	}

}
