package com.jpassion.dp;

public class Linux_RefinedAbstraction extends OSPlatform_Abstraction {

	private static final int MINSCREENSIZE = 75;
	private static final int MAXSCREENSIZE = 350;
	
	public Linux_RefinedAbstraction(GUI_Implementor implementor) {
		super(implementor);
	}

	@Override
	public int getMinScreenSize() {
		return MINSCREENSIZE;
	}

	@Override
	public int getMaxScreenSize() {
		return MAXSCREENSIZE;
	}

}
