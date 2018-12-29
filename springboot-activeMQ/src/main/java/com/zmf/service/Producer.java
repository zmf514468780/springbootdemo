package com.zmf.service;

import javax.jms.Destination;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

@Service("producer")
public class Producer {
	@Autowired
	private JmsMessagingTemplate jtTemplate;
	
	public void sendMessage(Destination destination , String message){
		jtTemplate.convertAndSend(destination, message);
	}
}
