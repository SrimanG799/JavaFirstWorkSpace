package com.staticblock;

public class Student {
	int id;
	String name;
	String course;
	static String COLLEGE="TPCE";
	int fee;
	public Student(int id,String name,String course,int fee)
	{
		this.id=id;
		this.name=name;
		
		this.course=course;
		this.fee=fee;
	}
	public Student(int id,String name)

	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println("id         "+id);
		System.out.println("name       "+name);
		System.out.println("course     "+COLLEGE);
		System.out.println("fee        "+fee);
		System.out.println("--------->>>>>>");
	}
	public static void main(String[] args)
	
	
	{
		Student s1=new Student(1,"sriman","ece",35000);
		Student s2=new Student(2,"ramesh","ece",35000);
		Student s3=new Student(3,"vinodh","eee",35000);
		s1.display();
		s2.display();
		s3.display();
		Student s4=new Student(4,"mahesh");
		Student s5=new Student(5,"kumar");
		s4.display();
		s5.display();
		
		
		
		
		
		
	}
}
