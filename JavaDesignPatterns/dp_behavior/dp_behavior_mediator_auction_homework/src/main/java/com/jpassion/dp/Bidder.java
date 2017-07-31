package com.jpassion.dp;

public class Bidder {

	private String name;
	private IAuctionHouse iAuctionHouse;

	public Bidder(String name, IAuctionHouse iAuctionHouse) {
		this.setName(name);
		this.iAuctionHouse = iAuctionHouse;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public void bid(Item item, int price) {
		iAuctionHouse.bid(this, item, price);
	}

	

}
