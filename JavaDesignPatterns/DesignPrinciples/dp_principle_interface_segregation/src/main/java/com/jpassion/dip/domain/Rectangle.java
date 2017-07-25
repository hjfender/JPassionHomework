package com.jpassion.dip.domain;

public class Rectangle implements IAreaComputable, IDrawable {

	private double height;
	private double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public void draw() {
		System.out.println("Rectangle is drawn");
	}
	
	public double computeArea(){
		return height * width;
	}
}
