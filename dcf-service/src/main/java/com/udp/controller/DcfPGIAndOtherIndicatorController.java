package com.udp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udp.models.PGIAndOtherIndicator;
import com.udp.models.SchProfileOne;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class DcfPGIAndOtherIndicatorController {
	
	@Autowired
	MongoTemplate mongoTemplate;

	@GetMapping(value = "/fetchPGIAndOtherIndicator/{schoolId}/{year}")
	public PGIAndOtherIndicator fetchPGIAndOtherIndicator(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year) {
		System.out.println("--------------------------------------pgi and indicator");
	//	Integer schId = Integer.parseInt(schoolId);
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		PGIAndOtherIndicator pGIAndOtherIndicatorData = mongoTemplate.findOne(query, PGIAndOtherIndicator.class);
		return pGIAndOtherIndicatorData;
	}

}
