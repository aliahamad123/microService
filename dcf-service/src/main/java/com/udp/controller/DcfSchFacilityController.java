package com.udp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udp.models.SchFacilityFour;
import com.udp.models.SchFacilityOne;
import com.udp.models.SchFacilityThree;
import com.udp.models.SchFacilityTwo;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DcfSchFacilityController {

	@Autowired
	MongoTemplate mongoTemplate;

	@GetMapping(value = "/fetchSchFacilityOne/{schoolId}/{year}")
	public SchFacilityOne fetchSchFacilityOne(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year) {
		Query query = new Query();	
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acyear").is(year));
		SchFacilityOne profileData = mongoTemplate.findOne(query, SchFacilityOne.class);
		return profileData;
	}

	@GetMapping(value = "/fetchSchFacilityTwo/{schoolId}/{year}")
	public SchFacilityTwo fetchSchFacilityTwo(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		SchFacilityTwo profileData = mongoTemplate.findOne(query, SchFacilityTwo.class);
		return profileData;
	}

	@GetMapping(value = "/fetchSchFacilityThree/{schoolId}/{year}")
	public SchFacilityThree fetchSchFacilityThree(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		SchFacilityThree profileData = mongoTemplate.findOne(query, SchFacilityThree.class);
		return profileData;
	}

	@GetMapping(value = "/fetchSchFacilityFour/{schoolId}/{year}")
	public SchFacilityFour fetchSchFacilityFour(@PathVariable("schoolId") Integer schoolId ,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		SchFacilityFour profileData = mongoTemplate.findOne(query, SchFacilityFour.class);
		return profileData;
	}

}
