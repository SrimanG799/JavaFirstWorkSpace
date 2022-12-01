package com.kumar;

public class StaticObj {
	public static void main(String[] args) {someMethod(null);
	}
	
	public static void main(Object [] args) {
		
	}
		public static void someMethod(Object o)
		
		{
			//o.getClass();
			System.out.println("object");
		}
		public static void someMethod(String s) 
		
		{
			
			System.out.println("string");
		}
	}
	


