package com.jpassion.dp;

public abstract class Shape {
	public void doSomethingWithShape() {
		System.out.println("playing with shape " + this.getClass().getName());
	}
	
	public abstract void computeArea();
}
