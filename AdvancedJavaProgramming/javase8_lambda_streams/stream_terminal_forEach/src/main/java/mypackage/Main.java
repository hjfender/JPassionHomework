package mypackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		numbers.stream()
		       .filter(p -> p > 5)
		       .forEach(p -> System.out.println(p + " "));
		
		// <For your own exercise>
		// - Create a list of names
		// - Filter names length of which are greater than 3
		// - Use forEach to display them
		
		Stream.of("Raghu", "Meghna", "Esha", "Rohit", "Taneeya", "Ex", "Box", "Clu")
			  .filter(p -> p.length() > 3)
			  .forEach(p -> System.out.println(p + " "));
	}

}