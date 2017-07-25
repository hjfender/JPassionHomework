package com.jpassion.dip.domain;

public class Line implements IDrawable {

	private double length;
	
	public Line(double length){
		this.length = length;
	}

	public void draw() {
		System.out.println("line is drawn");
	}
	
}
