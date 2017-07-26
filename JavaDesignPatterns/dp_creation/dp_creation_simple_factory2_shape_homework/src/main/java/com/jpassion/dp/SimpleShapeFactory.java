package com.jpassion.dp;

public class SimpleShapeFactory {

	public Shape createShape(String shapeToCreate){
		
		Shape shape;
		
		switch(shapeToCreate){
		case "circle":
			shape = new Circle(5f);
			break;
		case "rectangle":
			shape = new Rectangle(1f,1f);
			break;
		default:
			shape = null;
			break;
		}
		
		return shape;
	}
}
