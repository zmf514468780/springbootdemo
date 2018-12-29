package com.zmf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ZmfController {
	@RequestMapping("/Aindex")
	public String index(ModelMap map){
		map.put("zmf", "AAAA8888");
		return "zmf";
	}
}
