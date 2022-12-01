package com.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentTree {
	public static void main(String[] args) {
		TreeSet <Student>Ts=new TreeSet(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.id-o2.id;
			}
		});
		Ts.add(new Student(1, "sriman", "java"));
		Ts.add(new Student(2, "shan", "python"));
		Ts.add(new Student(3, "mahesh", "java"));
		
		
		System.out.println(Ts);
		
	}

}
