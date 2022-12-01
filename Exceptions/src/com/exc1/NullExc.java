package com.exc1;

public class NullExc {

	String name;
	int id;
	String school;
	/**
	 * @param name
	 * @param id
	 * @param school
	 */
	public NullExc(String name, int id, String school) {
		this.name = name;
		this.id = id;
		this.school = school;
	}
	@Override

	public String toString() {
		try
		{if(this==null)
		{
			throw new NullPointerException();
		}
		
	}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		return "NullExc [name=" + name + ", id=" + id + ", school=" + school + "]";
		}
	public static void main(String[] args)throws NullPointerException
	{
		NullExc s1=new NullExc("sriman", 1, "adarsha");
		NullExc s2=new NullExc("kumar", 2, "adarsha");
		NullExc s3=null;
		NullExc s4=new NullExc("shan", 3, "adarsha");
		NullExc s5=new  NullExc("mahesh", 4, "adarsha");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		try{
			System.out.println(s3.toString());
		}catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		System.out.println(s4.toString());
		System.out.println(s5.toString());
		
	}
	
}
