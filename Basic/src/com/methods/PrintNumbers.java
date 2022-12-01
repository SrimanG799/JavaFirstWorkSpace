package com.methods;

public class PrintNumbers {
	int printNumbers(int a){
		return a;
		
	}
	public static void main(String[] args)
	{
		PrintNumbers pn=new PrintNumbers();
		firstMethod fn=new firstMethod();

		System.out.println(pn.printNumbers(41));
		System.out.println(pn.printNumbers(55));
		System.out.println(fn.printName("sriman","Rapelli"));
		System.out.println(fn.printName("java","programs" ));
	}
	

}
