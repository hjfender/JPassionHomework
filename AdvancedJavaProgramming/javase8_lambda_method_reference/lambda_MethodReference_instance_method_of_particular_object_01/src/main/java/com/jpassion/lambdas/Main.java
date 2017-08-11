package com.jpassion.lambdas;

public class Main {
	public static void main(String[] args) {
		//Create an object that will be used within the body of lambda expression
		Person myObject = new Person();
		
		//Anonymous inner class.
		MyFunctionalInterface fi1 = new MyFunctionalInterface() {
			public void mySingleAbstractMethod(String name, int age) {
				myObject.existingInstanceMethod(name, age);
			}
		};
		fi1.mySingleAbstractMethod("Jon", 88);
		
		//Lambda expression
		MyFunctionalInterface fi2 = (name, age) -> myObject.existingInstanceMethod(name, age);
		fi2.mySingleAbstractMethod("Jon", 77);
		
		//Method reference
		MyFunctionalInterface fi3 = myObject::existingInstanceMethod;
		fi3.mySingleAbstractMethod("Jon", 66);
	}
}
