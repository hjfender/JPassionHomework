package mypackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		int max = 5000000;
		int threshold = 50000;

		Date d1, d2;
		long elapsed_time;

		// Create test data
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < max; i++)
			numbers.add(i);

		d1 = new Date();

		// Perform sequential filtering
		numbers.stream()
				.filter(p -> p > threshold)
				.mapToInt(i -> i)
				.sum();

		d2 = new Date();
		elapsed_time = d2.getTime() - d1.getTime();
		System.out.println("Using sequential stream took " + elapsed_time + " milliseconds");

		d1 = new Date();

		// Perform parallelStream
		numbers.parallelStream()
				.filter(p -> p > threshold)
				.mapToInt(i -> i)
				.sum();

		d2 = new Date();
		elapsed_time = d2.getTime() - d1.getTime();
		System.out.println("Using parallel stream took " + elapsed_time + " milliseconds");

		// <For your own exercise>
		// - Create test data with random numbers (instead of sequential numbers)
		// - Use sorted
		List<Integer> random = new ArrayList<Integer>();
		Random r = new Random();
		
		numbers.stream()
			   .forEach(i -> random.add(r.nextInt(max)));
		
		
		d1 = new Date();
		numbers.stream()
			   .sorted()
			   .mapToInt(i -> i)
			   .sum();
		d2 = new Date();
		elapsed_time = d2.getTime() - d1.getTime();
		System.out.println("Using sequential stream took " + elapsed_time + " milliseconds to sort");
		
		d1 = new Date();
		numbers.stream()
			   .sorted()
			   .mapToInt(i -> i)
			   .sum();
		d2 = new Date();
		elapsed_time = d2.getTime() - d1.getTime();
		System.out.println("Using parallel stream took " + elapsed_time + " milliseconds to sort");
		

	}

}