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

import com.udp.models.AdmissionGradeOne;
import com.udp.models.EnrolByCwsn;
import com.udp.models.EnrolByGradeByAge;
import com.udp.models.EnrolByMediumOfInst;
import com.udp.models.EnrolReptrByAcademicStream;
import com.udp.models.EnrolSocialMinorityCat;
import com.udp.models.ReptrSocialMinorityCat;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DcfSchAdmissionEnrolReptrController {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@GetMapping(value = "/fetchSchAdmissionGradeOne/{schoolId}/{year}")
	public AdmissionGradeOne fetchSchAdmissGrade(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		//with(Sort.by(Direction.ASC, "acYear"));
		AdmissionGradeOne admissionGradeOneDataList = mongoTemplate.findOne(query, AdmissionGradeOne.class);
		return admissionGradeOneDataList;
	}
	@GetMapping(value = "/fetchEnrolSocialMinority/{schoolId}/{year}")
	public List<EnrolSocialMinorityCat> fetchEnrolSocialMinority(@PathVariable("schoolId") Integer schoolId, @PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		List<EnrolSocialMinorityCat> enrolSocialMinorityCat = mongoTemplate.find(query, EnrolSocialMinorityCat.class);
		return enrolSocialMinorityCat;
		
	}
	
	@GetMapping(value = "/fetchReptrSocialMinorityCat/{schoolId}/{year}")
	public List<ReptrSocialMinorityCat> fetchReptrSocialMinorityCat(@PathVariable("schoolId") Integer schoolId, @PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		List<ReptrSocialMinorityCat> reptrSocialMinorityCat = mongoTemplate.find(query, ReptrSocialMinorityCat.class,"reptrSocialMinorityCat");
		return reptrSocialMinorityCat;
		
	}
	
	
	@GetMapping(value = "/fetchEnrolByGradeByAge/{schoolId}/{year}")
	public List<EnrolByGradeByAge> fetchEnrolByGradeByAge(@PathVariable("schoolId") Integer schoolId, @PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		List<EnrolByGradeByAge> enrolByGradeByAge = mongoTemplate.find(query, EnrolByGradeByAge.class,"enrolByGradeByAge");
		return enrolByGradeByAge;
		
	}
	
	
	@GetMapping(value = "/fetchEnrolByMediumOfInst/{schoolId}/{year}")
	public List<EnrolByMediumOfInst> fetchEnrolByMediumOfInst(@PathVariable("schoolId") Integer schoolId, @PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		List<EnrolByMediumOfInst> enrolByMediumOfInst = mongoTemplate.find(query, EnrolByMediumOfInst.class,"enrolByMediumOfInst");
		return enrolByMediumOfInst;
		
	}

	
	
	@GetMapping(value = "/fetchEnrolByCwsn/{schoolId}/{year}")
	public List<EnrolByCwsn> fetchEnrolByCwsn(@PathVariable("schoolId") Integer schoolId, @PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		List<EnrolByCwsn> enrolByCwsn = mongoTemplate.find(query, EnrolByCwsn.class,"enrolByCwsn");
		return enrolByCwsn;
		
	}
	
	
	@GetMapping(value = "/fetchEnrolReptrByAcademicStream/{schoolId}/{year}")
	public List<EnrolReptrByAcademicStream> fetchEnrolReptrByAcademicStream(@PathVariable("schoolId") Integer schoolId, @PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		List<EnrolReptrByAcademicStream> enrolReptrByAcademicStream = mongoTemplate.find(query, EnrolReptrByAcademicStream.class);
		return enrolReptrByAcademicStream;
		
	}
	
	
}
