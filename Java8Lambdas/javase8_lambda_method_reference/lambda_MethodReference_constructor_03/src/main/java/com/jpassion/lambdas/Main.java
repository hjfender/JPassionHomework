package com.jpassion.lambdas;

public class Main {

	public static void main(String[] args) {
		//Use lambda expression
		MyFunctionalInterface<Person, String, Integer> myFunctionalInterface1 = (name, age) -> new Person(name, age);
		Person person1 = myFunctionalInterface1.createObject("sang", 33);
		System.out.println(person1);
		
		//Use method reference
		MyFunctionalInterface<Person, String, Integer> myFunctionalInterface2 = Person::new;
		Person person2 = myFunctionalInterface2.createObject("jon", 44);
		System.out.println(person2);
	}
}
