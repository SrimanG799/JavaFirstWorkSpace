package com.treeset;

public class Student {
	int id;
	String name;
	String course;
	/**
	 * @param id
	 * @param name
	 * @param course
	 */
	public Student(int id, String name, String course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
	

}
