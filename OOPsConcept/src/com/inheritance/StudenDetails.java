package com.inheritance;
 public class StudenDetails {
	public static void main(String[] args)
	{
		//Acces constructor from StudentId class 
	
		
		StudentId s1=new StudentId(01,"ramesh","java","iq",25000);
		StudentId s2=new StudentId(02,"kumar","java","iq",25000);
		StudentId s3=new StudentId(03,"sriman","java","iq",25000);
		
		
	StudentId[] student= {s1,s2,s3};//grouping all students object into StudentId array
	
	
	for(StudentId s:student)//class is a group of objects like array
	{
	
		{
		s.display();
	}
		
		
		
		
	}

}
 }
