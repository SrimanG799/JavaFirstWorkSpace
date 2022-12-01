package com.homework;

import java.util.Enumeration;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Vectorr {
	public static void main(String[] args) {
		Vector V=new Vector();
		V.add("sriman");
		V.add("kumar");
		V.add("mahesh");
		V.add("shan");
		V.add("mango");
		V.add("sapota");
		System.out.println(V);
		V.addElement("pineapple");
		V.addElement("watermealon");
		V.addElement("promogranate");
		
		
		//Iterator it=(Iterator) V.iterator();		
		Enumeration E=V.elements();
		while(E.hasMoreElements())
		{
			System.out.println(E.nextElement());
		}
		System.out.println(V.size());
		System.out.println(V.capacity());
		System.out.println(V.contains("mango"));
		
	}

}
