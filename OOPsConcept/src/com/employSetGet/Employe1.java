package com.employSetGet;

public class Employe1 {
	int id;
	String name;
	String role;
	static String COMP="Tech mahindra";
	int exp;
	int sal;
	
	public Employe1(int id,String name,String role,int exp,int sal)
	{
		this.id=id;
		this.name=name;
		this.role=role;
		this.exp=exp;
		this.sal=sal;
		
	}
	int getId()
	{
		return this.id;
	}
	String getName()
	{
		return name;
	}
	public void display()
	{
		System.out.println("id         "+id);
		System.out.println("name       "+name);
		System.out.println("role       "+role);
		System.out.println("Company    "+COMP);
		System.out.println("exp        "+exp);
		System.out.println("salary      "+sal);
		System.out.println("------->>>>>>>");
		
	}
	public static void main(String[] args)
	{
	
		
		
		
}
	
}


