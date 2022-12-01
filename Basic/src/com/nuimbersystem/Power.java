package com.nuimbersystem;

public class Power {
public static void main(String[] args)
{
	int base=5;
	int power=3;
	int result=1;
	for(int i=1;i<=power;i++)
	{
		result=result*base;
	}
	System.out.println(result);
}
}