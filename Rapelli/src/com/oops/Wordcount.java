package com.oops;

import java.util.Scanner;

public class Wordcount {
public static void main(String[] args)
{
	int count=1;//first word is pre count
	System.out.println("enter the string ");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	char[] ch=s.toCharArray();
	for(int i=0;i<s.length()-1;i++)
	{
		if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')//if the condtiotion is true count will increase by 1
		
{
	count++;
}
	}
	System.out.println(count);//after complete loop it will print count value
}
}
