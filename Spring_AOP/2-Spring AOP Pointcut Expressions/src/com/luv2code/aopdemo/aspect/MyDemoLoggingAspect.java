package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice

//	@Before("execution(* add*(com.luv2code.aopdemo.Account, ..))")
	//any class with method starting with add and any no of params
//	@Before("execution(* add*(..))")
	//matching methods from the dao package
	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice() {

			System.out.println("\n=====>>> Executing @Before advice on method");

	}
}










