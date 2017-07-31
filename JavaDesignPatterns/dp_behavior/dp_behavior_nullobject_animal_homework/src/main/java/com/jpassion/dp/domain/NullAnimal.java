package com.jpassion.dp.domain;

public class NullAnimal extends AbstractAnimal {

	@Override
	public String getAnimal() {
		return "Animal not available in dataset";
	}

}
