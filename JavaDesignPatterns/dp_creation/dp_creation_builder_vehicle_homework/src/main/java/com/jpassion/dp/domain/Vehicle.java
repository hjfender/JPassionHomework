package com.jpassion.dp.domain;

/* Vehicle */
public class Vehicle {
	private String engine;
	private String exhaust;
	private String tires;
	
	public String getEngine() {
		return engine;
	}
	
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public String getExhaust() {
		return exhaust;
	}
	
	public void setExhaust(String exhaust) {
		this.exhaust = exhaust;
	}
	
	public String getTires() {
		return tires;
	}
	
	public void setTires(String tires) {
		this.tires = tires;
	}
	
	@Override
	public String toString(){
		return this.engine + " " + this.tires + " " + this.exhaust + " ";
	}
}
