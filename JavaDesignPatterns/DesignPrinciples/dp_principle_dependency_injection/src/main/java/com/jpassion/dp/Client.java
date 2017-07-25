package com.jpassion.dp;

import com.jpassion.dp.domain.PaymentSchemeAbstraction;
import com.jpassion.dp.domain.ShoppingCart;

public class Client {

	public static void main(String[] args) {
		//GOOD: a particular payment scheme can be
		//set during runtime
		PaymentSchemeAbstraction paymentScheme = null;
		String paymentSchemeName = "com.jpassion.dp.domain.Paypal";
		if(args.length == 1){
			paymentSchemeName = args[0];
		}
		
		try {
			paymentScheme = (PaymentSchemeAbstraction) Class.forName(paymentSchemeName).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//GOOD: Different payment scheme can be injected including mock object
		ShoppingCart shoppingCart = new ShoppingCart(paymentScheme);
		shoppingCart.takePayment();
	}
}
