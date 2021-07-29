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
import com.ms.beans.StateBean;
import com.ms.modals.StateMaster;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MstState {

	@Autowired
	MongoTemplate mongoTemplet;

@GetMapping(value = "/getAllState")
public CommenResponseBean fetchAllState() {
		
		int startRecord = 1;
		int endRecord =10;
		List<StateBean> listOfState = new ArrayList<>();
		CommenResponseBean responseBean = new CommenResponseBean();
		DataBean data = new DataBean();
		List<StateMaster> stateList = mongoTemplet.findAll(StateMaster.class,"mst_state");
		for (StateMaster stateObj : stateList) {
			StateBean bean = new StateBean();
			bean.setStateId(stateObj.getStateId());
			bean.setStateCode(stateObj.getUdiseStateCode());
			bean.setStateName(stateObj.getStateName());
			listOfState.add(bean);
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
		data.setStartRecord(startRecord);
		data.setEndRecord(endRecord);
		data.setTotalSize(listOfState.size());
		data.setFetchedSize(endRecord);
		data.setRecords(listOfState);
		responseBean.setData(data);
		return responseBean;
	}

	@GetMapping(value = "/getState/{stateId}")
	public StateBean fetchStateByStateId(@PathVariable("stateId") Integer stateId) {
		
		int startRecord = 1;
		int endRecord =10;
		CommenResponseBean responseBean = new CommenResponseBean();
		DataBean data = new DataBean();
		StateBean bean = new StateBean();
		Query query = new Query();
		query.addCriteria(Criteria.where("stateId").is(stateId));
		StateMaster stateName = mongoTemplet.findOne(query, StateMaster.class);
		bean.setStateId(stateName.getStateId());
		bean.setStateName(stateName.getStateName());
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
		data.setStartRecord(startRecord);
		data.setEndRecord(endRecord);
		//data.setTotalSize(stateName.size());
		data.setFetchedSize(endRecord);
		data.setRecords(bean);
		responseBean.setData(data);
		return bean;

	}

}
