package com.udiseservices.outerServices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.udiseservices.models.SchExamMarksGradeX;
import com.udiseservices.models.SchExamMarksGradeXII;
import com.udiseservices.models.SchExamResultGradeX;
import com.udiseservices.models.SchExamResultGradeXII;



@CrossOrigin(origins = "*", allowedHeaders = "*")
@FeignClient(name="dcf-service")
public interface BoardExaminationResultOuterService {
	
	@GetMapping(value = "/fetchSchExamResultGradeX/{schoolId}/{year}")
	public SchExamResultGradeX fetchSchExamResultGradeX(@PathVariable("schoolId")Integer schoolId, @PathVariable("year") String year);
	
	@GetMapping(value = "/fetchSchExamMarksGradeX/{schoolId}/{year}")
	public SchExamMarksGradeX fetchSchExamMarksGradeX(@PathVariable("schoolId")Integer schoolId, @PathVariable("year") String year);
	
	@GetMapping(value = "/fetchSchExamResultGradeXII/{schoolId}/{year}")
	public SchExamResultGradeXII fetchSchExamResultGradeXII(@PathVariable("schoolId")Integer schoolId, @PathVariable("year") String year);
	
	@GetMapping(value = "/fetchSchExamMarksGradeXII/{schoolId}/{year}")
	public SchExamMarksGradeXII fetchSchExamMarksGradeXII(@PathVariable("schoolId")Integer schoolId, @PathVariable("year") String year);
	
	
}
