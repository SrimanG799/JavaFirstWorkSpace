package com.bankexc;

public class BankAc {
	String bankName;
	String acnum;
	String acname;
	double balance;
	public BankAc(String bankName, String acnum, String acname, double balance) {
		
		this.acnum = acnum;
		this.acname = acname;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAc [bankName=" + bankName + ", acnum=" + acnum + ", acname=" + acname + ", balance=" + balance
				+ "]";
	}
	
	void withdraw(double amount)
	{
		if(amount<0||amount>balance)
		{
			throw new BalanceMissmatchException("pls enter valid balnce");
		}
		else
		{
			balance-=amount;
		}
	}
	void transfor(Object obj,double amount)
	
	{
		BankAc a=(BankAc)obj;
		if(this.balance<=amount)
		{
			throw new InsaficientBalanceInSenderAc("sender doesnt have this much balance");
			
		}
	
		
			
			a.balance+=amount;
			this.balance-=amount;
		
		
		
	}
	

}
