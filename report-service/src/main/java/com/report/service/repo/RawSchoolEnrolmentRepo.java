package com.report.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.report.service.model.RawSchoolEnrolment;


@Repository
public interface RawSchoolEnrolmentRepo extends JpaRepository<RawSchoolEnrolment, Integer>{
	
	//public RawSchoolEnrolment fetchEnrolmentDetailsBySchId(Integer schoolId);

}
