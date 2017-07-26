package com.jpassion.dp;

public abstract class ShapeFactoryAbstraction {

	public Shape createShape() {
		Shape shape = shape();
		shape.computeArea();
		shape.labelIt();
		shape.drawIt();
		return shape;
	}

	abstract Shape shape();
}
