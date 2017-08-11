package mypackage;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 6, 7, 8);
		
		System.out.println("Stream contains 5? "+ numbers.stream().anyMatch(i -> i==5));
		System.out.println("Stream contains all elements less than 10?  "+ numbers.stream().allMatch(i -> i<10));
		System.out.println("Stream doesn't contain 10? "+ numbers.stream().noneMatch(i -> i==10));
 
		// <For your own exercise>
		// -Create a names list with "Sang","John","David", "Mary", "Dadu"
		// -Check if there is a name that starts with "Sa"
		// -Check if length of every name is greater than 3
		// -Check if there is a name whose length is 5
		
		List<String> names = Arrays.asList("Sang","John","David", "Mary", "Dadu");
		
		System.out.println("Stream contains a name beginning wiht 'Sa': " + names.stream().anyMatch(i -> i.startsWith("Sa")));
		System.out.println("Stream contains only names with length greater that 3: " + names.stream().allMatch(i -> i.length() > 3));
		System.out.println("Stream contains a name with length 5: " + names.stream().anyMatch(i -> i.length() == 5));
	}

}