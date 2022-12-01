package com.oops;

public class Student4 //static variable
{
  int id;
  String name;
 static String college="TPCE";
 static String place="warangal";
  Student4(int roll,String sname)
  {
	  id=roll;
	  name=sname;
	  
  }
  void display()
  {
	  System.out.println(id+" "+name+" "+college+" "+place);
  }
  public static void main(String[] args)
  {
	  Student4 s1=new Student4(111,"sriman");
	 Student4 s2=new Student4(112,"kumar");
	 Student4 s3=new Student4(113,"ram");
	 s1.display();
	 s2.display();
	 s3.display();
	 
  }
}
