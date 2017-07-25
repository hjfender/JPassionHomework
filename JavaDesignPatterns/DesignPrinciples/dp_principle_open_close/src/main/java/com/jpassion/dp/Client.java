package com.jpassion.dp;

import com.jpassion.dp.domain.Cash;
import com.jpassion.dp.domain.CreditCard;
import com.jpassion.dp.domain.Customer;
import com.jpassion.dp.domain.Paypal;

public class Client {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.pay(new Cash());
		customer.pay(new CreditCard());
		customer.pay(new Paypal());
	}
}
