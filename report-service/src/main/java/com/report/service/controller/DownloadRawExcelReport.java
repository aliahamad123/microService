package com.report.service.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.report.service.model.RawSchoolEnrolment;
import com.report.service.repo.RawSchoolEnrolmentRepo;

@RestController
public class DownloadRawExcelReport {
	
	//@Autowired
	//RawSchEnrolmentRepoImpl rawSchEnrolmentRepoImpl;
	@Autowired
	RawSchoolEnrolmentRepo rawSchoolEnrolmentRepo;
	
	@GetMapping(value = "/getExeclReport/{schoolId}")
	public Optional<RawSchoolEnrolment> getExcelReportBySchoolId(@PathVariable("schoolId") Integer schoolId) {
		
		Optional<RawSchoolEnrolment> rawSchoolEnrolment = null;
		rawSchoolEnrolment = rawSchoolEnrolmentRepo.findById(schoolId);
		 return rawSchoolEnrolment;
	}

}
