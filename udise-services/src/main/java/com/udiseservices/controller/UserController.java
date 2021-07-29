package com.udiseservices.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udiseservices.beans.SessionManage;
import com.udiseservices.models.UserMaster;

@RestController
@RequestMapping("users")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
	
	
	@Autowired
	MongoTemplate mongoTemplate;
	/*
	* @Resource(name="sessionScopedBean") 
	* SessionBean sessionScopedBean;
	 */
	@Autowired
	private SessionManage sessionManage;
	@Autowired Captcha captcha;
	
	@GetMapping("/authenticate1/{username}/{password}")
	public UserMaster get(@PathVariable("username") String username,@PathVariable("password") String password) {
//		System.out.println("hello controller");
		Query query = new Query();
		query.addCriteria(Criteria.where("username").is(username));
		UserMaster userMaster = mongoTemplate.findOne(query, UserMaster.class,"user");	
		return userMaster;
	}

	@PostMapping("/authenticate")
//	@SessionScope
	public UserMaster get1(@RequestBody UserMaster user,HttpSession session) {
		
		System.out.println("Captcha Key is  => " + session.getAttribute("CAPTCHA_KEY"));
		System.out.println("User Object" +sessionManage.getSessionbean().getCaptchaString());
		//System.out.println("User Object" +sessionScopedBean.getCaptchaString());
		//System.out.println("Object => " + captcha.getCaptcha());
		Query query = new Query();
		query.addCriteria(Criteria.where("username").is(user.getUsername()).and("password").is(user.getPassword()));
		UserMaster userMaster = mongoTemplate.findOne(query, UserMaster.class,"user");	
		return userMaster;
	}
	
	
	@PostMapping("/authenticate1/{username}")
	public UserMaster authenticate(@RequestBody String username) {
		try {
			System.out.println("username===" + username);
			Query query = new Query();
			query.addCriteria(Criteria.where("username").is(username));
			UserMaster userMaster = mongoTemplate.findOne(query, UserMaster.class,"user");
			return userMaster;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

}
	@GetMapping("/auth")
	public String auth() {
		System.out.println("hello");
	return "Hello";

}
}
