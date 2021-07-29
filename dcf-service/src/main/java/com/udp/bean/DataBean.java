package com.udp.bean;

public class DataBean {
	   
	private String limit;
	private Integer startRecord;
	private Integer endRecord;
	private Integer totalSize;
	private Integer fetchedSize;
	private Object records;
	
	public Object getRecords() {
		return records;
	}
	public void setRecords(Object records) {
		this.records = records;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public Integer getStartRecord() {
		return startRecord;
	}
	public void setStartRecord(Integer startRecord) {
		this.startRecord = startRecord;
	}
	public Integer getEndRecord() {
		return endRecord;
	}
	public void setEndRecord(Integer endRecord) {
		this.endRecord = endRecord;
	}
	public Integer getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}
	public Integer getFetchedSize() {
		return fetchedSize;
	}
	public void setFetchedSize(Integer fetchedSize) {
		this.fetchedSize = fetchedSize;
	}
	
	
}
