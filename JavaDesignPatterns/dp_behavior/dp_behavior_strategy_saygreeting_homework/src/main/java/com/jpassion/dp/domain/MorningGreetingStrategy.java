package com.jpassion.dp.domain;

public class MorningGreetingStrategy implements IGreetingStrategy {

	@Override
	public String greetingMessage(String string, String string2) {
		return "Good Morning " + string + " " + string2 + "!";
	}

}
