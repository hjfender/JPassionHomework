package com.jpassion.dp.domain;

public class Customer {

	/*
	 * GOOD DESIGN: Open Close principle is used. In this example,
	 * this code does not need to be changed even if a new payment
	 * scheme is used. In other words, this code does not need to
	 * know any concrete payment schemes.
	 */
	/*
	 * GOOD DESIGN: This is another example of dependency inversion.
	 * The higher level class (Customer class) does not depend of lower
	 * level concrete classes anymore.
	 */
	public void pay(PaymentSchemeAbstraction paymentScheme){
		paymentScheme.pay();
	}
}
