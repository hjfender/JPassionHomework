package com.jpassion.dp.domain;

public abstract class House {
	
	private String address;
	
	public House(String address){
		this.address = address;
	}

	public void construct(){
		layFoundation();
		constructFrame();
		buildExterior();
		decorateInterior();
		paint();
	}

	public abstract void layFoundation();
	public abstract void constructFrame();
	public abstract void buildExterior();
	
	public void decorateInterior(){
		System.out.println("Decorating the interior the same way all day!");
	};
	
	public abstract void paint();
	
}
