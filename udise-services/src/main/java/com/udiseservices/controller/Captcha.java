package com.udiseservices.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Captcha {
	
	private String captcha = "";
	
	public String getCaptcha() {
	
		return this.captcha;
	}
	
	public void setCaptcha(String string) {
		this.captcha = string;
	System.out.println("Setting Capthca Key " + this.captcha);
	}
}
