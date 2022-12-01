package com.atmexc2;

public class AtmExTest {
	public static void main(String[] args) {
		AtmAc a1=new AtmAc("sriman", "0001", 30000);
		AtmAc a2=new AtmAc("kumar", "0002", 50000);
		AtmAc a3=new AtmAc("shan", "0003", 60000);
		try {
			a1.withdraw(50000);
		} catch (NoAcBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoAmountInMachine e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			a2.withdraw(6000);
		} catch (NoAcBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoAmountInMachine e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a1.balance);
		System.out.println(a2.balance);
		System.out.println(AtmAc.cashInMachine);
		try {
			a1.withdraw(25000);
		} catch (NoAcBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoAmountInMachine e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			a2.withdraw(44000);
		} catch (NoAcBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoAmountInMachine e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a1.balance);
		System.out.println(a2.balance);
		System.out.println(AtmAc.cashInMachine);
		try {
			a3.withdraw(20000);
		} catch (NoAcBalanceException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoAmountInMachine e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			a1.withdraw(3000);
		} catch (NoAcBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoAmountInMachine e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a1.balance);
		System.out.println(a2.balance);
		System.out.println(AtmAc.cashInMachine);
	}

}
