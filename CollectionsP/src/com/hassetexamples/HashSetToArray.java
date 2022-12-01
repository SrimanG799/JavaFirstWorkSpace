package com.hassetexamples;

import java.util.HashSet;

public class HashSetToArray {
	public static void main(String[] args) {
		HashSet H2=new HashSet<>();
		H2.add("mango");
		H2.add("orange");
		H2.add("apple");
		H2.add("salt");
		H2.add("banana");
		H2.add("potato");
		System.out.println("Hashset elements ");
		System.out.println(H2);
		String[] HStArr=new String[H2.size()];
		H2.toArray(HStArr);
		System.out.println("---------copied array----------------");
		for (String s : HStArr) {
			
			System.out.println(s);
			
			
			
		}
	}

}
