package com.jpassion.dp.command;

import com.jpassion.dp.domain.Airline;

public class AirlineReservation implements IReservation {

	private Airline airline;

	public AirlineReservation(Airline airline) {
		this.setAirline(airline);
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	
	@Override
	public void execute() {
		airline.reserve();
	}

}
