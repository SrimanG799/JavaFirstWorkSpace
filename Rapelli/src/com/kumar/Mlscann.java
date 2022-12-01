package com.kumar;

import java.util.Scanner;

public class Mlscann
{
	public static void main(String[] args)
	{
		int sum=0;
Scanner sc=new Scanner(System.in);
for(int i=0;i<=5;i++)
{
	System.out.println("enter" +i+ "element");
	int ai=sc.nextInt();
	sum=sum+ai;
	
}
System.out.println(sum);
}
}