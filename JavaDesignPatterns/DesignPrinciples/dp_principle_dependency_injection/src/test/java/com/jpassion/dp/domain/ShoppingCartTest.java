package com.jpassion.dp.domain;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShoppingCartTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setupStreams(){
		System.out.println(new PrintStream(outContent));
	}
	
	@After
	public void cleanUpStreams(){
		System.setOut(null);
	}
	
	//GOOD: payment scheme can be injected for testing
	//It could be a mock object for true unit-testing
	@Test
	public void payWithCash() {
		PaymentSchemeAbstraction paymentSchemeAbstraction = new Cash();
		ShoppingCart shoppingCart = new ShoppingCart(paymentSchemeAbstraction);
		shoppingCart.takePayment();
		assertThat(outContent.toString(), containsString("pay with cash"));
	}
	
	//GOOD: payment scheme can by injected for testing
	@Test
	public void payWithCreditCard(){
		PaymentSchemeAbstraction paymentSchemeAbstraction = new CreditCard();
		ShoppingCart shoppingCart = new ShoppingCart(paymentSchemeAbstraction);
		shoppingCart.takePayment();
		assertThat(outContent.toString(), containsString("pay with credit card"));
	}
}
