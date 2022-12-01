package com.kumar;

public class Pangram {
	public static void main(String[] args)
	{
		String s="the quick brown  fox jum";
	for(char ch='a';ch<='z';ch++)
	{
		if(s.indexOf(ch)<=0)
		{
			System.out.println("string is not panagram");
		}
		else {
			System.out.println("ia panagram");
		}
	}

}
}