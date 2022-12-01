package com.marsh;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlElement;

@XmlRootElement
public class Student {
	String name;
	int id;
	String school;
	public Student()
	{
		
	}
	
	/**
	 * @param name
	 * @param id
	 * @param school
	 */
	public Student(String name, int id, String school) {
		this.name = name;
		this.id = id;
		this.school = school;
	}
@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@XmlElement
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", school=" + school + "]";
	}
}