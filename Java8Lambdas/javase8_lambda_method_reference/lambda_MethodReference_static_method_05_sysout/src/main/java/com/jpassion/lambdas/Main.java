package com.jpassion.lambdas;

public class Main {

	public static void main(String[] args){
		Person jon = new Person("Jon", 12);
		
		//Use lambda expression - existing static method of String class
		displaySomething(jon, person -> System.out.println(person));
		
		//Use method reference - existing staic method of String class
		displaySomething(jon, System.out::println);
	}
	
	public static void displaySomething(Person jon, MyFunctionalInterface f) {
		f.mySingleAbstractMethod(jon);
	}
}
