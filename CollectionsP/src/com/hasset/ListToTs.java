package com.hasset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ListToTs {
	public static void main(String[] args) {
		List L=new ArrayList<>();
		L.add("mango");
		L.add("orange");
		L.add("banana");
		L.add("sapota");
		L.add("potato");
		L.add("tamato");
		L.add("tamato");
		L.add("orange");
		L.add("orange");
		L.add("sapota");
		System.out.println(L);
		HashSet H=new HashSet();
		H.addAll(L);
		System.out.println(H);
		TreeSet ts=new TreeSet();
		ts.addAll(L);
		System.out.println(ts);
		System.out.println("with iterator Ts");
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
