package com.basictest;

import org.junit.Test;

import com.basic.Calculator;

import junit.framework.Assert;

public class CalculatorTest {
	Calculator cal=new Calculator();
	@Test
	public void test()
	{
		int result=cal.add(10, 30);
		
org.junit.Assert.assertEquals(40, result);


	}
	@Test 
	public void test2()
	{
		int result2=cal.mul(2, 3);
		org.junit.Assert.assertEquals(6, result2);
	}
	
	

}
