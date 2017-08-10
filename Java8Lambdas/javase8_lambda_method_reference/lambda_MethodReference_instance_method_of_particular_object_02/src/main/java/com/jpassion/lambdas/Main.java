package com.jpassion.lambdas;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Person[] personArray1 = {new Person("Sang", 11), new Person("Jon", 12), new Person("Mary", 13)};
		
		//Use lambda expression of comparing names without using existing method
		Arrays.sort(personArray1,(Person a, Person b) -> {return a.getName().compareTo(b.getName());});
		displayPeople(personArray1);
		
		//Create an object that will be used within the body of lambda expression
		ComparisonProvider myComparisonProvider = new ComparisonProvider();
		
		//Use lambda expression with using existing method
		Person[] personArray2 = {new Person("Sang", 11), new Person("Jon", 12), new Person("Mary", 13)};
		Arrays.sort(personArray2, (a,b) -> myComparisonProvider.compareByName(a, b));
		displayPeople(personArray2);
		
		//Use method reference - existing instance method of a particular object
		Person[] personArray3 = {new Person("Sang", 11), new Person("Jon", 12), new Person("Mary", 13)};
		Arrays.sort(personArray3, myComparisonProvider::compareByName);
		displayPeople(personArray3);
	}
	
	public static void displayPeople(Person[] people) {
		System.out.println("---- displayPeople");
		for (Person person: people) {
			System.out.println(person.getName());
		}
	}
}
