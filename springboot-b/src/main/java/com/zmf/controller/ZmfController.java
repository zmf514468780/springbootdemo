package com.zmf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ZmfController {
	@RequestMapping("/Bindex")
	public String index(ModelMap map){
		map.put("zmf", "bbbb8028");
		return "zmf";
	}
}
