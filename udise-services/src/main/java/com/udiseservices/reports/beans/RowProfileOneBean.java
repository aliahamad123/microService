package com.udiseservices.reports.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class RowProfileOneBean {
	@Id
	@Field(value = "_id")
	private String _id;
	
	@Field(name ="state_id")
	public String stateId;

	@Field(name ="district_id")
	public String 	districtId;
	
	@Field(name ="block_id")
	public String  blockId;
	
	@Field(name ="cluster_id")
	public String 	clusterId;
	
	@Field(name ="school_id")
	public String 	schoolId;
	
	@Field(name ="state_cd")
	public String 	stateCd;
	
	@Field(name ="district_cd")
	public String 	districtCd;
	
	@Field(name ="block_cd")
	public String 	blockCd;
	
	@Field(name ="block_name")
	public String 	blockName;
	
	@Field(name ="village_cd")
	public String  villageCd;
	
	@Field(name ="village_name")
	public String 	villageName;
	
	@Field(name ="cluster_cd")
	public String 	clusterCd;
	
	@Field(name ="cluster_name")
	public String 	clusterName;
	
	@Field(name ="school_name")
	public String 	schoolName;
	
	@Field(name ="udise_sch_code")
	public String 	udiseSchCode;
	
	@Field(name ="sch_category_id")
	public String 	schCategoryId;
	
	@Field(name ="sch_mgmt_id")
	public String 	schMgmtId;
	
	@Field(name ="sch_location")
	public String 	schLocation;
	
	@Field(name ="sch_type")
	public String 	schType;
	
	@Field(name ="class_frm")
	public String 	classFrm;
	
	@Field(name ="class_to")
	public String 	classTo;
	
	@Field(name ="latitude")
	public String 	latitude;
	
	@Field(name ="longitude")
	public String 	longitude;
	
	@Field(name ="hab_cd")
	public String 	habCd;
	
	@Field(name ="hab_name")
	public String 	habName;
	
	@Field(name ="pan_cd")
	public String 	panCd;
	
	@Field(name ="pan_name")
	public String 	panName;
	
	@Field(name ="edu_block_cd")
	public String 	eduBlockCd;
	
	@Field(name ="edu_block_name")
	public String 	eduBlockName;
	
	@Field(name ="assembly_cd")
	public String 	assemblyCd;
	
	@Field(name ="assembly_name")
	public String 	assemblyName;
	
	@Field(name ="parl_cd")
	public String 	parlCd;
	
	@Field(name ="parl_name")
	public String 	parlName;
	
	@Field(name ="munici_cd")
	public String 	municiCd;
	
	@Field(name ="munici_name")
	public String 	municiName;
	
	@Field(name ="city_cd")
	public String 	cityCd;
	
	@Field(name ="city_name")
	public String 	cityName;
	
	@Field(name ="address")
	public String 	address;
	
	@Field(name ="resp_name")
	public String  respName;
	
	@Field(name ="mobile")
	public String  mobile;
	
	@Field(name ="mobile_resp")
	public String 	mobileResp;
	
	@Field(name ="c0_sec")
	public String 	c0Sec;
	
	@Field(name ="c1_sec")
	public String 	c1Sec;
	
	@Field(name ="c2_sec")
	public String 	c2Sec;
	
	@Field(name ="c3_sec")
	public String 	c3Sec;
	
	@Field(name ="c4_sec")
	public String 	c4Sec;
	
	@Field(name ="c5_sec")
	public String 	c5Sec;
	
	@Field(name ="c6_sec")
	public String 	c6Sec;
	
	@Field(name ="c7_sec")
	public String 	c7Sec;
	
	@Field(name ="c8_sec")
	public String 	c8Sec;
	
	@Field(name ="c9_sec")
	public String 	c9Sec;
	
	@Field(name ="c10_sec")
	public String 	c10Sec;
	
	@Field(name ="c11_sec")
	public String  c11Sec;
	
	@Field(name ="c12_sec")
	public String 	c12Sec;
	
	@Field(name ="estd_year")
	public String 	estdYear;
	
	@Field(name ="recog_year_pri")
	public String 	recogYearPri;


}
