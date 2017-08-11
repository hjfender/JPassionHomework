package com.jpassion.dp;

import java.util.Random;

// TODO (Homework): Create Animal kingdom in which
// you want to create Monkeys with various heights 
// using Flyweight pattern

// <Steps to follow>
// 1. Create "AnimalFactory" class (provided with skeleton
//    code), which has "getAnimal(String animal, int height)"
//    static method that returns "IAnimal" object. It also
//    maintains previously created animal objects in the map
//    and if the object with same height already exists in
//    the map, it returns it. Otherwise, a new object gets
//    created and returned.

// Result of running this application results in something like following
//1: CreatingMonkeywhose height is 4
//Monkey says yo
//2: CreatingMonkeywhose height is 18
//Monkey says yo
//3: CreatingMonkeywhose height is 12
//Monkey says yo
//4: CreatingMonkeywhose height is 17
//Monkey says yo
//Monkey says yo
//5: CreatingMonkeywhose height is 3
//Monkey says yo
//Monkey says yo
//6: CreatingMonkeywhose height is 1
//Monkey says yo
//Monkey says yo
//7: CreatingMonkeywhose height is 6
//Monkey says yo
//8: CreatingMonkeywhose height is 19
//Monkey says yo
//9: CreatingMonkeywhose height is 7
//Monkey says yo
//10: CreatingMonkeywhose height is 14
//Monkey says yo
//Monkey says yo
//Monkey says yo
//11: CreatingMonkeywhose height is 15
//Monkey says yo
//Monkey says yo
//Monkey says yo
//Monkey says yo
//Monkey says yo

public class Client {

	private static final int NUMBER_OF_RETRIEVALS = 20;

	public static void main(String[] args) {
		
		for (int i = 0; i < NUMBER_OF_RETRIEVALS; ++i) {
			IAnimal iAnimal = (IAnimal) AnimalFactory.getAnimal("Monkey", new Random().nextInt(NUMBER_OF_RETRIEVALS));
			iAnimal.makeSound("yo");
		}

	}

}