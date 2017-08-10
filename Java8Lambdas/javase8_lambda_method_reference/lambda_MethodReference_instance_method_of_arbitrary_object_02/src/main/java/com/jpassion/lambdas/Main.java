package com.jpassion.lambdas;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		//Create Person array - they will be sorted based on their names
		Person[] personArray = { new Person("Sang", 11), new Person("Jon", 12),
                new Person("Mary", 13) };
		
		//Use lambda expression
		Arrays.sort(personArray, (Person a, Person b) -> a.compareByName_InstanceMethod(b));
		
		//Use method reference - existing instance method of an arbitrary object
		Arrays.sort(personArray, Person::compareByName_InstanceMethod);
		displayPeople(personArray);
		
		//Create String array - they will be sorted
		String[] stringArray = {"cherry", "orange", "watermelon", "apple"};
		
		//Use lambda expression
		Arrays.sort(stringArray, (String a, String b) -> a.compareToIgnoreCase(b));
		
		//Use method reference - existing instance method of an arbitrary object
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		displayStrings(stringArray);	
	}
	
	//Utility methods for display Person array
	public static void displayPeople(Person[] people) {
		System.out.println("---- displayPeople");
		for (Person person: people) {
			System.out.println(person.getName());
		}
	}
	
	//Utility methods for display String array
	public static void displayStrings(String[] strings) {
		System.out.println("---- displayStrings");
		for (String string: strings) {
			System.out.println(string);
		}
	}
}
