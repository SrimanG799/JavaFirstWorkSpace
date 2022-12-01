package com.hassetexamples;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetCopy {
	public static void main(String[] args) {
		HashSet Hs=new HashSet<>();
		Hs.add("first");
		Hs.add("second");
		Hs.add("third");
		Iterator itr=Hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Student s1=new Student("sriman", 26, "java");
		Student s2=new Student("kumar", 27, "java");
		HashSet H=new HashSet<>();
		H.addAll(Hs);
		H.add(s1);
		H.add(s2);
		Iterator itr2=H.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		System.out.println(H);
		
	}

}
