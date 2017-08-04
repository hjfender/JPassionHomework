package com.javapassion.examples.bank.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AccountTests {
	
    private static final int TEST_ACCOUNT_NO = 1234;
    
    private static final int TEST_BALANCE = 100;
    
    private Account account;

    @Before
    public void init() {
        account = new Account(TEST_ACCOUNT_NO, TEST_BALANCE);
    }

    @Test
    public void equals() {
    	Account dummyAccount = new Account(TEST_ACCOUNT_NO, TEST_BALANCE);
        assertTrue(account.equals(dummyAccount));
    }
}