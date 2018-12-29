package com.zmf;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * TODO 返回 freemaker的文件。 
 * 默认文件配置在 ／src/main/resources/templates/下面
 * @author zmf  2018年12月6日
 */
@Controller 
public class IndexController {
	@RequestMapping("/index")
	public String getIndex(Map<String ,Object> map){
		map.put("name", "zmf you need fighting!");
		return "index";
	}
}
