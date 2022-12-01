package com.arrLtoHM;

import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
		
		HashMap H=new HashMap<>();
		H.put(1, new StuClass(5,"siman","java"));
		H.put(2,new StuClass(6, "mahesh", "java"));
		HashMap H2=new HashMap();
		H2.put(1, new StuClass2(10,"ram","python"));
		H2.put(2, new StuClass2(2, "kalyan","python"));
		HashMap HM=new HashMap<>();
		HM.put(1, H);
		HM.put(2,H2);
		System.out.println(HM.toString());
		
		
		

}
}