package com.homework;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TestList {
	public static void main(String[] args) {
		ArrayList A=new ArrayList();
		        A.add(new Student(1, "sriman", "iq"));
				A.add(new Student(2, "shan", "iq"));
				A.add(new Student(3, "mahesh", "iq"));
				System.out.println(A);
				//Iterator itr=(Iterator) A.iterator();
				for (Object object : A)
				{
                            System.out.println(object.toString());					
				}
	}

}
