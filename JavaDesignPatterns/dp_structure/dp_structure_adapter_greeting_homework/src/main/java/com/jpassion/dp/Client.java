package com.jpassion.dp;

// TODO (Homework): You want to use OldGreeting class via
// INewGreeting interface.  The OldGreeting takes a 
// single String argument while the new INewGreeting interface
// takes 3 arguments - String greeter, String greetee, String message

// <Steps to follow>
// 0. Uncomment client code below
// 1. Create "OldGreeting" class
// 2. Create "INewGreeting" interface and "NewGreeting" class

// Running this application results in something like following
//
// Hello, Mary I am Sang.  I want to say Good Morning

public class Client {
	
	public static void main(String[] args) {
		
		INewGreeting iNewGreeting = new NewGreeting(new OldGreeting());
		iNewGreeting.sayHello("Sang", "Mary", "Good Morning");
		iNewGreeting.sayHello("Raghu", "Spencer", "Goodbye");
	}

}
