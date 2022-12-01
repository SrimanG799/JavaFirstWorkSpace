package com.employSetGet;

public class DetailsGet {
	
	void getDetails(int ID)
	{

		StudentGet s1=new StudentGet("sriman",1,"java",15);
		StudentGet s2=new StudentGet("shan",2,"java",25);
		StudentGet s3=new StudentGet("kumar",3,"python",30);
		StudentGet s4=new StudentGet("Ravi",4,"c sharp",13);
		StudentGet s5=new StudentGet("megha",5,"j2ee",21);
		StudentGet s6=new StudentGet("sriman",6,"Matlab",26);
		StudentGet s7=new StudentGet("mohan",7,"c++",17);
		StudentGet s8=new StudentGet("sai",8,"c++",16);
		StudentGet[] S= {s1,s2,s3,s4,s5,s6,s7,s8};
		int flag=0;
		for(StudentGet l:S)
		{
			if(l.getId()==ID)
			{
				
				l.fineDetails();
				flag=1;
				
			}
		}
		if(flag==0)
		{
			System.out.println("enter valid id");
		
			
			
			
		}
		
		
	}
	void getDetails(String Name)
	{
		
		StudentGet s1=new StudentGet("sriman",1,"java",15);
		StudentGet s2=new StudentGet("shan",2,"java",25);
		StudentGet s3=new StudentGet("kumar",3,"python",30);
		StudentGet s4=new StudentGet("Ravi",4,"c sharp",13);
		StudentGet s5=new StudentGet("megha",5,"j2ee",21);
		StudentGet s6=new StudentGet("sriman",6,"Matlab",26);
		StudentGet s7=new StudentGet("mohan",7,"c++",17);
		StudentGet s8=new StudentGet("sai",8,"c++",16);
		StudentGet[] S= {s1,s2,s3,s4,s5,s6,s7,s8};
		int flag=0;
		for(StudentGet l:S)
		{
			if(l.getName()==Name)
			{
				
				l.fineDetails();;
				flag=1;
				
			}
		}
			if(flag==0)
			{
				System.out.println("enter valid name");
			}
	
	}
	public static void main(String[] args)
	{
		
		DetailsGet Ds=new DetailsGet();
		Ds.getDetails(9);
		Ds.getDetails("sriman");
		Ds.getDetails("anil");
	}
	
	
	
	
	
	
	
	

}
