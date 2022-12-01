package com.oops;

 class Student2 {
	int id;
	String name;
	void display()
	{
		System.out.println("id ="+id+"  " +"name ="+name);//it will display values from constructor 
	}
	Student2(int i,String n)//take values from object in the form of i,n and assign to the class variables id,name;
	{
		id=i;//i , n are constructor variables used for take input from object 
		name=n;
	}
public static void main(String[] args)
{
	 Student2 s1=new  Student2(111,"sriman");
	Student2 s2=new Student2(121,"kumar");

	s1.display();
	s2.display();

}
}
