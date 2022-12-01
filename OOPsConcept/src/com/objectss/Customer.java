package com.objectss;

public class Customer implements Cloneable {
	String name;
	String cusId;
	CustomerAddress customerAddress;
	public Customer(String name, String cusId, CustomerAddress customerAddress) {
		super();
		this.name = name;
		this.cusId = cusId;
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", cusId=" + cusId + ", customerAddress=" + customerAddress + "]";
	
	
	
	
	}
}
