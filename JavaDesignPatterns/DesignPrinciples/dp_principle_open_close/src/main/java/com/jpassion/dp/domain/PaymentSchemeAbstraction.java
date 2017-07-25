package com.jpassion.dp.domain;

public abstract class PaymentSchemeAbstraction {

	private String paymentSchemeName;

	public String getPaymentSchemeName() {
		return paymentSchemeName;
	}

	public void setPaymentSchemeName(String paymentSchemeName) {
		this.paymentSchemeName = paymentSchemeName;
	}
	
	public abstract void pay();
}
