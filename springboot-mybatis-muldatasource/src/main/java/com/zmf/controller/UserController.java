package com.zmf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zmf.domain.User;
import com.zmf.service.UserService;
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/getUserList")
	public List<User> getUserList(){
		return userService.getUserList();
	}
}
