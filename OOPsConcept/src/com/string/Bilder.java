package com.string;

public class Bilder {
	public static void main(String[] args) {
		
	
	String s1="sriman kumar";
	System.out.println(s1.hashCode());
	s1="welcome to java";
	System.out.println(s1.hashCode());
	StringBuilder b1=new StringBuilder("hello");
	System.out.println(b1.capacity());
	System.out.println(b1.hashCode());
	b1=b1.append("welcome to java");
	System.out.println(b1);
	System.out.println(b1.capacity());
	b1=b1.insert(4, " how to run");
	System.out.println(b1);
	b1=b1.replace(3, 9, "sriman");
	System.out.println(b1);
	
	
	b1.delete(0, b1.length());
	b1=new StringBuilder("create iq");
	System.out.println(b1.hashCode());
	b1=new StringBuilder("     hai helll");
	System.out.println(b1.hashCode());
	String b2=b1+"t point";
	System.out.println(b2);
	b1.append(" sriman kumar java iq ");
	System.out.println(b1.hashCode());
	StringBuilder b3=new StringBuilder("  epsam salt how r u");
	
	//System.out.println(b3.reverse());
	String s4=new String(b3);
	System.out.println(s4.trim());
	
	
	
	
	
	
	
System.out.println(b1);
	
	

}
}