package com.sebsonic2o.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {

	@Pointcut("execution(* com.sebsonic2o.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}

	@Pointcut("within(com.sebsonic2o.spring.aop.springaop.business..*)")
	public void businessLayerExecutionWithWithin() {}

	@Pointcut("bean(*business*)")
	public void beanContainingBusiness() {}

	@Pointcut("execution(* com.sebsonic2o.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {}

	@Pointcut("com.sebsonic2o.spring.aop.springaop.aspect.CommonPointcutConfig.dataLayerExecution() && com.sebsonic2o.spring.aop.springaop.aspect.CommonPointcutConfig.businessLayerExecution()")
	public void allLayerExecution() {}
}
