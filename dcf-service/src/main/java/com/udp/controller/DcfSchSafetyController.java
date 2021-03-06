package com.udp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udp.models.SchProfileOne;
import com.udp.models.SchSafety;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DcfSchSafetyController {

	@Autowired
	MongoTemplate mongoTemplate;

	@GetMapping(value = "/fetchSchSafety/{schoolId}/{year}")
	public SchSafety fetchSchSafety(@PathVariable("schoolId") Integer schoolId, @PathVariable("year") String year) {
		System.out.println("Ali");
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		SchSafety schSafetyData = mongoTemplate.findOne(query, SchSafety.class);
		System.out.println("Query is " + query);
		return schSafetyData;

	}
}
