package com.jpassion.examples.service;

import org.springframework.integration.annotation.ServiceActivator;

public class MyHandler {

	@ServiceActivator
	public String convertLower(String inputMessage) {
		String trimmedMessage = inputMessage.trim();
		if(trimmedMessage.length() > 0)
			return trimmedMessage.substring(0,1).toUpperCase() + trimmedMessage.substring(1).toLowerCase();
		else
			return trimmedMessage;
	}
}
