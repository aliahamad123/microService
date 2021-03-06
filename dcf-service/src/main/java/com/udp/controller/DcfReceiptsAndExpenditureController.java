package com.udp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udp.models.SchReceiptsAndExpenditure;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DcfReceiptsAndExpenditureController {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@GetMapping(value = "/fetchSchoolfundReceivFinancialYear/{schoolId}/{year}")
	public SchReceiptsAndExpenditure fetchSchoolfundReceivFinancialYear(@PathVariable("schoolId")Integer schoolId, @PathVariable("year") String year) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("acYear").is(year));
		SchReceiptsAndExpenditure SchReceiptsAndExpenditureData = mongoTemplate.findOne(query, SchReceiptsAndExpenditure.class);
		return SchReceiptsAndExpenditureData;
	}
	/*
	 * @GetMapping(value =
	 * "/fetchSchoolfundReceivFinancialYear201718ForSecHSecSch/{schoolId}/{year}")
	 * public SchFundReceivFinancialYear201718ForSecHSecSch
	 * fetchSchoolfundReceivFinancialYear201718ForSecHSecSch(@PathVariable(
	 * "schoolId")String schoolId, @PathVariable("year") String year) {
	 * 
	 * Query query = new Query();
	 * query.addCriteria(Criteria.where("schoolId").is(schoolId).and("year").is(year
	 * )); SchFundReceivFinancialYear201718ForSecHSecSch
	 * schFundReceivFinancialYear201718ForSecHSecSch = mongoTemplate.findOne(query,
	 * SchFundReceivFinancialYear201718ForSecHSecSch.class); return
	 * schFundReceivFinancialYear201718ForSecHSecSch; }
	 * 
	 * @GetMapping(value =
	 * "/fetchSchFundReceivFinancialYear201920ForGovAndGovAddedSch/{schoolId}/{year}")
	 * public SchFundReceivFinYear201920ForGovAndGovAddedSch
	 * fetchSchFundReceivFinancialYear201920ForGovAndGovAddedSch(@PathVariable(
	 * "schoolId")String schoolId, @PathVariable("year") String year) {
	 * 
	 * Query query = new Query();
	 * query.addCriteria(Criteria.where("schoolId").is(schoolId).and("year").is(year
	 * )); SchFundReceivFinYear201920ForGovAndGovAddedSch
	 * schFundReceivFinancialYear201920ForGovAndGovAddedSchData =
	 * mongoTemplate.findOne(query,
	 * SchFundReceivFinYear201920ForGovAndGovAddedSch.class); return
	 * schFundReceivFinancialYear201920ForGovAndGovAddedSchData; }
	 * 
	 * @GetMapping(value = "/fetchFinAssistanceReceivBySch/{schoolId}/{year}")
	 * public FinAssistanceReceivBySch
	 * fetchFinAssistanceReceivBySch(@PathVariable("schoolId")String
	 * schoolId, @PathVariable("year") String year) {
	 * 
	 * Query query = new Query();
	 * query.addCriteria(Criteria.where("schoolId").is(schoolId).and("year").is(year
	 * )); FinAssistanceReceivBySch finAssistanceReceivBySchData =
	 * mongoTemplate.findOne(query, FinAssistanceReceivBySch.class); return
	 * finAssistanceReceivBySchData; }
	 * 
	 * @GetMapping(value = "/fetchSchMaintainingInventoryReg/{schoolId}/{year}")
	 * public SchMaintainingInventoryReg
	 * fetchSchMaintainingInventoryReg(@PathVariable("schoolId")String
	 * schoolId, @PathVariable("year") String year) {
	 * 
	 * Query query = new Query();
	 * query.addCriteria(Criteria.where("schoolId").is(schoolId).and("year").is(year
	 * )); SchMaintainingInventoryReg schMaintainingInventoryReg =
	 * mongoTemplate.findOne(query, SchMaintainingInventoryReg.class); return
	 * schMaintainingInventoryReg; }
	 */

}
