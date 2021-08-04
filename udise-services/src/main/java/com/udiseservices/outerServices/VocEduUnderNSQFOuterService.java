package com.udiseservices.outerServices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.udiseservices.models.VocEduUnderNSQF;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@FeignClient(name="report-service")
public interface VocEduUnderNSQFOuterService {
	
	@GetMapping(value = "/fetchVocEduUnderNSQF/{schoolId}/{year}")
	public VocEduUnderNSQF fetchVocEduUnderNSQF(@PathVariable("schoolId") String schoolId,String year);

}
