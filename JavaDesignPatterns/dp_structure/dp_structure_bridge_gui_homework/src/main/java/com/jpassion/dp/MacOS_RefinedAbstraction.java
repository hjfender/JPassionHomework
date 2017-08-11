package com.jpassion.dp;

public class MacOS_RefinedAbstraction extends OSPlatform_Abstraction {

	private static final int MINSCREENSIZE = 100;
	private static final int MAXSCREENSIZE = 200;
	
	public MacOS_RefinedAbstraction(GUI_Implementor implementor) {
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
