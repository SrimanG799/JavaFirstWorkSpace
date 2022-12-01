package com.atmexc2;

public class AtmAc {
	String name;
	String acno;
	double balance;
	static double cashInMachine=80000;
	/**
	 * @param name
	 * @param acno
	 * @param balance
	 */
	public AtmAc(String name, String acno, double balance) {
		super();
		this.name = name;
		this.acno = acno;
		this.balance = balance;
	}
	void withdraw(double amount)throws NoAcBalanceException, NoAmountInMachine
	{
		if(this.balance<amount)
		{
			throw new NoAcBalanceException("ur account dos nt have this much balance");
			
		}
		else if(cashInMachine<amount)
		{
			throw new NoAmountInMachine("machine dont have money pls visit other Atm");
		}
		else
		{
			this.balance-=amount;
			cashInMachine-=amount;
		}
	}
	

}
