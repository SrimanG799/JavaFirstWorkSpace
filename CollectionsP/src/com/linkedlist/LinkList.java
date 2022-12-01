package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkList {
	public static void main(String[] args) {
		
	
	LinkedList LL=new LinkedList<>();
	LL.add("sriman");
	LL.add("kumar");
	LL.add("shan");
	LL.add("mahesh");
	LL.add("mohan");
	LL.add("koti");
	LL.add("rajesh");
	LL.add("ramesh");
	LL.add("umesh");
	System.out.println(LL);
	Iterator itr=LL.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	LinkedList L2=new LinkedList();
	L2.add("shan");
	L2.add("mohan");
	L2.add("koti");
	LinkedList L3=new LinkedList<>();
	L3.add("mango");
	L3.add("sapota");
	L3.add("orange");
	LinkedList L4=new LinkedList<>();
	L4.add("potato");
	L4.add("apple");
	L4.add("sunfower");
	System.out.println(LL.containsAll(L2));
	LinkedList L=new LinkedList();
	L.add(LL);
	L.add(L2);
	L.add(L3);
	L.add(L4);
	System.out.println(L);
	Object[] LA=L.toArray();
	/*System.out.println(LA);
	for(Object o:LA)
	{
		System.out.println(o);
	}*/
	
	//List Li=L2.subList(2, 4);
	List a=L.subList(0,3);
	System.out.println(a);
	
	}
}
