package com.jpassion.lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Person[] personArray1 = { new Person("Sang", 11), new Person("Jon", 12), new Person("Mary", 13) };
		displayPeople(personArray1);
		
		//Use anonymous class
		Arrays.sort(personArray1, new Comparator<Person>(){
			@Override
			public int compare(Person a, Person b){
				return a.getName().compareTo(b.getName());
			}
		});
		displayPeople(personArray1);
		
		//Use lambda expression - provide the logic directly
		Person[] personArray2 = { new Person("Sang", 11), new Person("Jon", 12), new Person("Mary", 13) };
		Arrays.sort(personArray2, (Person a, Person b) -> {
			return a.getName().compareTo(b.getName());
		});
		displayPeople(personArray2);
		
		//Use lambda expression - existing static method of Person class
		Person[] personArray3 = { new Person("Sang", 11), new Person("Jon", 12), new Person("Mary", 13) };
		Arrays.sort(personArray3, (a,b) -> Person.compareByName_StaticMethod(a, b));
		displayPeople(personArray3);
		
		//Use method reference - existing static method of Person class
		Person[] personArray4 = { new Person("Sang", 11), new Person("Jon", 12), new Person("Mary", 13) };
		Arrays.sort(personArray4, Person::compareByName_StaticMethod);
		displayPeople(personArray4);
	}
	
	public static void displayPeople(Person[] people) {
		System.out.println("---- displayPeople");
		for (Person person: people){
			System.out.println(person.getName());
		}
	}
}
