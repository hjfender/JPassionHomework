package com.jpassion.dp;

public class GUILib1_ConcreteImplementor implements GUI_Implementor {

	@Override
	public void drawCircle() {
		System.out.println("GUILib1 draws a circle");
	}

	@Override
	public void drawSquare() {
		System.out.println("GUILib1 draws a square");
	}

}
