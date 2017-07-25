package com.jpassion.dp.domain;

public class ShoppingCart {

	private PaymentSchemeAbstraction paymentSchemeAbstraction;
	
	//GOOD: Payment scheme is injected through a constructor
	public ShoppingCart(PaymentSchemeAbstraction paymentSchemeAbstraction){
		this.paymentSchemeAbstraction = paymentSchemeAbstraction;
	}
	
	//GOOD: Payment scheme can be injected via a setter method
	public void setPaymentSchemeAbstraction(PaymentSchemeAbstraction paymentSchemeAbstraction){
		this.paymentSchemeAbstraction = paymentSchemeAbstraction;
	}
	
	public void takePayment() {
		paymentSchemeAbstraction.pay();
	}
}
