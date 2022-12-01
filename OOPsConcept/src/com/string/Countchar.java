package com.string;

public class Countchar {
	public static void main(String[] args)
	{
		int count=0;
		String s1="sriman shan kumar mahesh";
		char[] s2=s1.toCharArray();
		for(int i=0;i<s2.length;i++)
		{
			for(int j=i+1;j<s2.length;j++)
			{
				if(s2[i]==s2[j])
				{
					count++;
					s2[j]=' ';
				}
					System.out.println(s1.charAt(i)+" repeted "+count+"times");
				
			}
		}
	}

}
