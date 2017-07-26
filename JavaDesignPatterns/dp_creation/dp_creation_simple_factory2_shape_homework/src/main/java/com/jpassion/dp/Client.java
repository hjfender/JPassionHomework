package com.jpassion.dp;

// TODO (Homework) : Create ShapeManufacturer class, which contains
// handleShapeOrder() method, in which computeArea(),
// colorIt(), labelIt(), and drawIt() method of 
// Shape class gets called in sequence. 

//<Steps to follow>
// 0. Uncomment the client code below
// 1. Use provided "Shape", "Circle", and "Rectangle" classes
// 2. Create "SimpleShapeFactory" class
// 3. Create "ShapeManufacturer" class

// Running this application results in something like following:
//
//78.53981633974483
//color shape
//label shape
//draw shape

public class Client {
	
	public static void main(String[] args) {
		
		String shapeToCreate = "circle";
		if (args.length == 1){
			shapeToCreate = args[0];
		}
		
		ShapeManufacturer shapeManufacturer = new ShapeManufacturer(new SimpleShapeFactory());
		shapeManufacturer.handleShapeOrder(shapeToCreate);
		
	}

}
