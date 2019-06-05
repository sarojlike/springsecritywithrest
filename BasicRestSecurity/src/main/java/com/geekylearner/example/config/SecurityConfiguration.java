package com.geekylearner.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("saroj").password("{noop}1234").roles("USER");
	}

	
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
		http.csrf().disable();
	}
	
	
}
