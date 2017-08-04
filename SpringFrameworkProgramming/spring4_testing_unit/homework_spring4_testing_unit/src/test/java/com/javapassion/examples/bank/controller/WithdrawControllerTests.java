package com.javapassion.examples.bank.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.ModelMap;

import com.javapassion.examples.bank.services.AccountService;

public class WithdrawControllerTests {

	private static final int TEST_ACCOUNT_NO = 1234;
	
	private static final double TEST_AMOUNT = 50;
	
	private static final double RESULT_AMOUNT = 150;
	
	@Mock
	private AccountService accountServiceMock;
	
	@InjectMocks
	private WithdrawController withdrawController;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testWithdraw(){
		when(accountServiceMock.getBalance(TEST_ACCOUNT_NO)).thenReturn(RESULT_AMOUNT);
		
		ModelMap model = new ModelMap();
		String viewName = withdrawController.withdraw(TEST_ACCOUNT_NO, TEST_AMOUNT, model);
	
		verify(accountServiceMock);
		
		assertEquals(viewName, "success");
		assertEquals(TEST_ACCOUNT_NO, model.get("accountNo"));
		assertEquals(RESULT_AMOUNT, model.get("balance"));
	}
}
