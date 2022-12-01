package com.string;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Joiner {
	public static void main(String[] args) {
		String str="hello word welcome to java";
		System.out.println("original  "+str);
		System.out.println("modifiaction String");
		StringTokenizer st=new StringTokenizer(str," ");
		System.out.println(st.toString());
		StringJoiner sj=new StringJoiner(" ");
		StringBuffer sb=null;
		while(st.hasMoreElements())
		{
			 sb=new StringBuffer(st.nextToken()).reverse();
		
		//code to first letter upper
		String first_letter=sb.substring(0, 1).toUpperCase();
		String remaining=sb.substring(1).toLowerCase();
		String s=first_letter+remaining;
		sj.add(s);
	}
	System.out.println(sj.toString());


}}
