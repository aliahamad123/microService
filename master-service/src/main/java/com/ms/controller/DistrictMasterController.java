package com.ms.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ms.beans.CommenResponseBean;
import com.ms.beans.DataBean;
import com.ms.beans.DistrictMasterBean;
import com.ms.beans.StateBean;
import com.ms.modals.DistrictMaster;
import com.ms.modals.StateMaster;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DistrictMasterController {
	
	@Autowired
	MongoTemplate mongoTemplet;
	
	@GetMapping(value = "/getDistrictList/{stateId}")
	public CommenResponseBean fetchDistrictByStateId(@PathVariable("stateId") String stateCode) {
	System.out.println("District Master Controller ..........................................");
		CommenResponseBean responseBean = new CommenResponseBean();
		DataBean data = new DataBean();
		List<DistrictMasterBean> districtDataList = new ArrayList<>();
		Query query = new Query();
		query.addCriteria(Criteria.where("udiseStateCode").is(stateCode));
		List<DistrictMaster> districtList = mongoTemplet.find(query, DistrictMaster.class,"mst_district");
		if(districtList !=null && districtList.size() >0) {
			for(DistrictMaster obj : districtList) {
				DistrictMasterBean bean = new DistrictMasterBean();
				bean.setDistrictId(obj.getDistrictId());
				bean.setUdiseDistrictCode(obj.getUdiseDistrictCode());
				bean.setDistrictName(obj.getDistrictName());
				districtDataList.add(bean);
			}
		}
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		responseBean.setApiId("1234");
		responseBean.setApiName("Profile One By School Id");
		responseBean.setApiVersion("v1.0.0.1");
		responseBean.setDevelopedBy("UDISE Plus Team, NIC");
		responseBean.setMethod("GET");
		responseBean.setReleasedDate(dateFormate.format(new Date()));
		responseBean.setRequestedDate(dateFormate.format(new Date()));
		responseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		responseBean.setResponseId(rand.nextInt(100000));
		data.setRecords(districtDataList);
		responseBean.setData(data);
		return responseBean;

	}

}
