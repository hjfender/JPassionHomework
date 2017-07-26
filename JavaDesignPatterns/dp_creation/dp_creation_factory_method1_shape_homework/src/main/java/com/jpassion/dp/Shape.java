package com.jpassion.dp;

public abstract class Shape {
	public void doSomethingWithShape() {
		System.out.println("playing with shape " + this.getClass().getName());
	}
	
	public void colorIt() {
		System.out.println("color shape " + this.getClass().getName());
	}

	public void labelIt() {
		System.out.println("label shape " + this.getClass().getName());
	}

	public void drawIt() {
		System.out.println("draw shape " + this.getClass().getName());
	}
	
	public abstract void computeArea();
}
