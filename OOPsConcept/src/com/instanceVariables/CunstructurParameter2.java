package com.instanceVariables;

public class CunstructurParameter2 {
	int id;
	String name;
	String course;
	String institute;
	String location;
	double fee;
	
	CunstructurParameter2(int id,String name,String course,String institute,String location,double fee)
	{
		
		
		this.id=id;
		this.name=name;
		this.course=course;
		this.institute=institute;
		this.location=location;
		this.fee=fee;
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(course);
		System.out.println(institute);
		System.out.println(location);
		System.out.println(fee);
		System.out.println("____-_____----_____>>>>");
	}
		
		
	CunstructurParameter2(int id,String name,String location)
	{
		
		this.id=id;
		this.name=name;
		this.location=location;
		
		
		
	}
	public static void main(String[] args)
	{
		CunstructurParameter2 st1=new CunstructurParameter2(1,"sriman","sr nagar");
		CunstructurParameter2 st2=new CunstructurParameter2(2,"sriman","java","create iq","sr nagar",12000);
		CunstructurParameter2 st3=new CunstructurParameter2(3,"kumar","java","create iq","sr nagar",12000);
		st1.display();
		st2.display();
		st3.display();
		
	}
		
		
	


}