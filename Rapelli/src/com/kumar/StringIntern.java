package com.kumar;

public class StringIntern {
	public static void main(String[] args) {
		
	
	String s1="sriman";
	String s2="sriman";
	String s3=new String("sriman");
	String s4=new String("sriman");
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s4.hashCode());
	String s5=s4.intern();
	System.out.println(s5.hashCode());
	
	System.out.println(s1==s2);
	System.out.println(s3==s4);
	System.out.println(s1==s5);
	System.out.println(s4==s5);
	String s6=s1;
	System.out.println(s6==s1);
	System.out.println(s6==s2);
	System.out.println(s5==s6);
	System.out.println(s6.hashCode());
	String s7=s1.intern();
	System.out.println(s7.hashCode());

	}

}
