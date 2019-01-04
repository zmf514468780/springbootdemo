package com.zmf.Thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledDemo {
	public static void main(String[] args) {
		 ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
		 newScheduledThreadPool.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("xxx");
			}
		},0,1,TimeUnit.SECONDS);
		 
	}
}
