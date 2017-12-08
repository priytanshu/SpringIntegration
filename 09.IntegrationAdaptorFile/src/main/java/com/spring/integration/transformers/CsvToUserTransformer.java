package com.spring.integration.transformers;

import java.io.File;
import java.io.IOException;

import org.springframework.integration.annotation.Transformer;
import org.springframework.messaging.Message;

import com.spring.integration.bean.UserRegistration;
import com.spring.integration.service.BufferedReaderFileIterator;

public class CsvToUserTransformer {

	@Transformer
	public UserRegistration toUserTransformer(Message<?> inString) {
		try {
			System.out.println("inside transformer " + new BufferedReaderFileIterator((File) inString.getPayload()));

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
