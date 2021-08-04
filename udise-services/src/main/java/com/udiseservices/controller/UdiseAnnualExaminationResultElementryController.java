package com.udiseservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udiseservices.models.AnnualExaminationResultElementryGrdV;
import com.udiseservices.models.AnnualExaminationResultElementryGrdVIII;
import com.udiseservices.outerServices.AnnualExaminationResultElementryOuterService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UdiseAnnualExaminationResultElementryController {
	
	@Autowired
	AnnualExaminationResultElementryOuterService annualExaminationResultElementryOuterService;
	
	
	@GetMapping(value = "/fetchAnnualExaminationResultElementryGrdV/{schoolId}/{year}")
	public void fetchAnnualExaminationResultElementryGrdV(@PathVariable("schoolId") String schoolId ,@PathVariable("year") String yearId) {
		
		AnnualExaminationResultElementryGrdV annualExaminationResultElementryGrdVData = annualExaminationResultElementryOuterService.fetchAnnualExaminationResultElementryGrdV(schoolId, yearId);
		AnnualExaminationResultElementryGrdVIII annualExaminationResultElementryGrdVIIIData = annualExaminationResultElementryOuterService.fetchAnnualExaminationResultElementryGrdVIII(schoolId, yearId);
		
	}

}
