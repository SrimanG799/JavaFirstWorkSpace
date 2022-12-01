package com.oops;

public class Static1 
{
	static 
	{
		System.out.println("static dont need main method");
		System.out.println("welcome to static");
		
	}

	public static void main(String[] args)
	{
		System.out.println("static block print before main method execution");
	}

}
