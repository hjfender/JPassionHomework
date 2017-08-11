package com.jpassion.dp;

public class GUILib3_ConcreteImplementor implements GUI_Implementor {
	
	@Override
	public void drawCircle() {
		System.out.println("GUILib3 draws a circle");
	}

	@Override
	public void drawSquare() {
		System.out.println("GUILib3 draws a square");
	}
}
