package com.udp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udp.models.IncentivesFacilitiesProvidedCwsn;
import com.udp.models.SchIncentivesFacilitiesProd;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DcfSchIncentivesFacilitiesProvidedChildrenController {

	@Autowired
	MongoTemplate mongoTemplate;
	
	@GetMapping(value = "/fetchSchIncentivesFacilitiesProd/{schoolId}/{year}")
	public SchIncentivesFacilitiesProd fetchSchIncentivesFacilitiesProd(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("year").is(year));
		SchIncentivesFacilitiesProd schIncentivesFacilitiesProdData =mongoTemplate.findOne(query, SchIncentivesFacilitiesProd.class);
		return schIncentivesFacilitiesProdData;

	}
	
//	@GetMapping(value = "/fetchFacilitiesProvidedChildrenFiveToEight/{schoolId}/{year}")
//	public IncentivesFacilitiesProvidedChildrenFiveToEight fetchFacilitiesProvidedChildrenFiveToEight(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year) {
//		
//		IncentivesFacilitiesProvidedChildrenFiveToEight incentivesFacilitiesProvidedChildrenFiveToEight = null;
//		Query query = new Query();
//		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("year").is(year));
//		incentivesFacilitiesProvidedChildrenFiveToEight =mongoTemplate.findOne(query, IncentivesFacilitiesProvidedChildrenFiveToEight.class);
//		return incentivesFacilitiesProvidedChildrenFiveToEight;
//
//	}
//	
	@GetMapping(value = "/fetchFacilitiesProvidedCwsn/{schoolId}/{year}")
	public IncentivesFacilitiesProvidedCwsn fetchFacilitiesProvidedCwsn(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("year").is(year));
		IncentivesFacilitiesProvidedCwsn incentivesFacilitiesProvidedCwsn =mongoTemplate.findOne(query, IncentivesFacilitiesProvidedCwsn.class);
		return incentivesFacilitiesProvidedCwsn;

	}

}
