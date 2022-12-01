package com.bankingThread;

public class BankDemo {
	public static void main(String[] args) {
		Bankikng b=new Bankikng(20000);
		//Bankikng c=new Bankikng(40000);
		Runnable runwithdraw=new Runnable() {

			@Override
			public void run() {
				
					
				
				b.withdraw(30000);
		
				
			}
			
		};
		Thread withdrw=new Thread(runwithdraw);
		Runnable rundeposit=new Runnable()
				{

					@Override
					public void run() {
						b.deposite(20000);
						b.deposite(4000);
						
					}
			
				};
				
				Thread deposit=new Thread(rundeposit);
				withdrw.start();
				deposit.start();
			
	}

}
