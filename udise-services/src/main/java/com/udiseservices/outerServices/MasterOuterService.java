package com.udiseservices.outerServices;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.udiseservices.beans.*;
import com.udiseservices.models.SchoolMaster;
import com.udiseservices.models.VillageWardMaster;

//@FeignClient(name="master-service", url ="http://10.247.141.227:5000")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@FeignClient(name="master-service")
public interface MasterOuterService {
	
	@GetMapping(value = "/getState/{stateId}")
	public List<StateBean> fetchStateByStateId(@PathVariable("stateId")Integer stateId);
	
	@GetMapping(value = "/getSchMasterDataBySchId/{schoolId}")
	public SchoolMaster fetchSchMasterBySchoolId(@PathVariable("schoolId") Integer schoolId);
	
	@GetMapping(value = "/getVillMasterDataByVillId/{villageWardId}")
	public VillageWardMaster fetchVillMasterByVillageId(@PathVariable("villageWardId") String villageWardId);

}
