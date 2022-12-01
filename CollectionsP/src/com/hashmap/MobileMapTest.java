package com.hashmap;

import java.util.HashMap;

public class MobileMapTest {
	public static void main(String[] args) {
		HashMap<Integer,Mobile> H=new HashMap<>();
		H.put(1,new Mobile("oppo",65000) );
		H.put(2,new Mobile("relme",7000) );
		H.put(3, new Mobile("moto",68000));
		System.out.println(H);
	}

}
