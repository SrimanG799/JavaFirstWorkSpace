package com.kumar;

public class Allrev2 {

	public static void main(String[] args)

{
String s1="rapelli sriman kumar welcome to java tutorial";
String[] s2=s1.split(" ");
System.out.println(s2);
for(int i=0;i<=s2.length-1;i++)
{
 String s3=s2[i];
 //System.out.println(s3);
for(int j=s3.length()-1;j>=0;j--)
{
	
	System.out.print(s3.charAt(j)+" ");


}
}
}


}
