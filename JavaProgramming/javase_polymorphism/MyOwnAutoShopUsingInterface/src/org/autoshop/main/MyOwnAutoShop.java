package org.autoshop.main;

import org.autoshop.classes.*;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		CarInterface[] listOfCars = {
										new Sedan(50, 20000, "Black", 14),
									 	new Ford(80, 30000, "Red", 2001, 3500),
									 	new Ford(60, 25000, "Blue", 14, 1500),
									 	new Car(40, 15000, "Green")
									 };
	
		for (CarInterface car : listOfCars) {
			System.out.println("Sale prive of the " + car.getClass().getName() + " is " + car.getSalePrice() + ".");
		}
	}
}
