package com.udiseservices.outerServices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.udiseservices.models.IncentivesFacilitiesProvidedChildren;
import com.udiseservices.models.IncentivesFacilitiesProvidedChildrenFiveToEight;
import com.udiseservices.models.IncentivesFacilitiesProvidedCwsn;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@FeignClient(name="dcf-service")
public interface IncentivesFacilitiesProvidedChildrenOuterService {
	
	@GetMapping(value = "/fetchFacilitiesProvidedChildrenOneToFive/{schoolId}/{year}")
	public IncentivesFacilitiesProvidedChildren fetchFacilitiesProvidedChild1renOneToFive(@PathVariable("schoolId") String schoolId,@PathVariable("year") String yearId);
	
	@GetMapping(value = "/fetchFacilitiesProvidedChildrenFiveToEight/{schoolId}/{year}")
	public IncentivesFacilitiesProvidedChildrenFiveToEight fetchFacilitiesProvidedChildrenFiveToEight(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/fetchFacilitiesProvidedCwsn/{schoolId}/{year}")
	public IncentivesFacilitiesProvidedCwsn fetchFacilitiesProvidedCwsn(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);

}