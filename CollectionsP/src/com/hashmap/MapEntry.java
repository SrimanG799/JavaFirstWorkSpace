package com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {
	public static void main(String[] args) {
		Map<String,Float> m=new HashMap();
		m.put("banan",35.5f);
		m.put("apple", 44.32f);
		m.put("mango",12.36f);
		m.put("sapota", 33.21f);
		
		for(Map.Entry<String,Float> res:m.entrySet())
		{
			System.out.println(res.getKey()+" ++>> "+res.getValue());
		}
		
		Set<Entry<String, Float>> res2=m.entrySet();
		for (Entry<String, Float> entry : res2) {
			System.out.println(entry.getKey()+"===>>> "+entry.getValue());
			
		}
		
	}

}
