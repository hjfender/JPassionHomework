package com.javapassion.examples.bank.services;

import static org.testng.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.javapassion.examples.bank.services.AccountService;

@ContextConfiguration(locations = "/beans-test.xml")
public class AccountServiceTestNGContextTests extends AbstractTransactionalTestNGSpringContextTests  {

    private static final int TEST_ACCOUNT_NO = 1234;

    @Autowired
    private AccountService accountService;    

    @BeforeMethod
    public void init() {
	executeSqlScript("classpath:/bank.sql", true);
        jdbcTemplate.update(
            "INSERT INTO ACCOUNT (ACCOUNT_NO, BALANCE) VALUES (?, ?)",
            TEST_ACCOUNT_NO, 100
        );
    }

    @Test
    public void deposit() {
        accountService.deposit(TEST_ACCOUNT_NO, 50);
        double balance = jdbcTemplate.queryForObject(
            "SELECT BALANCE FROM ACCOUNT WHERE ACCOUNT_NO = ?",
            Double.class, TEST_ACCOUNT_NO
        );
        assertEquals(balance, 150, 0);
    }

    @Test
    public void withDraw() {
        accountService.withdraw(TEST_ACCOUNT_NO, 50);
        double balance = jdbcTemplate.queryForObject(
            "SELECT BALANCE FROM ACCOUNT WHERE ACCOUNT_NO = ?",
            Double.class, TEST_ACCOUNT_NO
        );
        assertEquals(balance, 50, 0);
    }
}
