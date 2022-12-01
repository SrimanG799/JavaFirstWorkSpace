package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class HashToSet {
	public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.put(1, "hello");
		h1.put(4,"mango");
		h1.put(3, "orange");
		h1.put(2,"banana");
		HashMap h2=new HashMap();
		h2.put(4,"orioa");
		h2.put(2, "britania");
		h2.put(1, "sapota");
		h2.put(3, "pinaple");
		HashMap H=new HashMap<>();
		H.put(1,h2);
		H.put(2, h1);
		//System.out.println(H);
		HashMap h3=new HashMap();
		h3.put(1, "oppo");
		h3.put(2,"realme");
		h3.put(3, "redmi");
		HashMap h4=new HashMap<>();
		h4.put(1, "oppo");
		h4.put(2, "realme");
		h4.put(3,"redmi");
		HashMap H2=new HashMap<>();
		H2.put(1,h3);
		H2.put(2, h4);
		HashMap H3=new HashMap<>();
		H3.put(1, H);
		H3.put(2, H2);
		H3.putAll(H);
		H3.putAll(H2);
	
		//System.out.println(H3);
		Iterator itr=H3.keySet().iterator();
		while(itr.hasNext())
		{
			int key=(int)itr.next();
			
			System.out.println(H3.get(key));
		}
		
		
		
	}

}
