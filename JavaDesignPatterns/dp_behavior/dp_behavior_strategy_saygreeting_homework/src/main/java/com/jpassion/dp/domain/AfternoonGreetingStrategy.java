package com.jpassion.dp.domain;

public class AfternoonGreetingStrategy implements IGreetingStrategy {

	@Override
	public String greetingMessage(String string, String string2) {
		return "Good Afternoon " + string + " " + string2 + "!";
	}

}
