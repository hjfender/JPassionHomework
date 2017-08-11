package com.jpassion.dp;

public class Windows_RefinedAbstraction extends OSPlatform_Abstraction {

	private static final int MINSCREENSIZE = 50;
	private static final int MAXSCREENSIZE = 500;
	
	public Windows_RefinedAbstraction(GUI_Implementor implementor) {
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
