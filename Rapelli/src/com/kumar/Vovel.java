package com.kumar;
import java.util.*;

public class Vovel
{
	public static void main(String[] args)
	{
String s1="sriman rapelli you welcomeeeiiouuuoaaa";
int count=0;
char[] ch=s1.toCharArray();
for(int i=0;i<s1.length();i++)
{
	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
{
count++;
}
}
System.out.println(count);
	}
}
