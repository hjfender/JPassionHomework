package com.jpassion.dip.domain;

public class Circle implements IDrawable, IAreaComputable {

	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}

	public void draw() {
		System.out.println("Circle is drawn");
	}

	public double computeArea() {
		return radius * radius * Math.PI;
	}
}
