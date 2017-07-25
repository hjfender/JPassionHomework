package com.jpassion.dp.domain;

public class CreditCard extends PaymentSchemeAbstraction {
	
	public CreditCard() {
		setPaymentSchemeName("creditcard");
	}
	
	@Override
	public void pay(){
		System.out.println("pay with credit card");
	}
}
