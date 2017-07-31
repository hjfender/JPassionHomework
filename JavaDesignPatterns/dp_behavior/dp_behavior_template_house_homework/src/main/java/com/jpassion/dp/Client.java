package com.jpassion.dp;

import com.jpassion.dp.builder.HouseBuilder;
import com.jpassion.dp.domain.BostonHouse;
import com.jpassion.dp.domain.ChicagoHouse;
import com.jpassion.dp.domain.NewYorkHouse;

// TODO (Homework): Construct regionally different style
// houses while following the common set of
// house construction procedure as following:
//   (1) lay foundation
//   (2) construct a frame
//   (3) work on exterior
//   (4) decorate interior
//   (5) paint the house
// Among these steps, for step (4) decorate interior
// all regions follow the same concrete scheme.

// <Steps to follow>
// 0. Uncomment the client code below
// 1. Create "House" abstract class, which contains
//    a template method "constructHouse()", which defines
//    a sequence of methods described above.
// 2. Create "NewYorkHouse" and "ChicagoHouse" concrete
//    classes, which extends "House" abstract class
// 3. Create "HouseBuilder" class (it is provided), which receives
//    "House" object as a constructor argument
//    (Or the client code can directly use the "House" object
//    without intermediary "HouseBuilder" class)
//
// <Optional steps>
// 4. Create "BostonHouse" concrete class and observe
//   the "HouseBuilder" class does not need to be modified.

//Running this application results in something like following
//
//Lay foundation in NewYork style
//Construct frame in NewYork style
//Work on exterior in NewYork style
//Decorate interior of the house
//Paint house in NewYork style
//Lay foundation in Chicago style
//Construct frame in Chicago style
//Work on exterior in Chicago style
//Decorate interior of the house
//Paint house in Chicago style

public class Client {
	public static void main(String[] args) {

		HouseBuilder houseBuilder = new HouseBuilder(new NewYorkHouse("1 Dream road"));
		houseBuilder.constructHouse();
		
		houseBuilder = new HouseBuilder(new ChicagoHouse("2 Jodan road"));
		houseBuilder.constructHouse();
		
		houseBuilder = new HouseBuilder(new BostonHouse("3 Donk avenue"));
		houseBuilder.constructHouse();
	}
}
