package com.jpassion.dp;

// TODO (Homework): Create a greeting message and decorate it with date
// and location information. The location data can be hard coded.
//
// <Steps to follow>
// 1. Create "IGreeting" interface (provided), which has "String makeGreeting();"
//    method
// 2. Create "InitialGreeting" class (provided), which represents decorated target
// 3. Create "GreetingAbstract" abstract class (provided), which implements
//    IGreeting interface.  It also contains "protected IGreeting decoratedTarget;"
// 4. Create "DateDecorator" class and "LocationDecorator" class, which
//    extends "GreetingAbstract" abstract class.

// Result of running this application results in something like following
//----->Greeting without any decoration
//Hello 
//----->Greeting decorated with Date
//Hello  Tue May 31 14:46:55 EDT 2016
//----->Greeting decorated with Date and Location
//Hello  Tue May 31 14:46:56 EDT 2016 Boston

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("----->Greeting without any decoration");
		IGreeting iGreeting = new InitialGreeting();
		System.out.println(iGreeting.makeGreeting());

		System.out.println("----->Greeting decorated with Date");
		IGreeting igreeting2 = new DateDecorator(new InitialGreeting());
		System.out.println(igreeting2.makeGreeting());
		
		System.out.println("----->Greeting decorated with Date and Location");
		IGreeting igreeting3 = new LocationDecorator(igreeting2);
		System.out.println(igreeting3.makeGreeting());

	}
	
}
