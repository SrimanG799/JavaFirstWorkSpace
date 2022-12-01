package com.passportInhreritance;

public class Person  extends Passport{
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	private String location;
	public Person(int pasportid,int id,String firstname,String lastname,int age,String location)
	
	{
		
		super(pasportid);
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.age=age;
		this.location=location;
		
	}
	/*public Person(int id,String firstname,String lastname,int age,String location)
	{
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.age=age;
		this.location=location;
	}*/
	public void getBiodata()
	{
		System.out.println(" id   :"+id);
		System.out.println("fullname   :"+firstname+" "+lastname);
		System.out.println("age  :"+age);
		System.out.println("location  :"+location);
	}
	
public 	void applyPassport()
	{
		super.applyPassport();
	}
	

}
