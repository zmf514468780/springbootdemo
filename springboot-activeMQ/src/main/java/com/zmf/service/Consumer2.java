package com.zmf.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class Consumer2 {
	@JmsListener(destination="zmfcc")
	public void recevingQueue(String text){
		System.out.println("Consumer2 收到的文章为："+text);
		
	}
}