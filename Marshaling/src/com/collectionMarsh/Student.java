package com.collectionMarsh;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	String name;
	int id;
	String course;
	/**
	 * @param name
	 * @param id
	 * @param course
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int id, String course) {
		this.name = name;
		this.id = id;
		this.course = course;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@XmlElement
	public String getName() {
		return name;
	}
	@XmlElement
	public int getId() {
		return id;
	}
	@XmlElement
	public String getCourse() {
		return course;
	}
	
	}
	
	
	


