package com.licabstraction;

public abstract class Lic {
	int id;
	String name;
	String state;
	String city;
	String roll;
	int salary;
	public Lic(int id, String name, String state, String city,String roll, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.city = city;
		this.salary = salary;
		this.roll=roll;
	}
	String getState()
	{
		return state;
	}
	String getCity()
	{
		return city;
	}
	

}
