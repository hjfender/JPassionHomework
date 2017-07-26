package com.jpassion.dp;

import com.jpassion.dp.domain.IFrame_AbstractProduct;
import com.jpassion.dp.domain.IMenu_AbstractProduct;
import com.jpassion.dp.domain.ITitleBar_AbstractProduct;
import com.jpassion.dp.factory.IGUI_AbstractFactory;
import com.jpassion.dp.factory.MacOS_ConcreteFactory;
import com.jpassion.dp.factory.Windows_ConcreteFactory;

// TODO (Homework): Create GUI libraries for Windows and
// MacOS using Abstract Factory pattern.  The GUI library supports 3 
// UI components: Frame, Menu, and Title bar.

//<Steps to follow>
// 0. Uncomment the client code below
// 1. Create "IGUI_AbstractFactory" interface (skeleton code is
//    provided)
// 2. Create "Windows_ConcreteFactory" and "MacOS_ConcreteFactory"
//    classes, which implement "IGUI_AbstractFactory" interface
// 3. Create "IFrame_AbstractProduct", "IMenu_AbstractProduct" (provided),
//    "ITitleBar_AbstractProduct" interfaces with appropriate method.
//    (For example, the "IMenu_AbstractProduct" interface has
//    "void displayMenu()" method.)
// 4. Create "WindowsFrame", "WindowsMenu", "WindowsTitlebar", which
//    implements "IFrame_AbstractProduct", "IMenu_AbstractProduct",
//    "ITitleBar_AbstractProduct" interfaces
// 5. Create "MacOSFrame", "MacOSMenu", "MacOSTitlebar", which
//    implements "IFrame_AbstractProduct", "IMenu_AbstractProduct",
//    "ITitleBar_AbstractProduct" interfaces
//
//<Optional steps>
// 1. Create "Linux_ConcreteFactory" and modify other files accordingly

// The result will look like something like following
//
// Windows: draw a frame
// Windows: display menu
// Windows: display title bar
// MacOS: draw a frame
// MacOS: display menu
// MacOS: display title bar

public class Client {

	public static void main(String[] args) {
		
		// Choose a concrete factory during runtime
		IGUI_AbstractFactory iGUI = new Windows_ConcreteFactory();
		
		// Create objects
		IFrame_AbstractProduct frame = iGUI.createFrame();
		IMenu_AbstractProduct menu = iGUI.createMenu();
		ITitleBar_AbstractProduct titlebar = iGUI.createTitle();

		// Use objects
		frame.drawFrame();
		menu.displayMenu();
		titlebar.displayTitleBar();
		
		// Choose another concrete factory during runtime
		iGUI = new MacOS_ConcreteFactory();
		
		// Create objects
		frame = iGUI.createFrame();
		menu = iGUI.createMenu();
		titlebar = iGUI.createTitle();

		// Use objects
		frame.drawFrame();
		menu.displayMenu();
		titlebar.displayTitleBar();
				
	}

}
