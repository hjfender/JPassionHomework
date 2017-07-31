package com.jpassion.dp.domain;

public class Airline {

	private String name;
	
	public Airline(String name) {
		this.name = name;
	}
	
	public void reserve() {
		System.out.println("Reserve airline " + name);
	}
}
