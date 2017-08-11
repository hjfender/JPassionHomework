package com.jpassion.dp;

public class GUILib2_ConcreteImplementor implements GUI_Implementor {

	@Override
	public void drawCircle() {
		System.out.println("GUILib2 draws a circle");
	}

	@Override
	public void drawSquare() {
		System.out.println("GUILib2 draws a square");
	}

}
