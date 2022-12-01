package com.arraylist;

import java.util.ArrayList;

public class ALMethods {
	public static void main(String[] args) {
		ArrayList A=new ArrayList();
		A.add("sriman");
		A.add("shan");
		A.add("kumar");
		A.add("mahesh");
		A.add("pavan");
		System.out.println(A);
		A.add(1, "santhosh");
		A.add(5,"ramesh");
		A.add(7,"priya");
		A.add(8,"pooja");
	
		System.out.println(A);
		A.remove(5);
		System.out.println(A);
		System.out.println(A.contains("pooja"));
		System.out.println(A.contains("dattu"));
		System.out.println(A.get(5));
		System.out.println(A.indexOf("mahesh"));
		System.out.println(A.isEmpty());
		System.out.println(A.iterator());
		A.set(3, "bahu");
		System.out.println(A);
		System.out.println(A.size());
		//System.out.println(A.spliterator());
		System.out.println(A.subList(3, 8));
		//System.out.println((A.toArray()).toString());
		System.out.println(A);
	Object B[]=	A.toArray();
	for(Object b:B)
	{
		System.out.print(b+"  ");
		
	}
		
	}

}
