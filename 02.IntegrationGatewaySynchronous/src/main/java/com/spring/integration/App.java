package com.spring.integration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.integration.service.HelloMessageService;
import com.spring.integration.service.IHelloGatewayMessage;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext ctx = new GenericXmlApplicationContext("beanConfig.xml");

		IHelloGatewayMessage helloService = ctx.getBean("helloGateway", IHelloGatewayMessage.class);

		System.out.println(helloService.sayHello("Hello from App class "));

		System.out.println("The End");
	}
}
