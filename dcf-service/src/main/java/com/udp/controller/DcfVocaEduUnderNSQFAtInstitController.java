package com.udp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udp.models.AdmissionGradeOne;
import com.udp.models.VocEduUnderNSQF;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DcfVocaEduUnderNSQFAtInstitController {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@GetMapping(value = "/fetchVocEduUnderNSQF/{schoolId}/{year}")
	public VocEduUnderNSQF fetchVocEduUnderNSQF(@PathVariable("schoolId") String schoolId,String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		VocEduUnderNSQF vocEduUnderNSQFData = mongoTemplate.findOne(query, VocEduUnderNSQF.class);
		return vocEduUnderNSQFData;
	}

}
