package com.oops;

import javax.sound.midi.SysexMessage;

class Superke {
	int x=10;
	int y=25;
	int z=35;
}

	class Supp extends Superke
	{
		int x=15;
		int y=20;
		int z=30;
		void display()
		{
			int x=5;
			int y=9;
			int z=2;
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			System.out.println(super.x);
			
		}
		
	

	

	public static void main(String[] args)
	{
		Supp sp=new Supp();
		sp.display();
		
	}
	}

	



