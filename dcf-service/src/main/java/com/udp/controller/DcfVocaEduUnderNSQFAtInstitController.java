package com.udp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udp.models.NsqfBasicInfo;
import com.udp.models.NsqfClassConductPrevAcadYear;
import com.udp.models.NsqfEnrCasteByTradeAndByJobRole;
import com.udp.models.NsqfEnrCasteByTradeAndBySocialCategory;
import com.udp.models.ResPersIncludTeachNSQFVoca;
import com.udp.models.VoEduStudPlacementDetailClsXIIPreYear;
import com.udp.models.VoEduStudPlacementDetailClsXPreYear;
import com.udp.models.VocaEduResultStudent;
import com.udp.models.VocationalTrainingProviders;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DcfVocaEduUnderNSQFAtInstitController {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@GetMapping(value = "/StudPlacementDetailClsXPreYear/{schoolId}/{year}")
	public VoEduStudPlacementDetailClsXPreYear fetchStudPlacementDetailClsXPreYear(@PathVariable("schoolId") String schoolId,String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		VoEduStudPlacementDetailClsXPreYear studPlamntDetailClsXPreYearData = mongoTemplate.findOne(query, VoEduStudPlacementDetailClsXPreYear.class);
		return studPlamntDetailClsXPreYearData;
	}
	
	@GetMapping(value = "/studPlacementDetailClsXIIPreYear/{schoolId}/{year}")
	public VoEduStudPlacementDetailClsXIIPreYear fetchStudPlacementDetailClsXIIPreYear(@PathVariable("schoolId") String schoolId,String year) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		VoEduStudPlacementDetailClsXIIPreYear studPlamntDetailClsXIIPreYearData = mongoTemplate.findOne(query, VoEduStudPlacementDetailClsXIIPreYear.class);
		return studPlamntDetailClsXIIPreYearData;
	}
	
	@GetMapping(value = "/VocaEduResultStu/{schoolId}/{year}")
	public VocaEduResultStudent fetchVoEduResultStu(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		VocaEduResultStudent vocaEduResultStudentData = mongoTemplate.findOne(query, VocaEduResultStudent.class);
		return vocaEduResultStudentData;
	}
	
	@GetMapping(value = "/fetchVocationalTrainingProviders/{schoolId}/{year}")
	public VocationalTrainingProviders fetchVocationalTrainingProviders(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		VocationalTrainingProviders vocationalTraProData = mongoTemplate.findOne(query, VocationalTrainingProviders.class);
		return vocationalTraProData;
	}
	
	@GetMapping(value = "/fetchResPersIncludTeachNSQFVoca/{schoolId}/{year}")
	public ResPersIncludTeachNSQFVoca fetchResPersIncludTeachNSQFVoca(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		ResPersIncludTeachNSQFVoca resPersIncludTeachNSQFVocaData = mongoTemplate.findOne(query, ResPersIncludTeachNSQFVoca.class);
		return resPersIncludTeachNSQFVocaData;
	}
	
	@GetMapping(value = "/fetchNsqfBasicInfo/{schoolId}/{year}")
	public NsqfBasicInfo fetchNsqfBasicInfo(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		NsqfBasicInfo NsqfBasicInfoData = mongoTemplate.findOne(query, NsqfBasicInfo.class);
		return NsqfBasicInfoData;
	}
	
	@GetMapping(value = "/fetchNsqfEnrCasteByTradeAndBySocialCategory/{schoolId}/{year}")
	public NsqfEnrCasteByTradeAndBySocialCategory fetchNsqfEnrCasteByTradeAndBySocialCategory(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		NsqfEnrCasteByTradeAndBySocialCategory nsqfEnrCasteByTradeAndBySocialCategoryData = mongoTemplate.findOne(query, NsqfEnrCasteByTradeAndBySocialCategory.class);
		return nsqfEnrCasteByTradeAndBySocialCategoryData;
	}
	
	@GetMapping(value = "/fetchNsqfEnrCasteByTradeAndByJobRole/{schoolId}/{year}")
	public NsqfEnrCasteByTradeAndByJobRole fetchNsqfEnrCasteByTradeAndByJobRole(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		NsqfEnrCasteByTradeAndByJobRole nsqfEnrCasteByTradeAndByJobRoleData = mongoTemplate.findOne(query, NsqfEnrCasteByTradeAndByJobRole.class);
		return nsqfEnrCasteByTradeAndByJobRoleData;
	}
	
	@GetMapping(value = "/fetchNsqfClassConductPrevAcadYear/{schoolId}/{year}")
	public NsqfClassConductPrevAcadYear fetchNsqfClassConductPrevAcadYear(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year) {
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		NsqfClassConductPrevAcadYear nsqfClassConductPrevAcadYearData = mongoTemplate.findOne(query, NsqfClassConductPrevAcadYear.class);
		return nsqfClassConductPrevAcadYearData;
	}

}
