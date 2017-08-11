package com.jpassion.lambdas;

public class Main {

	public static void main(String[] args) {
		char[] charArray = {'j','p','a','s','s','i','o','n'};
		
		//Use lambda expression
		MyFunctionalInterface fi1 = cArray -> new String(cArray);
		System.out.println(fi1.createString(charArray));
		
		//Use constructor reference
		MyFunctionalInterface fi2 = String::new;
		System.out.println(fi2.createString(charArray));
	}
}
