package com.bankingThread;

public class Bankikng {
	private int totalAmount;

	/**
	 * @param amount
	 */
	public Bankikng(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public synchronized void deposite(int amount)
	{
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	synchronized(this)
	{
		System.out.println("Total amount before depositn :"+totalAmount);
		totalAmount=totalAmount+amount;
		System.out.println("deposit succesfully");
		System.out.println("Total Amount afer deposit: "+totalAmount);
		notify();
		
	}
	}


	public void withdraw(int amount)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(this)
		{
			System.out.println("total amount before wihtdraw:  "+totalAmount);
			if(amount>totalAmount)
			{
				System.out.println("insafficient fundsa");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			totalAmount=totalAmount-amount;
			System.out.println("withdraw succesfully");
			System.out.println("Total amount after withraw : "+totalAmount);
			notify();
			
		}
		
	}
}