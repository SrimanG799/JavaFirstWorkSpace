package com.concurent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> A=new CopyOnWriteArrayList<>();
		A.add(44);
		A.add(42);
		A.add(65);
		A.add(33);
		A.add(12);
		A.add(14);
		A.add(15);
		A.add(18);
		A.add(19);
		A.add(21);
		A.add(23);
		A.add(46);
		A.add(48);
		Iterator<Integer> itr=A.iterator();
		while(itr.hasNext())
		{
			
			Integer b=itr.next();
			if(b%2!=0)
			{
				A.remove(b);
				System.out.println(b);
			}
			
		}
		System.out.println(A);
	}

}
