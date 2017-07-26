package com.jpassion.dp;

public class RectangleFactory extends ShapeFactoryAbstraction {

	@Override
	Shape shape() {
		System.out.println("Create rectangle");
		return new Rectangle(4f, 6f);
	}

}
