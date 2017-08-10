package com.jpassion.lambdas;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		MyFunctionalInterface<Date> myDate1 = () -> new Date();
		System.out.println(myDate1.createObject());
		
		MyFunctionalInterface<Date> myDate2 = Date::new;
		System.out.println(myDate2.createObject());
	}
}
