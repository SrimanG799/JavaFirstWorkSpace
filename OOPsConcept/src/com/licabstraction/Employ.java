package com.licabstraction;

public class Employ extends Lic {

	public Employ(int id, String name, String state, String city, int salary,String roll) {
		super(id, name, state, city, roll,salary);
		// TODO Auto-generated constructor stub
	}
	
	void getDetails()
	{
		System.out.println("id  "+id);
		System.out.println(" name  "+name);
		System.out.println(" state  "+state);
		System.out.println(" city    "+city);
	}
	
	
	
		
	

}
