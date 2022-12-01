package com.vari;

public class Days {
	public static void main(String[] args)
	{
	int days=642;
	int year=days/365;
	int week=(days-(year*365))/7;
	int day=days-((year*365)+(week*7));
	System.out.println(year +" year");
	System.out.println(week +" weeks");
	System.out.println(day +" days");
	}
}
