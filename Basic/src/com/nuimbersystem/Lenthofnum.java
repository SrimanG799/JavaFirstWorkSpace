package com.nuimbersystem;

public class Lenthofnum {
	public static void main(String[] args)
	{
		int num=4585;
		int count=0;
		while(num>0)
		{
			int rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);
	}

}
