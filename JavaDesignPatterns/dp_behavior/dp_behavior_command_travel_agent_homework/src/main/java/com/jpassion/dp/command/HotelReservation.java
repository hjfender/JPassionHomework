package com.jpassion.dp.command;

import com.jpassion.dp.domain.Hotel;

public class HotelReservation implements IReservation {

	private Hotel hotel;

	public HotelReservation(Hotel hotel) {
		this.hotel = hotel;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	@Override
	public void execute(){
		hotel.reserve();
	}
}