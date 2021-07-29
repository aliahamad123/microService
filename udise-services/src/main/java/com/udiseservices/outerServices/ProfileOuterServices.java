package com.udiseservices.outerServices;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.udiseservices.models.AdmissionGradeOne;
import com.udiseservices.models.EnrolByGradeByAge;
import com.udiseservices.models.EnrolSocialMinorityCat;
import com.udiseservices.models.SchFacilityFour;
import com.udiseservices.models.SchFacilityOne;
import com.udiseservices.models.SchFacilityThree;
import com.udiseservices.models.SchFacilityTwo;
import com.udiseservices.models.SchManagement;
import com.udiseservices.models.SchProfileFour;
import com.udiseservices.models.SchProfileOne;
import com.udiseservices.models.SchProfileThree;
import com.udiseservices.models.SchProfileTwo;
import com.udiseservices.models.TeacherOne;
import com.udiseservices.models.TeacherProfileTwo;
import com.udiseservices.models.EnrolReptrByAcademicStream;
import com.udiseservices.models.EnrolByCwsn;
import com.udiseservices.models.ReptrSocialMinorityCat;
import com.udiseservices.models.EnrolByMediumOfInst;

//@FeignClient(name="dcf-service" ,url ="http://10.247.141.227:8001")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@FeignClient(name="dcf-service")
public interface ProfileOuterServices {
	
	@GetMapping(value = "/fetchSchProfileOne/{schoolId}/{year}")
	public SchProfileOne fetchSchProfileOne(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/fetchSchProfileTwo/{schoolId}/{year}")
	public SchProfileTwo fetchSchProfileTwo(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/fetchSchProfileThree/{schoolId}/{year}")
	public SchProfileThree fetchSchProfileThree(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/fetchSchProfileFour/{schoolId}/{year}")
	public SchProfileFour fetchSchProfileFour(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/fetchSchManagement/{schoolId}/{year}")
	public SchManagement fetchSchManagement(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/fetchSchFacilityOne/{schoolId}/{year}")
	public SchFacilityOne fetchSchFacilityOne(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/fetchSchFacilityTwo/{schoolId}/{year}")
	public SchFacilityTwo fetchSchFacilityTwo(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/fetchSchFacilityThree/{schoolId}/{year}")
	public SchFacilityThree fetchSchFacilityThree(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/fetchSchFacilityFour/{schoolId}/{year}")
	public SchFacilityFour fetchSchFacilityFour(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/fetchSchTeacherOne/{schoolId}/{year}")
	public TeacherOne fetchSchTeacherOne(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/fetchSchTeacherProfile/{schoolId}")
	public List<TeacherProfileTwo> fetchSchTeacherProfile(@PathVariable("schoolId") String schoolId);
	
	@GetMapping(value = "/fetchSchAdmissionGradeOne/{schoolId}/{year}")
	public AdmissionGradeOne fetchSchAdmissGrade(@PathVariable("schoolId") String schoolId,@PathVariable("year") String year);
	
	@GetMapping(value = "/fetchEnrolSocialMinority/{schoolId}/{year}")
	public List<EnrolSocialMinorityCat> fetchEnrolSocialMinority(@PathVariable("schoolId") String schoolId, @PathVariable("year") String year);
	
	@GetMapping(value = "/fetchEnrolByGradeByAge/{schoolId}/{year}")
	public List<EnrolByGradeByAge> fetchEnrolByGradeByAge(@PathVariable("schoolId") String schoolId, @PathVariable("year") String year);
	
	@GetMapping(value = "/fetchEnrolByMediumOfInst/{schoolId}/{year}")
	public List<EnrolByMediumOfInst> fetchEnrolByMediumOfInst(@PathVariable("schoolId") String schoolId , @PathVariable("year") String year);
	
	@GetMapping(value = "/fetchReptrSocialMinorityCat/{schoolId}/{year}")
	public List<ReptrSocialMinorityCat> fetchReptrSocialMinorityCat(@PathVariable("schoolId") String schoolId , @PathVariable("year") String year);
	
	@GetMapping(value = "/fetchEnrolByCwsn/{schoolId}/{year}")
	public List<EnrolByCwsn> fetchEnrolByCwsn(@PathVariable("schoolId") String schoolId, @PathVariable("year") String year);
	
	@GetMapping(value = "/fetchEnrolReptrByAcademicStream/{schoolId}/{year}")
	public List<EnrolReptrByAcademicStream> fetchEnrolReptrByAcademicStream(@PathVariable("schoolId") String schoolId, @PathVariable("year") String year);
}
