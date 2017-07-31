package com.jpassion.dp.domain;

public abstract class AbstractAnimal {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract String getAnimal();
}
