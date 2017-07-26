package com.jpassion.dp;

public abstract class Shape {
	public void doSomethingWithShape() {
		System.out.println("playing with shape " + this.getClass().getName());
	}
	
	public void colorIt() {
		System.out.println("color shape");
	}

	public void labelIt() {
		System.out.println("label shape");
	}

	public void drawIt() {
		System.out.println("draw shape");
	}
	
	public abstract void computeArea();
}
