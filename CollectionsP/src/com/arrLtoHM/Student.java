package com.arrLtoHM;

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
	
	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	//public static String getName() {
	//	return name;
	//}




	public void setName(String name) {
		this.name = name;
	}




	public String getCourse() {
		return course;
	}




	public void setCourse(String course) {
		this.course = course;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}

}
