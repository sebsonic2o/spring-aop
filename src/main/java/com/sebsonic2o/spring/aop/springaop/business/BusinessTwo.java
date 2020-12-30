package com.sebsonic2o.spring.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sebsonic2o.spring.aop.springaop.data.DaoTwo;

@Service
public class BusinessTwo {

	@Autowired
	private DaoTwo daoTwo;

	public String manipulateData() {
		// some business logic
		return daoTwo.retrieveData();
	}
}
