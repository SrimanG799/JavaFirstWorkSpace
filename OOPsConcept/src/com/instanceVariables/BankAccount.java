package com.instanceVariables;

public class BankAccount {
	String Bank;
	String Branch;
	String Location;
	int AccNumber;
	String Name;
	String AccType;
	int AvlBalance;
	String IFSC;

	void display() {
		System.out.println("Bank       " + Bank);
		System.out.println("Branch     " + Branch);
		System.out.println("Location   " + Location);
		System.out.println("AccNumbwr  " + AccNumber);
		System.out.println("Name       " + Name);
		System.out.println("AccType    " + AccType);
		System.out.println("AvlBalnce  " + AvlBalance + "rs");
		System.out.println("IFSC       " + IFSC);
		System.out.println("------------------------>>>>>>");
	}

	public static void main(String[] args) {
		BankAccount BA1 = new BankAccount();
		BA1.Bank = "SBI";
		BA1.Branch = "ADB Manthani";
		BA1.Location = "Manthani";
		BA1.AccNumber = 11201;
		BA1.Name = "Sriman";
		BA1.AccType = "Savings";
		BA1.AvlBalance = 45000;
		BA1.IFSC = "SBI00MN4033";
		BA1.display();
		BankAccount BA2 = new BankAccount();
		BA2.Bank = "HDFC";
		BA2.Branch = "HDFC Peddapalli";
		BA2.Location = "Peddapalli";
		BA2.AccNumber = 32111;
		BA2.Name = "Kumar";
		BA2.AccType = "Current";
		BA2.AvlBalance = 1000000;
		BA2.IFSC = "HDFC0IH20344";
		BA2.display();

	}

}
