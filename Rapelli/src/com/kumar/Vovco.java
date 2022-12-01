package com.kumar;

public class Vovco {
	public static void main(String[] args)
	{
	int counta=0;
	int counte=0;
	int counti=0;
	int counto=0;
	int countu=0;
	String s1="rapelli sriman kumaraa iiiiwelooocomeuuuuu lkokmjnhhygfdeaswerycvnnmikloloouuaaaoooiiieee";
	char[] ch=s1.toCharArray();
	for(int j=0;j<s1.length();j++)
	{
		 if(ch[j]=='a')
		 {
			 counta++;
		 }
		 else if(ch[j]=='e')
		 {
			 counte++;
		 }
		 else if(ch[j]=='i')
		 {
			 counti++;
		 }
		 else if(ch[j]=='o')
		 {
			 counto++;
		 }
		 else if(ch[j]=='u')
		 {
			 countu++;
		 }
		 }
	System.out.println("a repeated "  +counta+ "  times");
	System.out.println("e repeated "  +counte+ "  times");
	System.out.println("i repeated "  +counti+ "  times");
	System.out.println("o repeated "  +counto+ "  times");
	 
	System.out.println("u repeated "  +countu+ "  times");
	
	}
}
