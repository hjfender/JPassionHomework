package com.jpassion.dp.command;

import com.jpassion.dp.domain.Car;

public class CarReservation implements IReservation {
	
	private Car car;

	public CarReservation(Car car) {
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public void execute() {
		car.reserve();
	}

}
