package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount, boolean vipFlag) {
		
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
		System.out.println(		theAccount.getName()+ "\n"+theAccount.getLevel()+"\n\n");
		
	}

	public boolean doWork(){
		System.out.println(getClass() + ": DOING MY DB WORK -> true/false");
		return  false;
	}

	public void addMe(){
		System.out.println("\n\n ___________this is me__________  \n\n");
	}
}
