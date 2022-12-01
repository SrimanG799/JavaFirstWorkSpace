package com.comparatorf;
import java.util.*;
public class AgeComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student s1=(Student) o1;
		Student s2=(Student) o2;
		if(s1.roll==s2.roll)
	
			return 0;
		if(s1.roll>s2.roll)
			return 1;
		else
			return -1;
		
		
			
		
	
	}

}
