package com.jpassion.dp;

// TODO (Homework): Create SimpleShapeFactory class, through 
// which you can create either Circle or Rectangle. Display 
// computed area from the created object.  

// <Steps to follow>
// 0. Uncomment the client code below
// 1. Use provided "Shape", "Circle", and "Rectangle" classes
// 2. Create "SimpleShapeFactory" class

// The result will look something like following
//
//playing with shape com.jpassion.dp.Circle
//78.53981633974483

public class Client {
	
	public static void main(String[] args) {
		
		String shapeToCreate = "circle";
		if (args.length == 1){
			shapeToCreate = args[0];
		}
		
		Shape shape = SimpleShapeFactory.createToy(shapeToCreate);
		
		shape.doSomethingWithShape();
		shape.computeArea();
		
	}

}
