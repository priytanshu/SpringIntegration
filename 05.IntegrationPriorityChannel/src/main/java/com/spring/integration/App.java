package com.spring.integration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.integration.IntegrationMessageHeaderAccessor;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

/**
 * Hello world!
 *
 */

// Direct Channel

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext ctx = new GenericXmlApplicationContext("beanConfig.xml");

		MessageChannel channel = ctx.getBean("inputChannel", MessageChannel.class);
		/*
		 * Message<String> message =
		 * MessageBuilder.withPayload("Hello Spring Integration ")
		 * .setHeader(MessageHeaders.CONTENT_TYPE, 10).build();
		 */

		for (int i = 0; i < 10; i++) {
			Message<String> message1 = MessageBuilder.withPayload("Hello Spring Integration " + i)
					.setHeaderIfAbsent(IntegrationMessageHeaderAccessor.PRIORITY, i).build();
			channel.send(message1);
		}

		System.out.println("The Message is published successfully");
	}
}
