package com.kumar;

public class Allrev
{
	public static void main(String[] args)

{
String s1="rapelli sriman kumar welcome to java tutorial";
String[] s2=s1.split(" ");
System.out.println(s2.hashCode());

for(int i=s2.length-1;i>=0;i--)
{
 String s3=s2[i];
 //System.out.println(s3);
for(int j=s3.length()-1;j>=0;j--)
{
	
	System.out.print(s3.charAt(j)+" ");


}
System.out.println(" ");
}
}
}