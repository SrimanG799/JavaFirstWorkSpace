package com.inheritance;

public class GetByID {
	public void all()
	{

		StudentId s1=new StudentId(1,"sriman","java","tpce",25000);
		StudentId s2=new StudentId(2,"kumar","python","iq",30000);
		StudentId s3=new StudentId(3,"shan","c shorp","iq",30000);
		
		StudentId[] student= {s1,s2,s3};//grouping all students object into StudentId array
		
		
		for(StudentId s:student)//class is a group of objects like array
		{
		
			{
			s.display();
			System.out.println("------->>>>");
		}
		
	}

	
	}
	public void getById(int id)
	{
	

		StudentId s1=new StudentId(1,"sriman","java","tpce",25000);
		StudentId s2=new StudentId(2,"kumar","python","iq",30000);
		StudentId s3=new StudentId(3,"shan","c shorp","iq",30000);
		
		StudentId[] student= {s1,s2,s3};//grouping all students object into StudentId array
		
		
		for(StudentId s:student)//class is a group of objects like array
		{
		if(s.getId()==id)
			{
			
			System.out.println("by id = "+id);
			s.display();
			System.out.println("------>>>>.");
			}
		}
	}
	public void getByname(String name)
	{


		StudentId s1=new StudentId(1,"sriman","java","tpce",25000);
		StudentId s2=new StudentId(2,"kumar","python","iq",30000);
		StudentId s3=new StudentId(3,"shan","c shorp","iq",30000);
		
		StudentId[] student= {s1,s2,s3};//grouping all students object into StudentId array
		
		
		for(StudentId s:student)//class is a group of objects like array
		{
		if(s.getName()==name)
			{
			
			System.out.println("by name = "+name);
			s.display();
			System.out.println("------>>>>.");
			}
		}
		
	}
	public static void main(String[] args)
	{
		GetByID gi=new GetByID();
		gi.all();
		gi.getById(1);
		gi.getByname("sriman");
	}
		
		

			
		
	
	
}
	
	
	
	

