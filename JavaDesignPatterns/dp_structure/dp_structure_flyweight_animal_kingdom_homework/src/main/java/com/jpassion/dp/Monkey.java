package com.jpassion.dp;

public class Monkey implements IAnimal {
	private int height;
	
	public Monkey(){		
	}

	public Monkey(int height) {
		this.height = height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void makeSound(String sound) {
		System.out.println("Monkey says " + sound);
	}
}