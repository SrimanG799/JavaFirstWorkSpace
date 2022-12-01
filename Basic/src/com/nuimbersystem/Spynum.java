package com.nuimbersystem;

public class Spynum {
	public static void main(String[] args)
	{
		int num=1124;
		int sum=0;
		int pro=1;
		int rem=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			pro=pro*rem;
			num=num/10;
		}
		if(sum==pro) 
		{
			System.out.println(temp +" is spy number");
		}
		else
		{
			System.out.println("it is not spy number");
		}
	}

}
