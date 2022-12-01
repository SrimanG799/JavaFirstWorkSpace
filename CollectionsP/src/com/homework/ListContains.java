package com.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListContains {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add("shan");
		v1.add("mohan");
		v1.add("mahesh");
		v1.add("Kumar");
		v1.add("santhosh");
		v1.add("prabhas");
		v1.add("krishna");
		ArrayList A=new ArrayList();
		A.add("shan");
		A.add("krishna");
		System.out.println(v1.containsAll(A));
		
		
	}

}
