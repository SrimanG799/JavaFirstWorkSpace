package com.model;

public class Employe {
	int id;
	String name;
	double salary;
	String location;
	/**
	 * @param id
	 * @param name
	 * @param salary
	 * @param location
	 */
	public Employe() {
		
	}
	public Employe(int id, String name, double salary, String location) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + ", location=" + location + "]";
	}
	public Employe(int id)
	{
		this.id=id;
	}
	
	
	
	
	

}
