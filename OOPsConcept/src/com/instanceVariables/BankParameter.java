package com.instanceVariables;

public class BankParameter {
	String name;
	int accno;
	String bank;
	String branch;
	int amount;
	
	public BankParameter(String name,int  accno,String bank,String branch,int amount)
	{
		this.name=name;
		this.accno=accno;
		
		this.bank=bank;
		this.branch=branch;
		this.amount=amount;
		
	}
	public void display()
	{
		System.out.println("name       "+name);
		System.out.println("accno      "+accno);
		System.out.println("bank       "+bank);
		System.out.println("branch     "+branch);
		System.out.println("amount     "+amount);
		System.out.println("--------->>>>>>>>>>>>");
		
	}
	public static void main(String[] args)
	{
		
		
		BankParameter bp1=new BankParameter("sriman",11211,"SBI","Manthani",50000);
		BankParameter bp2=new BankParameter("kumar",11212,"SBI","Manthani",60000);
		BankParameter bp3=new BankParameter("shan",11213,"SBI","Manthani",75000);
		bp1.display();
		bp2.display();
		bp3.display();
		
	}
}
