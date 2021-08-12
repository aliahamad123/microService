package com.udp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.udp.models.SchExamMarksGradeX;
import com.udp.models.SchExamMarksGradeXII;
import com.udp.models.SchExamResultGradeX;
import com.udp.models.SchExamResultGradeXII;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DcfBoardExaminationRsltController {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@GetMapping(value = "/fetchSchExamResultGradeX/{schoolId}/{year}")
	public SchExamResultGradeX fetchSchExamResultGradeX(@PathVariable("schoolId")Integer schoolId, @PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		SchExamResultGradeX schExamResultGradeXData = mongoTemplate.findOne(query, SchExamResultGradeX.class);
		return schExamResultGradeXData;
		
	}
	
	@GetMapping(value = "/fetchSchExamMarksGradeX/{schoolId}/{year}")
	public SchExamMarksGradeX fetchSchExamMarksGradeX(@PathVariable("schoolId")Integer schoolId, @PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		SchExamMarksGradeX schExamMarksGradeXnData = mongoTemplate.findOne(query, SchExamMarksGradeX.class);
		return schExamMarksGradeXnData;
		
	}
	
	@GetMapping(value = "/fetchSchExamResultGradeXII/{schoolId}/{year}")
	public SchExamResultGradeXII fetchSchExamResultGradeXII(@PathVariable("schoolId")Integer schoolId, @PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		SchExamResultGradeXII schExamResultGradeXIIData = mongoTemplate.findOne(query, SchExamResultGradeXII.class);
		return schExamResultGradeXIIData;
		
	}
	
	@GetMapping(value = "/fetchSchExamMarksGradeXII/{schoolId}/{year}")
	public SchExamMarksGradeXII fetchSchExamMarksGradeXII(@PathVariable("schoolId")Integer schoolId, @PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		SchExamMarksGradeXII schExamMarksGradeXIIData = mongoTemplate.findOne(query, SchExamMarksGradeXII.class);
		return schExamMarksGradeXIIData;
		
	}


}
