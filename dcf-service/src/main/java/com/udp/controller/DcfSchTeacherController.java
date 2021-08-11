package com.udp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.udp.models.TeacherOne;
import com.udp.models.TeacherProfileTwo;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DcfSchTeacherController {
	
	
	@Autowired
	MongoTemplate mongoTemplate;

	@GetMapping(value = "/fetchSchTeacherOne/{schoolId}/{year}")
	public TeacherOne fetchSchTeacherOne(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		//query.addCriteria(Criteria.where("acYear").is(year));
		//.with(Sort.by(Direction.ASC, "acYear"));
		TeacherOne profileDataList = mongoTemplate.findOne(query, TeacherOne.class);
		return profileDataList;
	}
	
	@GetMapping(value = "/fetchSchTeacherProfile/{schoolId}/{year}")
	public List<TeacherProfileTwo> fetchSchTeacherProfile(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		//query.addCriteria(Criteria.where("acYear").is(year));
		//.with(Sort.by(Direction.ASC, "acYear"));
		List<TeacherProfileTwo> profileDataList = mongoTemplate.find(query, TeacherProfileTwo.class);
		return profileDataList;
	}

}
