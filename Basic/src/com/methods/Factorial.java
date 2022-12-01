package com.methods;

public class Factorial {
	void fact(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+a+"is "+fact);
	}
	public static void main(String[] args)
	{
		Factorial fc=new Factorial();
		fc.fact(5);
		fc.fact(3);
		fc.fact(6);
	}

}
