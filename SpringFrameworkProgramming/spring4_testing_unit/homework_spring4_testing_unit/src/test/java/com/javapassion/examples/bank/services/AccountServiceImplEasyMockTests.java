package com.javapassion.examples.bank.services;

import org.easymock.EasyMock; //import org.easymock.MockControl;
import org.junit.Before;
import org.junit.Test;

import com.javapassion.examples.bank.dao.AccountDao;
import com.javapassion.examples.bank.domain.Account;
import com.javapassion.examples.bank.services.AccountService;
import com.javapassion.examples.bank.services.AccountServiceImpl;

public class AccountServiceImplEasyMockTests {

	private static final int TEST_ACCOUNT_NO = 1234;
	
	private AccountDao accountDaoMock;
	
	private AccountService accountService;

	@Before
	public void init() {
		accountDaoMock = EasyMock.createMock(AccountDao.class);
		accountService = new AccountServiceImpl(accountDaoMock);
	}

	@Test
	public void deposit() {
		Account account = new Account(TEST_ACCOUNT_NO, 100);
		EasyMock.expect(accountDaoMock.findAccount(TEST_ACCOUNT_NO)).andReturn(account);
		account.setBalance(150);
		accountDaoMock.updateAccount(account);
		EasyMock.replay(accountDaoMock);

		accountService.deposit(TEST_ACCOUNT_NO, 50);
		EasyMock.verify(accountDaoMock);
	}

	@Test
	public void withdrawWithSufficientBalance() {
		Account account = new Account(TEST_ACCOUNT_NO, 100);
		EasyMock.expect(accountDaoMock.findAccount(TEST_ACCOUNT_NO)).andReturn(account);
		account.setBalance(50);
		accountDaoMock.updateAccount(account);
		EasyMock.replay(accountDaoMock);

		accountService.withdraw(TEST_ACCOUNT_NO, 50);
		EasyMock.verify(accountDaoMock);
	}

	@Test(expected = InsufficientBalanceException.class)
	public void testWithdrawWithInsufficientBalance() {
		Account account = new Account(TEST_ACCOUNT_NO, 100);
		accountDaoMock.findAccount(TEST_ACCOUNT_NO);
		EasyMock.expectLastCall().andReturn(account);
		EasyMock.replay(accountDaoMock);

		accountService.withdraw(TEST_ACCOUNT_NO, 150);
		EasyMock.verify(accountDaoMock);
	}
}