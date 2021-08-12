package com.udiseservices.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udiseservices.beans.CommenResponseBean;
import com.udiseservices.beans.DataBean;
import com.udiseservices.models.IncentivesFacilitiesProvidedCwsn;
import com.udiseservices.models.SchIncentivesFacilitiesProd;
import com.udiseservices.outerServices.IncentivesFacilitiesProvidedChildrenOuterService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UdiseIncentivesFacilitiesProvidedChildrenController {
	
	@Autowired
	IncentivesFacilitiesProvidedChildrenOuterService incentivesFacilitiesProvidedChildrenOuterService;
	
	@GetMapping(value = "/fetchFacilitiesProvidedChildren/{schoolId}/{year}")
	public CommenResponseBean fetchFacilitiesProvidedChildren(@PathVariable("schoolId") Integer schoolId, @PathVariable("year") String yearId) {
		
		SchIncentivesFacilitiesProd incentivFacilitiProvidChildOOneToFiveData  = incentivesFacilitiesProvidedChildrenOuterService.fetchSchIncentivesFacilitiesProd(schoolId, yearId);
		IncentivesFacilitiesProvidedCwsn incentivFacilitiProvidChildCwsnData = incentivesFacilitiesProvidedChildrenOuterService.fetchFacilitiesProvidedCwsn(schoolId, yearId);
		
		List incenFaciProList = new ArrayList<>();
		CommenResponseBean incenFaciProResponseBean = new CommenResponseBean();
		DataBean data = new DataBean();
		incenFaciProList.add(incentivFacilitiProvidChildOOneToFiveData);
		incenFaciProList.add(incentivFacilitiProvidChildCwsnData);
		
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		incenFaciProResponseBean.setApiId("1234");
		incenFaciProResponseBean.setApiName("Profile One By School Id");
		incenFaciProResponseBean.setApiVersion("v1.0.0.1");
		incenFaciProResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		incenFaciProResponseBean.setMethod("GET");
		incenFaciProResponseBean.setReleasedDate(dateFormate.format(new Date()));
		incenFaciProResponseBean.setRequestedDate(dateFormate.format(new Date()));
		incenFaciProResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		incenFaciProResponseBean.setResponseId(rand.nextInt(100000));
		data.setTotalSize(incenFaciProList.size());
		data.setRecords(incenFaciProList);
		incenFaciProResponseBean.setData(data);
		return incenFaciProResponseBean;
		
	}

}
