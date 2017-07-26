package com.jpassion.dp;

public class ShapeManufacturer {
	
	private SimpleShapeFactory simpleShapeFactory;

	public ShapeManufacturer(SimpleShapeFactory simpleShapeFactory) {
		this.simpleShapeFactory = simpleShapeFactory;
	}

	public void handleShapeOrder(String shapeToCreate) {
		Shape shape = simpleShapeFactory.createShape(shapeToCreate);
		
		shape.computeArea();
		shape.colorIt();
		shape.labelIt();
		shape.drawIt();
	}

}
