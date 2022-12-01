package com.abstraction;
import java.util.Random;
public class Randomdemo {
	public static void main(String[] args)
	{	
		double per=85.25;
		Random random=new Random();
		if(random.nextDouble()*100>50)
		{
			System.out.println(" percentage is less than expected results");
		}
		else {
			
			System.out.println(per);
		}
	//double nextDouble=random.nextDouble();
	//System.out.println(nextDouble);

}

}
