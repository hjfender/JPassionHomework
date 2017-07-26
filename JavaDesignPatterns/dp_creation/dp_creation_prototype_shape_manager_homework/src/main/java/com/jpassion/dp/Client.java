package com.jpassion.dp;

// TODO (Homework): Create a Circle object by cloning.
// Manage the collection of them in a Map.

public class Client {

	public static void main(String arg[]) {

		PrototypeManager prototypeManager = new PrototypeManager();
		
		// Create two original objects
		Circle obj1 = new Circle(3.0);
		prototypeManager.addPrototype("circle1", obj1);
		Circle obj2 = new Circle(5.0);
		prototypeManager.addPrototype("circle2", obj2);

		// Create another object by cloning
		Shape prototype = prototypeManager.clonePrototype("circle1");

		System.out.println("Original object = " + obj1);
		System.out.println("Cloned object = " + prototype);
		
		System.out.println(obj1 == prototype);
		System.out.println(obj1.equals(prototype));
	}
}