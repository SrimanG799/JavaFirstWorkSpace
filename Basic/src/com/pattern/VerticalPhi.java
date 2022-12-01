package com.pattern;

public class VerticalPhi {

	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<n-i*1;s++)
			{
				System.out.print(" ");
			}
			System.out.println(" ");
			for(int j=n*i-1;j<n-2*i;j++)
			{
				System.out.print("*");
			}
		}
	}
}
