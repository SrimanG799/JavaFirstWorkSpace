package com.objectss;

public class CustomerAddress implements Cloneable {
	String city;
	String state;
	public CustomerAddress(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public static void main(String[] args)
	{
		CustomerAddress c1=new CustomerAddress("hyd", "ts");
		CustomerAddress c2=new CustomerAddress("knr","ts");
		
	}
	

}
