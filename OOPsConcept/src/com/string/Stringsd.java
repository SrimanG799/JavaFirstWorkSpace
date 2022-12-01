package com.string;

public class Stringsd {
	public static void main(String[] args)
	{
		String s1="sriman";
		System.out.println(s1.hashCode());
		s1=s1+"kumar";
		System.out.println(s1.hashCode());
		System.out.println(s1);
		s1=s1.concat("java");
		System.out.println(s1.hashCode());
		System.out.println(s1);
		
		StringBuilder b1=new StringBuilder("welcome");
		System.out.println(b1.hashCode());
		System.out.println(b1);
		b1=b1.append("shannu");
		System.out.println(b1);
		System.out.println(b1.hashCode());
		b1=b1.delete(0,b1.length());
		System.out.println(b1.hashCode());
		
	}

}
