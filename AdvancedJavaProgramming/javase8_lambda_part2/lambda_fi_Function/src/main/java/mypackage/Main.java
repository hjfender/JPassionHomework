package mypackage;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {

		Function<String, String> function1 = x -> x.toUpperCase();
		Function<String, String> function2 = x -> x.toLowerCase();
		
		// Call the functions directly
		String result1 = function1.apply("Code with Passion!");
		System.out.println(result1);
		
		String result2 = function2.apply("Code with Passion!");
		System.out.println(result2);
		
		// Pass the functions to a method as an argument
		doSomething(function1, "JPassion.com");
		doSomething(function2, "JPassion.com");
		
		Function<String, Integer> function3 = x -> x.length();
		doSomething(function3, "JPassion.com");
		
		BiFunction<String, String, String> function4 = (x, y) -> x.concat(y);
		doSomething2(function4, "Sang", "Shin");

		BiFunction<String, String, Integer> function5 = (x, y) -> x.length() + y.length();
		doSomething2(function5, "Sang", "Shin");
		
		// <For your own exercise>
		// - Create a Function object, which takes an Integer and returns square value
		// - Call "apply" method of the function object using appropriate Integer value
		// - Pass the function object to doSomething(..) method as an argument
		Function<Integer, Integer> squareFunc = x -> x*x;
		System.out.println("Squared value of " + 9 + " is " + squareFunc.apply(9));
		System.out.print("Squared value of " + 9 + " is ");
		doSomething(squareFunc, 8);
	}

	public static <T,R> void doSomething(Function<T, R> function, T something) {
		System.out.println(function.apply(something));
	}
	
	
	public static <T,U,R> void doSomething2(BiFunction<T, U, R> function, T something1, U something2) {
		System.out.println(function.apply(something1, something2));
	}
	
}
