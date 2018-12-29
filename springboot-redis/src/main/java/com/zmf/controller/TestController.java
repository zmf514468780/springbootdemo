package com.zmf.controller;

import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@Autowired
	private RedisTemplate<String, String> redis;

	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String attribute = (String) session.getAttribute("name");
		String key = attribute + "_key";
		// 获取的 string 
	//	ValueOperations<String, String> opsForValue = redis.opsForValue();
	// 	String string = opsForValue.get(key);
		Boolean flag = redis.hasKey(key);
		if (flag) {
			return "index";
		}

		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, String name, String password) {
		System.out.println(name+"------");
		// System.out.println(name +"   "+ password);
		ValueOperations<String, String> opsForValue = redis.opsForValue();
		String key = name + "_key";
		opsForValue.set(key, password, 30, TimeUnit.SECONDS);
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		return "index";
	}
}
