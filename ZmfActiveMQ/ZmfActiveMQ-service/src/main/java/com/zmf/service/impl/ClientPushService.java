package com.zmf.service.impl;

import javax.jms.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

import com.zmf.service.PushService;

public class ClientPushService implements PushService {
	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private Destination destination;

	@Override
	public void push(Object info) {
		pushExecutor.execute(new Runnable() {
			@Override
			public void run() {
				jmsTemplate.convertAndSend(destination, info);
			}
		});
	}

}
