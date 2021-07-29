package com.udiseservices.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.udiseservices.reports.models.RowProfileOne;

@Service
public class BlockLevelReportService {

	
	@Autowired
	MongoTemplate mongoTemplate;
	
	
	public RowProfileOne getRawProfileData(String schoolId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId));
		RowProfileOne rowProfileOne = mongoTemplate.findOne(query, RowProfileOne.class);	
		return rowProfileOne;
		
	}
}
