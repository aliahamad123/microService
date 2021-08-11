package com.udiseservices.outerServices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.udiseservices.models.NsqfBasicInfo;
import com.udiseservices.models.NsqfClassConductPrevAcadYear;
import com.udiseservices.models.NsqfEnrCasteByTradeAndByJobRole;
import com.udiseservices.models.NsqfEnrCasteByTradeAndBySocialCategory;
import com.udiseservices.models.ResPersIncludTeachNSQFVoca;
import com.udiseservices.models.VoEduStudPlacementDetailClsXIIPreYear;
import com.udiseservices.models.VoEduStudPlacementDetailClsXPreYear;
import com.udiseservices.models.VocaEduResultStudent;
import com.udiseservices.models.VocationalTrainingProviders;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@FeignClient(name="dcf-service")
public interface VocEduUnderNSQFOuterService {
	
	@GetMapping(value = "/StudPlacementDetailClsXPreYear/{schoolId}/{year}")
	public VoEduStudPlacementDetailClsXPreYear fetchStudPlacementDetailClsXPreYear(@PathVariable("schoolId") String schoolId,String year);

	@GetMapping(value = "/studPlacementDetailClsXIIPreYear/{schoolId}/{year}")
	public VoEduStudPlacementDetailClsXIIPreYear fetchStudPlacementDetailClsXIIPreYear(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/VocaEduResultStu/{schoolId}/{year}")
	public VocaEduResultStudent fetchVoEduResultStu(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	
	@GetMapping(value = "/fetchVocationalTrainingProviders/{schoolId}/{year}")
	public VocationalTrainingProviders fetchVocationalTrainingProviders(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/fetchResPersIncludTeachNSQFVoca/{schoolId}/{year}")
	public ResPersIncludTeachNSQFVoca fetchResPersIncludTeachNSQFVoca(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/fetchNsqfBasicInfo/{schoolId}/{year}")
	public NsqfBasicInfo fetchNsqfBasicInfo(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/fetchNsqfEnrCasteByTradeAndBySocialCategory/{schoolId}/{year}")
	public NsqfEnrCasteByTradeAndBySocialCategory fetchNsqfEnrCasteByTradeAndBySocialCategory(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/fetchNsqfEnrCasteByTradeAndByJobRole/{schoolId}/{year}")
	public NsqfEnrCasteByTradeAndByJobRole fetchNsqfEnrCasteByTradeAndByJobRole(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/fetchNsqfClassConductPrevAcadYear/{schoolId}/{year}")
	public NsqfClassConductPrevAcadYear fetchNsqfClassConductPrevAcadYear(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
		
		
}