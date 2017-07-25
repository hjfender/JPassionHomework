package com.jpassion.dp.domain;

public class Cash extends PaymentSchemeAbstraction {

	public Cash(){
		setPaymentSchemeName("cash");
	}
	
	@Override
	public void pay() {
		System.out.println("pay with cash");
	}

}
