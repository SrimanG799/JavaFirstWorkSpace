package com.exc1;

public class Nullpointer {
	String name;
	int id;
	public Nullpointer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Nullpointer [name=" + name + ", id=" + id + "]";
	}
	public static void main(String[] args) {
		Nullpointer n1=new Nullpointer("sriman", 1);
		Nullpointer n2=new Nullpointer("kumar", 2);
		
			Nullpointer n3=null;
			String s="sriman";
			String s2;
		
		
		try
		{
			
		
		System.out.println(n1.toString());
		}
		catch(NullPointerException e1)
		{
			e1.printStackTrace();
		}
		try {
		
		System.out.println(n3.toString());
		}
		catch(NullPointerException e2)
		{
			e2.printStackTrace();
		}
		try
		{
			
		System.out.println(n2.toString());
		}
		catch(NullPointerException e3)
		{
			e3.printStackTrace();
		}
		//System.out.println(s2);
		System.out.println(s);
		
		
	}
	

}
