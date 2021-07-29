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
import com.ms.beans.BlockMasterBean;
import com.ms.beans.CommenResponseBean;
import com.ms.beans.DataBean;
import com.ms.modals.BlockMaster;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BlockMasterController {

	@Autowired
	MongoTemplate mongoTemplet;
	
	@GetMapping(value = "/getBlockList/{districtId}")
	public CommenResponseBean fetchBlockByDistrictId(@PathVariable("districtId") String districtId) {
	System.out.println("Block Master Controller ..........................................");
		CommenResponseBean responseBean = new CommenResponseBean();
		DataBean data = new DataBean();
		List<BlockMasterBean> blockDataList = new ArrayList<>();
		Query query = new Query();
		query.addCriteria(Criteria.where("districtId").is(districtId));
		List<BlockMaster> blockList = mongoTemplet.find(query, BlockMaster.class,"mst_block");
		if(blockList !=null && blockList.size() >0) {
			for(BlockMaster obj : blockList) {
				BlockMasterBean bean = new BlockMasterBean();
					bean.setBlockId(obj.getBlockId());
					bean.setBlockName(obj.getBlockName());
					bean.setUdiseBlockCode(obj.getUdiseBlockCode());
					blockDataList.add(bean);
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
		data.setRecords(blockDataList);
		responseBean.setData(data);
		return responseBean;

	}
}
