package com.overload;

public class Add {
	public  void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b,int c)
	{
		
		int d=a+b+c;
		System.out.println(d);
	}
	public void add(float a,float b)
	{
		float c=a+b;
System.out.println(c);		
	}
	public void add(int a,float b)
	{
		float c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Add a=new Add();
		a.add(5, 6);
		a.add(8, 10);
		a.add(5.5f, 6.3f);
		a.add(5, 9, 7);
		a.add(10, 4.7f);
	}
	
	

}
