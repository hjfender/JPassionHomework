package com.jpassion.lambdas;

public class Main {

	public static void main(String[] args) {
		//Set variables with lambda expressions
		Calculator multiply = (x,y) -> x*y;
		Calculator divide = (x,y) -> x/y;
		
		//Call methods of lambda expressions
		int product = multiply.calculate(50, 10);
		int quotient = divide.calculate(50,10);
		
		System.out.println("product = " + product + " quotient = " + quotient);
		
		
		//Pass lambda expressions to a method as arguments
		someMethod(multiply, divide);
		
		//Pass lambda expressions to a method as arguments
		//Implement them in the method signature
		anotherMethod((x,y)->x*y,(x,y)->x/y);
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
