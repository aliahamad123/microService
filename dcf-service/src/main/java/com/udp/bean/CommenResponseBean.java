package com.udp.bean;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class CommenResponseBean {

	@JsonInclude(Include.NON_NULL)
	private String apiId;

	@JsonInclude(Include.NON_NULL)
	private String apiName;

	@JsonInclude(Include.NON_NULL)
	private String apiVersion;

	@JsonInclude(Include.NON_NULL)
	private String developedBy;

	@JsonInclude(Include.NON_NULL)
	private String method;

	@JsonInclude(Include.NON_NULL)
	private String releasedDate;
	
	@JsonInclude(Include.NON_NULL)
	private String requestedDate;
	
	@JsonInclude(Include.NON_NULL)
	private String requestedBy;

	@JsonInclude(Include.NON_NULL)
	private Integer responseId;
	
	@JsonInclude(Include.NON_NULL)
	private String authenticationType;
	
	@JsonInclude(Include.NON_NULL)
	private Object data;
	
	@JsonInclude(Include.NON_NULL)
	private Integer numberOfElement;
	
	@JsonInclude(Include.NON_NULL)
	private Integer totalPage;
	
	@JsonInclude(Include.NON_NULL)
	private Long totalElement;
	
	private Integer statuscode;
	private String statusmessage = "";	
	

	public String getAuthenticationType() {
		return authenticationType;
	}
	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}
	public String getRequestedDate() {
		return requestedDate;
	}
	public void setRequestedDate(String requestedDate) {
		this.requestedDate = requestedDate;
	}
	public Integer getNumberOfElement() {
		return numberOfElement;
	}
	public void setNumberOfElement(Integer numberOfElement) {
		this.numberOfElement = numberOfElement;
	}

	public Long getTotalElement() {
		return totalElement;
	}
	public void setTotalElement(Long totalElement) {
		this.totalElement = totalElement;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public String getApiId() {
		return apiId;
	}
	public void setApiId(String apiId) {
		this.apiId = apiId;
	}
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public String getApiVersion() {
		return apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}
	public String getDevelopedBy() {
		return developedBy;
	}
	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getReleasedDate() {
		return releasedDate;
	}
	public void setReleasedDate(String releasedDate) {
		this.releasedDate = releasedDate;
	}
	public String getRequestedBy() {
		return requestedBy;
	}
	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}
	public Integer getResponseId() {
		return responseId;
	}
	public void setResponseId(Integer responseId) {
		this.responseId = responseId;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Integer getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(Integer statuscode) {
		this.statuscode = statuscode;
	}
	public String getStatusmessage() {
		return statusmessage;
	}
	public void setStatusmessage(String statusmessage) {
		this.statusmessage = statusmessage;
	}
	
}
