package com.spring.integration;

import java.util.concurrent.Future;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.integration.service.IHelloGatewayMessage;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext ctx = new GenericXmlApplicationContext("beanConfig.xml");

		IHelloGatewayMessage helloGateway = ctx.getBean("helloGateway", IHelloGatewayMessage.class);

		// System.out.println(helloGateway.sayHello("Hello from App class "));

		Future<String> f = helloGateway.sayHello(" Hello from App class ");
		System.out.println("The End");
		try {
			String s = f.get();
			System.out.println("In try " +s);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
