package com.udiseservices.outerServices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.udiseservices.models.SchSafety;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@FeignClient(name="report-service")
public interface SchSafetyOuterService {
	
	@GetMapping(value = "/fetchSchSafety/{schoolId}/{year}")
	public SchSafety fetchSchSafety(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);

}
