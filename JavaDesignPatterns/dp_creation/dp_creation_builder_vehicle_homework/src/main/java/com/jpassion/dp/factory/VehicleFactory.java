package com.jpassion.dp.factory;

import com.jpassion.dp.builder.VehicleBuilder;
import com.jpassion.dp.domain.Vehicle;

public class VehicleFactory {

	VehicleBuilder vehicleBuilder;

	public void setVehicleBuilder(VehicleBuilder vehicleBuilder) {
		this.vehicleBuilder = vehicleBuilder;
	}
	
	public Vehicle getVehicle() {
		return vehicleBuilder.getVehicle();
	}

	public void buildVehicle() {
		vehicleBuilder.newVehicle()
					  .setEngine()
					  .setExhaust()
					  .setTires();
	}

}
