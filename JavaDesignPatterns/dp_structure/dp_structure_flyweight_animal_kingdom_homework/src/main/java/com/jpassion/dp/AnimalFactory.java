package com.jpassion.dp;

import java.util.HashMap;

public class AnimalFactory {

	private static HashMap<String, IAnimal> animalMap = new HashMap<String, IAnimal>();
	
	public static IAnimal getAnimal(String animal, int height) {

		IAnimal iAnimal = animalMap.get(animal + height);

		if(iAnimal == null) {
			System.out.println("Creating Monkey whose height is " + height);
			iAnimal = new Monkey(height);
			animalMap.put(animal+height, iAnimal);
		}
		return iAnimal;
	}
}
