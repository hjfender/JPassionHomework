package com.jpassion.dp.domain;

public class BostonHouse extends House {

	public BostonHouse(String address) {
		super(address);
	}

	@Override
	public void layFoundation() {
		System.out.println("Laying a foundation for a " + this.getClass().getName());
	}

	@Override
	public void constructFrame() {
		System.out.println("Constructing a frame for a " + this.getClass().getName());
	}

	@Override
	public void buildExterior() {
		System.out.println("Building an exterior for a " + this.getClass().getName());
	}

	@Override
	public void paint() {
		System.out.println("Painting a " + this.getClass().getName());
	}

}
