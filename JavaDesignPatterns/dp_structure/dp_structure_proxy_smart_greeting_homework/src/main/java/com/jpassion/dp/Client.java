package com.jpassion.dp;

// TODO (Homework): Create IGreeting interface, which displays greeting message
// 
// <Steps to follow>
// 1. Create "SimpleGreeting" and "VerboseGreeting" classes, which implements
// the same "IGreeting" interface. The latter has a reference to the former.

public class Client {

	public static void main(String[] args) {
		IGreeting iGreeting = new VerboseProxyGreeting(new SimpleGreeting());
		iGreeting.sayHello("Hello");
	}
}
