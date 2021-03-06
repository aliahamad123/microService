package com.udp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udp.models.SchManagement;
import com.udp.models.SchProfileFour;
import com.udp.models.SchProfileOne;
import com.udp.models.SchProfileThree;
import com.udp.models.SchProfileTwo;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DcfSchProfileController {

	@Autowired
	MongoTemplate mongoTemplate;

	@GetMapping(value = "/fetchSchProfileOne/{schoolId}/{year}")
	public SchProfileOne fetchSchProfileOne(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		SchProfileOne profileData = mongoTemplate.findOne(query, SchProfileOne.class);
		//System.out.println("");
		return profileData;
	}

	@GetMapping(value = "/fetchSchProfileTwo/{schoolId}/{year}")
	public SchProfileTwo fetchSchProfileTwo(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		SchProfileTwo profileData = mongoTemplate.findOne(query, SchProfileTwo.class);
		return profileData;
	}

	@GetMapping(value = "/fetchSchProfileThree/{schoolId}/{year}")
	public SchProfileThree fetchSchProfileThree(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		SchProfileThree profileData = mongoTemplate.findOne(query, SchProfileThree.class);
		return profileData;
	}

	@GetMapping(value = "/fetchSchProfileFour/{schoolId}/{year}")
	public SchProfileFour fetchSchProfileFour(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		SchProfileFour profileData = mongoTemplate.findOne(query, SchProfileFour.class);
		return profileData;
	}
	
	@GetMapping(value = "/fetchSchManagement/{schoolId}/{year}")
	public SchManagement fetchSchManagement(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		SchManagement profileData = mongoTemplate.findOne(query, SchManagement.class);
		return profileData;
	}

}
