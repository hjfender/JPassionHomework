package com.javapassion.examples.bank.controller;

import static org.junit.Assert.*;

import org.easymock.EasyMock; //import org.easymock.MockControl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ModelMap;

import com.javapassion.examples.bank.controller.DepositController;
import com.javapassion.examples.bank.services.AccountService;

public class DepositControllerTests {

	private static final int TEST_ACCOUNT_NO = 1234;

	private static final double TEST_AMOUNT = 50;

	private AccountService accountServiceMock;

	private DepositController depositController;

	@Before
	public void init() {
		// Create mock object, which represents a dependency.
		accountServiceMock = EasyMock.createMock(AccountService.class);
		depositController = new DepositController(accountServiceMock);
	}

	@Test
	public void deposit() {
		// Record behavior
		accountServiceMock.deposit(TEST_ACCOUNT_NO, TEST_AMOUNT);
		accountServiceMock.getBalance(TEST_ACCOUNT_NO);
		EasyMock.expectLastCall().andReturn(150.0);

		// Replay behavior
		EasyMock.replay(accountServiceMock);

		// Execute the test code.
		ModelMap model = new ModelMap();
		String viewName = depositController.deposit(TEST_ACCOUNT_NO,
				TEST_AMOUNT, model);

		// Verify behavior
		EasyMock.verify(accountServiceMock);

		assertEquals(viewName, "success");
		assertEquals(TEST_ACCOUNT_NO, model.get("accountNo"));
		assertEquals(150.0, model.get("balance"));
	}
}