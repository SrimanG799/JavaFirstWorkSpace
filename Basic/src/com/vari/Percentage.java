package com.vari;

public class Percentage {
	public static void main(String[] args)
	{
		int telugu=78;
		int hindhi=87;
		int english=68;
		int maths=88;
		int science=86;
		int social=87;
		double total=telugu+hindhi+english+maths+science+social;
		double average=total/6;
		double percentage=(total/600)*100;
		System.out.println(total);
		System.out.println(average);
		System.out.println(percentage);
	}

}
