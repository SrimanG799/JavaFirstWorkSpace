package com.abstraction;

public class Idea extends Network {
	String recargetype;
	String offer1;
	String offer2;
	String offer3;
	String offer4;

	public Idea(String company, String chairman, String service,String offer1,String offer2,String offer3,String offer4) {
		super(company, chairman, service);
		// TODO Auto-generated constructor stub
		
		this.offer1=offer1;
		this.offer2=offer2;
		this.offer3=offer3;
		this.offer4=offer4;
		
		
	}

	@Override
	void getOfers() {
		super.getDetails();
		
		// TODO Auto-generated method stub
		System.out.println(offer1);
		System.out.println(offer2);
		System.out.println(offer3);
		System.out.println(offer4);
		System.out.println("----------->>>>");
		
		
	}
	

}
