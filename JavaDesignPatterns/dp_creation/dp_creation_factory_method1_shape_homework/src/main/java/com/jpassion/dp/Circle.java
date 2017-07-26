package com.jpassion.dp;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void computeArea() {
		System.out.println(Math.PI * (radius * radius)); 
	}
}
