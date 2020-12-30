package com.sebsonic2o.spring.aop.springaop.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sebsonic2o.spring.aop.springaop.data.DaoTwo;

@Service
public class BusinessTwo {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private DaoTwo daoTwo;

	public String manipulateData() {
		// some business logic
		String data = daoTwo.retrieveData();
		logger.info(data);
		return data;
	}
}
