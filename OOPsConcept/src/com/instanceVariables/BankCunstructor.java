package com.instanceVariables;

public class BankCunstructor {
	String name;
	int accNum;
	long amount;
	String bank;
	String branch;
	String location;
	String ifsc;
public 	BankCunstructor(String name,int accNum,long amount,String bank,String branch,String location,String ifsc)
{
this.name=name;
	this.accNum=accNum;
	this.amount=amount;
	this.bank=bank;
	this.branch=branch;
	this.location=location;
	this.ifsc=ifsc;
}
void display()
{
	System.out.println(" name "+name);
	System.out.println("accNum "+accNum);
	System.out.println("amount "+amount);
	System.out.println("bank "+bank);
	System.out.println("branc "+branch);
	System.out.println("location"+location);
	System.out.println("IFSC"+ifsc);
	System.out.println("___--___---__---->>>>>>");
	
	
}
public static void main(String[] args)
{
	BankCunstructor BC1=new BankCunstructor("sriman",2011,50000,"SBI","ADB Manthani","Manthani","SBIN00402433");
	BankCunstructor BC2=new BankCunstructor("kumar",14522,60000,"HDFC","Goghavarikahni","Godhavarikhani","HDFC00917");
BC1.display();
BC2.display();
}
	

}
