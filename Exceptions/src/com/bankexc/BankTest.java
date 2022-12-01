package com.bankexc;

public class BankTest {
	public static void main(String[] args)
	{
		
		BankAc b1=new BankAc("sbi", "0001", "Sriman", 15000);
		
		
		BankAc b2=new BankAc("sbi", "0111", "shan", 30000);

		BankAc b3=new BankAc("sbi", "0111", "shan", 3200);
		AtmExceptin A1=new AtmExceptin("sriman", "sri12", b1);
		AtmExceptin A2=new AtmExceptin("shan","shan23",b2);
		
		
	/*	try
		{
			b1.withdraw(12000);
		}
		catch(BalanceMissmatchException B1)
		{
			B1.printStackTrace();
		}
		try
		{
			
		
		b2.withdraw(3000);
		}
		catch(BalanceMissmatchException B2)
		{
			B2.printStackTrace();
		}*/
		/*System.out.println(b1.balance);
		System.out.println(b2.balance);
		System.out.println(b3.balance);
		/*b1.transfor(b2, 2000);
		
		System.out.println(b1.balance);
		System.out.println(b2.balance);
		try
		{
			b1.transfor(b2, 10000);
		}
		catch(InsaficientBalanceInSenderAc B4)
		{
			B4.printStackTrace();
		}
		try {
		b1.transfor(b2, 3000);
		}
		catch(BalanceMissmatchException B5)
		{
			B5.printStackTrace();
		}
		b2.transfor(b1, 5000);
	}*/
		/*try
		{
			b1.transfor(b2, 3000);
		}
		catch(BalanceMissmatchException b7)
		{
			b7.printStackTrace();
		}
		System.out.println(b1.balance);
		System.out.println(b2.balance);
		b2.transfor(b1, 35000);
		System.out.println(b1);
		System.out.println(b2);*/
		//AtmExceptin A=new AtmExceptin();
		
		System.out.println(A1.bankac.balance);
		A1.atmWithdraw(A1, 5000);
		System.out.println(A1.bankac.balance);
}
}