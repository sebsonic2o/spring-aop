package com.sebsonic2o.spring.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Around("execution(* com.sebsonic2o.spring.aop.springaop.business.*.*(..))")
	public Object doAroundAction(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object result = joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		logger.info("{} executed in {} ms", joinPoint, endTime - startTime);
		return result;
	}
}
