package com.staticblock;

public class SetGet2 {
	int id;
	String name;
	String course;
	int fee;
	static String COLLEGE="TPCE";
	SetGet2()
	{}
	
		
		
	
	public int setId(int id)
	{
		return this.id=id;
	}
public String setName(String name)
{
	return this.name=name;
}
public String setCourse(String course)
{
	return this.course=course;
}
public int setFee(int fee)
{
	return this.fee=fee;
}
public int getId()
{
	return this.id;
}
public String getName()
{
return this.name;
}
public String getCollege()
{
	return this.COLLEGE;
}

public String getCourse()
{
return this.course;
}
public int getFee()
{
return this.fee;
}

public static void main(String[] args)
{
	SetGet2 st1=new SetGet2();
	st1.setId(1);
	st1.setName("sriman");
	st1.setCourse("java");
	st1.setFee(35000);
	SetGet2 st2=new SetGet2();
	st2.setId(2);
	st2.setName("kumar");
	st2.setCourse("jav");
	st2.setFee(32000);
	System.out.println(st1.getId());
	System.out.println(st1.getName());
	System.out.println(st1.getCourse());
	System.out.println(st1.getCollege());
	System.out.println(st1.getFee());
	System.out.println(st2.getId());
	System.out.println(st2.getName());
	System.out.println(st2.getCourse());
	System.out.println(st2.getCollege());
	System.out.println(st2.getFee());
}
}