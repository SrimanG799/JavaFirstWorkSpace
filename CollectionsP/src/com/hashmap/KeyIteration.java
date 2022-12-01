package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class KeyIteration {
	public static void main(String[] args) {
		HashMap<String,String> H=new HashMap<>();
		H.put("hyd", "telagana");
		H.put("vizog", "andrapadesh");
		H.put("mombai", "maharastra");
		H.put("chandighur", "haryana");
		for(String state:H.keySet())
		{
			System.out.println(state);
		}
	
	
	}

}
