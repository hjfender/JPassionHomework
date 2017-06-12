package org.autoshop.main;

import org.autoshop.classes.*;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		//Create an instance of the sedan class
		Sedan sedan = new Sedan(50, 20000, "Black", 14);
		
		//Create two instances of the ford class
		Ford ford1 = new Ford(80, 30000, "Red", 2001, 3500);
		Ford ford2 = new Ford(60, 25000, "Blue", 14, 1500);
		
		//Create an instance of the Car class and initialize all the fields
		Car car = new Car(40, 15000, "Green");
		
		//display the sale prices of all instances
		System.out.println("Sale price of the sedan " + sedan.getSalePrice());
		System.out.println("Sale price of the first ford " + ford1.getSalePrice());
		System.out.println("Sale price of the second ford " + ford2.getSalePrice());
		System.out.println("Sale price of the generic car " + car.getSalePrice());
	}
}
