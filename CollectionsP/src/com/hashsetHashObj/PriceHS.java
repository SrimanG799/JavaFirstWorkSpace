package com.hashsetHashObj;

import java.util.HashSet;

public class PriceHS {
	public static void main(String[] args) {
		HashSet<Price> Hs=new HashSet<>();
		Hs.add(new Price("mango", 25));
		Hs.add(new Price("orange",20));
		Hs.add(new Price("banana",30));
		Hs.add(new Price("sapota", 26));
		Hs.add(new Price("sapota",26));
		System.out.println(Hs);
		
	}

}
