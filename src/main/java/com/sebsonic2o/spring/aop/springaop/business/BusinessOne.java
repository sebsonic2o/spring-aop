package com.sebsonic2o.spring.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sebsonic2o.spring.aop.springaop.data.DaoOne;

@Service
public class BusinessOne {

	@Autowired
	private DaoOne daoOne;

	public String manipulateData() {
		// some business logic
		return daoOne.retrieveData();
	}
}
