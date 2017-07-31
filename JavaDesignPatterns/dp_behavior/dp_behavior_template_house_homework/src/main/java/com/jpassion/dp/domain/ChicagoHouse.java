package com.jpassion.dp.domain;

public class ChicagoHouse extends House {

	public ChicagoHouse(String address) {
		super(address);
	}

	@Override
	public void layFoundation() {
		System.out.println("Who cares about a " + this.getClass().getName() + "'s foundation?");
	}

	@Override
	public void constructFrame() {
		System.out.println("Who cares about a " + this.getClass().getName() + "'s frame?");
	}

	@Override
	public void buildExterior() {
		System.out.println("Who cares about a " + this.getClass().getName() + "'s exterior?");
	}

	@Override
	public void paint() {
		System.out.println("Who cares about a " + this.getClass().getName() + "'s paint?");
	}

}
