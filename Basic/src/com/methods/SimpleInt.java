package com.methods;

public class SimpleInt {
	
	
	public static void simpleIntrest(int princ,int time,int intr)
	
	{
	int si=0;
	int total=0;
		
		si=princ*time*intr/100;
		total=princ+si;
		System.out.println("si for given money"+si);
	System.out.println("total amount  "+total);
		
	}
	public static void main(String[] args)
	{
	
		SimpleInt.simpleIntrest(10000, 16, 02);
		SimpleInt.simpleIntrest(25000, 12, 2);
	}
	
		
	
	

}
