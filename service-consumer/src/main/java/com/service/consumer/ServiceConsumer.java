package com.service.consumer;

import com.service.api.ServiceApi;

public class ServiceConsumer {

	private ServiceApi serviceApi;

	public void setServiceApi(ServiceApi serviceApi) {
		this.serviceApi = serviceApi;
	}
	
	public void consumer(){
		serviceApi.sayHello("test");
	}
	
}
