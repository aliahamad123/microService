package com.udiseservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
	public void  fetchSchBoardExamResult(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year) {
		
		
		schExamResultGradeX = boardExaminationResultOuterService.fetchSchExamResultGradeX(schoolId, year);
		schExamMarksGradeX = boardExaminationResultOuterService.fetchSchExamMarksGradeX(schoolId, year);
		schExamResultGradeXII = boardExaminationResultOuterService.fetchSchExamResultGradeXII(schoolId, year);
		schExamMarksGradeXII = boardExaminationResultOuterService.fetchSchExamMarksGradeXII(schoolId, year);
	}

}
