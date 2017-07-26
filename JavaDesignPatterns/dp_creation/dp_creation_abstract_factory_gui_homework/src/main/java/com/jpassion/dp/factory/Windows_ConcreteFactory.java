package com.jpassion.dp.factory;

import com.jpassion.dp.domain.IFrame_AbstractProduct;
import com.jpassion.dp.domain.IMenu_AbstractProduct;
import com.jpassion.dp.domain.ITitleBar_AbstractProduct;
import com.jpassion.dp.domain.WindowsFrame;
import com.jpassion.dp.domain.WindowsMenu;
import com.jpassion.dp.domain.WindowsTitleBar;

public class Windows_ConcreteFactory implements IGUI_AbstractFactory {

	@Override
	public IFrame_AbstractProduct createFrame() {
		System.out.println("Create Windows Frame");
		return new WindowsFrame();
	}

	@Override
	public IMenu_AbstractProduct createMenu() {
		System.out.println("Create Windows Menu");
		return new WindowsMenu();
	}

	@Override
	public ITitleBar_AbstractProduct createTitle() {
		System.out.println("Create Windows Title Bar");
		return new WindowsTitleBar();
	}

}
