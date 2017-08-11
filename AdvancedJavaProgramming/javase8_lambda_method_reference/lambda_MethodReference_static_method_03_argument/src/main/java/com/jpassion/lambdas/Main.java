package com.jpassion.lambdas;

public class Main {

	public static void main(String[] args) {
		//Lambda expression
		yourMethod((name, age) -> System.out.println(name + " is " + age + " years old"));
		
		//Lambda expression using a static method of an existing class
		yourMethod((name, age) -> MyClass.existingStaticMethod(name, age));
		
		//Method reference
		yourMethod(MyClass::existingStaticMethod);
	}
	
	public static void yourMethod(MyFunctionalInterface x) {
		x.mySingleAbstractMethod("Jon", 11);
	}
}
