package com.bankandTaxes;

public class Transactions extends BankAccount {

	public Transactions(String name, int acnum, long balance) {
		super(name, acnum, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(long amount) {
		{
			if(amount<=0)
			{
				System.out.println("please deposit with valid amount");
			}
			else
			{
		super.setBalance(super.getBalance()+amount);
			System.out.println(amount+" is deposited present balnce is"+super.getBalance());
			//super.balance=balance;
		}
		}
		// TODO Auto-generated method stub
		
	
		}
		@Override
		public void withdraw(long amount) {

			if(amount<=0)
			{
				System.out.println(" please enter valid amount");
				
			}
			else
			{
				if(super.getBalance()>=amount)
				{
					super.setBalance(super.getBalance()-amount);
					System.out.println("your withdrwas amount "+amount+"present balance is "+super.getBalance());
					//super.balance=balance;
				}
				else
				{
					System.out.println("entered amount is not available in yor account");
				}
			// TODO Auto-generated method stub
			
		}
		
		
	
		
	}
		void currentBalance()
		{
			System.out.println(super.getBalance());
		}

		public String toString() {
			return "BankAccount [name=" + super.getName() + ", acnum=" + super.getAcnum()+ ", balance=" +super.getBalance() + "]";
		}
		
	
	
	
	
	
	
	
	

}
