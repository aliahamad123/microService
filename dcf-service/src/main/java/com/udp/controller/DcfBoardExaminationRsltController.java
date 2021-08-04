package com.udp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udp.models.BoardExamPrevAcademicYear;
import com.udp.models.NumOfRegularStudentsPassed;
import com.udp.models.OthrThanNumOfRegularStudentsPassed;
import com.udp.models.RsltOfGradeXIIBrdExamPrevAcadYearOthrRgulrStdnt;
import com.udp.models.RsltOfGradeXIIBrdExamPrevAcadYearrgulrStdnt;
import com.udp.models.RsltOfGradeXIIBrdExamRngOfMarkOthrRgulrStdnt;
import com.udp.models.RsltOfGradeXIIBrdExamRngOfMarkRgulrStdnt;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DcfBoardExaminationRsltController {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@GetMapping(value = "/fetchFacilitiesProvidedChildrenOneToFive/{schoolId}/{year}")
	public BoardExamPrevAcademicYear fetchBoardExamPreviousAcademicYear(@PathVariable("schoolId")String schoolId, @PathVariable("year") String year) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("year").is(year));
		BoardExamPrevAcademicYear boardExamPrevAcademicYearData = mongoTemplate.findOne(query, BoardExamPrevAcademicYear.class);
		return boardExamPrevAcademicYearData;
		
	}
	
	@GetMapping(value = "/fetchNumOfRegularStudentsPassed/{schoolId}/{year}")
	public NumOfRegularStudentsPassed fetchNumOfRegularStudentsPassed(@PathVariable("schoolId")String schoolId, @PathVariable("year") String year) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("year").is(year));
		NumOfRegularStudentsPassed numOfRegularStudentsPassedData = mongoTemplate.findOne(query, NumOfRegularStudentsPassed.class);
		return numOfRegularStudentsPassedData;
		
	}
	
	@GetMapping(value = "/fetchOthrThanNumOfRegularStudentsPassed/{schoolId}/{year}")
	public OthrThanNumOfRegularStudentsPassed fetchOthrThanNumOfRegularStudentsPassed(@PathVariable("schoolId")String schoolId, @PathVariable("year") String year) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("year").is(year));
		OthrThanNumOfRegularStudentsPassed othrThanNumOfRegularStudentsPassedData = mongoTemplate.findOne(query, OthrThanNumOfRegularStudentsPassed.class);
		return othrThanNumOfRegularStudentsPassedData;
		
	}
	
	@GetMapping(value = "/fetchRsltOfGradeXIIBrdExamPrevAcadYearRgulrStdnt/{schoolId}/{year}")
	public RsltOfGradeXIIBrdExamPrevAcadYearrgulrStdnt fetchRsltOfGradeXIIBrdExamPrevAcadYearRgulrStdnt(@PathVariable("schoolId")String schoolId, @PathVariable("year") String year) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("year").is(year));
		RsltOfGradeXIIBrdExamPrevAcadYearrgulrStdnt rsltOfGradeXIIBrdExamPrevAcadYearData = mongoTemplate.findOne(query, RsltOfGradeXIIBrdExamPrevAcadYearrgulrStdnt.class);
		return rsltOfGradeXIIBrdExamPrevAcadYearData;
		
	}
	
	@GetMapping(value = "/fetchRsltOfGradeXIIBrdExamPrevAcadYearOthrRgulrStdnt/{schoolId}/{year}")
	public RsltOfGradeXIIBrdExamPrevAcadYearOthrRgulrStdnt fetchRsltOfGradeXIIBrdExamPrevAcadYearOthrRgulrStdnt(@PathVariable("schoolId")String schoolId, @PathVariable("year") String year) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("year").is(year));
		RsltOfGradeXIIBrdExamPrevAcadYearOthrRgulrStdnt rsltOfGradeXIIBrdExamPrevAcadYearOthrRgulrStdntData = mongoTemplate.findOne(query, RsltOfGradeXIIBrdExamPrevAcadYearOthrRgulrStdnt.class);
		return rsltOfGradeXIIBrdExamPrevAcadYearOthrRgulrStdntData;
		
	}
	
	@GetMapping(value = "/fetchRsltOfGradeXIIBrdExamRngOfMarkRgulrStdnt/{schoolId}/{year}")
	public RsltOfGradeXIIBrdExamRngOfMarkRgulrStdnt fetchRsltOfGradeXIIBrdExamRngOfMarkRgulrStdnt(@PathVariable("schoolId")String schoolId, @PathVariable("year") String year) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("year").is(year));
		RsltOfGradeXIIBrdExamRngOfMarkRgulrStdnt rsltOfGradeXIIBrdExamRngOfMarkRgulrStdntData = mongoTemplate.findOne(query, RsltOfGradeXIIBrdExamRngOfMarkRgulrStdnt.class);
		return rsltOfGradeXIIBrdExamRngOfMarkRgulrStdntData;
		
	}
	
	@GetMapping(value = "/fetchRsltOfGradeXIIBrdExamRngOfMarkOthrRgulrStdnt/{schoolId}/{year}")
	public RsltOfGradeXIIBrdExamRngOfMarkOthrRgulrStdnt fetchRsltOfGradeXIIBrdExamRngOfMarkOthrRgulrStdnt(@PathVariable("schoolId")String schoolId, @PathVariable("year") String year) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("schoolId").is(schoolId).and("year").is(year));
		RsltOfGradeXIIBrdExamRngOfMarkOthrRgulrStdnt rsltOfGradeXIIBrdExamRngOfMarkOthrRgulrStdnt = mongoTemplate.findOne(query, RsltOfGradeXIIBrdExamRngOfMarkOthrRgulrStdnt.class);
		return rsltOfGradeXIIBrdExamRngOfMarkOthrRgulrStdnt;
		
	}

}
