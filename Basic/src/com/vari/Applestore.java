package com.vari;

public class Applestore {
	public static void main(String[] args)
	{
		
	
	int numApples=1000;
	int numcustomers=0;
	double price=35.50;
	double profit=0;
	System.out.println("one customer came pick 10 apples");
	numApples-=10;
	numcustomers++;
	profit=10*35.50;
	System.out.println("2nd customer came and pick 45 apples");
	numApples-=45;
	numcustomers++;
	profit+=45*35.50;
	System.out.println(numApples);
	System.out.println(numcustomers);
	System.out.println(profit);
	
	
	
	
	
	
	}
}
