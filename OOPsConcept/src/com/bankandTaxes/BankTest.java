package com.bankandTaxes;

public class BankTest {
	
	public static void main(String[] args)
	{
Transactions b1=new Transactions("sriman", 101, 15000); 
Transactions b2=new Transactions("ravi", 102, 1000);
Transactions b3=new Transactions("mahesh",103,20000);
b1.setBalance(35000);
b1.withdraw(5000);
b1.deposit(3000);
	}

}
