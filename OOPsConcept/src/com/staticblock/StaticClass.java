package com.staticblock;

public class StaticClass {
	{
	System.out.println("instance block 1");//after static,main instance  1 is executes
	}
	static {
	
		System.out.println("Static block");//static block executes before main 
	}
	{
		System.out.println("instance 2");//after instance 1 instance 2 is executes
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("main block");//main executes after static bcz static block is load first into class area
		StaticClass sc=new StaticClass();//for execute static object is no need
		System.out.println("main 2");
		//for executing instance object is needed
	}

}
