package com.hasObj;

import java.util.HashSet;
import java.util.Iterator;



public class StudentHash {
	public static void main(String[] args) {
		Student s1=new Student("sriman", 1, "java");
		Student s2=new Student("kumar", 2, "python");
		Student s3=new Student("sravani",3 , "c#");
		Student s4=new Student("shan", 4, "js native");
		Student s5=new Student("mahesh",5,"react js");
		Student s6=new Student("mahesh",5,"react js");
		HashSet H=new HashSet();
		H.add(s1);
		H.add(s2);
		H.add(s3);
		H.add(s4);
		H.add(s5);
		Iterator itr=H.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
