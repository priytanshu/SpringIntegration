package com.spring.integration.service;

import java.util.concurrent.Future;

public interface IHelloGatewayMessage {

	public Future<String> sayHello(String msg);
}
