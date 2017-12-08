package com.spring.integration.service;

public class HelloMessageService {

	public String sayHello(String msg) {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "From Hello Service class" + msg;
	}

}
