package com.arraylistMarsh;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	int id;
	String name;
	double fee;
	public Student()
	{
		
	}
	/**
	 * @param id
	 * @param name
	 * @param fee
	 */
	public Student(int id, String name, double fee) {
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	@XmlElement
	public int getId() {
		return id;
	}
	@XmlElement
	public String getName() {
		return name;
	}@XmlElement
	public double getFee() {
		return fee;
	}
	
	

}
