package com.nuimbersystem;

public class Number3prog {
	public static void main(String[] args)
	{
		int num=523;
		int  rev=0;
		int rem=0;
		int sum=0;
		int prod=1;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			prod=prod*rem;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println(sum);
		System.out.println(prod);
		System.out.println(rev);
	}

}
