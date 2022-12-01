package com.vari;

public class Compound {
	public static void main(String[] args)
	{
		
	
	double amount=10000;
	int intr=2;
	float year=4.6f;
	for(int i=1;i<=year;i++)
	{
		amount=amount+(amount*12*intr/100);
	} 
	System.out.println(amount);

}}
