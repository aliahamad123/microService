package com.udiseservices.outerServices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.udiseservices.models.AnnualExaminationResultElementryGrdV;
import com.udiseservices.models.AnnualExaminationResultElementryGrdVIII;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@FeignClient(name="dcf-service")
public interface AnnualExaminationResultElementryOuterService {
	
	@GetMapping(value = "/fetchAnnualExaminationResultElementryGrdV/{schoolId}/{year}")
	public AnnualExaminationResultElementryGrdV fetchAnnualExaminationResultElementryGrdV(@PathVariable("schoolId") Integer schoolId ,@PathVariable("year") String yearId);
	
	@GetMapping(value = "/fetchAnnualExaminationResultElementryGrdVIII/{schoolId}/{year}")
	public AnnualExaminationResultElementryGrdVIII fetchAnnualExaminationResultElementryGrdVIII(@PathVariable("schoolId") Integer schoolId ,@PathVariable("year") String yearId);

}
