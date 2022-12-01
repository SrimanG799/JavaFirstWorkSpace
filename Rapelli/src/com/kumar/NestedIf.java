package com.kumar;

public class NestedIf {
	public static void main(String[]args)
	{
		int num=22;
		if(num%2==0)
		{
			System.out.println("it is even");
			if(num<20)
			{
				System.out.println("it is even and below 20");
			}
			else    
			{
				System.out.println("it is not below 20");
			}
		}
		else
		{
			System.out.println("it is not even number");
		}
	}
	

}
