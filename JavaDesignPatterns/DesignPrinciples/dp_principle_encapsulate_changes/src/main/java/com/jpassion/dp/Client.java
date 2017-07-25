package com.jpassion.dp;

import com.jpassion.dp.domain.SimpleToyFactory;
import com.jpassion.dp.domain.Toy;

public class Client {

	public static void main(String[] args) {
		String toyToCreate = "car";
		if(args.length == 1){
			toyToCreate = args[0];
		}
		
		//GOOD: This Client class does not need to be changed
		//every time a new toy needs to be created.
		Toy toy = SimpleToyFactory.createToy(toyToCreate);
		System.out.println("toy that was created = " + toy.getClass());
		
		toy.performSomeBusinessLogic();
	}
}
