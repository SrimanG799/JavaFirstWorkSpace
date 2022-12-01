package com.pattern;

public class BigRev {
	public static void main(String[] args)
	{
		
	
	int n=6;
	for(int i=n;i>0;i--)
	{
		for(int s=1;s<=(n-i);s++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println(" ");
	}
		
	}
	

}
