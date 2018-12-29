package com.zmf;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * 
 * TODO springboot 全局异常捕获。 
 * 
 * @author zmf  2018年12月6日
 */
@ControllerAdvice
public class GlobalExceptionController {
	/**
	 * 
	 * TODO 捕获全局异常
	 * 返回值：
	 * 		String ： 返回到某个view
	 * 		ModelAndView：返回到ModelAndView
	 * 		model+@responseBody ： 直接页面显示
	 * @param e
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Map<String ,Object> exceptionHandler(Exception e){
		System.out.println("这里获取到了一个很严重的异常···");
		Map<String ,Object> map = new HashMap<String, Object>();
		map.put("ccc", e.toString());
		return map;
	}
}
