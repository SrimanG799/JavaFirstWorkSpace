package com.bankandTaxes;

public abstract class BankAccount {
	private String name;
	private int acnum;
	private long balance;
	public BankAccount(String name, int acnum, long balance) {
		super();
		this.name = name;
		this.acnum = acnum;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAcnum() {
		return acnum;
	}

	public void setAcnum(int acnum) {
		this.acnum = acnum;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public abstract void withdraw(long amount);
	public abstract void deposit(long amount); 
		// TODO Auto-generated method stub


	
	
	
	}


