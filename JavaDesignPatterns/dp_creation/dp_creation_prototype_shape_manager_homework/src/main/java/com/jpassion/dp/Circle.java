package com.jpassion.dp;

public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public Circle cloneIt() {
		Circle result = null;
		try{
			result = (Circle) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public boolean equals(Object object){
		Circle target = (Circle) object;
		return (this.getRadius() == target.getRadius()) ? true:false;
	}

}
