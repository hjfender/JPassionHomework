package com.jpassion.dp.domain;

public class Hotel {

	private String name;

	public Hotel(String name) {
		this.name = name;
	}
	
	public void reserve() {
		System.out.println("Reserve hotel " + name);	
	}
}
