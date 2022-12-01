package com.inheritance;

public class FirstC extends FirstB{
	int a=25;
	int b=35;
	public void add()
	{
		System.out.println("addition "+(a+b));
	}
public static void main(String[] args)
{
	FirstC fc1=new FirstC();
	fc1.add();
	fc1.add();
	System.out.println(fc1.c);//c is received from class B
	System.out.println(fc1.d);
	System.out.println(fc1.e);
	System.out.println(fc1.c+fc1.b);
}
}
