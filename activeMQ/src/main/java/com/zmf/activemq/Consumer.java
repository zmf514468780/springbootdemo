package com.zmf.activemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Consumer {
	private static String USERNAME = ActiveMQConnection.DEFAULT_USER;

	private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;

	private static final String BROKENURL = ActiveMQConnection.DEFAULT_BROKER_URL;

	public static void main(String[] args) {

		ConnectionFactory connectionFactory = null;
		Connection connection = null;
		Session session;
		Destination destination;
		MessageConsumer messageConsumer;
		connectionFactory = new ActiveMQConnectionFactory(USERNAME, PASSWORD,
				BROKENURL);
		try {
			connection = connectionFactory.createConnection();
			connection.start();
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		//	destination = session.createQueue("hellotopic");
			destination = session.createTopic("hellotopic");
			messageConsumer = session.createConsumer(destination);
		 while(true){
			 
		
				TextMessage message = (TextMessage) messageConsumer
						.receive();
				if (message != null) {
					System.out.println(" 接到消息：" + message.getText());
					// message.acknowledge();
				// 	message.acknowledge();
				}
		 } 
			 
		} catch (JMSException e) {
			e.printStackTrace();
		}finally{
			try {
				connection.close();
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}

	}
}
