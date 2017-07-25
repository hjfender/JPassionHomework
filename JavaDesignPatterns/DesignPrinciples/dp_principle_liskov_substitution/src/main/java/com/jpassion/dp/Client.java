package com.jpassion.dp;

import com.jpassion.dp.domain.Rectangle;

public class Client {

	private static Rectangle getNewRectangle() {
		return new Rectangle();
		//return new Square();
	}
	
	public static void main(String[] args) {
		Rectangle r = Client.getNewRectangle();
		
		r.setWidth(5);
		r.setHeight(10);
		
		System.out.println("Rectangle with 5 and 10 = " + r.computeArea());
	}
}
