package com.homework;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class RemoveItr {
	public static void main(String[] args) {
		ArrayList A=new ArrayList();
		A.add("sriman");
		A.add("shan");
		A.add("kumar");
		A.add("mahesh");
		A.add("mango");
		A.add("orange");
		A.add("sapota");
		Object b="mango";
		java.util.Iterator itg= A.iterator();
		while(itg.hasNext())
		{
			if(b.equals(itg.next()))
			{
				itg.remove();
				//A.remove(itg.next());
			}
		}
		System.out.println(A);
			
		

	}

}
