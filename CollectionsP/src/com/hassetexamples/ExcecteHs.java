package com.hassetexamples;

import java.util.HashSet;
import java.util.Iterator;

public class ExcecteHs {
	public static void main(String[] args) {
		HashSet H=new HashSet<>();
		H.add("sriman");
		H.add("shan");
		H.add("mahesh");
		H.add("mango");
		H.add(234);
		H.add(100);
		H.add('c');
		H.add('$');
		Iterator itr=H.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
