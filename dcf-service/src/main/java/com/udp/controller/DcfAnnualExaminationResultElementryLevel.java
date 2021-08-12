package com.udp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udp.models.AnnualExaminationResultElementryGrdV;
import com.udp.models.AnnualExaminationResultElementryGrdVIII;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DcfAnnualExaminationResultElementryLevel {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@GetMapping(value = "/fetchAnnualExaminationResultElementryGrdV/{schoolId}/{year}")
	public AnnualExaminationResultElementryGrdV fetchAnnualExaminationResultElementryGrdV(@PathVariable("schoolId") Integer schoolId ,@PathVariable("year") String yearId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(yearId));
		AnnualExaminationResultElementryGrdV annualExaminationResultElementryGrdVData = mongoTemplate.findOne(query, AnnualExaminationResultElementryGrdV.class);
		return annualExaminationResultElementryGrdVData;
		
	}
	
	@GetMapping(value = "/fetchAnnualExaminationResultElementryGrdVIII/{schoolId}/{year}")
	public AnnualExaminationResultElementryGrdVIII fetchAnnualExaminationResultElementryGrdVIII(@PathVariable("schoolId") Integer schoolId ,@PathVariable("year") String yearId) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(yearId));
		AnnualExaminationResultElementryGrdVIII annualExaminationResultElementryGrdVIIIData = mongoTemplate.findOne(query, AnnualExaminationResultElementryGrdVIII.class);
		return annualExaminationResultElementryGrdVIIIData;
		
	}

}
