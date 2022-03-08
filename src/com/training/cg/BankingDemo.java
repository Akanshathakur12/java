package com.training.cg;

public class BankingDemo {
	
	public static void main(String args[]) {
		
		SavingAccount s1=new SavingAccount(6000);
		System.out.println("balance in saving account is:"+s1.checkBalance());
		s1.deposit(2000);
		
		System.out.println("balance in saving account after deposit is:"+ s1.checkBalance());
		
		s1.withdraw(5000);
		System.out.println("balance in saving account after withdraw is: "+ s1.checkBalance());
		
		System.out.println("rate of interest is:"+s1.CalInterest(3));
		
		//OPERATIONS IN CURRENT ACCOUNT
		
		CurrentAccount c1= new CurrentAccount(5000);
		System.out.println("balance in current account is:"+c1.checkBalance());
		c1.deposit(1000);
		
		System.out.println("balance in current account after deposit is:"+ c1.checkBalance());
		
		c1.withdraw(6000);
		System.out.println("balance in current account after withdraw is: "+ c1.checkBalance());
		
	}

}
