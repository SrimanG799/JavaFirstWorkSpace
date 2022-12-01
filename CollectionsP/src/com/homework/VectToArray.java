package com.homework;

import java.util.Vector;

public class VectToArray {
	public static void main(String[] args) {
		Vector v=new  Vector();
		v.add("man");
		v.add("ant");
		v.add("ox");
		v.add("fox");
		String [] Vec=new String[v.size()];
		v.toArray(Vec);
		//v.copyInto(Vec);
		for (String string : Vec) {
			System.out.println(string);
		}
	}

}
