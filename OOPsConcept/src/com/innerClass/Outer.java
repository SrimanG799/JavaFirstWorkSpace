package com.innerClass;

public class Outer {
	public void outerM()
	{
		System.out.println("outer method");
	}
	public class Inner
	{
		public void innerM()
		{
			System.out.println("inner method");
		}
		
	}
	{
		System.out.println("block ");
	}
	public static void main(String[] args)
	{
		Outer o=new Outer();
		o.outerM();
		Outer.Inner i=o.new Inner();
		i.innerM();
		
	}

}
