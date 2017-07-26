package com.jpassion.dp;

// TODO (Homework): Create a singleton, which contains "tellTime()"
// method, which returns current date and time as a String object.

// Running this application results in something like following
//current time = May 31, 2016 6:55:17 AM

public class Client {
	public static void main(String[] args) {
		
		// Retrieve the singleton object
		TimeTellerSingleton singleton = TimeTellerSingleton.getInstance();
		
		// Use the instance
		System.out.println("current time = " + singleton.tellTime());
		
	}
}
