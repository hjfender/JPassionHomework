package com.jpassion.dp.domain;

public class NewYorkHouse extends House {

	public NewYorkHouse(String address) {
		super(address);
	}

	@Override
	public void layFoundation() {
		System.out.println("For " + this.getClass().getName() + "'s we lay foundations differently");
	}

	@Override
	public void constructFrame() {
		System.out.println("For " + this.getClass().getName() + "'s we construct frames differently");
	}

	@Override
	public void buildExterior() {
		System.out.println("For " + this.getClass().getName() + "'s we build exteriors differently");
	}

	@Override
	public void paint() {
		System.out.println("For " + this.getClass().getName() + "'s we paint differently");
	}

}
