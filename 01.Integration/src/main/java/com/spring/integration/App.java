package com.spring.integration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

/**
 * Hello world!
 *
 */


// Direct Channel 


public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext ctx = new GenericXmlApplicationContext("beanConfig.xml");

		MessageChannel channel = ctx.getBean("message", MessageChannel.class);
		Message<String> message = MessageBuilder.withPayload("Hello Spring Integration ").build();
		channel.send(message);
	}
}
