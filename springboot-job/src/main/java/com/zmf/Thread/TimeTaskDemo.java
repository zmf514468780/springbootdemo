package com.zmf.Thread;

import java.util.Timer;
import java.util.TimerTask;

/***
 * timer 和TimerTask 实现定时器的demo
 * TODO 填写功能说明
 * @author zmf  2018年12月29日
 */
public class TimeTaskDemo {
	static long count = 0;
	public static void main(String[] args) {
			TimerTask timerTask = new TimerTask() {
				@Override
				public void run() {
					System.out.println("定时：" +(++count));
				}
			};
			Timer timer = new Timer();
			//timer.schedule(timerTask, 3, 1000);
			timer.scheduleAtFixedRate(timerTask, 0, 1000);
			
	}
}
