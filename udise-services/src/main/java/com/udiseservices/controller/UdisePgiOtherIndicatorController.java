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
import com.udiseservices.beans.PgiIndicatorBean;
import com.udiseservices.models.PGIAndOtherIndicator;
import com.udiseservices.outerServices.PGIAndOtherIndicatorOuterService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UdisePgiOtherIndicatorController {

	@Autowired
	PGIAndOtherIndicatorOuterService pGIAndOtherIndicatorOuterService;
	PGIAndOtherIndicator pGIAndOtherIndicatorModelData;

	@GetMapping(value = "/fetchPGIAndOtherIndicator/{schoolId}/{year}")
	public CommenResponseBean fetchPGIAndOtherIndicator(@PathVariable("schoolId") Integer schoolId,
			@PathVariable("year") String year) {

		System.out.println("Ali" + schoolId + "year" + year);

		PgiIndicatorBean pgiOtherIndicatorBeanData = new PgiIndicatorBean();
		DataBean data = new DataBean();
		CommenResponseBean schPgiIndicatorResponseBean = new CommenResponseBean();
		List<PgiIndicatorBean> pgiOtherIndicatorList = new ArrayList<PgiIndicatorBean>();
		try {

			pGIAndOtherIndicatorModelData = pGIAndOtherIndicatorOuterService.fetchPGIAndOtherIndicator(schoolId, year);

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (pGIAndOtherIndicatorModelData != null) {

			pgiOtherIndicatorBeanData.setUdiseSchCode(pGIAndOtherIndicatorModelData.getUdiseSchCode());
			pgiOtherIndicatorBeanData.setAcYear(pGIAndOtherIndicatorModelData.getAcYear());
			pgiOtherIndicatorBeanData.setImprovPlanYn(pGIAndOtherIndicatorModelData.getImprovPlanYn());
			pgiOtherIndicatorBeanData.setSchEvalYn(pGIAndOtherIndicatorModelData.getSchEvalYn());
			pgiOtherIndicatorBeanData.setSchoolId(pGIAndOtherIndicatorModelData.getSchoolId());
			pgiOtherIndicatorBeanData.setSchPfmsYn(pGIAndOtherIndicatorModelData.getSchPfmsYn());
			pgiOtherIndicatorBeanData.setStuAtndncYn(pGIAndOtherIndicatorModelData.getStuAtndncYn());
			pgiOtherIndicatorBeanData.setTchAdhrSeed(pGIAndOtherIndicatorModelData.getTchAdhrSeed());
			pgiOtherIndicatorBeanData.setTchAtndncYn(pGIAndOtherIndicatorModelData.getTchAtndncYn());

		}
		pgiOtherIndicatorList.add(pgiOtherIndicatorBeanData);
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		schPgiIndicatorResponseBean.setApiId("1234");
		schPgiIndicatorResponseBean.setApiName("Profile One By School Id");
		schPgiIndicatorResponseBean.setApiVersion("v1.0.0.1");
		schPgiIndicatorResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		schPgiIndicatorResponseBean.setMethod("GET");
		schPgiIndicatorResponseBean.setReleasedDate(dateFormate.format(new Date()));
		schPgiIndicatorResponseBean.setRequestedDate(dateFormate.format(new Date()));
		schPgiIndicatorResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		schPgiIndicatorResponseBean.setResponseId(rand.nextInt(100000));
		data.setTotalSize(pgiOtherIndicatorList.size());
		data.setRecords(pgiOtherIndicatorList);
		schPgiIndicatorResponseBean.setData(data);

		return schPgiIndicatorResponseBean;

	}

}
