package com.jpassion.dp;

// TODO (Homework): We want OS platform vendors to be able use multiple set of
// GUI libraries, GUILib1 and GUILib2, for example. OS platform vendors
// want to evolve their platforms independently from the GUI libraries 
// they use.

// <Steps to follow>
// 1. Create "OSPlatform_Abstraction" abstract class, which contains
//    "GUI_Implementor" type object as a field. It also contains
//    abstract methods - getMinScreenSize() and getMaxScreenSize()
//    assuming different OS platform will have different min and max
//    screen sizes.
// 2. Create "Windows_RefinedAbstraction" and "MacOS_RefinedAbstraction"
//    classes, which extends "OSPlatform_Abstraction" abstract class
// 3. Create "GUI_Implementor" abstract class, which has its own
//    abstract methods - drawCircle() and drawSquare() methods
// 4. Create "GUILib1_ConcreteImplementor" and "GUILib2_ConcreteImplementor"
//    classes, which implement abstract methods of "GUI_Implementor" abstract class

// <Optional steps>
// 5. Add "GUILib3".  Observe that it does not force any change in the
//    OS platform related code. It proves that the abstraction (OS platform)
//    and the implementor (GUI libraries) can evolve independently.
// 6. Add "Linux_RefinedAbstraction" and observe that it does not force
//    any change in the GUI library related code.

// Running this application results in something like following:
//
//GUILib1 draws a circle
//GUILib1 draws a square
//min screensize = 50
//max screensize = 500
//GUILib2 draws a circle
//GUILib2 draws a square
//min screensize = 100
//max screensize = 200

public class Client{
	
	public static void main(String[] args){
		
		OSPlatform_Abstraction osPlatform_Abstraction = new Windows_RefinedAbstraction(new GUILib1_ConcreteImplementor());		
		
		osPlatform_Abstraction.drawCircle();
		osPlatform_Abstraction.drawSquare();
		
		System.out.println("min screensize = " + osPlatform_Abstraction.getMinScreenSize());
		System.out.println("max screensize = " + osPlatform_Abstraction.getMaxScreenSize());
	
		// You can use a different implementor 
		osPlatform_Abstraction = new MacOS_RefinedAbstraction(new GUILib2_ConcreteImplementor());
		osPlatform_Abstraction.drawCircle();
		osPlatform_Abstraction.drawSquare();
		
		System.out.println("min screensize = " + osPlatform_Abstraction.getMinScreenSize());
		System.out.println("max screensize = " + osPlatform_Abstraction.getMaxScreenSize());
		
		//Practice using the Linux implementor
		osPlatform_Abstraction = new Linux_RefinedAbstraction(new GUILib3_ConcreteImplementor());
		osPlatform_Abstraction.drawCircle();
		osPlatform_Abstraction.drawSquare();
		
		System.out.println("min screensize = " + osPlatform_Abstraction.getMinScreenSize());
		System.out.println("max screensize = " + osPlatform_Abstraction.getMaxScreenSize());
	}
	
}