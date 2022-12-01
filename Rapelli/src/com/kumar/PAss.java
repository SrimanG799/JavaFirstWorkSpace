package com.kumar;

public class PAss {
	public static void main(String[] args)
	{
	int telugu=78;
	int hindhi=69;
	int english=73;
	int math=74;
	int science=74;
	int social=69;
	if(telugu>=35&&hindhi>=35&&english>=35&&math>=35&&science>=35&&social>=0)
	{
		System.out.println("cleared in all subjects");
		System.out.println("total marks"+"   "+(telugu+hindhi+english+math+science+social) );
		
	}
	else {
		System.out.println("he failed ");
	}
}
}
