package com.concurent;

import java.util.ArrayList;
import java.util.Iterator;

public class Concurent {
	public static void main(String[] args) {
		ArrayList<Integer> A=new ArrayList<>();
		A.add(456);
		A.add(41);
		A.add(30);
		A.add(32);
		A.add(15);
		A.add(14);
		A.add(33);
		A.add(16);
		A.add(8);
		Iterator itr=A.iterator();
		while(itr.hasNext())
		{
			int b=(int) itr.next();//it is bettr to use Integer Wrapper class
     // Integer b=new Integer((int) itr.next());
      
			if(b%2!=0)
			{
				System.out.println(b);
				//A.remove(b);
				
			}
			
		}
		//System.out.println(A);
		
		
	}

}
