package com.ms.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
import com.ms.beans.SchoolMasterBean;
import com.ms.modals.DistrictMaster;
import com.ms.modals.SchoolMaster;
import com.ms.modals.VillageWardMaster;
import com.ms.utitlity.StaticMasterUtilityMethodes;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SchoolMasterController {
	@Autowired
	MongoTemplate mongoTemplate;

	@GetMapping(value = "/getSchMasterDataBySchId/{schoolId}")
	public SchoolMaster fetchSchMasterBySchoolId(@PathVariable("schoolId") Integer schoolId) {
		System.out.println("Ali..................................................");
		System.out.println("Inside School Master  Controller");
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId)).with(Sort.by(Direction.ASC, "acYear"));
		SchoolMaster schoolMasterData = mongoTemplate.findOne(query, SchoolMaster.class, "school_master");
		return schoolMasterData;

	}

	@GetMapping(value = "/getSchMasterDataByBlockId/{blockId}")
	public CommenResponseBean fetchSchMasterByBlockId(@PathVariable("blockId") String blockId) {
		System.out.println("Ali..................................................");
		System.out.println("Inside School Master  Controller");
		CommenResponseBean responseBean = new CommenResponseBean();
		List<SchoolMasterBean> schMasterDataList = new ArrayList<>();
		DataBean data = new DataBean();
		Query query = new Query();
		query.addCriteria(Criteria.where("blockId").is(blockId)).with(Sort.by(Direction.ASC, "acYear"));
		;
		List<SchoolMaster> schoolMasterData = mongoTemplate.find(query, SchoolMaster.class, "school_master");

		if (schoolMasterData != null && schoolMasterData.size() > 0) {
			for (SchoolMaster obj : schoolMasterData) {
				SchoolMasterBean bean = new SchoolMasterBean();
				bean.setSchoolId(obj.getSchoolId());
				bean.setSchoolName(obj.getSchoolName());
				bean.setUdiseSchCode(obj.getUdiseSchCode());
				bean.setSchCategoryId(StaticMasterUtilityMethodes.fetchSchoolCategoryDetails(obj.getSchCategoryId()));
				bean.setDistrictCode(obj.getDistrictId());
				bean.setDistrictCode(obj.getDistrictCode());
				bean.setBlockId(obj.getBlockId());
				bean.setBlockCode(obj.getBlockCode());
				bean.setStateId(obj.getStateId());
				bean.setStateCode(obj.getStateCode());
				schMasterDataList.add(bean);
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
		data.setRecords(schMasterDataList);
		responseBean.setData(data);
		return responseBean;

	}

	@GetMapping(value = "/getVillMasterDataByVillId/{villageWardId}")
	public VillageWardMaster fetchVillMasterByVillageId(@PathVariable("villageWardId") String villageWardId) {
		System.out.println("Inside Village Master  Controller");
		Query query = new Query();
		query.addCriteria(Criteria.where("villageWardId").is(villageWardId)).with(Sort.by(Direction.ASC, "acYear"));
		VillageWardMaster villageMasterData = mongoTemplate.findOne(query, VillageWardMaster.class, "mst_village_ward");
		return villageMasterData;
	}
}
