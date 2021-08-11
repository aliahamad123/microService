package com.udiseservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udiseservices.models.SchReceiptsAndExpenditure;
import com.udiseservices.outerServices.ReceiptsAndExpenditureOuterService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UdiseReceiptsAndExpenditureController {
	
	
	@Autowired
	ReceiptsAndExpenditureOuterService receiptsAndExpenditureOuterService;
	SchReceiptsAndExpenditure schReceiptsAndExpenditureModelData;
	
	@GetMapping(value = "/fetchSchoolfundReceivFinancialYear/{schoolId}/{year}")
	public SchReceiptsAndExpenditure fetchSchoolfundReceivFinancialYear(@PathVariable("schoolId")String schoolId, @PathVariable("year") String year) {
	
		
		schReceiptsAndExpenditureModelData = receiptsAndExpenditureOuterService.fetchSchoolfundReceivFinancialYear(schoolId, year);
		return schReceiptsAndExpenditureModelData;
	}

}
