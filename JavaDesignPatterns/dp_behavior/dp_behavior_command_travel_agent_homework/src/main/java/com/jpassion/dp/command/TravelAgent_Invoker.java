package com.jpassion.dp.command;

import java.util.ArrayList;
import java.util.List;

public class TravelAgent_Invoker {
	
	// TODO: Add a private field for the list of IReservation requests
	private List<IReservation> reservationsList = new ArrayList<>(); 

	// TODO: Add a method for adding a new reservation request
	public void addReservation(IReservation reservation) {
		reservationsList.add(reservation);
	}
	
	public void removeReservation(IReservation reservation) {
		reservationsList.remove(reservation);
	}
	
	// TODO: Add a method for executing a single reservation request
	public void execute(IReservation reservation) {
		reservation.execute();
		reservationsList.remove(reservation);
	}
	

	// TODO: Add a method for executing all reservation requests in the list
	public void executeReservations(){
		for(IReservation reservation : reservationsList){
			reservation.execute();
		}
		reservationsList.clear();
	}

}
