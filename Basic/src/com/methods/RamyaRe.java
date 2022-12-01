package com.methods;

public class RamyaRe {
	void add(int a,int b)
	{
		System.out.println("addition:"+(a+b));
		System.out.println("subtraction:" +(a-b));
		System.out.println("multiplicstion:"+(a*b));
		System.out.println("divison:"+(a/b));
	}
	void name()
	{
		System.out.println(" hai hello");
	}

	public static void main(String[] args)
	{
		RamyaRe RR=new RamyaRe();
		RR.add(5, 54);
		RR.add(8, 1);
		RR.add(54, 5);
		RR.name();
		RR.name();
	}
}
