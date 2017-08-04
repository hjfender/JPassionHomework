package com.javapassion.examples.bank.dao;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.javapassion.examples.bank.domain.Account;
import com.javapassion.examples.bank.services.AccountNotFoundException;
import com.javapassion.examples.bank.services.DuplicateAccountException;

@ContextConfiguration(locations = "/beans-test.xml")
public class JdbcAccountDaoTests extends AbstractTransactionalJUnit4SpringContextTests {

	private static final int EXISTING_ACCOUNT_NO = 1234;
	
	private static final int NEW_ACCOUNT_NO = 5678;

	private Account existingAccount;
	
	private Account newAccount;
	
	@Autowired
	private JdbcAccountDao accountDao;

	@Before
	public void init() {
		executeSqlScript("classpath:/bank-create.sql", false);
		
		existingAccount = new Account(EXISTING_ACCOUNT_NO, 100);
		newAccount = new Account(NEW_ACCOUNT_NO, 200);

		accountDao.createAccount(existingAccount);
	}
	
	@After
	public void destroy() {
		executeSqlScript("classpath:/bank-drop.sql", false);
	}

	@Test
	public void createNewAccount() {
		accountDao.createAccount(newAccount);
		
		assertEquals(accountDao.findAccount(NEW_ACCOUNT_NO).getBalance(), 200, 0);
	}

	@Test(expected = DuplicateAccountException.class)
	public void createDuplicateAccount() {
		accountDao.createAccount(existingAccount);
	}

	@Test
	public void updateExistingAccount() {
		existingAccount.setBalance(150);
		accountDao.updateAccount(existingAccount);
		
		assertEquals(accountDao.findAccount(EXISTING_ACCOUNT_NO), existingAccount);
	}
	
	 @Test(expected = AccountNotFoundException.class)
	 public void updateNonExistingAccount() {
		 accountDao.updateAccount(newAccount);
	 }
	
	@Test(expected = AccountNotFoundException.class)
	public void removeNonExistingAccount() {
		accountDao.removeAccount(newAccount);
	}
	
	@Test
	public void findExistingAccount() {
		Account account = accountDao.findAccount(EXISTING_ACCOUNT_NO);
	 
		 assertEquals(account, existingAccount);
	}
	 
	 @Test(expected = AccountNotFoundException.class)
	 public void findNonExistingAccount() {
		 accountDao.findAccount(NEW_ACCOUNT_NO);
	 }
}