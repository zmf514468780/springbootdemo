package com.zmf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {
	@RequestMapping("/clientIndex")
	public String index(ModelMap map ){
		map.put("name", "zmf");
		return "index";
	}
}
