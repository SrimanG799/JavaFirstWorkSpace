package com.string;

public class Trim {
	public static void main(String[] args)
	{
		String s1="sriman";
		String s2="sriman";
		String s3=new String("sriman");
		String s4=new String("sriman");
		String s5=s4;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(s5==s4);
		
	}
	

}
