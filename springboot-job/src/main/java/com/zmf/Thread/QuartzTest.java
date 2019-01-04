package com.zmf.Thread;

import org.quartz.JobBuilder;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzTest {
	public static void main(String[] args) throws SchedulerException {
		StdSchedulerFactory stdSchedulerFactory = new StdSchedulerFactory();
		Scheduler scheduler = stdSchedulerFactory.getScheduler();
		JobBuilder newJob = JobBuilder.newJob(Quartz.class).withDescription("这是一个job").withIdentity("ramJob", "ramGroup");
		
	}
}
