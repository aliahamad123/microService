package com.udiseservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.udiseservices.models.IncentivesFacilitiesProvidedCwsn;
import com.udiseservices.models.SchIncentivesFacilitiesProd;
import com.udiseservices.outerServices.IncentivesFacilitiesProvidedChildrenOuterService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UdiseIncentivesFacilitiesProvidedChildrenController {
	
	@Autowired
	IncentivesFacilitiesProvidedChildrenOuterService incentivesFacilitiesProvidedChildrenOuterService;
	
	@GetMapping(value = "/fetchFacilitiesProvidedChildren/{schoolId}/{year}")
	public void fetchFacilitiesProvidedChildren(@PathVariable("schoolId") String schoolId, @PathVariable("year") String yearId) {
		
		SchIncentivesFacilitiesProd incentivFacilitiProvidChildOOneToFiveData  = incentivesFacilitiesProvidedChildrenOuterService.fetchSchIncentivesFacilitiesProd(schoolId, yearId);
		IncentivesFacilitiesProvidedCwsn incentivFacilitiProvidChildCwsnData = incentivesFacilitiesProvidedChildrenOuterService.fetchFacilitiesProvidedCwsn(schoolId, yearId);
		
	}

}
