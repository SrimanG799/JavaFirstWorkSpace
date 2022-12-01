package com.hasObj;

public class Student {
	String name;
	int id;
	String course;
	/**
	 * @param name
	 * @param id
	 * @param course
	 */
	public Student(String name, int id, String course) {
		this.name = name;
		this.id = id;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", course=" + course + "]";
	}
	

}
