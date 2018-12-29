package com.zmf.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
	@Async
	public void say(){
		System.out.println("async say().....");
	}
}
