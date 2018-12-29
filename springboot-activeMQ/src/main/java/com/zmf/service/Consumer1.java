package com.zmf.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer1 {
	@JmsListener(destination="zmfcc")
	public void recevingQueue(String text){
		System.err.println("Consumer1 收到的文章为："+text);
		
	}
}
