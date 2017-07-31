package com.jpassion.dp;

import com.jpassion.dp.command.AirlineReservation;
import com.jpassion.dp.command.CarReservation;
import com.jpassion.dp.command.HotelReservation;
import com.jpassion.dp.command.IReservation;
import com.jpassion.dp.command.TravelAgent_Invoker;
import com.jpassion.dp.domain.Airline;
import com.jpassion.dp.domain.Car;
import com.jpassion.dp.domain.Hotel;

// TODO (Homework): Simulate travel agent via Command pattern. 
// The travel agent can receive various kinds
// of reservation requests: car reservation, hotel reservation,
// airline reservation, etc.  The travel agent want execute them
// as a batch.

// <Steps to follow>
// 0. Uncomment the client code below
// 1. Create "IReservation" interface, that contains 'execute()" method
// 2. Create "HotelReservation". "CarReservation" classes that implement
//    the "IReservation" interface
// 3. Create "TravelAgent_Invoker" class (skeleton code is
//    provided), which performs bookkeeping of the reservation requests
//    and various schemes of request execution including batch execution.
//
// <Optional steps>
// 4. Add "AirlineReservation" class, and modify other codese accordingly.
//    (Note that it is really easy to add other types of reservation requests.
//     The "TravelAgent_Invoker" class does not need to be modified observing
//     open close principle)
// 5. Add "Undo previously submitted request" to the invoker. (It is considered
//    as part of bookkeeping chores the invoker performs)

// Running the  application might result in the following output
//
// Reserve hotel Hilton
// Reserve hotel Conrad
// Reserve car ford

public class Client {
	
	public static void main(String[] args) {
		
		IReservation commandA = new HotelReservation(new Hotel("Hilton"));
		IReservation commandB = new HotelReservation(new Hotel("Conrad"));
		IReservation commandC = new CarReservation(new Car("ford"));
		IReservation commandD = new AirlineReservation(new Airline("Delta"));

		TravelAgent_Invoker travelAgent = new TravelAgent_Invoker();
		travelAgent.addReservation(commandA);
		travelAgent.addReservation(commandB);
		travelAgent.addReservation(commandC);
		travelAgent.addReservation(commandD);

		travelAgent.executeReservations();
	}
}