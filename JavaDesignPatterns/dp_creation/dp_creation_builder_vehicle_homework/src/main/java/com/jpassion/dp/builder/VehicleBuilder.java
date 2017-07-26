package com.jpassion.dp.builder;

import com.jpassion.dp.domain.Vehicle;

public abstract class VehicleBuilder {

	private Vehicle vehicle;
	
	public Vehicle getVehicle(){
		return vehicle;
	}
	
	public VehicleBuilder newVehicle(){
		this.vehicle = new Vehicle();
		return this;
	}
	
	public abstract VehicleBuilder setEngine();
	
	public abstract VehicleBuilder setTires();
	
	public abstract VehicleBuilder setExhaust();
}
