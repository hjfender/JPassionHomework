package com.jpassion.dp.builder;

import com.jpassion.dp.domain.House;

public class HouseBuilder {
	
	private House house;

	public HouseBuilder(House house) {
		super();
		this.house = house;
	}
	
	public void constructHouse(){
		house.construct();
	}

}
