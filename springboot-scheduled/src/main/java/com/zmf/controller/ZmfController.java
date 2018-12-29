package com.zmf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zmf.service.AsyncService;

@RestController
public class ZmfController {
	@Autowired
	private AsyncService service;
	@Value("${zmf}")
	private String zmf;
	@RequestMapping("/cc") 
	public String getUrl(){
		for (int i = 0; i < 3; i++) {
			System.out.println("getUrl say " + i );
			service.say();
		}
		return  zmf;
	}
}
