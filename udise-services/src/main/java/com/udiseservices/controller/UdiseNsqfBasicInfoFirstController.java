package com.udiseservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udiseservices.models.NsqfBasicInfo;
import com.udiseservices.models.NsqfClassConductPrevAcadYear;
import com.udiseservices.models.NsqfEnrCasteByTradeAndByJobRole;
import com.udiseservices.models.NsqfEnrCasteByTradeAndBySocialCategory;
import com.udiseservices.outerServices.VocEduUnderNSQFOuterService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UdiseNsqfBasicInfoFirstController {
	
	@Autowired
	VocEduUnderNSQFOuterService vocEduUnderNSQFOuterService;
	NsqfBasicInfo nsqfBasicInfoModelData;
	NsqfEnrCasteByTradeAndBySocialCategory nsqfEnrCasteByTradeAndBySocialCategoryModelData;
	NsqfEnrCasteByTradeAndByJobRole nsqfEnrCasteByTradeAndByJobRoleModelData;
	NsqfClassConductPrevAcadYear nsqfClassConductPrevAcadYearModelData;
	
	@GetMapping(value = "/fetchNsqfBasicInfo/{schoolId}/{year}")
	public NsqfBasicInfo fetchNsqfBasicInfo(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year) {
		
		nsqfBasicInfoModelData = vocEduUnderNSQFOuterService.fetchNsqfBasicInfo(schoolId, year);
		return nsqfBasicInfoModelData;
		
	}
	
	@GetMapping(value = "/fetchNsqfEnrCasteByTradeAndBySocialCategory/{schoolId}/{year}")
	public NsqfEnrCasteByTradeAndBySocialCategory fetchNsqfEnrCasteByTradeAndBySocialCategory(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year) {
		nsqfEnrCasteByTradeAndBySocialCategoryModelData = vocEduUnderNSQFOuterService.fetchNsqfEnrCasteByTradeAndBySocialCategory(schoolId, year);
		return nsqfEnrCasteByTradeAndBySocialCategoryModelData;
	}
	
	@GetMapping(value = "/fetchNsqfEnrCasteByTradeAndByJobRole/{schoolId}/{year}")
	public NsqfEnrCasteByTradeAndByJobRole fetchNsqfEnrCasteByTradeAndByJobRole(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year) {
		
		nsqfEnrCasteByTradeAndByJobRoleModelData = vocEduUnderNSQFOuterService.fetchNsqfEnrCasteByTradeAndByJobRole(schoolId, year);
		return nsqfEnrCasteByTradeAndByJobRoleModelData;
	}
	
	
	@GetMapping(value = "/fetchNsqfClassConductPrevAcadYear/{schoolId}/{year}")
	public NsqfClassConductPrevAcadYear fetchNsqfClassConductPrevAcadYear(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year) {
		
		nsqfClassConductPrevAcadYearModelData = vocEduUnderNSQFOuterService.fetchNsqfClassConductPrevAcadYear(schoolId, year);
		return nsqfClassConductPrevAcadYearModelData;
		
	}

}
