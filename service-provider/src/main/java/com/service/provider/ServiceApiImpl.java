package com.service.provider;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.alibaba.dubbo.rpc.RpcContext;
import com.service.api.ServiceApi;

public class ServiceApiImpl implements ServiceApi {

	public String sayHello(String name) {
		 System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
         return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
	}

}
