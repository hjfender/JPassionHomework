package mypackage;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

		Supplier<String> supplier1 = () -> "adsf";
		String result = supplier1.get();
		System.out.println(result);
		
		Supplier<Integer> supplier2 = () -> 34;
		printSupplied(supplier2);
		
		// <For your own exercise #1>
		// -Create Supplier<Long> object with appropriate code
		// -Call functional method of the Supplier and display the result
		Supplier<Long> supplier3 = () -> 55L;
		printSupplied(supplier3);
		
		// <For your own exercise #2>
		// -Create a new method called printSuppliedWithTwoSuppliers, which
		//  takes two Supplier objects and then print them out
		printSuppliedWithTwoSuppliers(supplier1, supplier3);

	}

	public static <T> void  printSupplied(Supplier<T> supplier) {
		System.out.println(supplier.get());
	}
	
	public static <T, U> void printSuppliedWithTwoSuppliers(Supplier<T> supplier1, Supplier<U> supplier2) {
		System.out.println(supplier1.get() + ", " + supplier2.get());
	}

}
