package com.oops;

public class Thisdemo 
{
	
	
		
	
String name="sriman";
int id=45;
String course="java";
void demo()
{
	String name="kumar";
	int id=36;
	String course="python";
	System.out.println(this.name);
	System.out.println(this.id);
	System.out.println(this.course);
	System.out.println(this.id+id);
	System.out.println(name);
	System.out.println(id);
}
public static void main(String[] args)
{
	Thisdemo td = new Thisdemo();
	
	td.demo();
}

}
