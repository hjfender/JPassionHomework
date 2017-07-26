package com.jpassion.dp;

// TODO (Homework): Create Circle and Rectangle using Factory method pattern.

// <Steps to follow>
// 0. Uncomment the client code below
// 1. Create "ShapeFactoryAbstraction" class, which contains "createShape()"
//    abstract method
// 2. Create "CircleFactory" and "RectangleFactory" classes, which implements
//    the "createShape()" abstract method of the "ShapeFactoryAbstraction" class

//The result will look like something like following
//Create circle
//153.93804002589985
//label shape com.jpassion.dp.Circle
//draw shape com.jpassion.dp.Circle
//Create rectangle
//24.0
//label shape com.jpassion.dp.Rectangle
//draw shape com.jpassion.dp.Rectangle

public class Client {

	public static void main(String[] args) {

// Option 1 - Decide which concrete factory to use 
	
		// Decide which concrete factory to use during runtime
		ShapeFactoryAbstraction shapeFactoryAbstraction = new CircleFactory();
		Shape shape = shapeFactoryAbstraction.createShape();
		
		// Decide which concrete factory to use during runtime
		shapeFactoryAbstraction = new RectangleFactory();
		shape = shapeFactoryAbstraction.createShape();
		
// Option 2 - Decide which concrete factory to use from user-provided argument 
 
//		String shapeFactory = "com.jpassion.dp.CircleFactory";
//		if (args.length == 1) {
//			shapeFactory = args[0];
//		}
//
//		// GOOD: The name of the factory class can be set during
//		// runtime. In other words, this code does not have to
//		// be changed.
//		try {
//			ShapeFactoryAbstraction shapeFactoryAbstraction = (ShapeFactoryAbstraction) Class.forName(shapeFactory).newInstance();
//			Shape shape = shapeFactoryAbstraction.createShape();
//
//			shapeFactory = "com.jpassion.dp.RectangleFactory"; // This could be set during runtime.
//			shapeFactoryAbstraction = (ShapeFactoryAbstraction) Class.forName(shapeFactory).newInstance();
//			shape = shapeFactoryAbstraction.createShape();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}
