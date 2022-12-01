package com.oops;

public class This {
	int x=10;
	int y=20;
	int z=30;
	void display()
	{
		int x=15;
		int y=25;
		int z=35;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(this.z);
	}
	/*{
	System.out.println(x);
	System.out.println(y);
	}*/
public static void main(String[] args)
{
	This th=new This();
	th.display();

}
}
