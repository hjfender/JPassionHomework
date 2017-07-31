package com.jpassion.dp.domain;

public class Car {

	private String model;

	public Car(String model) {
		this.model = model;
	}
	
	public void reserve() {
		System.out.println("Reserve car " + model);	
	}
}
