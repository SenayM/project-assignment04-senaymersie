package com.assignment_4.subclasses;

import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

public class PersonalAccount extends BankAccount{
	public PersonalAccount(){
		this.accountNumber=UUID.randomUUID().toString().substring(0,6);
		this.balance=0;
		this.accountType="Personal Account";
	}
}
