package com.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListToVec {
	public static void main(String[] args) {
		Vector V=new Vector<>();
		V.add("sriman");
		V.add("python");
		V.add("c");
		V.add("ruby");
		List L=new ArrayList<>();
		L.add("mango");
		L.add("orange");
		V.addAll(L);
		L.addAll(V);
		V.addAll(L);
		L.addAll(V);
		System.out.println(L);
		System.out.println(V);
		
	
	}

}
