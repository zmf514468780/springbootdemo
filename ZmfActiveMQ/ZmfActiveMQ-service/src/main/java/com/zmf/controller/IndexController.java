package com.zmf.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/indexcc")
	public String index(ModelMap  map){
		System.out.println("ccc");
		map.put("name", "zmf");
		return "index";
	}
}
