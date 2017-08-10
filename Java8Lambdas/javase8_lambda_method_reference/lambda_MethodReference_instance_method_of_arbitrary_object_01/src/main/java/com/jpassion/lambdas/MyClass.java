package com.jpassion.lambdas;

@FunctionalInterface
interface MyInterface <T, U, V> {
	V apply(T receiver, U argument);
}

public class MyClass {

	Integer existingInstanceMethod(String s1) {
		System.out.println("length of " + s1 + " is " + s1.length());
		return s1.length();
	}
	
	static void testMethod(MyInterface<MyClass, String, Integer> func) {
		Integer result = func.apply(new MyClass(), "jpassion");
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		//lambda expression assigned to a variable
		MyInterface<MyClass, String, Integer> myfunction1 = (MyClass myClass, String s1) -> myClass.existingInstanceMethod(s1);
		Integer result1 = myfunction1.apply(new MyClass(), "jpassion");
		System.out.println(result1);
		
		//method reference assigned to a variable
		MyInterface<MyClass, String, Integer> myfunction2 = MyClass::existingInstanceMethod;
		Integer result2 = myfunction2.apply(new MyClass(), "jpassion");
		System.out.println(result2);
		
		//lambda expression passed as an argument
		testMethod((MyClass myClass, String s1) -> myClass.existingInstanceMethod(s1));
		
		//method reference passed as an argument
		testMethod(MyClass::existingInstanceMethod);
	}
}
