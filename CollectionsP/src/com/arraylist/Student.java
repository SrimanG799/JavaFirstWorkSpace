package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

//import com.sun.tools.javac.code.Attribute.Array;

public class Student {
	public static void main(String[] args) {
		
		ArrayList Ar=new ArrayList();
		Ar.add(1);
		Ar.add("sriman");
		Ar.add("createiq");
		Ar.add(25000);
		System.out.println(Ar);
		Iterator itr=Ar.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
