package com.udiseservices.outerServices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.udiseservices.models.PGIAndOtherIndicator;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@FeignClient(name="dcf-service")
public interface PGIAndOtherIndicatorOuterService {
	
	@GetMapping(value = "/fetchPGIAndOtherIndicator/{schoolId}/{year}")
	public PGIAndOtherIndicator fetchPGIAndOtherIndicator(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year);

}
