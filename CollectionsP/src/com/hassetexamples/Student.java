package com.hassetexamples;

public class Student {
	String name;
	int age;
	String course;
	/**
	 * @param name
	 * @param age
	 * @param course
	 */
	public Student(String name, int age, String course) {
		this.name = name;
		this.age = age;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", course=" + course + "]";
	}
	
	

}
