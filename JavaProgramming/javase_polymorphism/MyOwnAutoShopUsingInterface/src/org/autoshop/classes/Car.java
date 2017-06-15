package org.autoshop.classes;

public class Car implements CarInterface {
	
	private int speed;
	private double regularPrice;
	private String color;
	
	public Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	
	@Override
	public double getSalePrice(){
		return getRegularPrice();
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public double getRegularPrice() {
		return regularPrice;
	}

	@Override
	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}
}
