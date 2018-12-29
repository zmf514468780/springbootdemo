package com.zmf;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zmf.dao.MessageDao;
import com.zmf.entity.Message;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMain {
	@Autowired
	private MessageDao dao ;
	@Test
	public void test(){
		Message message = new Message();
		message.setMessage_type("1");
		message.setMessageName("messagename");
		dao.save(message);
		
	}
	@Test
	public void tes2t(){
		List<Message> list = dao.findAll();
		for (Message message2 : list) {
			System.out.println(message2 );
		}
	}
	@Test
	public void test3(){
		List<Object[]>  findMessageAll = dao.findMessageAll();
		for (Object[] message2 : findMessageAll) {
			System.out.println( message2[0]+" "+message2[1] );
		}
		Set<String> set = new TreeSet<String>();
	}
	
}
