package com.abstraction;

public abstract class Network {
	private String company;
	private String chairman;
	private String service;
	public Network(String company, String chairman, String service) {
		super();
		this.company = company;
		this.chairman = chairman;
		this.service = service;
	}
	public  void getDetails()
	{
		System.out.println("-------->>>>>");
		System.out.println("company  "+company);
		System.out.println("charmen   "+chairman);
		System.out.println("service   "+service);
		
	}
	abstract void getOfers();
	
}
	

