package com.nuimbersystem;

public class Atnmoney
{
public static void main(String[] args)
{
	int note500=50;
	int note200=50;
	int note100=50;
	long money=(note500*500+note200*200+note100*100);
	System.out.println(money);
	long amount=2800;
	if(money>=amount)
	{
	if(amount>=500)
	{
		int giv500=(int) (amount/500);
		amount=amount-(giv500*500);
		System.out.println(" 500 notes are  "+giv500);
		money=money-(giv500*500);
		
	}
	}
	if(amount>=200)
	{
		int giv200=(int) (amount/200);
		amount=amount-(giv200*200);
		System.out.println(" 200 notes are "+giv200);
		money=money-(giv200*200);
	}
	if(amount>=100)
	{
		int giv100=(int) (amount/100);
		amount=amount-(giv100*100);
		System.out.println(" 100 notes are "+giv100);
		money=money-(giv100*100);
	}
	System.out.println("remain maoney in atm  "+money);
	//System.out.println("remain 500notes"+(note500-giv500));
	}
}


