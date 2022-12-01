package com.nuimbersystem;

public class Ternery1
{
public static void main(String [] args)
{
	int a=100;
	int b=100;
	int c=45;
	int result=((a<b)&&(b<c))?a:((b<a)&&(a<c))?b:c;
	System.out.println(result);

}
}