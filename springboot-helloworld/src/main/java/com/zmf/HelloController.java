package com.zmf;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/zmf")
	public String getUser(){
		int i = 1/ 0;
		return "cccccc";
	}
	
	
}
