package com.encop;

public class BankTest {
	public static void main(String[] args)
	{
		Bank b1=new Bank("Adb", "sriman", "1111113", 15000);
		Bank b2=new Bank("Adb","kumar","111112",25000);
		System.out.println(b1.getBalance());
		System.out.println(b2.getAccnum());
		//b1.setAccnum("1212545");
		
		
	}

}
