package com.jpassion.dp.domain;

public class Paypal extends PaymentSchemeAbstraction {

	public Paypal(){
		setPaymentSchemeName("paypal");
	}
	
	@Override
	public void pay(){
		System.out.println("pay with paypal");
	}
}
