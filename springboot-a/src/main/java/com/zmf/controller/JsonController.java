package com.zmf.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zmf.domain.User;

@RestController
public class JsonController {
	@RequestMapping("/getJson")
	public User getJson(HttpServletResponse request){
	//	request.setHeader("Access-Control-Allow-Origin", "*");
		User user = new User();
		user.setId(1);
		user.setName("zmf");
		return user;
	}
}
