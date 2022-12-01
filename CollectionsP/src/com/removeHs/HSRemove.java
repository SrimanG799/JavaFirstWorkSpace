package com.removeHs;

import java.util.HashSet;

public class HSRemove {
	public static void main(String[] args) {
		
	
	HashSet<Price>H= new HashSet();
	
	H.add(new Price("mango", 30));
	H.add(new Price("sapota", 25));
	H.add(new Price("potao", 30));
	H.add(new Price("melon", 25));
	System.out.println(H);
	for(Price h:H)
	{
		System.out.println(h);
	}
	System.out.println("after elment remove");
	Price pp=new Price("melon", 55);
	H.remove(pp);
	for(Price p:H)
	{
		System.out.println(p);
	}
	
	
	

}
}
