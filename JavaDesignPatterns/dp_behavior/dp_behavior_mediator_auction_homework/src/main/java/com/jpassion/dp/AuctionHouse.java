package com.jpassion.dp;

public class AuctionHouse implements IAuctionHouse {

	@Override
	public void bid(Bidder bidder, Item item, int price) {
		System.out.println(bidder.getName() + " bid on " + item.getName() +" with $" + price);
	}

}
