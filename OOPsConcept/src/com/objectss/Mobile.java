package com.objectss;

public class Mobile implements Cloneable
{

	String name;
	String price;
	String model;
	Features features;
	public Mobile(String name, String price, String model,Features features) {
		super();
		this.name = name;
		this.price = price;
		this.model = model;
		this.features=features;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public Features getFeatures() {
		return features;
	}
	public void setFeatures(Features features) {
		this.features = features;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + ", model=" + model + ", features=" + features + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Mobile m=(Mobile) super.clone();
		m.setFeatures((Features)m.getFeatures().clone());
		return m;
		
	}

	}
	

