package com.jpassion.lambdas;

public class ComparisonProvider {

	public int compareByName(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}
	
	public int compareByAge(Person a, Person b) {
		Integer aInteger = a.getAge();
		Integer bInteger = b.getAge();
		return aInteger.compareTo(bInteger);
	}
}
