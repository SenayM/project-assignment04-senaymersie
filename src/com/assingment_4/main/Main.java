package com.assingment_4.main;

import com.assignment_4.subclasses.*;
import com.assignment_4.superclasses.BankAccount;

public class Main {

	public static void main(String[] args) {
		
		String account="";
		BankCustomer bc=new BankCustomer("Senay", 31);
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		System.out.println(bc.toString());
		
		account=bc.getCustomerAccount().get(0).getAccountNumber();
		System.out.println("Depositing 30.0 to the first account");
		bc.depositToAccount(account, 30.0);
		System.out.println(bc.toString());
		
		System.out.println("Withdrawing 200.0 to the fist account");
		account=bc.getCustomerAccount().get(1).getAccountNumber();
		bc.withdrawFromAccount(account, 200.0);
		System.out.println(bc.toString());
		
		System.out.println("Depositing 110.0 to the fist account");
		account=bc.getCustomerAccount().get(1).getAccountNumber();
		bc.depositToAccount(account, 110.0);
		System.out.println(bc.toString());
		
		
		/*
		BankAccount bankAccount=new BankAccount();
		System.out.println(bankAccount.toString());
		bankAccount.depositMoney(200.0);
		bankAccount.depositMoney(200.0);
		
	    PersonalAccount pa=new PersonalAccount();
	    pa.depositMoney(70);
	    pa.depositMoney(70);
	    pa.depositMoney(70);
		System.out.println(pa.toString());
		pa.depositMoney(-1);
		
		 SavingAccount sa=new SavingAccount();
		 sa.depositMoney(30);
		 sa.withdrawMoney(-20);
		 sa.withdrawMoney(-20);
		 System.out.println(sa.toString());*/
	


	}

}
