package com.zmf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PushController {
	@RequestMapping("/push")
	public String say() {
		System.out.println("xx");
		return "xx";
	}
}
