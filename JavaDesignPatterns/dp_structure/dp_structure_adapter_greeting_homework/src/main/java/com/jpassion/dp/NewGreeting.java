package com.jpassion.dp;

public class NewGreeting implements INewGreeting {

	private OldGreeting oldGreeting;
	
	public NewGreeting(OldGreeting oldGreeting) {
		this.oldGreeting = oldGreeting;
	}

	@Override
	public void sayHello(String sender, String receiver, String greeting) {
		System.out.print("Hello, " + receiver + " I am " + sender + ". ");
		oldGreeting.greet(greeting);
	}
}
