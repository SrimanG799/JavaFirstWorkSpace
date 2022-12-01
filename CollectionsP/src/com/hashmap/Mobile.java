package com.hashmap;

public class Mobile {
	String name;
	int cost;
	
	/**
	 * @param name
	 * @param cost
	 */
	public Mobile(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", cost=" + cost + "]";
	}
	
	

}
