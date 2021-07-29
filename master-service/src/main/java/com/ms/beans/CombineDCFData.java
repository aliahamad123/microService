package com.ms.beans;

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
