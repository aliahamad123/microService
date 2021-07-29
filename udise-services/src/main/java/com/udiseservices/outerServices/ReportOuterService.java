package com.udiseservices.outerServices;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.udiseservices.beans.RawSchoolEnrolment;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@FeignClient(name="report-service")
public interface ReportOuterService {
	
	@GetMapping(value = "/getExeclReport/{schoolId}")
	public Optional<RawSchoolEnrolment> getExcelReportBySchoolId(@PathVariable("schoolId") Integer schoolId);

}
