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
import com.udiseservices.models.SchReceiptsAndExpenditure;
import com.udiseservices.outerServices.ReceiptsAndExpenditureOuterService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UdiseReceiptsAndExpenditureController {
	
	
	@Autowired
	ReceiptsAndExpenditureOuterService receiptsAndExpenditureOuterService;
	SchReceiptsAndExpenditure schReceiptsAndExpenditureModelData;
	
	@GetMapping(value = "/fetchSchoolfundReceivFinancialYear/{schoolId}/{year}")
	public CommenResponseBean fetchSchoolfundReceivFinancialYear(@PathVariable("schoolId")Integer schoolId, @PathVariable("year") String year) {
	
		
		schReceiptsAndExpenditureModelData = receiptsAndExpenditureOuterService.fetchSchoolfundReceivFinancialYear(schoolId, year);
		
		List schReceipExpendtList = new ArrayList<>();
		CommenResponseBean schReceipExpendtResponseBean = new CommenResponseBean();
		DataBean data = new DataBean();
		schReceipExpendtList.add(schReceiptsAndExpenditureModelData);
		
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		schReceipExpendtResponseBean.setApiId("1234");
		schReceipExpendtResponseBean.setApiName("Profile One By School Id");
		schReceipExpendtResponseBean.setApiVersion("v1.0.0.1");
		schReceipExpendtResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		schReceipExpendtResponseBean.setMethod("GET");
		schReceipExpendtResponseBean.setReleasedDate(dateFormate.format(new Date()));
		schReceipExpendtResponseBean.setRequestedDate(dateFormate.format(new Date()));
		schReceipExpendtResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		schReceipExpendtResponseBean.setResponseId(rand.nextInt(100000));
		data.setTotalSize(schReceipExpendtList.size());
		data.setRecords(schReceipExpendtList);
		schReceipExpendtResponseBean.setData(data);
		return schReceipExpendtResponseBean;

	}

}
