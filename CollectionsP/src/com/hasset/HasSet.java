package com.hasset;

import java.util.Collections;
import java.util.HashSet;

public class HasSet {
	
	public static void main(String[] args) {
		HashSet H1=new HashSet();
		H1.add(100);
		H1.add("sriman");
		H1.add("3434");
		H1.add(784);
		H1.add(996);
		H1.add(985);
		H1.add("mahesh");
		H1.add("kumar");
		H1.add(16);
		H1.add(32);
		H1.add(64);
		H1.add(66);
		System.out.println(H1);
	
	System.out.println(H1.hashCode());

	}

}
