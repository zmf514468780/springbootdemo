package com.zmf;
 
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * TODO 启动项
 * MapperScan:浏览的dao文件
 * @author zmf  2018年12月6日
 */
@SpringBootApplication   
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
