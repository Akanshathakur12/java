package com.training.cg;

public class AccountType implements Account {
 double INITIALBALANCE;
	double totalBalance;
	double rateofInterest=5;

	@Override
	public void deposit(double amount) {
		
		totalBalance=(totalBalance+amount);
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount<=INITIALBALANCE) {
			totalBalance=totalBalance-amount;
		}
		else {
			System.out.println("ERROR: Insufficient Balance");
		}
		
	}

	@Override
	public double checkBalance() {
		
		return totalBalance;
	}
	
	public double CalInterest(int TimePeriod) {
		return (rateofInterest * TimePeriod)/100 ;
	}


}
