package com.jpassion.dp;

public class Rectangle extends Shape {
	
	private double height;
	private double width;
	
	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	@Override
	public void computeArea() {
		System.out.println(height * width); 
	}

}
