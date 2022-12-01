package com.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrL {
	
	public static void main(String[] args) {
		ArrayList A=new ArrayList();
		A.add("sriman");
		A.add("kumar");
		A.add("shan");
		A.add("mahesh");
		A.add("mango");
		A.add("apple");
		java.util.Iterator itr= A.iterator();//iterator
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Object B=new ArrayList();
		
		B=A.clone();//cloning
		System.out.println(B);
		Object[] C=A.toArray();//arraylist to array
		for(Object c:C)

			{
			System.out.println(c);
	        }
		List D=A.subList(1, 4);//sublist
		System.out.println(D);
		
		//swap in arry list
		System.out.println(A);
		Collections.swap(A,2,4);
		System.out.println(A);
		ArrayList E=new ArrayList();//remove all elements
		E=(ArrayList) A.clone();
		System.out.println(E);
		E.removeAll(E);
		System.out.println(E);
		

	}}
