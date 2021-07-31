package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice

		// fully qualified path to restrict any other classes to do before advice
//	@Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")

	//match method starting with "add" in any class
//	@Before("execution(public void add*())")

	//match method with return type
	@Before("execution(* add*())")

//	@Before("execution(public void addAccount())")
//	@Before("execution(public void updateAccount())")
	public void beforeAddAccountAdvice() {

			System.out.println("\n=====>>> Executing @Before advice on method");

	}
}










