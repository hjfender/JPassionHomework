package com.jpassion.lambdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> persons = Person.createShortList();
		
		//Sort with Anonymous Inner Class
		Collections.sort(persons, new Comparator<Person>(){
			@Override
			public int compare(Person p1, Person p2){
				return p1.getSurName().compareTo(p2.getSurName());
			}
		});
		
		System.out.println("=== Sorted Asc SurName ===");
		for(Person p: persons){
			p.printName();
		}
		
		//Use Lambda instead
		
		//Print in ascending order
		System.out.println("=== Sorted Asc SurName ===");
		Collections.sort(persons, (p1, p2) -> p1.getSurName().compareTo(p2.getSurName()));
		
		for(Person p: persons){
			p.printName();
		}
		
		System.out.println("=== Sorted Desc SurName ===");
		Collections.sort(persons, (p1, p2) -> p2.getSurName().compareTo(p1.getSurName()));
		
		for(Person p: persons){
			p.printName();
		}
	}
}
