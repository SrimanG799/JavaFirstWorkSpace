package com.university;

public class Engineering extends TPCE {
	private String director;
	private String principle;
	private String branch;
	private String name;
	int id;
	public Engineering(String di,String pr,String br,String n,int i)
	{
		director=di;
		principle=pr;
		branch=br;
		name=n;
		id=i;
		
	}
	String getDi()
	{
		return director;
	}
	String getPrinc()
	{
		return principle;
	}
	
		String getBranch()
		{
			return branch;
		}
		String getName()
		{
			return name;
		
	}
		int getId()
		{
			return id;
		}
	public void display()
	{
		System.out.println("<<-----Engineering details--->>");
		System.out.println(getId());
		System.out.println(getName());
		System.out.println(getBranch());
		System.out.println(getPrinc());
		System.out.println(getDi());
		System.out.println(getChair());
		System.out.println(getLoc());
		
	
	}
	
	
	
	

}
