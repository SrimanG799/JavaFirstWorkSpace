package com.objectss;

public class TestMobile {
	public static void main(String[] args) throws CloneNotSupportedException {
		Features f1=new Features("15mp", "4amph", "qulcom");
		Features f2=new Features("13mp", "5amph", "intel");
		Mobile m1=new Mobile("realme", "12000", "c25", f1);
		Mobile m2=new Mobile("moto", "10000", "g2", f2);
		Mobile m3=(Mobile) m1.clone();
		m3.getFeatures().setBattery("3amph");
		System.out.println(m1);
		System.out.println(m3);
		
	}

}
