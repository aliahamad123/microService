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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.udiseservices.beans.AdmissionGradeOneBean;
import com.udiseservices.beans.CombineDCFData;
import com.udiseservices.beans.CommenResponseBean;
import com.udiseservices.beans.DataBean;
import com.udiseservices.beans.UdiseEnrolByGradeByAgeBean;
import com.udiseservices.beans.UdiseEnrolByMediumOfInstBean;
import com.udiseservices.beans.UdiseEnrolSocialMinorityCatBean;
import com.udiseservices.beans.UdiseReptrSocialMinorityCatBean;
import com.udiseservices.beans.UdiseEnrolReptrByAcademicStreamBean;
import com.udiseservices.beans.UdiseEnrolByCwsnBean;
import com.udiseservices.models.AdmissionGradeOne;
import com.udiseservices.models.EnrolByCwsn;
import com.udiseservices.models.EnrolByGradeByAge;
import com.udiseservices.models.EnrolByMediumOfInst;
import com.udiseservices.models.EnrolSocialMinorityCat;
import com.udiseservices.models.ReptrSocialMinorityCat;
import com.udiseservices.models.EnrolReptrByAcademicStream;
import com.udiseservices.outerServices.ProfileOuterServices;
import com.udiseservices.utility.StaticMasterUtilityMethodes;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SchAdmissionEnrolReptr {

	@Autowired
	ProfileOuterServices profileOuterService;
	private AdmissionGradeOne obj;

	@GetMapping(value = "/fetchAdmissionEnrolReptrData/{schoolId}/{year}")
	public CommenResponseBean fetchSchAdmissionEnrolReptr(@PathVariable("schoolId") Integer schoolId,@PathVariable("year") String year) {

		AdmissionGradeOneBean admissionGradeOneBean = new AdmissionGradeOneBean();
		// List<TeacherProfileTwoBean> teacherInstr = new
		// ArrayList<TeacherProfileTwoBean>();
		CombineDCFData combineDCFData = new CombineDCFData();
		CommenResponseBean profileResponseBean = new CommenResponseBean();
		DataBean data = new DataBean();
		try {
			obj = profileOuterService.fetchSchAdmissGrade(schoolId,year);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (obj != null) {
				admissionGradeOneBean.setAge4Boys(obj.getAge4Boys());
				admissionGradeOneBean.setAge4Girls(obj.getAge4Girls());
				admissionGradeOneBean.setAge5Boys(obj.getAge5Boys());
				admissionGradeOneBean.setAge5Girls(obj.getAge5Girls());
				admissionGradeOneBean.setAge6Boys(obj.getAge6Boys());
				admissionGradeOneBean.setAge6Girls(obj.getAge6Girls());
				admissionGradeOneBean.setAge7Boys(obj.getAge7Boys());
				admissionGradeOneBean.setAge7Girls(obj.getAge7Girls());
				admissionGradeOneBean.setAge8Boys(obj.getAge8Boys());
				admissionGradeOneBean.setAge8Girls(obj.getAge8Girls());
				admissionGradeOneBean.setAnganwadiBoys(obj.getAnganwadiBoys());
				admissionGradeOneBean.setAnganwadiGirls(obj.getAnganwadiGirls());
				admissionGradeOneBean.setOthSchBoys(obj.getOthSchBoys());
				admissionGradeOneBean.setOthSchGirls(obj.getOthSchGirls());
				admissionGradeOneBean.setSameSchBoys(obj.getSameSchBoys());
				admissionGradeOneBean.setSameSchGirls(obj.getSameSchGirls());
				admissionGradeOneBean.setSchoolId(obj.getSchoolId());
				admissionGradeOneBean.setUdiseSchCode(obj.getUdiseSchCode());
				admissionGradeOneBean.setPpstuLkgBoys(obj.getPpstuLkgBoys());
				admissionGradeOneBean.setPpstuLkgGirls(obj.getPpstuLkgGirls());
				admissionGradeOneBean.setPpstuUkgBoys(obj.getPpstuUkgBoys());
				admissionGradeOneBean.setPpstuUkgGirls(obj.getPpstuUkgGirls());
				//admissionEnrolReptr.add(admissionGradeOneBean);
			
		}

		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		profileResponseBean.setApiId("1234");
		profileResponseBean.setApiName("Profile Two By School Id");
		profileResponseBean.setApiVersion("v1.0.0.1");
		profileResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		profileResponseBean.setMethod("GET");
		profileResponseBean.setReleasedDate(dateFormate.format(new Date()));
		profileResponseBean.setRequestedDate(dateFormate.format(new Date()));
		profileResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		profileResponseBean.setResponseId(rand.nextInt(100000));
		combineDCFData.setAdmissionGradeOne(admissionGradeOneBean);
		// combineDCFData.setTeachersInstructors(teacherInstr);
		data.setRecords(combineDCFData);
		//data.setTotalSize(admissionEnrolReptr.size());
		data.setRecords(combineDCFData);
		profileResponseBean.setData(data);
		return profileResponseBean;

	}

	@GetMapping(value = "/fetchEnrolSocialMinorityData/{schoolId}/{year}")
	public CommenResponseBean fetchEnrolSocialMinority(@PathVariable("schoolId") Integer schoolId, @PathVariable("year") String year) {
		List<UdiseEnrolSocialMinorityCatBean> enrolSocialMinorityCatdata = new ArrayList<UdiseEnrolSocialMinorityCatBean>();
		CommenResponseBean profileResponseBean = new CommenResponseBean();
		CombineDCFData combineDCFData = new CombineDCFData();
		DataBean data = new DataBean();
		List<EnrolSocialMinorityCat> enrolSocialMinorityCat = profileOuterService.fetchEnrolSocialMinority(schoolId, year);

		if (enrolSocialMinorityCat != null && enrolSocialMinorityCat.size() > 0) {
			for (EnrolSocialMinorityCat obj : enrolSocialMinorityCat) {
				UdiseEnrolSocialMinorityCatBean enrolSocialMinorityBean = new UdiseEnrolSocialMinorityCatBean();
				enrolSocialMinorityBean.setItemId(obj.getItemId());
				enrolSocialMinorityBean.setSchoolId(obj.getSchoolId());
				enrolSocialMinorityBean.setUdiseSchCode(obj.getUdiseSchCode());
				enrolSocialMinorityBean.setModifiedTime(obj.getModifiedTime());
				enrolSocialMinorityBean.setModifiedBy(obj.getModifiedBy());
				enrolSocialMinorityBean.setItemGroup(obj.getItemGroup());
				enrolSocialMinorityBean.setCppGirls(obj.getCppGirls());
				enrolSocialMinorityBean.setCppBoys(obj.getCppBoys());
				enrolSocialMinorityBean.setC1Girls(obj.getC1Girls());
				enrolSocialMinorityBean.setC1Boys(obj.getC1Boys());
				enrolSocialMinorityBean.setC2Girls(obj.getC2Girls());
				enrolSocialMinorityBean.setC2Boys(obj.getC2Boys());
				enrolSocialMinorityBean.setC3Girls(obj.getC3Girls());
				enrolSocialMinorityBean.setC3Boys(obj.getC3Boys());
				enrolSocialMinorityBean.setC4Girls(obj.getC4Girls());
				enrolSocialMinorityBean.setC4Boys(obj.getC4Boys());
				enrolSocialMinorityBean.setC5Girls(obj.getC5Girls());
				enrolSocialMinorityBean.setC5Boys(obj.getC5Boys());
				enrolSocialMinorityBean.setC6Girls(obj.getC6Girls());
				enrolSocialMinorityBean.setC6Boys(obj.getC6Boys());
				enrolSocialMinorityBean.setC7Girls(obj.getC7Girls());
				enrolSocialMinorityBean.setC7Boys(obj.getC7Boys());
				enrolSocialMinorityBean.setC8Girls(obj.getC8Girls());
				enrolSocialMinorityBean.setC8Boys(obj.getC8Boys());
				enrolSocialMinorityBean.setC9Girls(obj.getC9Girls());
				enrolSocialMinorityBean.setC9Boys(obj.getC9Boys());
				enrolSocialMinorityBean.setC10Girls(obj.getC10Girls());
				enrolSocialMinorityBean.setC10Boys(obj.getC10Boys());
				enrolSocialMinorityBean.setC11Girls(obj.getC11Girls());
				enrolSocialMinorityBean.setC11Boys(obj.getC11Boys());
				enrolSocialMinorityBean.setC12Girls(obj.getC12Girls());
				enrolSocialMinorityBean.setC12Boys(obj.getC12Boys());
				enrolSocialMinorityBean.setAcYear(obj.getAcYear());
				enrolSocialMinorityCatdata.add(enrolSocialMinorityBean);
			}
		}
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		profileResponseBean.setApiId("1234");
		profileResponseBean.setApiName("Profile Two By School Id");
		profileResponseBean.setApiVersion("v1.0.0.1");
		profileResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		profileResponseBean.setMethod("GET");
		profileResponseBean.setReleasedDate(dateFormate.format(new Date()));
		profileResponseBean.setRequestedDate(dateFormate.format(new Date()));
		profileResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		profileResponseBean.setResponseId(rand.nextInt(100000));
		combineDCFData.setEnrolSocialMinorityCat(enrolSocialMinorityCatdata);
		// combineDCFData.setTeachersInstructors(teacherInstr);
		data.setRecords(combineDCFData);
		data.setTotalSize(enrolSocialMinorityCatdata.size());
		data.setRecords(combineDCFData);
		profileResponseBean.setData(data);
		return profileResponseBean;

	}

	@GetMapping(value = "/fetchEnrolByGradeByAgeData/{schoolId}/{year}")
	public CommenResponseBean fetchEnrolByGradeByAge(@PathVariable("schoolId") Integer schoolId , @PathVariable("year") String year) {
		List<UdiseEnrolByGradeByAgeBean> enrolByGradeByAgedata = new ArrayList<UdiseEnrolByGradeByAgeBean>();
		CommenResponseBean profileResponseBean = new CommenResponseBean();
		CombineDCFData combineDCFData = new CombineDCFData();
		DataBean data = new DataBean();
		List<EnrolByGradeByAge> enrolByGradeByAge = profileOuterService.fetchEnrolByGradeByAge(schoolId, year);

		if (enrolByGradeByAge != null && enrolByGradeByAge.size() > 0) {
			for (EnrolByGradeByAge obj : enrolByGradeByAge) {

				UdiseEnrolByGradeByAgeBean enrolByGradeByAgeBean = new UdiseEnrolByGradeByAgeBean();
				enrolByGradeByAgeBean.set_id(obj.get_id());
				enrolByGradeByAgeBean.setAcYear(obj.getAcYear());
				enrolByGradeByAgeBean.setAgeId(obj.getAgeId());
				enrolByGradeByAgeBean.setCasteId(obj.getCasteId());
				enrolByGradeByAgeBean.setUdiseSchCode(obj.getUdiseSchCode());
				enrolByGradeByAgeBean.setSchoolId(obj.getSchoolId());
				enrolByGradeByAgeBean.setModifiedTime(obj.getModifiedTime());
				enrolByGradeByAgeBean.setModifiedBy(obj.getModifiedBy());
				enrolByGradeByAgeBean.setCppBoys(obj.getCppBoys());
				enrolByGradeByAgeBean.setCppGirls(obj.getCppGirls());
				enrolByGradeByAgeBean.setC1Boys(obj.getC1Boys());
				enrolByGradeByAgeBean.setC1Girls(obj.getC1Girls());
				enrolByGradeByAgeBean.setC2Boys(obj.getC2Boys());
				enrolByGradeByAgeBean.setC2Girls(obj.getC2Girls());
				enrolByGradeByAgeBean.setC3Boys(obj.getC3Boys());
				enrolByGradeByAgeBean.setC3Girls(obj.getC3Girls());
				enrolByGradeByAgeBean.setC4Boys(obj.getC4Boys());
				enrolByGradeByAgeBean.setC4Girls(obj.getC4Girls());
				enrolByGradeByAgeBean.setC5Boys(obj.getC5Boys());
				enrolByGradeByAgeBean.setC5Girls(obj.getC5Girls());
				enrolByGradeByAgeBean.setC6Boys(obj.getC6Boys());
				enrolByGradeByAgeBean.setC6Girls(obj.getC6Girls());
				enrolByGradeByAgeBean.setC7Boys(obj.getC7Boys());
				enrolByGradeByAgeBean.setC7Girls(obj.getC7Girls());
				enrolByGradeByAgeBean.setC8Boys(obj.getC8Boys());
				enrolByGradeByAgeBean.setC8Girls(obj.getC8Girls());
				enrolByGradeByAgeBean.setC9Boys(obj.getC9Boys());
				enrolByGradeByAgeBean.setC9Girls(obj.getC9Girls());
				enrolByGradeByAgeBean.setC10Boys(obj.getC10Boys());
				enrolByGradeByAgeBean.setC10Girls(obj.getC10Girls());
				enrolByGradeByAgeBean.setC11Boys(obj.getC11Boys());
				enrolByGradeByAgeBean.setC11Girls(obj.getC11Girls());
				enrolByGradeByAgeBean.setC12Boys(obj.getC12Boys());
				enrolByGradeByAgeBean.setC12Girls(obj.getC12Girls());
				enrolByGradeByAgedata.add(enrolByGradeByAgeBean);

			}
		}

		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		profileResponseBean.setApiId("1234");
		profileResponseBean.setApiName("Profile Two By School Id");
		profileResponseBean.setApiVersion("v1.0.0.1");
		profileResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		profileResponseBean.setMethod("GET");
		profileResponseBean.setReleasedDate(dateFormate.format(new Date()));
		profileResponseBean.setRequestedDate(dateFormate.format(new Date()));
		profileResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		profileResponseBean.setResponseId(rand.nextInt(100000));
		combineDCFData.setEnrolByGradeByAge(enrolByGradeByAgedata);
		// combineDCFData.setTeachersInstructors(teacherInstr);
		data.setRecords(combineDCFData);
		data.setTotalSize(enrolByGradeByAgedata.size());
		data.setRecords(combineDCFData);
		profileResponseBean.setData(data);
		return profileResponseBean;

	}

	@GetMapping(value = "/fetchEnrolByMediumOfInstData/{schoolId}/{year}")
	public CommenResponseBean fetchEnrolByMediumOfInst(@PathVariable("schoolId") Integer schoolId, @PathVariable("year") String year) {
		List<UdiseEnrolByMediumOfInstBean> enrolByMediumOfInstdata = new ArrayList<UdiseEnrolByMediumOfInstBean>();
		CommenResponseBean profileResponseBean = new CommenResponseBean();
		CombineDCFData combineDCFData = new CombineDCFData();
		DataBean data = new DataBean();
		List<EnrolByMediumOfInst> enrolByMediumOfInst = profileOuterService.fetchEnrolByMediumOfInst(schoolId,year);

		if (enrolByMediumOfInst != null && enrolByMediumOfInst.size() > 0) {
			for (EnrolByMediumOfInst obj : enrolByMediumOfInst) {

				UdiseEnrolByMediumOfInstBean enrolByMediumOfInstBean = new UdiseEnrolByMediumOfInstBean();
				enrolByMediumOfInstBean.setSchoolId(obj.getSchoolId());
				enrolByMediumOfInstBean.setUdiseSchCode(obj.getUdiseSchCode());
				enrolByMediumOfInstBean.setMedinstrType(
						StaticMasterUtilityMethodes.fetchMediumAvailabilityWthtCode(obj.getMedinstrType()));
				enrolByMediumOfInstBean.setMedinstrSeq(obj.getMedinstrSeq());
				enrolByMediumOfInstBean.setCppBoys(obj.getCppBoys());
				enrolByMediumOfInstBean.setCppGirls(obj.getCppGirls());
				enrolByMediumOfInstBean.setC1Boys(obj.getC1Boys());
				enrolByMediumOfInstBean.setC1Girls(obj.getC1Girls());
				enrolByMediumOfInstBean.setC2Boys(obj.getC2Boys());
				enrolByMediumOfInstBean.setC2Girls(obj.getC2Girls());
				enrolByMediumOfInstBean.setC3Boys(obj.getC3Boys());
				enrolByMediumOfInstBean.setC3Girls(obj.getC3Girls());
				enrolByMediumOfInstBean.setC4Boys(obj.getC4Boys());
				enrolByMediumOfInstBean.setC4Girls(obj.getC4Girls());
				enrolByMediumOfInstBean.setC5Boys(obj.getC5Boys());
				enrolByMediumOfInstBean.setC5Girls(obj.getC5Girls());
				enrolByMediumOfInstBean.setC6Boys(obj.getC6Boys());
				enrolByMediumOfInstBean.setC6Girls(obj.getC6Girls());
				enrolByMediumOfInstBean.setC7Boys(obj.getC7Boys());
				enrolByMediumOfInstBean.setC7Girls(obj.getC7Girls());
				enrolByMediumOfInstBean.setC8Boys(obj.getC8Boys());
				enrolByMediumOfInstBean.setC8Girls(obj.getC8Girls());
				enrolByMediumOfInstBean.setC9Boys(obj.getC9Boys());
				enrolByMediumOfInstBean.setC9Girls(obj.getC9Girls());
				enrolByMediumOfInstBean.setC10Boys(obj.getC10Boys());
				enrolByMediumOfInstBean.setC10Girls(obj.getC10Girls());
				enrolByMediumOfInstBean.setC11Boys(obj.getC11Boys());
				enrolByMediumOfInstBean.setC11Girls(obj.getC11Girls());
				enrolByMediumOfInstBean.setC12Boys(obj.getC12Boys());
				enrolByMediumOfInstBean.setC12Girls(obj.getC12Girls());
				enrolByMediumOfInstBean.setModifiedBy(obj.getModifiedBy());
				enrolByMediumOfInstBean.setModifiedTime(obj.getModifiedTime());
				enrolByMediumOfInstBean.setAcYear(obj.getAcYear());
				enrolByMediumOfInstBean.setCreatedTime(obj.getCreatedTime());
				enrolByMediumOfInstdata.add(enrolByMediumOfInstBean);
			}
		}

		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		profileResponseBean.setApiId("1234");
		profileResponseBean.setApiName("Profile Two By School Id");
		profileResponseBean.setApiVersion("v1.0.0.1");
		profileResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		profileResponseBean.setMethod("GET");
		profileResponseBean.setReleasedDate(dateFormate.format(new Date()));
		profileResponseBean.setRequestedDate(dateFormate.format(new Date()));
		profileResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		profileResponseBean.setResponseId(rand.nextInt(100000));
		combineDCFData.setEnrolByMediumOfInst(enrolByMediumOfInstdata);
		// combineDCFData.setTeachersInstructors(teacherInstr);
		data.setRecords(combineDCFData);
		data.setTotalSize(enrolByMediumOfInstdata.size());
		data.setRecords(combineDCFData);
		profileResponseBean.setData(data);
		return profileResponseBean;

	}

	@SuppressWarnings("unlikely-arg-type")
	@GetMapping(value = "/fetchReptrSocialMinorityCatData/{schoolId}/{year}")
	public CommenResponseBean fetchReptrSocialMinorityCat(@PathVariable("schoolId") Integer schoolId , @PathVariable("year") String year) {
		List<UdiseReptrSocialMinorityCatBean> reptrSocialMinorityCatdata = new ArrayList<UdiseReptrSocialMinorityCatBean>();
		CommenResponseBean profileResponseBean = new CommenResponseBean();
		CombineDCFData combineDCFData = new CombineDCFData();
		DataBean data = new DataBean();
		List<ReptrSocialMinorityCat> reptrSocialMinorityCat = profileOuterService.fetchReptrSocialMinorityCat(schoolId,year);

		if (reptrSocialMinorityCat != null && reptrSocialMinorityCat.size() > 0) {
			for (ReptrSocialMinorityCat obj : reptrSocialMinorityCat) {

				UdiseReptrSocialMinorityCatBean reptrSocialMinorityBean = new UdiseReptrSocialMinorityCatBean();
				reptrSocialMinorityBean.set_id(obj.get_id());
				reptrSocialMinorityBean.setAcYear(obj.getAcYear());
				reptrSocialMinorityBean.setUdiseSchCode(obj.getUdiseSchCode());
				reptrSocialMinorityBean.setSchoolId(obj.getSchoolId());
				reptrSocialMinorityBean.setModifiedTime(obj.getModifiedTime());
				reptrSocialMinorityBean.setModifiedBy(obj.getModifiedBy());
				if (obj.getItemGroup().equals("1")) {
					reptrSocialMinorityBean
							.setItemId(StaticMasterUtilityMethodes.fetchSocailCategoryDataWthtCode(obj.getItemId()));
				}else if(obj.getItemGroup().equals("2")) {
					reptrSocialMinorityBean.setItemId(StaticMasterUtilityMethodes.fetchTMinSchTypeWthtCode(obj.getItemId()));
				}
				reptrSocialMinorityBean.setItemGroup(obj.getItemGroup());
				reptrSocialMinorityBean.setCppBoys(obj.getCppBoys());
				reptrSocialMinorityBean.setCppGirls(obj.getCppGirls());
				reptrSocialMinorityBean.setC1Boys(obj.getC1Boys());
				reptrSocialMinorityBean.setC1Girls(obj.getC1Girls());
				reptrSocialMinorityBean.setC2Boys(obj.getC2Boys());
				reptrSocialMinorityBean.setC2Girls(obj.getC2Girls());
				reptrSocialMinorityBean.setC3Boys(obj.getC3Boys());
				reptrSocialMinorityBean.setC3Girls(obj.getC3Girls());
				reptrSocialMinorityBean.setC4Boys(obj.getC4Boys());
				reptrSocialMinorityBean.setC4Girls(obj.getC4Girls());
				reptrSocialMinorityBean.setC5Boys(obj.getC5Boys());
				reptrSocialMinorityBean.setC5Girls(obj.getC5Girls());
				reptrSocialMinorityBean.setC6Boys(obj.getC6Boys());
				reptrSocialMinorityBean.setC6Girls(obj.getC6Girls());
				reptrSocialMinorityBean.setC7Boys(obj.getC7Boys());
				reptrSocialMinorityBean.setC7Girls(obj.getC7Girls());
				reptrSocialMinorityBean.setC8Boys(obj.getC8Boys());
				reptrSocialMinorityBean.setC8Girls(obj.getC8Girls());
				reptrSocialMinorityBean.setC9Boys(obj.getC9Boys());
				reptrSocialMinorityBean.setC9Girls(obj.getC9Girls());
				reptrSocialMinorityBean.setC10Boys(obj.getC10Boys());
				reptrSocialMinorityBean.setC10Girls(obj.getC10Girls());
				reptrSocialMinorityBean.setC11Boys(obj.getC11Boys());
				reptrSocialMinorityBean.setC11Girls(obj.getC11Girls());
				reptrSocialMinorityBean.setC12Boys(obj.getC12Boys());
				reptrSocialMinorityBean.setC12Girls(obj.getC12Girls());
				reptrSocialMinorityCatdata.add(reptrSocialMinorityBean);
			}
		}

		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		profileResponseBean.setApiId("1234");
		profileResponseBean.setApiName("Profile Two By School Id");
		profileResponseBean.setApiVersion("v1.0.0.1");
		profileResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		profileResponseBean.setMethod("GET");
		profileResponseBean.setReleasedDate(dateFormate.format(new Date()));
		profileResponseBean.setRequestedDate(dateFormate.format(new Date()));
		profileResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		profileResponseBean.setResponseId(rand.nextInt(100000));
		combineDCFData.setReptrSocialMinorityCat(reptrSocialMinorityCatdata);
		// combineDCFData.setTeachersInstructors(teacherInstr);
		data.setRecords(combineDCFData);
		data.setTotalSize(reptrSocialMinorityCatdata.size());
		data.setRecords(combineDCFData);
		profileResponseBean.setData(data);
		return profileResponseBean;
	}
	
	
	@GetMapping(value = "/fetchEnrolByCwsnData/{schoolId}/{year}")
	public CommenResponseBean fetchEnrolByCwsn(@PathVariable("schoolId") Integer schoolId, @PathVariable("year") String year) {
		List<UdiseEnrolByCwsnBean> enrolByCwsndata = new ArrayList<UdiseEnrolByCwsnBean>();
		CommenResponseBean profileResponseBean = new CommenResponseBean();
		CombineDCFData combineDCFData = new CombineDCFData();
		DataBean data = new DataBean();
		List<EnrolByCwsn> enrolByCwsn = profileOuterService.fetchEnrolByCwsn(schoolId,year);

		if (enrolByCwsn != null && enrolByCwsn.size() > 0) {
			for (EnrolByCwsn obj : enrolByCwsn) {

				UdiseEnrolByCwsnBean enrolByCwsnBean = new UdiseEnrolByCwsnBean();
				enrolByCwsnBean.set_id(obj.get_id());
				enrolByCwsnBean.setAcYear(obj.getAcYear());
				enrolByCwsnBean.setUdiseSchCode(obj.getUdiseSchCode());
				enrolByCwsnBean.setSchoolId(obj.getSchoolId());
				enrolByCwsnBean.setModifiedTime(obj.getModifiedTime());
				enrolByCwsnBean.setModifiedBy(obj.getModifiedBy());
				enrolByCwsnBean.setDisabilityType(obj.getDisabilityType());
				enrolByCwsnBean.setDisabilityValue(StaticMasterUtilityMethodes.fetchEnrolByCwsn(obj.getDisabilityType()));
				enrolByCwsnBean.setCppBoys(obj.getCppBoys());
				enrolByCwsnBean.setCppGirls(obj.getCppGirls());
				enrolByCwsnBean.setC1Boys(obj.getC1Boys());
				enrolByCwsnBean.setC1Girls(obj.getC1Girls());
				enrolByCwsnBean.setC2Boys(obj.getC1Boys());
				enrolByCwsnBean.setC2Girls(obj.getC1Girls());
				enrolByCwsnBean.setC3Boys(obj.getC1Boys());
				enrolByCwsnBean.setC3Girls(obj.getC1Girls());
				enrolByCwsnBean.setC4Boys(obj.getC1Boys());
				enrolByCwsnBean.setC4Girls(obj.getC1Girls());
				enrolByCwsnBean.setC5Boys(obj.getC1Boys());
				enrolByCwsnBean.setC5Girls(obj.getC1Girls());
				enrolByCwsnBean.setC6Boys(obj.getC1Boys());
				enrolByCwsnBean.setC6Girls(obj.getC1Girls());
				enrolByCwsnBean.setC7Boys(obj.getC1Boys());
				enrolByCwsnBean.setC7Girls(obj.getC1Girls());
				enrolByCwsnBean.setC8Boys(obj.getC1Boys());
				enrolByCwsnBean.setC8Girls(obj.getC1Girls());
				enrolByCwsnBean.setC9Boys(obj.getC1Boys());
				enrolByCwsnBean.setC9Girls(obj.getC1Girls());
				enrolByCwsnBean.setC10Boys(obj.getC1Boys());
				enrolByCwsnBean.setC10Girls(obj.getC1Girls());
				enrolByCwsnBean.setC11Boys(obj.getC1Boys());
				enrolByCwsnBean.setC11Girls(obj.getC1Girls());
				enrolByCwsnBean.setC12Boys(obj.getC1Boys());
				enrolByCwsnBean.setC12Girls(obj.getC1Girls());
				enrolByCwsndata.add(enrolByCwsnBean);
			}
		}
		
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		profileResponseBean.setApiId("1234");
		profileResponseBean.setApiName("Profile Two By School Id");
		profileResponseBean.setApiVersion("v1.0.0.1");
		profileResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		profileResponseBean.setMethod("GET");
		profileResponseBean.setReleasedDate(dateFormate.format(new Date()));
		profileResponseBean.setRequestedDate(dateFormate.format(new Date()));
		profileResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		profileResponseBean.setResponseId(rand.nextInt(100000));
		combineDCFData.setEnrolByCwsn(enrolByCwsndata);
		// combineDCFData.setTeachersInstructors(teacherInstr);
		data.setRecords(combineDCFData);
		data.setTotalSize(enrolByCwsndata.size());
		data.setRecords(combineDCFData);
		profileResponseBean.setData(data);
		return profileResponseBean;
	}
	
	
	
	@GetMapping(value = "/fetchEnrolReptrByAcademicStreamData/{schoolId}/{year}")
	public CommenResponseBean fetchEnrolReptrByAcademicStream(@PathVariable("schoolId") Integer schoolId, @PathVariable("year") String year) {
		List<UdiseEnrolReptrByAcademicStreamBean> enrolReptrByAcademicStreamdata = new ArrayList<UdiseEnrolReptrByAcademicStreamBean>();
		CommenResponseBean profileResponseBean = new CommenResponseBean();
		CombineDCFData combineDCFData = new CombineDCFData();
		DataBean data = new DataBean();
		List<EnrolReptrByAcademicStream> enrolReptrByAcademicStream = profileOuterService.fetchEnrolReptrByAcademicStream(schoolId, year);

		if (enrolReptrByAcademicStream != null && enrolReptrByAcademicStream.size() > 0) {
			for (EnrolReptrByAcademicStream obj : enrolReptrByAcademicStream) {

				UdiseEnrolReptrByAcademicStreamBean enrolReptrByAcademicStreamBean = new UdiseEnrolReptrByAcademicStreamBean();
				
				enrolReptrByAcademicStreamBean.set_id(obj.get_id());
				enrolReptrByAcademicStreamBean.setAcYear(obj.getAcYear());
				enrolReptrByAcademicStreamBean.setCasteId(obj.getCasteId());
				enrolReptrByAcademicStreamBean.setCastevalue(StaticMasterUtilityMethodes.fetchEnrolReptrByAcademicStream(obj.getCasteId()));
				enrolReptrByAcademicStreamBean.setCreatedTime(obj.getCreatedTime());
				enrolReptrByAcademicStreamBean.setUdiseSchCode(obj.getUdiseSchCode());
				enrolReptrByAcademicStreamBean.setStreamId(StaticMasterUtilityMethodes.fetchEnrolReptrByAcademicStream(obj.getStreamId()));
				enrolReptrByAcademicStreamBean.setSchoolId(obj.getSchoolId());
				enrolReptrByAcademicStreamBean.setModifiedBy(obj.getModifiedBy());
				enrolReptrByAcademicStreamBean.setModifiedTime(obj.getModifiedTime());
				enrolReptrByAcademicStreamBean.setEc11Boys(obj.getEc11Boys());
				enrolReptrByAcademicStreamBean.setEc11Girls(obj.getEc11Girls());
				enrolReptrByAcademicStreamBean.setEc12Boys(obj.getEc12Boys());
				enrolReptrByAcademicStreamBean.setEc12Girls(obj.getEc12Girls());
				enrolReptrByAcademicStreamBean.setRc11Boys(obj.getRc11Boys());
				enrolReptrByAcademicStreamBean.setRc11Girls(obj.getRc11Girls());
				enrolReptrByAcademicStreamBean.setRc12Boys(obj.getRc12Boys());
				enrolReptrByAcademicStreamBean.setRc12Girls(obj.getRc12Girls());
				enrolReptrByAcademicStreamdata.add(enrolReptrByAcademicStreamBean);
			}
		}
		
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
		profileResponseBean.setApiId("1234");
		profileResponseBean.setApiName("Profile Two By School Id");
		profileResponseBean.setApiVersion("v1.0.0.1");
		profileResponseBean.setDevelopedBy("UDISE Plus Team, NIC");
		profileResponseBean.setMethod("GET");
		profileResponseBean.setReleasedDate(dateFormate.format(new Date()));
		profileResponseBean.setRequestedDate(dateFormate.format(new Date()));
		profileResponseBean.setAuthenticationType("NONE");
		Random rand = new Random();
		profileResponseBean.setResponseId(rand.nextInt(100000));
		combineDCFData.setEnrolreptrByAcademicStream(enrolReptrByAcademicStreamdata);
		// combineDCFData.setTeachersInstructors(teacherInstr);
		data.setRecords(combineDCFData);
		data.setTotalSize(enrolReptrByAcademicStreamdata.size());
		data.setRecords(combineDCFData);
		profileResponseBean.setData(data);
		return profileResponseBean;
		
	}
}
