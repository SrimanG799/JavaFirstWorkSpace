package com.kumar;

public class countspce {
	public static void main(String[] args)
	{
		int count=1;
		String s1="sri man kum ar ra pe lli";
		char[] s2=s1.toCharArray();
		{
			for(int i=0;i<s2.length;i++)
			{
				if(s2[i]==' '&&s2[i+1]!=' ')
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
