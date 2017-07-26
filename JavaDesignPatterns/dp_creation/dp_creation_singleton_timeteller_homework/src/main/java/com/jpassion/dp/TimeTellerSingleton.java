package com.jpassion.dp;

import java.util.Date;

public class TimeTellerSingleton {
	
	// Private Instance of itself
	private static TimeTellerSingleton instance = new TimeTellerSingleton();
	
	// Private Constructor
	private TimeTellerSingleton() {
	}
	
	// Accessor method for private instance
	public static TimeTellerSingleton getInstance() {
		return instance;
	}

	public String tellTime() {
		Date date = new Date(System.currentTimeMillis());
		return date.toString();
	}

}
