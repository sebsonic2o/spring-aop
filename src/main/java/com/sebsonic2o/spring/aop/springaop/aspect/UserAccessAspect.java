package com.sebsonic2o.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// intercept method calls before execution by defining "pointcut"
	@Before("com.sebsonic2o.spring.aop.springaop.aspect.CommonPointcutConfig.businessLayerExecutionWithWithin()")
	public void doBeforeAction(JoinPoint joinPoint) {
		// intercept logic aka "advice"
		logger.info("Check for user access");
		logger.info("Allow access for {}", joinPoint);
	}
}
