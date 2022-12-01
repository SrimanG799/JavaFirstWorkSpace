package com.kumar;

public class Primetest {
	public static void main(String[] args)
	{
		
	
	int num=36;
	int count=0;
	
	if(num==0||num==1)
	{
		System.out.println("it is not prime");
	}
	else
	{
		for(int i=2;i<=num/2;i++)
		{
			int rem=num%i;
			if(rem==0)
			{
				count=1;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("it is not prime");
		}
		else
		{
			System.out.println("it is prime");
		}
}
	}
}