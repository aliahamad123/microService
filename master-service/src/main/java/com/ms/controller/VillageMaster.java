package com.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.ms.modals.VillageWardMaster;

@RestController
public class VillageMaster {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	/*
	 * @GetMapping(value = "/getVillMasterDataByVillId/{villageWardId}") public
	 * VillageWardMaster fetchVillMasterByVillageId(@PathVariable("villageId")
	 * String villageWardId){
	 * System.out.println("Inside Village Master  Controller"); Query query = new
	 * Query();
	 * query.addCriteria(Criteria.where("villageWardId").is(villageWardId)).with(
	 * Sort.by(Direction.ASC, "acYear"));; VillageWardMaster villageMasterData =
	 * mongoTemplate.findOne(query, VillageWardMaster.class,"mst_village_ward");
	 * return villageMasterData;
	 * 
	 * }
	 */
}
