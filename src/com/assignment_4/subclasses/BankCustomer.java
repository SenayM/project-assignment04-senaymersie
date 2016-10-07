package com.assignment_4.subclasses;

import java.util.ArrayList;

import com.assignment_4.superclasses.*;

public class BankCustomer extends Human {
	ArrayList<BankAccount> customerAccount=new ArrayList<BankAccount>();

	public BankCustomer(String name, int age) {
		super(name, age);
		
	}

	public ArrayList<BankAccount> getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(ArrayList<BankAccount> customerAccount) {
		this.customerAccount = customerAccount;
	}
	public void addAccount(BankAccount bankAccount){
		customerAccount.add(bankAccount);
	}
	public void depositToAccount(String accountNumber,double amount){
		for(int i=0;i<customerAccount.size();i++){
			if (customerAccount.get(i).getAccountNumber().equals(accountNumber)){
				customerAccount.get(i).depositMoney(amount);
			}
		}
	}
	public void withdrawFromAccount(String accountNumber,double amount){
		for(int i=0;i<customerAccount.size();i++){
			if (customerAccount.get(i).getAccountNumber().equals(accountNumber)){
				customerAccount.get(i).withdrawMoney(amount);
			}
		}
	}

	@Override
	public String toString() {
		return "BankCustomer [customerAccount=" + customerAccount + "] "+customerAccount.toString() ;
		
	}
	
}
