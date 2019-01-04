package com.zmf.Thread;

public class ThreadJobDemo {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
				System.out.println("定时输出");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
