package com.exc1;

public class Propagation {

	public static void m1() 
	{
		
		
		
		System.out.println("m1 is invoked");
		}
		
		
	
	
	public static void m2() 
	{System.out.println();
		
			System.out.println("m2 is invoked");
		try {
		
		System.out.println(10/2);
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("how r u");
		m1();
		
		
		
		
	}
	public static void m3() 
	{
		try
		{
		
		System.out.println("m3 is invoked");
		System.out.println(45/4);
		
		}
		catch(ArithmeticException a)
		{
			a.printStackTrace();
		}
		m2();
		
	}
	
		
	public static void main(String[] args) {
		Propagation p=new Propagation();		
	
			
		
		p.m3();
		
	}
	

}
