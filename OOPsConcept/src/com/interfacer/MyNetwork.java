package com.interfacer;

public class MyNetwork implements Network  {

	@Override
	public void callRates() {
		
		// TODO Auto-generated method stub
		System.out.println(Colour.ANSE_CYAN+"my call rates");
		
	}

	@Override
	public void smsRates() {
		// TODO Auto-generated method stub
		System.out.println(Colour.ANSE_BLUE+" my sms rates");
		
	}

	@Override
	public void dataRates() {
		System.out.println("my data rates");
		// TODO Auto-generated method stub
		
	}
	

}
