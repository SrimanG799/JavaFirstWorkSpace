package com.employInheritance;

public class Employe extends Company  {
	String firstName;
	String lastName;
	String role;
	int age;
	int sal;
	
	public Employe(int id,String firstName,String lastName,String role,int age,int sal)
	{
		super(id);
		this.firstName=firstName;
		this.lastName=lastName;
		this.role=role;
		this.age=age;
		this.sal=sal;
	
		// TODO Auto-generated constructor stub
	}

	//Company c=new Company();
	void getDetails()
	{
		System.out.println("------<<<<>>>>------");
	     System.out.println("id     :"+id);
		System.out.println("fullname     :"+firstName+" "+lastName);
		System.out.println("role         :"+role);
		System.out.println("age          :"+age);
		System.out.println("sal          :"+sal);
		System.out.println("company      :"+COMPANY);
		System.out.println("<<<<<___________>>>>>>");
		
	}
	

}
