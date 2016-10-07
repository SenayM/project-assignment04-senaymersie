package com.assignment_4.superclasses;

import java.util.UUID;

import com.assigment_4.interfaces.BankOperations;

public class BankAccount implements BankOperations{
	public String accountNumber="";
	public String accountType="";
	public double balance=0;
	
	@Override
	public String toString() {
		return "\nBankAccount [accountNumber= " + accountNumber + " AccountType=" + accountType + " Balance=" + balance
				+ "]";
	}

	public BankAccount(){
		this.accountNumber=UUID.randomUUID().toString().substring(0,6);
		this.balance=0;
		this.accountType="Bank Account";
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void withdrawMoney (double amount){
		if (amount>=0){
			setBalance(getBalance()-amount);
		}else {
				System.out.println("You can not withdraw a negative value!");
				}
	}

	@Override
	public void depositMoney(double amount) {
		setBalance(getBalance()+amount);
		System.out.println("You have Deposited "+ amount +"Kr and your balance is now "+ getBalance());
		
		
	}

	
	
}
