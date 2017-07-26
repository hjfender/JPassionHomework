package com.jpassion.dp;

public class CircleFactory extends ShapeFactoryAbstraction {

	@Override
	Shape shape() {
		System.out.println("Create circle");
		return new Circle(7f);
	}

}
