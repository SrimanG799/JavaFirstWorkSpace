package com.hasset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDupliArray {
	public static void main(String[] args) {
		String[] fruits= {"mango","grape","banana","sapota","orange","mango","orange","grape","sapota"};
		List L=new ArrayList();
		L=Arrays.asList(fruits);
		System.out.println("String Array To List");
		System.out.println(L);
		System.out.println("List To Set");
		Set s=new HashSet();
		s.addAll(L);
		System.out.println(s);
		System.out.println("List To Treeset");
		TreeSet ts=new TreeSet<>();
		ts.addAll(L);
		System.out.println(ts);
		System.out.println("String array to treeset with for each");
		
		
		TreeSet ts2=new TreeSet<>();
		
		for(String f:fruits)
		{
			
			ts2.add(f);
		}
		System.out.println(ts2);
		
		
		
		
	
}

}
