package com.udp.outerServices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="master-service")
public interface StateServices {
	
	@GetMapping(value = "/getState/{stateId}")
	public String fetchStateByStateId(@PathVariable("stateId")Integer stateId);

}
