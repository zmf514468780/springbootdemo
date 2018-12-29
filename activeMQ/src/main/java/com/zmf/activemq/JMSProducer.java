package com.zmf.activemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
/**
 * 
 * TODO ActiveMQ 生产者
 * @author zmf  2018年12月18日
 */
public class JMSProducer {
	private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;

	private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;

	private static final String BROKENURL = ActiveMQConnection.DEFAULT_BROKER_URL;

	private static final int SENDNUM = 10;

	public static void main(String[] args) {
		ConnectionFactory connectionFactory = null;
		Connection connection = null;
		Session session;
		Destination destination;
		MessageProducer messageProducer;
		connectionFactory = new ActiveMQConnectionFactory(USERNAME, PASSWORD,
				BROKENURL);
		try {
			connection = connectionFactory.createConnection();
			connection.start();
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			// destination = session.createQueue("HelloWorlds");
			destination = session.createTopic("hellotopic");
			messageProducer = session.createProducer(destination);
			sendMessage(session, messageProducer);
			// session.commit(); // 不写session.commit()； 队列中将不会有数据
		} catch (JMSException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (JMSException e) {
					e.printStackTrace();
				}
			}

		}

	}

	private static void sendMessage(Session session,
			MessageProducer messageProducer) {
		// TODO Auto-generated method stub
		for (int i = 0; i < SENDNUM; i++) {
			try {
				TextMessage message = session
						.createTextMessage("activeMQ 发送消息： " + i);
				System.out.println("发送消息：activeMQ " + i);
				messageProducer.send(message);

			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
