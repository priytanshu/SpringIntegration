package com.spring.integration.service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint(value="firstMessageService")
public class FirstMessageService {

	@ServiceActivator(inputChannel="pubSubChannel", autoStartup="true")
	public void recieveMessage(Message<?> message) {
		System.out.println(message.getPayload() + "---- First Message Service");
	}

}
