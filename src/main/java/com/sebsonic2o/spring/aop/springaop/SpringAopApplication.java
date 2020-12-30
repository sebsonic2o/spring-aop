package com.sebsonic2o.spring.aop.springaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sebsonic2o.spring.aop.springaop.business.BusinessOne;
import com.sebsonic2o.spring.aop.springaop.business.BusinessTwo;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BusinessOne businessOne;

	@Autowired
	private BusinessTwo businessTwo;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(businessOne.manipulateData());
		logger.info(businessTwo.manipulateData());
	}
}
