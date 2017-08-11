package mypackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		// Perform count
		System.out.println("count of numbers greater than 3 is " +
				numbers.stream()
						.filter(p -> p > 3)
						.count());

		// Perform sum
		System.out.println("sum of the numbers is " +
				numbers.stream()
						.filter(p -> p > 3)
						.mapToInt(i -> i)
						.sum());

		// <For your own exercise>
		// - Create a list of names with "Sang", "Jon", "Paul", "Leo"
		// - Filter names length of which are greater than 3
		// - Use map operator to map the name to the length of the name
		// - Use count() and sum() and display the result
		IntStream strames = Stream.of("Sang", "Jon", "Paul", "Leo")
			  .filter(p -> p.length() > 3)
			  .mapToInt(n -> n.length());
		
		System.out.println("Number of names with length greater than 3: " + strames.count());
		
		strames = Stream.of("Sang", "Jon", "Paul", "Leo")
				  .filter(p -> p.length() > 3)
				  .mapToInt(n -> n.length());
		
		System.out.println("Sum of mapped values in stream: " + strames.sum());

	}

}