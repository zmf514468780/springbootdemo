package com.zmf.controller;

import org.springframework.web.bind.annotation.RestController;

import com.zmf.domain.User;

@RestController
public class JsonPGetJson {
	public User JsonPGetJson(){
		User user = new User();
		user.setId(1);
		user.setName("zmf");
		return user;
	}
}
