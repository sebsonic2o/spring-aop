package com.sebsonic2o.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class DaoOne {

	public String retrieveData() {
		return "DaoOne";
	}
}
