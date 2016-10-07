package com.assignment_4.subclasses;

import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

public class SavingAccount extends BankAccount{

	public SavingAccount() {
		this.accountNumber=UUID.randomUUID().toString().substring(0,6);
		this.balance=0;
		this.accountType="Saving Account";
	}
	

}
