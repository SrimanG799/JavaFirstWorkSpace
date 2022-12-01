package com.comparatorf;

import java.util.Comparator;

public class NameComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student) o1;
		Student s2=(Student) o2;
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);
	}

}
