package com.udiseservices.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.udiseservices.models.UserMaster;

@Service
public class UserDeatilsImpl {
	
	
	@Autowired
	MongoTemplate mongoTemplate;
	public UserMaster getUserDetail(String username) {
		UserMaster userMaster =null;
	try {
		System.out.println("username===" + username);
		Query query = new Query();
		query.addCriteria(Criteria.where("username").is(username));
		userMaster = mongoTemplate.findOne(query, UserMaster.class,"user");
	} catch (Exception e) {
		e.printStackTrace();
	}
	return userMaster; 
	
	}
	

}
