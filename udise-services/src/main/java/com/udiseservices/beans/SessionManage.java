package com.udiseservices.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SessionManage {
	
	@Autowired
	SessionBean sessionbean;

	public SessionBean getSessionbean() {
		return sessionbean;
	}

	public void setSessionbean(SessionBean sessionbean) {
		this.sessionbean = sessionbean;
	}
	
	
	
	
	
	

	

}
