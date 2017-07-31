package com.jpassion.dp.domain;

public class AnimalDataset {
	
	public static final String[] animals = { "Monkey", "Lion", "Deer", "Bird"};

	public static AbstractAnimal getAnimal(String animal) {

		for (int i = 0; i < animals.length; i++) {
			if (animals[i].equalsIgnoreCase(animal)) {
				return new RealAnimal(animal);
			}
		}
		return new NullAnimal();
	}

}
