package com.refactor;

 class First {
	int i=10;
	public First(int j)
	{
		System.out.println(i);
		this.i=j*10;
		
	}

}
class Second extends First
{

	public Second(int j) {
		super(j);
		// TODO Auto-generated constructor stub
		System.out.println(i);
		this.i=j*20;
	}
	
}
 