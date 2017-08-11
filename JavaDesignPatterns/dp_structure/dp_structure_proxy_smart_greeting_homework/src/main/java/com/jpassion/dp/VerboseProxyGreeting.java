package com.jpassion.dp;

public class VerboseProxyGreeting implements IGreeting {

	private SimpleGreeting simpleGreeting;
	
	public VerboseProxyGreeting(SimpleGreeting simpleGreeting) {
		this.simpleGreeting = simpleGreeting;
	}

	@Override
	public void sayHello(String greeting) {
		System.out.println("Proxy behaviour sits on top!");
		simpleGreeting.sayHello(greeting);
	}
	

}
