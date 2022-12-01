package com.methods;

public class PrimeNumber {
	void isPrime(int a)
	{
		boolean flag=true;
		for(int i=3;i<=a/2;i++)
		{
			if(a%i==0)
			{
				flag=true;
				break;
			}
			else
			{
				flag=false;
			}
		}
		if(flag==true)
		{
			System.out.println("given number is not primr "+a);
			
		}
		else
		{
			System.out.println("given number is prime "+a);
		}
		
	}
	public static void main(String[] args)
	{
	PrimeNumber pn=new PrimeNumber();
	pn.isPrime(9);
	pn.isPrime(11);
	pn.isPrime(15);
	pn.isPrime(19);
		
		
	}
}