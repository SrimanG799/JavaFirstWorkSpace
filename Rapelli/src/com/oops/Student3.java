package com.oops;

public class Student3 {
	int id;
	String name;
	int marks;
	Student3(int i,String n)
	{
		id=i;
		name=n;
	}
	Student3(int i,String n,int mark )
	{
		id=i;
		name=n;
		marks=mark;
		
	}
void display()
{
	System.out.println(id+" "+name+" "+marks);
}
public static void main(String[] args)
{
	Student3 s1=new Student3(111,"kumar");
	Student3 s2=new Student3(112,"sriman");
	Student3 s3=new Student3(113,"sriman",567);
	Student3 s4=new Student3(114,"shannu",486);
	s1.display();
	s2.display();
	s3.display();
	s4.display();
}
}
