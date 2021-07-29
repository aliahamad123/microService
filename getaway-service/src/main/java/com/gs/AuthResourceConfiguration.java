package com.gs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;

//@EnableResourceServer
//@EnableGlobalMethodSecurity(securedEnabled = true)
public class AuthResourceConfiguration extends ResourceServerConfigurerAdapter {

	@Autowired
	private RemoteTokenServices tokenServices;

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers(Utility.publicUrls()).permitAll().anyRequest()
				.fullyAuthenticated();
	}

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		resources.tokenServices(tokenServices);
		resources.resourceId("inventory");
	}

}
