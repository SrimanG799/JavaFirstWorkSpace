
package com.oops;
import java.util.Scanner;
public class Dupliwords {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to count");
		String s=sc.nextLine();
		String[] str=s.split(" ");//splits string into string array
		String r=" ";
		//int count=0;
		for(int i=0;i<str.length;i++)
		{
			
		r=str[i];//r stores each word from the string array as string respect to i valuue
		for(int j=r.length()-1;j>=0;j--)//loop iterates elements from string r respect to j
		{
		System.out.print(r.charAt(j));//prints charector from string r respect to j index 
	
		}
		System.out.print(" ");//after complete one r string reverse it prints space space for word to word
			
	}

}}
