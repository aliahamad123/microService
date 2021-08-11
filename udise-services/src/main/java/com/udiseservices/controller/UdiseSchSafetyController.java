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
import com.udiseservices.beans.SchsafetyBean;
import com.udiseservices.models.SchSafety;
import com.udiseservices.outerServices.SchSafetyOuterService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UdiseSchSafetyController {

	@Autowired
	SchSafetyOuterService schSafetyOuterService;
	private SchSafety schSafetyData;

	@GetMapping(value = "/fetchSchSafety/{schoolId}/{year}")
	public CommenResponseBean fetchSchSafetyData(@PathVariable("schoolId") Integer schoolId,
			@PathVariable("year") String year) {

		System.out.println("Ali" + schoolId + "year" +year);
		
		SchsafetyBean schSafetyBeanData = new SchsafetyBean();
		DataBean data = new DataBean();
		CommenResponseBean schSafetyResponseBean = new CommenResponseBean();
		List<SchsafetyBean> schSafetyList = new ArrayList<SchsafetyBean>();
		try {
			
			schSafetyData = schSafetyOuterService.fetchSchSafety(schoolId, year);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(schSafetyData != null) {
			
			schSafetyBeanData.setUdiseSchCode(schSafetyData.getUdiseSchCode());
			schSafetyBeanData.setSchoolId(schSafetyData.getSchoolId());
			schSafetyBeanData.setSdmpPlanYn(schSafetyData.getSdmpPlanYn());
			schSafetyBeanData.setStructSafaudYn(schSafetyData.getStructSafaudYn());
			schSafetyBeanData.setNonstrSafaudYn(schSafetyData.getNonstrSafaudYn());
			schSafetyBeanData.setFireExtYn(schSafetyData.getFireExtYn());
			schSafetyBeanData.setSaftyTrngYn(schSafetyData.getSaftyTrngYn());
			schSafetyBeanData.setDismgmtTaugYn(schSafetyData.getDismgmtTaugYn());
			schSafetyBeanData.setSlfdefGrtYn(schSafetyData.getSlfdefGrtYn());
			schSafetyBeanData.setSlfdefTrained(schSafetyData.getSlfdefTrained());
			schSafetyBeanData.setExtraColumn1(schSafetyData.getExtraColumn1());
			schSafetyBeanData.setCctvCamYn(schSafetyData.getCctvCamYn());
			schSafetyBeanData.setNodalTchYn(schSafetyData.getNodalTchYn());
			schSafetyBeanData.setGuidanceYn(schSafetyData.getGuidanceYn());
			schSafetyBeanData.setGuideDisplayYn(schSafetyData.getGuideDisplayYn());
			schSafetyBeanData.setTchRcvdGrantYn(schSafetyData.getTchRcvdGrantYn());
			schSafetyBeanData.setGuidanceYn(schSafetyData.getGuidanceYn());
			schSafetyBeanData.setSensitizeYn(schSafetyData.getSensitizeYn());
			schSafetyBeanData.setStuAwarenessYn(schSafetyData.getStuAwarenessYn());
			schSafetyBeanData.setStuFeedbackYn(schSafetyData.getStuFeedbackYn());
			schSafetyBeanData.setCompBoxYn(schSafetyData.getCompBoxYn());
			schSafetyBeanData.setGuideToStuYn(schSafetyData.getGuideToStuYn());
			
		}
		schSafetyList.add(schSafetyBeanData);
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		schSafetyResponseBean.setApiId("1234");
		schSafetyResponseBean.setApiName("Profile One By School Id");
		schSafetyResponseBean.setApiVersion("v1.0.0.1");
		schSafetyResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		schSafetyResponseBean.setMethod("GET");
		schSafetyResponseBean.setReleasedDate(dateFormate.format(new Date()));
		schSafetyResponseBean.setRequestedDate(dateFormate.format(new Date()));
		schSafetyResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		schSafetyResponseBean.setResponseId(rand.nextInt(100000));
		data.setTotalSize(schSafetyList.size());
		data.setRecords(schSafetyList);
		schSafetyResponseBean.setData(data);
		
		return schSafetyResponseBean;

	}
}
