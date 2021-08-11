package com.udiseservices.outerServices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.udiseservices.models.SchFundReceivFinYear201920ForGovAndGovAddedSch;
import com.udiseservices.models.SchFundReceivFinancialYear201718ForSecHSecSch;
import com.udiseservices.models.SchMaintainingInventoryReg;
import com.udiseservices.models.SchReceiptsAndExpenditure;
import com.udiseservices.models.SchoolfundReceivFinancialYear201718ExcludMDM;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@FeignClient(name="dcf-service")
public interface ReceiptsAndExpenditureOuterService {
	
	@GetMapping(value = "/fetchSchoolfundReceivFinancialYear/{schoolId}/{year}")
	public SchReceiptsAndExpenditure fetchSchoolfundReceivFinancialYear(@PathVariable("schoolId")String schoolId, @PathVariable("year") String year);
	
//	@GetMapping(value = "/fetchSchoolfundReceivFinancialYear201718ExcludMDM/{schoolId}/{year}")
//	public SchoolfundReceivFinancialYear201718ExcludMDM fetchSchoolfundReceivFinancialYear201718ExcludMDM(@PathVariable("schoolId")String schoolId, @PathVariable("year") String year);
//	
//	@GetMapping(value = "/fetchSchoolfundReceivFinancialYear201718ForSecHSecSch/{schoolId}/{year}")
//	public SchFundReceivFinancialYear201718ForSecHSecSch fetchSchoolfundReceivFinancialYear201718ForSecHSecSch(@PathVariable("schoolId")String schoolId, @PathVariable("year") String year);
//	
//	@GetMapping(value = "/fetchSchFundReceivFinancialYear201920ForGovAndGovAddedSch/{schoolId}/{year}")
//	public SchFundReceivFinYear201920ForGovAndGovAddedSch fetchSchFundReceivFinancialYear201920ForGovAndGovAddedSch(@PathVariable("schoolId")String schoolId, @PathVariable("year") String year);
//	
//	@GetMapping(value = "/fetchSchMaintainingInventoryReg/{schoolId}/{year}")
//	public SchMaintainingInventoryReg fetchSchMaintainingInventoryReg(@PathVariable("schoolId")String schoolId, @PathVariable("year") String year);

}
