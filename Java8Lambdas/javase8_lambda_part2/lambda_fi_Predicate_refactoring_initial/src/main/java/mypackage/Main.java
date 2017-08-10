package mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		// Create test data
		Person[] personArray = { new Person("Jong", 5),
				new Person("Jon", 12),
				new Person("Jon", 17),
				new Person("Mary", 13) };
		List<Person> people = Arrays.asList(personArray);

		Fruit[] fruitArray = { new Fruit("Apple", 11),
				new Fruit("Orange", 22),
				new Fruit("Banana", 33) };
		List<Fruit> fruits = Arrays.asList(fruitArray);

		// #1: call methods which embeds test code in a for loop
		List<Person> peopleResult = findPeopleByName(people, "Jon");
		displayResult("---->#1a: ", peopleResult);

		// <For your own exercise>
		// - Write code to find people whose age is greater than 10
		// - Observe that you have to write new method each time
		//   you need to perform find operation with new criteria
		List<Person> peopleResult2 = findPeopleByAge(people, 10);
		displayResult("---->#1b: ", peopleResult2);

		// <For your own exercise>
		// #2: call methods which use Predicate with specific type,
		//   for example, Predicate<Person> or Predicate<Fruit>
		Predicate<Person> peoplePredicate = x -> x.getName().equals("Jon");
		List<Person> peopleResult3 = findPeopleByPredicate(people, peoplePredicate);
		displayResult("---->#2a: ", peopleResult3);

		// <For your own exercise>
		// #3: call methods which use predicate with generic type
		Predicate<Fruit> fruityPreddles = x -> x.getQuantity() == 22;
		List<Fruit> fruitResult = find(fruits, fruityPreddles);
		displayResult("---->#3a: ", fruitResult);
		
		// <For your own exercise>
		// #4: Use a stream (optional exercise since we have not learned streams)
		Stream<Fruit> froosh = fruits.stream().filter(fruityPreddles);
		System.out.print("---->#4a: ");
		froosh.forEach(x -> System.out.print(x));
	}
	
	// #1: Embed test code in a for loop
	private static List<Person> findPeopleByAge(List<Person> people, int age) {
		List<Person> result = new ArrayList<>();
		for (Person p : people) {
			if (p.getAge() > 10) {
				result.add(p);
			}
		}
		return result;
	}

	public static List<Person> findPeopleByName(List<Person> people, String name) {

		List<Person> result = new ArrayList<>();
		for (Person p : people) {
			if (p.getName().equals(name)) {
				result.add(p);
			}
		}
		return result;
	}
	
	//#2
	private static List<Person> findPeopleByPredicate(List<Person> people, Predicate<Person> predicate) {
		List<Person> result = new ArrayList<>();
		for(Person p : people){
			if(predicate.test(p)){
				result.add(p);
			}
		}
		return result;
	}
	
	//#3
	private static <T> List<T> find(List<T> items, Predicate<T> predicate){
		List<T> result = new ArrayList<>();
		for(T item : items){
			if(predicate.test(item)){
				result.add(item);
			}
		}
		return result;
	}

	// Utility method to display the result
	// <For your own exercise>
	// - Genericize the following method so that it can
	//   take list of any type (not just list of Person type)
	public static <T> void displayResult(String prefix, List<T> results) {
		System.out.print(prefix);
		results.forEach((item) -> System.out.print(item));
		System.out.println();
	}

}
