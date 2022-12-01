package com.encop;


public class Bank {
private static String BANK="SBI";

private String branch;
private String name;
private String  accnum;
private long balance;
public Bank(String branch, String name, String accnum, long balance) {
	super();
	if(accnum.length()!=6)
	{
		System.out.println(" account numbr must contains only 6 digits");
		
	}
	else
	{
		
	
	this.branch = branch;
	this.name = name;
	this.accnum = accnum;
	this.balance = balance;
}
}
public static String getBANK() {
	return BANK;
}
public static void setBANK(String bANK) {
	BANK = bANK;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAccnum() {
	return accnum;
}
public void setAccnum(String accnum) {
	
	if(accnum.length()!=6)
	{
		System.out.println(" accnum must contains only  6 digits");
	}
	else {
		
	
	this.accnum = accnum;
	}
}
public long getBalance() {
	return balance;
}
public void setBalance(long balance) {
	this.balance = balance;
}




}
