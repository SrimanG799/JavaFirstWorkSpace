package com.hasagroup;

public class CollegeTest {
	public static void main(String[] args) {
		
		ECE s1=new ECE("sriman", 1);
		ECE s2=new ECE("kumar",2);
		ECE s3=new ECE("ravi",3);
		ECE s4=new ECE("shan",4);
		
		ECE[] c= {s1,s2,s3,s4};
		EEE e1=new EEE("mahesh",1);
		EEE e2=new EEE("surya",2);
		EEE e3=new EEE("vashi",3);
		EEE e4=new EEE("vamshi",4);
		EEE[] e= {e1,e2,e3,e4};
		College C=new College(c, e);
		System.out.println(C.toString());
	}

}
