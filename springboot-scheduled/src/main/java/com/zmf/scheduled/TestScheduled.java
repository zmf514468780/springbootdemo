package com.zmf.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduled {
	@Scheduled(fixedRate=1000)
	public void say(){
		System.out.println("say......");
	}
}

