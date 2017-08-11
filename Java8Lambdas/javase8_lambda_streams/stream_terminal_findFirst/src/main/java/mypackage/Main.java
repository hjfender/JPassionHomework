package mypackage;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Stream<String> names = Stream.of("Sang", "John", "David", "Mary", "Dadu");

		Optional<String> firstNameWithD = names.filter(i -> i.startsWith("D")).findFirst();
		if (firstNameWithD.isPresent()) {
			System.out.println("First Name starting with D = " + firstNameWithD.get());
		}

		names = Stream.of("Sang", "John", "David", "Mary", "Dadu");

		names.filter(i -> i.startsWith("D"))
				.findAny()
				.ifPresent(thing -> System.out.println("Any Name starting with D = " + thing));

		// <For your own exercise>
		// - From the "names" stream, filter names whose length is greater than 3
		// - Use findFirst() and findAny()
		
		names = Stream.of("Sang", "John", "David", "Mary", "Dadu");
		
		names.filter(n -> n.length() > 3)
			 .findFirst()
			 .ifPresent(name -> System.out.println("First name with length less than 3: " + name));
		
		names = Stream.of("Sang", "John", "David", "Mary", "Dadu");
		
		names.filter(n -> n.length() > 3)
			 .findAny()
			 .ifPresent(name -> System.out.println("Any name with length less than 3: " + name));

		// <For your own exercise>
		// - Given a list of numbers of 1,2,3,4,5,6,7,8,9 find the first
		// number whose is greater than 3 and even number and double it
		IntStream numbers = Stream.of(1,2,3,4,5,6,7,8,9).mapToInt(i -> i);
		
		numbers.filter(i -> i > 3 && i % 2 == 0)
			   .map(i -> 2*i)
			   .findFirst()
			   .ifPresent(i -> System.out.println("First 'even number greater than three' doubled: " + i));
		
		// - Convert the lambda expression to method references
		numbers = Stream.of(1,2,3,4,5,6,7,8,9).mapToInt(i -> i);
		
		numbers.filter(Main::filterBasedOnCriteria)
			   .map(Main::doubleAnInt)
			   .findFirst()
			   .ifPresent(Main::consumeResult);
		
		
	}
	
	public static int doubleAnInt(int i){
		return 2*i;
	}
	
	public static boolean filterBasedOnCriteria(int i){
		return i > 3 && i % 2 == 0;
	}
	
	public static void consumeResult(int i) {
		System.out.println("First 'even number greater than three' doubled: " + i);
	}

}