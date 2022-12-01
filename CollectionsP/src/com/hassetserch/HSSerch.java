package com.hassetserch;

import java.util.HashSet;

public class HSSerch {
	
	public static void main(String[] args) {
		HashSet<Price> H1=new HashSet<>();
		H1.add(new Price("mango", 26));
		H1.add(new Price("orange", 30));
		H1.add(new Price("sapota", 20));
		H1.add(new Price("banana", 45));
		H1.add(new Price("grapes", 30));
		for(Price h:H1)
		{
			System.out.println(h);
		}
		Price key=new Price("orange", 30);
		System.out.println("does set contains key    "+H1.contains(key));
	}

}
