package com.jpassion.di.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpassion.di.dao.CourseDao;
import com.jpassion.di.dao.CustomerDao;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao customerDao;
	
	@Autowired
	CourseDao courseDao;

	public String getCustomerGreeting() {
		String greeting = "Hello, " + customerDao.getCustomerName() + ", you are taking " + courseDao.getCourseName() + "!";
		return greeting;
	}

}
