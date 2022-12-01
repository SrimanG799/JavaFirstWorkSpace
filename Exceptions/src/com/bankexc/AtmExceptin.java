package com.bankexc;

import java.util.Scanner;



public class AtmExceptin {
	Scanner sc=new Scanner(System.in);
	static double cashonMachine=60000;
	String name;
	String pasword;
	
	BankAc bankac;
	
	/**
	 * @param name
	 * @param pasword
	 * @param bankac
	 */
	public AtmExceptin(String name, String pasword, BankAc bankac) {
		super();
		this.name = name;
		this.pasword = pasword;
		this.bankac = bankac;
	}
	


	static void atmWithdraw(Object obj,double amount)
	{
		BankAc ae=(BankAc)obj;
		if(ae.balance<=amount)
		{
			
			System.out.println("no balance");
		}
		else {
		
		
		if(AtmExceptin.cashonMachine<=amount)
			{
				System.out.println("no cash on machine");
			}
		else
			
		{
			ae.balance-=amount;
			AtmExceptin.cashonMachine-=amount;
			
		}

		
		
		
	}

}
	}

