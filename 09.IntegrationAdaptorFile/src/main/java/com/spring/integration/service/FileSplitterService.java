package com.spring.integration.service;

import java.io.File;
import java.io.IOException;

import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;

public class FileSplitterService extends AbstractMessageSplitter {

	private String commentPrefix = ",";

	@Override
	protected Object splitMessage(Message<?> message) {
		System.out.println(message.getPayload() + "---- First Splitter Service");
		try {
			System.out.println((File) message.getPayload());
			return new BufferedReaderFileIterator((File) message.getPayload());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return message;
	}

	public void setCommentPrefix(String commentPrefix) {
		this.commentPrefix = commentPrefix;
	}

}
