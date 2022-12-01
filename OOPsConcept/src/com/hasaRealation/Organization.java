package com.hasaRealation;

public class Organization {
	String campany;
	String empname;
	int empid;
	double salary;
	Adress adress;
	public Organization(String campany, String empname, int empid, double salary, Adress adress) {
		super();
		this.campany = campany;
		this.empname = empname;
		this.empid = empid;
		this.salary = salary;
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Organization [campany=" + campany + ", empname=" + empname + ", empid=" + empid + ", salary=" + salary
				+ ", adress=" + adress + "]";
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}

	
	

}
