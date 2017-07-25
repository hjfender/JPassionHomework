package com.jpassion.dp.domain;

public class SimpleToyFactory {

	public static Toy createToy(String toyToCreate) {
		
		Toy toy;
		
		//GOOD: We encapsulate changing part into
		//another class so that existing class does not
		//need to be changed
		//
		//BAD: Well... this code needs to be changed
		//every time a new toy is added - hence the
		//reason we might use Factory Method pattern.
		switch(toyToCreate){
		case "car":
			toy = new CarToy();
			break;
		case "train":
			toy = new TrainToy();
			break;
		case "plain":
			toy = new PlainToy();
			break;
		default:
			toy = null;
		}
		
		return toy;
	}
}
