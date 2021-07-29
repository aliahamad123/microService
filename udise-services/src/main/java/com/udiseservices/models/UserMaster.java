package com.udiseservices.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "user")
public class UserMaster {
	
	@Id
	@Field(value = "_id")
	private String _id;

	@Field(name = "username")
	private String username;

	@Field(name = "password")
	private String password;

	@Field(name = "firstname")
	private String firstname;

	@Field(name = "userType")
	private String userType;
	
	@Field(name = "lastname")
	private String lastname;
	
	@Transient
	private String captchaString;
	

	@Field(name = "token")
	private String token;
	
	
	

	public String getCaptchaString() {
		return captchaString;
	}

	public void setCaptchaString(String captchaString) {
		this.captchaString = captchaString;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}


}
