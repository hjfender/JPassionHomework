package com.jpassion.dp;

import com.jpassion.dp.domain.Cashier;
import com.jpassion.dp.domain.Cook;
import com.jpassion.dp.domain.Waiter;

// TODO (Homework): When a cook is done with cooking, it should
// notify the waiter and cashier.
//
// <Steps to follow>
// 0. Uncomment the client code below
// 1. Create "Waiter" class and "Casher" class, which implement 
// "java.util.Observer" interface
// 2. Create "Cook" class, which extends java.util.Observable" class.

// Running this application results in something like following
//
// Cook notified the waiter
// Cook notified the casher

public class Client {

	public static void main(String[] args) {
		Cook cook = new Cook("Sang");
		cook.addObserver(new Waiter());
		cook.addObserver(new Cashier());
		
		cook.finishCooking();		
	}
}