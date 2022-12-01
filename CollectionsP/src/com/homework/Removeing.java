package com.homework;

import java.util.ArrayList;
import java.util.Vector;

public class Removeing {
	public static void main(String[] args) {
		ArrayList A=new ArrayList<>();
		A.add("mabo");
		A.add("melon");
		A.add("musk");
		A.add("promo");
		Vector v=new Vector<>();
		v.add("sapota");
		v.add("orange");
		v.add("grape");
		System.out.println(A);
		System.out.println(v);
		A.clear();
		v.clear();
		System.out.println(A);
		System.out.println(v);
		
	}

}
