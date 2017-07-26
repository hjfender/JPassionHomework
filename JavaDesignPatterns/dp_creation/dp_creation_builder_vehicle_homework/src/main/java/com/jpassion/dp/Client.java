package com.jpassion.dp;

import com.jpassion.dp.builder.AutomobileBuilder;
import com.jpassion.dp.builder.BikeBuilder;
import com.jpassion.dp.builder.VehicleBuilder;
import com.jpassion.dp.domain.Vehicle;
import com.jpassion.dp.factory.VehicleFactory;

// TODO (Homework): Build automobile or bike using builder
// pattern.
//
// <Steps to follow>
// 0. Uncomment the client code below
// 1. Create "VehicleBuilder" abstract class, which contains
//    "setEngine()", "setTires()", and "setExhaust()" abstract methods
// 2. Create "AutomobileBuilder" and "BikeBuilder" classes,
//    which implement abstract methods of the "VehicleBuilder" class
// 3. Create "VehicleFactory" class, to which "VehicleBuilder" object
//    gets injected via constructor.  Add "buildVehicle()" method
//    to this class.

// The result will look like something like following
//
// Bike = bike engine added bike tires added bike exhaust added
// Automobile = automobile engine added automobile tires added automobile exhaust added

class Client {

	public static void main(String[] args) {
		
		// Set things up
		VehicleFactory factory = new VehicleFactory();
		
		// Create bike via BikeBuilder
		VehicleBuilder bikeBuilder = new BikeBuilder();
		factory.setVehicleBuilder(bikeBuilder);
		factory.buildVehicle();

		Vehicle carA = factory.getVehicle();
		System.out.println("Bike = " + carA);
		
		// Create automobile via AutomobileBuilder
		VehicleBuilder fancyCarBuilder = new AutomobileBuilder();
		factory.setVehicleBuilder(fancyCarBuilder);
		factory.buildVehicle();

		Vehicle carB = factory.getVehicle();
		System.out.println("Automobile = " + carB);
	}
}

