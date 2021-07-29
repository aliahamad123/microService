package com.udiseservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.udiseservices.reports.models.RowProfileOne;


@RestController
public class StateSpecificExclReport {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@GetMapping(value = "/downloadSpreadsheets")
	public void downloadExclFile() {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("district_id").is("2603"));
		List<RowProfileOne> profileDataList = mongoTemplate.find(query, RowProfileOne.class);
		generateProfileExcl(profileDataList);
	}
	
	public void generateProfileExcl(List<RowProfileOne> profileDataList){
		
	}

}
