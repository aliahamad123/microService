package com.udiseservices.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.udiseservices.models.UserMaster;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionBean {
	
	private UserMaster user;
	private String captchaString;
	
	
	
	public SessionBean sessionScopedBean() {
	    return new SessionBean();
	}
	
	public UserMaster getUser() {
		return user;
	}
	public void setUser(UserMaster user) {
		this.user = user;
	}
	public String getCaptchaString() {
		return captchaString;
	}
	public void setCaptchaString(String captchaString) {
		this.captchaString = captchaString;
	}

}
