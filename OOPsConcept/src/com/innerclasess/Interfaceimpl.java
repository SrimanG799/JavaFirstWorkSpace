package com.innerclasess;

public class Interfaceimpl implements OuterInterface {

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	public static void main(String[] args) {
		Interfaceimpl impl=new Interfaceimpl();
		System.out.println(impl.calculate(10, 65));
	}

}
