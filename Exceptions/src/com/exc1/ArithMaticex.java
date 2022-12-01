package com.exc1;

public class ArithMaticex {
	public static void main(String[] args) {
		int x=45;
		int y=0;
		System.out.println("statement 1 hello");
		System.out.println("statement 2 hello2");
		System.out.println(x/y);
		System.out.println("hello");
		try {
			
		
		System.out.println(45/0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.print("statement after exception");
		
	}

}
