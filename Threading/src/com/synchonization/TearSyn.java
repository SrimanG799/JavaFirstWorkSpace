package com.synchonization;

public class TearSyn {
	public static void main(String[] args) {
		Tables tb1=new Tables();
		Tables tb2=new Tables();
		Thread1 td1=new Thread1(5, tb1);
		Thread1 td2=new Thread1(3,tb1);
		td1.start();
		td2.start();
		
	}

}
