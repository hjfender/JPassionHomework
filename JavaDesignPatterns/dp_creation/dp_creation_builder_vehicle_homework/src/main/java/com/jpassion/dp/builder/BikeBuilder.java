package com.jpassion.dp.builder;

public class BikeBuilder extends VehicleBuilder {

	@Override
	public VehicleBuilder setEngine() {
		this.getVehicle().setEngine("bike engine added ");
		return this;
	}
	
	@Override
	public VehicleBuilder setExhaust() {
		this.getVehicle().setExhaust("bike exhaust added ");
		return this;
	}

	@Override
	public VehicleBuilder setTires() {
		this.getVehicle().setTires("bike tires added ");
		return this;
	}

}
