package com.zmf.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
 
@JobHandler(value="zmf")
@Component
public class ZmfService extends IJobHandler{

	@Override
	public ReturnT<String> execute(String param) throws Exception {
		System.out.println("cccccccc——"+param);
		return ReturnT.SUCCESS;
	}

}
