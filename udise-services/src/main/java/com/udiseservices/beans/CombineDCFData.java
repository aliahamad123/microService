package com.udiseservices.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class CombineDCFData {

	@JsonInclude(content = Include.NON_NULL)
	private Object category;

	@JsonInclude(content = Include.NON_NULL)
	private Object language;

	@JsonInclude(content = Include.NON_NULL)
	private Object rteNorms;

	@JsonInclude(content = Include.NON_NULL)
	private Object management;
	
	@JsonInclude(content = Include.NON_NULL)
	private Object classRoom;

	@JsonInclude(content = Include.NON_NULL)
	private Object toilet;
	
	@JsonInclude(content = Include.NON_NULL)
	private Object physicalFacility;

	@JsonInclude(content = Include.NON_NULL)
	private Object ictFacility;
	
	@JsonInclude(content = Include.NON_NULL)
	private Object teachingNonTeachingStaff;

	@JsonInclude(content = Include.NON_NULL)
	private Object teachersInstructors;
	
	@JsonInclude(content = Include.NON_NULL)
	private Object admissionGradeOne;
	
	@JsonInclude(content = Include.NON_NULL)
	private Object enrolSocialMinorityCat;
	
	@JsonInclude(content = Include.NON_NULL)
	private Object enrolByGradeByAge;
	
	@JsonInclude(content = Include.NON_NULL)
	private Object enrolByMediumOfInst;
	
	@JsonInclude(content = Include.NON_NULL)
	private Object reptrSocialMinorityCat;
	
	@JsonInclude(content = Include.NON_NULL)
	private Object enrolByCwsn;
	
	@JsonInclude(content = Include.NON_NULL)
	private Object enrolreptrByAcademicStream;
	
	
	

	public Object getEnrolreptrByAcademicStream() {
		return enrolreptrByAcademicStream;
	}

	public void setEnrolreptrByAcademicStream(Object enrolreptrByAcademicStream) {
		this.enrolreptrByAcademicStream = enrolreptrByAcademicStream;
	}

	public Object getEnrolByCwsn() {
		return enrolByCwsn;
	}

	public void setEnrolByCwsn(Object enrolByCwsn) {
		this.enrolByCwsn = enrolByCwsn;
	}

	public Object getReptrSocialMinorityCat() {
		return reptrSocialMinorityCat;
	}

	public void setReptrSocialMinorityCat(Object reptrSocialMinorityCat) {
		this.reptrSocialMinorityCat = reptrSocialMinorityCat;
	}

	public Object getEnrolByMediumOfInst() {
		return enrolByMediumOfInst;
	}

	public void setEnrolByMediumOfInst(Object enrolByMediumOfInst) {
		this.enrolByMediumOfInst = enrolByMediumOfInst;
	}

	public Object getEnrolByGradeByAge() {
		return enrolByGradeByAge;
	}

	public void setEnrolByGradeByAge(Object enrolByGradeByAge) {
		this.enrolByGradeByAge = enrolByGradeByAge;
	}

	public Object getEnrolSocialMinorityCat() {
		return enrolSocialMinorityCat;
	}

	public void setEnrolSocialMinorityCat(Object enrolSocialMinorityCat) {
		this.enrolSocialMinorityCat = enrolSocialMinorityCat;
	}

	public Object getTeachersInstructors() {
		return teachersInstructors;
	}

	public void setTeachersInstructors(Object teachersInstructors) {
		this.teachersInstructors = teachersInstructors;
	}

	public Object getAdmissionGradeOne() {
		return admissionGradeOne;
	}

	public void setAdmissionGradeOne(Object admissionGradeOne) {
		this.admissionGradeOne = admissionGradeOne;
	}

	public Object getTeachingNonTeachingStaff() {
		return teachingNonTeachingStaff;
	}

	public void setTeachingNonTeachingStaff(Object teachingNonTeachingStaff) {
		this.teachingNonTeachingStaff = teachingNonTeachingStaff;
	}

	public Object getPhysicalFacility() {
		return physicalFacility;
	}

	public void setPhysicalFacility(Object physicalFacility) {
		this.physicalFacility = physicalFacility;
	}

	public Object getIctFacility() {
		return ictFacility;
	}

	public void setIctFacility(Object ictFacility) {
		this.ictFacility = ictFacility;
	}

	public Object getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(Object classRoom) {
		this.classRoom = classRoom;
	}

	public Object getToilet() {
		return toilet;
	}

	public void setToilet(Object toilet) {
		this.toilet = toilet;
	}

	public Object getCategory() {
		return category;
	}

	public void setCategory(Object category) {
		this.category = category;
	}

	public Object getLanguage() {
		return language;
	}

	public void setLanguage(Object language) {
		this.language = language;
	}

	public Object getRteNorms() {
		return rteNorms;
	}

	public void setRteNorms(Object rteNorms) {
		this.rteNorms = rteNorms;
	}

	public Object getManagement() {
		return management;
	}

	public void setManagement(Object management) {
		this.management = management;
	}

}
