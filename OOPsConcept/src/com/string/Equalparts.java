
package com.string;

public class Equalparts
{
public static void main(String[] args)

{
	String s1="abcdefghijklmnoplasbhruilshabz";
	int parts=30;
	int n=s1.length();
	String temp[]=new String[parts];
	int ind=0;
	if(n%parts!=0)
	{
		System.out.println("partsion not passible");
		
		
	}
	else
	{
		
	int d=n/parts;
		for(int i=0;i<s1.length();i=i+d)
		{
			temp[ind]=s1.substring(i, i+d);
			
			ind++;
		}
	}
	for(String b:temp)
	{
		System.out.println(b);
	}
}
}