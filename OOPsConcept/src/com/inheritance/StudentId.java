package com.inheritance;

public class StudentId {
	String name;
	int id;
	String course;
	String college;
	int fee;
	StudentId(int id,String name,String course,String college,int fee)
	{
		this.id=id;
		this.name=name;
		this.course=course;
		this.college=college;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(course);
		System.out.println(college);
		System.out.println(fee);
	}
	int getId()
	{
		return this.id;
	}
	String getName()
	{
		return name;
	}

	public static void main(String[] args)
	{
		StudentId s1=new StudentId(1,"sriman","java","tpce",25000);
		StudentId s2=new StudentId(2,"kumar","python","iq",30000);
		StudentId s3=new StudentId(3,"shan","c shorp","iq",30000);
		
		
		
		
		
	}
	

}
