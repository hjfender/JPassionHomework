package com.jpassion.lambdas;

public class Main {

	public static void main(String[] args) {
		//Set variables with lambda expressions
		Calculator multiply = (x,y) -> {return x*y;};
		Calculator divide = (x,y) -> x/y;
		int product = multiply.calculate(50, 10);
		int quotient = divide.calculate(50, 10);
		
		System.out.println("product = " + product + " quotient = " + quotient);
		
		Calculator2 square1 = (x) -> x*x;
		Calculator2 square2 = x -> x*x;
		int s1 = square1.calculate(50);
		int s2 = square2.calculate(10);
		
		System.out.println("s1 = " + s1 + " s2 = " + s2);
		
		//Pass lambda expression as arguments
		someMethod(multiply, divide);
		
		//Pass lambda expression as arguments
		anotherMethod((x,y) -> {return x*y;}, 	//return is specified
					  (x,y) -> x/y);
	}
	
	public static void someMethod(Calculator m, Calculator d){
		int product = m.calculate(60, 10);
        int quotient = d.calculate(60, 10);
        System.out.println("product = " + product + " quotient = " + quotient);
	}
	
	public static void anotherMethod(Calculator m, Calculator d){
		int product = m.calculate(70, 10);
        int quotient = d.calculate(70, 10);
        System.out.println("product = " + product + " quotient = " + quotient);
	}
}
