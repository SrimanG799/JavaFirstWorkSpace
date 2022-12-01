package com.university;

public class Pharmacy extends TPCE{
	private String director;
	private String principle;
	private String branch;
	private String name;
	int id;
	public Pharmacy(String di,String pr,String br,String n,int i)
	{
		director=di;
		principle=pr;
		branch=br;
		name=n;
		id=i;
		
	}
	 void display()
	{
		 System.out.println(id);
		 System.out.println(name);
		 System.out.println(branch);
		 System.out.println(principle);
		 System.out.println(director);
		 System.out.println(getChair());
		 System.out.println(getLoc());
		 
		
	}
	

}
