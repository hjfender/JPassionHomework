package com.jpassion.dp.domain;

import java.util.Observable;

public class Cook extends Observable {

	private String name;
	private boolean cooking;

	public Cook(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean isCooking() {
		return cooking;
	}
	
	public void finishCooking() {
		this.cooking = false;
		setChanged();
		notifyObservers(this.cooking);
	}
	
	@Override
	public String toString() {
		return getName();
	}


}
