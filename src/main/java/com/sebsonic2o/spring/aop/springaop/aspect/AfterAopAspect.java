package com.sebsonic2o.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@After("com.sebsonic2o.spring.aop.springaop.aspect.CommonPointcutConfig.businessLayerExecution()")
	public void doAfterAction(JoinPoint joinPoint) {
		logger.info("After {}", joinPoint);
	}

	@AfterReturning(
			value="com.sebsonic2o.spring.aop.springaop.aspect.CommonPointcutConfig.businessLayerExecution()",
			returning="result"
			)
	public void doAfterReturningAction(JoinPoint joinPoint, Object result) {
		logger.info("{} returned with value {}", joinPoint, result);
	}

	@AfterThrowing(
			value="com.sebsonic2o.spring.aop.springaop.aspect.CommonPointcutConfig.businessLayerExecution()",
			throwing="exception"
			)
	public void doAfterThrowingAction(JoinPoint joinPoint, Object exception) {
		logger.info("{} errored with exception {}", joinPoint, exception);
	}
}
