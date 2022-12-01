package com.instanceVariables;

public class CunstructurParameter {
	int id;
	String name;
	String course;
	String institute;
	double fee;
	String location;
	public CunstructurParameter(int id,String name,String course,String institute,double fee,String location)
	//parameter constructor
	{
		this.id=id;
		this.name=name;
		this.course=course;//assign values to the instance variables from constructor parameter
		this.institute=institute;
		this.fee=fee;
		this.location=location;
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(course);
		System.out.println(institute);
		System.out.println(fee);
		System.out.println(location);
		System.out.println("----------->>>>>");
	}
	
	public static void main(String[] args)
	
	{
		CunstructurParameter st1=new CunstructurParameter(1,"sriman","java","create iq",25000,"sr nagar");
		CunstructurParameter st2=new CunstructurParameter(2,"kumar","java","create iq",25000,"sr nagar");
		CunstructurParameter st3=new CunstructurParameter(3,"phasha","java","create iq",25000,"sr nagar");
		CunstructurParameter st4=new CunstructurParameter(4,"pooja","java","crete iq",25000,"sr nagar");
		st1.display();
		st2.display();
		st3.display();
		st4.display();
		
		
		
		
	}
	

}
