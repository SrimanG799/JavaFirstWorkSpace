package com.exc1;

public class ArrayBound {
	public static void main(String[] args) {
		
	
int[] A= {3,8,0,4,7,3};
try {
System.out.println(A[0]);
System.out.println(A[1]);
System.out.println(A[2]);
System.out.println(A[9]);
}
catch(ArrayIndexOutOfBoundsException e)
{
	e.printStackTrace();
	
}
try {
System.out.println(A[10]);
}
	catch(ArrayIndexOutOfBoundsException e)
	{
		e.printStackTrace();
		
System.out.println(A[3]);
System.out.println(A[4]);

	}
	
}
}