package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap hm=new HashMap<>();
		hm.put(1, "siman");
		hm.put(2, "shan");
		hm.put(3,"kumar");
		hm.put(4,"mahesh");
		hm.put(10, "kumar");
		hm.put(7, "kalyan");
		hm.put(8, "jayanth");
		hm.put(9, "prashanth");
		hm.put(6, "mahesh");
		hm.put(5, "praveen");
		System.out.println(hm);
		Iterator itr=hm.keySet().iterator();
		while(itr.hasNext())
		{
			int key=(int)itr.next();
			System.out.println("key  "+key+"     "+"value  ="+hm.get(key));
		}
		
		
		
		
		
	}

}
