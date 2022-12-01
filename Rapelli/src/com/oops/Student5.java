package com.oops;

public class Student5 {
	  int id;
	  String name;
	 static String college="TPCE";
	  Student5(int roll,String sname,String college)
	  {
		  id=roll;
		  name=sname;
		  
		  
	  }
	  void display()
	  {
		  System.out.println(id+" "+name+" "+college);
	  }
	  static void change()

	  {
		 college="vgdv";
	  }
		  public static void main(String[] args)
	  
	  {
			  Student5.change();
		  Student5 s1=new Student5(111,"sriman",college);
		 Student5 s2=new Student5(112,"kumar",college);
		 Student5 s3=new Student5(113,"ram",college);
		 
		 s1.display();
		 s2.display();
		 s3.display();
		 
	  }
	}

	


