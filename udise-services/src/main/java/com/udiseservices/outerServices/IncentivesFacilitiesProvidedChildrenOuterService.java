package com.udiseservices.outerServices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.udiseservices.models.IncentivesFacilitiesProvidedCwsn;
import com.udiseservices.models.SchIncentivesFacilitiesProd;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@FeignClient(name="dcf-service")
public interface IncentivesFacilitiesProvidedChildrenOuterService {
	
	@GetMapping(value = "/fetchSchIncentivesFacilitiesProd/{schoolId}/{year}")
	public SchIncentivesFacilitiesProd fetchSchIncentivesFacilitiesProd(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String yearId);
	
	@GetMapping(value = "/fetchFacilitiesProvidedCwsn/{schoolId}/{year}")
	public IncentivesFacilitiesProvidedCwsn fetchFacilitiesProvidedCwsn(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year);

}
