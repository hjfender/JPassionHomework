package mypackage;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		// Create test data
		Person[] personArray = { new Person("Jong", 5), new Person("Jon", 12), new Person("Mary", 13) };
		List<Person> people = Arrays.asList(personArray);

		Fruit[] fruitArray = { new Fruit("Apple", 11), new Fruit("Orange", 22), new Fruit("Banana", 33) };
		List<Fruit> fruits = Arrays.asList(fruitArray);

		// #1: call methods which embeds conversion code in a for loop
		convertPeopleUppercase(people);
		displayResult("---->#1a: ", people);

		convertPeopleLowercase(people);
		displayResult("---->#1b: ", people);

		// #2: call methods which use Function with specific type
		Function<Person, Person> function1 = p -> {
			p.setName(p.getName().toUpperCase());
			return p;
		};

		Function<Person, Person> function2 = p -> {
			p.setName(p.getName().toLowerCase());
			return p;
		};

		Function<Fruit, Fruit> function3 = p -> {
			p.setName(p.getName().toUpperCase());
			return p;
		};
		
		Function<Fruit, Fruit> function4 = p -> {
			p.setName(p.getName().toLowerCase());
			return p;
		};
		
		people = Arrays.asList(personArray);
		
		convertPeopleThroughFunction(people, function1);
		displayResult("---->#2a: ", people);
		
		convertPeopleThroughFunction(people, function2);
		displayResult("---->#2b: ", people);

		// #3: call methods which use Function with generic type
		people = Arrays.asList(personArray);
		
		convertGenericThroughFunction(people, function1);
		displayResult("---->#3a: ", people);
		
		convertGenericThroughFunction(people, function2);
		displayResult("---->#3b: ", people);
		
		convertGenericThroughFunction(fruits, function3);
		displayResult("---->#3a: ", fruits);
		
		convertGenericThroughFunction(fruits, function4);
		displayResult("---->#3b: ", fruits);

		// #4: Use a stream (optional exercise since we
		// have not learned streams yet)
		Stream<Person> peopleStream = people.stream().map(function1);
		System.out.print("---->#4a: ");
		peopleStream.forEach(x -> System.out.print(x + " "));

	}

	// #1: Embed conversion code in a for loop
	public static void convertPeopleUppercase(List<Person> people) {
		for (Person p : people) {
			p.setName(p.getName().toUpperCase());
		}
	}

	public static void convertPeopleLowercase(List<Person> people) {
		for (Person p : people) {
			p.setName(p.getName().toLowerCase());
		}
	}

	// #2
	public static void convertPeopleThroughFunction(List<Person> people, Function<Person, Person> function) {
		for (Person p : people) {
			function.apply(p);
		}
	}

	// #3
	public static <T> void convertGenericThroughFunction(List<T> items, Function<T, T> function) {
		for (T t : items) {
			function.apply(t);
		}
	}

	// Utility method to display list of items
	public static <T> void displayResult(String prefix, List<T> results) {
		System.out.print(prefix);
		results.forEach(item -> System.out.print(item + " "));
		System.out.println();
	}

}