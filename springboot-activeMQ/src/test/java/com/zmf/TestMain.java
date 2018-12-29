package com.zmf;
import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zmf.service.Producer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMain {
	@Autowired
	private Producer producer;
	
	@Test
	public void test(){
		// Destination destination = new ActiveMQTopic("zmfcc");// Pub/Sub模式
		Destination destination = new ActiveMQQueue("zmfcc"); // P2P模式
		for (int i = 0; i < 10; i++) {
			producer.sendMessage(destination, "xiaoxi + "+i);
		}
	}
}
