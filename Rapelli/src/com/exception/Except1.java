package com.exception;

public class Except1 {
	public static void main(String[] args)
	{
		System.out.println("hello ecxception");
		
		try
		{
			int a=10;
		
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		catch( ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		
		System.out.println("welcome");
		System.out.println("exception handling properly");
	}

}
