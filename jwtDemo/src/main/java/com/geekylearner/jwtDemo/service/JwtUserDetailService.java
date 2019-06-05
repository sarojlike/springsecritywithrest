package com.geekylearner.jwtDemo.service;

import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.geekylearner.jwtDemo.entity.User;

@Service
public class JwtUserDetailService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = new User(1, "saroj", "123");
		UserBuilder builder = org.springframework.security.core.userdetails.User.withUsername(username);
		
		builder.password(new BCryptPasswordEncoder().encode(user.getPassword()));
		builder.roles(new String [] {});
		
		return builder.build();
	}

}
