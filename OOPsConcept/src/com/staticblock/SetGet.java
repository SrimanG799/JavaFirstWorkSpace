package com.staticblock;

public class SetGet {
	int id;
	String name;
	String course;
	static String COLLEGE="TPCE";



public SetGet(int id,String name,String course )
{
	
	this.id=id;
	this.name=name;
	this.course=course;
	
}
    public int getId()
    {
    	return id;
    }
   public  String getName()
    {
    	return name;
    }
   public  String getCourse()
    {
    	return course;
    }
   public String getCollege()
    {
    	return COLLEGE;
    }
    public static void main(String[] args)
    {
    	SetGet s1=new SetGet(1,"sriman","ece");
    	SetGet s2=new SetGet(2,"kumar","eee");
    	System.out.println(s1.getId());
    	System.out.println(s1.getName());
    	System.out.println(s1.getCourse());
    	System.out.println(s1.getCollege());
    	System.out.println(s2.getId());
    	System.out.println(s2.getName());
    	System.out.println(s2.getCourse());
    	System.out.println(s2.getCollege());
    	
    	
    	
    	
    	
    	
    	
    	
    }
    	
    }

