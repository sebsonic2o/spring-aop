package com.sebsonic2o.spring.aop.springaop.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sebsonic2o.spring.aop.springaop.data.DaoOne;

@Service
public class BusinessOne {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private DaoOne daoOne;

	public String manipulateData() {
		// some business logic
		String data = daoOne.retrieveData();
		logger.info(data);
		return data;
	}
}
