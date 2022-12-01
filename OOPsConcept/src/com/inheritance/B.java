package com.inheritance;

public class B extends A{
	public void m3()
	{
		System.out.println("hai im m3 from class b");
	}
	public void m2()
	{
		System.out.println("m2 from B");
	}
	public static void main(String[] args)
	{
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		A a=new A();
		a.m2();
	}

}
