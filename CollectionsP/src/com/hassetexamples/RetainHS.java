package com.hassetexamples;

import java.util.HashSet;

public class RetainHS {
	public static void main(String[] args) {
		HashSet H1=new HashSet<>();
		H1.add("sriman");
		H1.add("kumar");
		H1.add("mahesh");
		H1.add("shan");
		H1.add("mango");
		H1.add("sapota");
		H1.add("tamoto");
		H1.add("orange");
		H1.add("potato");
		H1.add("banana");
		HashSet H2=new HashSet<>();
		H2.add("orange");
		H2.add("mango");
		H2.add("potato");
		H2.add("kumar");
		H2.add("car");
		System.out.println(H1);
		System.out.println(H2);
		H1.retainAll(H2);
		System.out.println("after retain all");
		System.out.println(H1);
	}

}
