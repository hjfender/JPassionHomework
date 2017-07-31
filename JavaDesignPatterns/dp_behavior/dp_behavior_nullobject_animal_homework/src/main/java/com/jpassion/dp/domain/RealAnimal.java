package com.jpassion.dp.domain;

public class RealAnimal extends AbstractAnimal {

	public RealAnimal(String name) {
		setName(name);
	}

	@Override
	public String getAnimal() {
		return this.getName();
	}

}
