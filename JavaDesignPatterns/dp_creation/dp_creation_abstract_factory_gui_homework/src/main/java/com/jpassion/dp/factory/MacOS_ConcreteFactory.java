package com.jpassion.dp.factory;

import com.jpassion.dp.domain.IFrame_AbstractProduct;
import com.jpassion.dp.domain.IMenu_AbstractProduct;
import com.jpassion.dp.domain.ITitleBar_AbstractProduct;
import com.jpassion.dp.domain.MacOSFrame;
import com.jpassion.dp.domain.MacOSMenu;
import com.jpassion.dp.domain.MacOSTitleBar;

public class MacOS_ConcreteFactory implements IGUI_AbstractFactory {

	@Override
	public IFrame_AbstractProduct createFrame() {
		System.out.println("Create Mac OS Frame");
		return new MacOSFrame();
	}

	@Override
	public IMenu_AbstractProduct createMenu() {
		System.out.println("Create Mac OS Menu");
		return new MacOSMenu();
	}

	@Override
	public ITitleBar_AbstractProduct createTitle() {
		System.out.println("Create Mac OS Title Bar");
		return new MacOSTitleBar();
	}

}
