package com.jpassion.dp.builder;

public class AutomobileBuilder extends VehicleBuilder {

	@Override
	public VehicleBuilder setEngine() {
		this.getVehicle().setEngine("automobile engine added ");
		return this;
	}
	
	@Override
	public VehicleBuilder setExhaust() {
		this.getVehicle().setExhaust("automobile exhaust added ");
		return this;
	}

	@Override
	public VehicleBuilder setTires() {
		this.getVehicle().setTires("automobile tires added ");
		return this;
	}
	
}
