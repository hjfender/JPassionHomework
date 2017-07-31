package com.jpassion.dp;

// TODO (Homework): Build an auction system using Mediator pattern. 

// <Steps to follow>
// 0. Uncomment the client code below
// 1. Create "IAuctionHouse" interface, which has 
//    void bid(Bidder bidder, Item item, int price); 
// 2. Create "AuctionHouse" class, which implements
//    "IAuctionHouse" interface
// 3. Create "Bidder" class, which has a reference to
//    IAuctionHouse object

// Running this application result in something like following
//
// Sang bid on iPhone with $30
// Mary bid on iPhone with $35

public class Client {
	public static void main(String[] args) {

		IAuctionHouse iAuctionHouse = new AuctionHouse();

		Bidder sang = new Bidder("Sang", iAuctionHouse);
		Bidder mary = new Bidder("Mary", iAuctionHouse);
		Bidder david = new Bidder("David", iAuctionHouse);
		Item item = new Item("iPhone");

		sang.bid(item, 30);
		mary.bid(item, 35);

	}
}
