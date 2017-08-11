package com.jpassion.dp;

public abstract class OSPlatform_Abstraction {

	private GUI_Implementor implementor;
	
	public OSPlatform_Abstraction(GUI_Implementor implementor) {
		this.implementor = implementor;
	}
	
	public abstract int getMinScreenSize();
	public abstract int getMaxScreenSize();

	public void drawCircle() {
		implementor.drawCircle();
	};
	
	public void drawSquare() {
		implementor.drawSquare();
	};
}
