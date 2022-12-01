package com.arrLtoHM;

import java.util.ArrayList;

public class StuClass {
	public StuClass(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
	}


		// TODO Auto-generated constructor stub
	

	public static void main(String[] args) {
		ArrayList<Student>Ar=new ArrayList();
		Ar.add(new Student(1, "sriman", "java"));
		Ar.add(new Student(2, "mahesh", "java"));
		System.out.println(Ar);
	}

	@Override
	public String toString() {
		return "StuClass []";
	}
	

}
