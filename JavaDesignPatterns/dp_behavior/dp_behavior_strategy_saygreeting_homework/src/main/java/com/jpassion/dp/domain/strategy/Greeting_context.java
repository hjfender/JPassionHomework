package com.jpassion.dp.domain.strategy;

import com.jpassion.dp.domain.IGreetingStrategy;

public class Greeting_context {

	private IGreetingStrategy greetingStrategy;
	
	public Greeting_context setGreetingStrategy(IGreetingStrategy decideGreetingStrategy){
		this.greetingStrategy = decideGreetingStrategy;
		return this;
	}
	
	public String getGreetingMessage(String string, String string2) {
		return greetingStrategy.greetingMessage(string, string2);
	}

}
