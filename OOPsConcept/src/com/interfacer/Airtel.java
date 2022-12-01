package com.interfacer;

public class Airtel implements Network {

	@Override
	public void callRates() {
		// TODO Auto-generated method stub
		
		System.out.println(Colour.ANSE_BLUE+ " call rates");
	}

	@Override
	public void smsRates() {
		// TODO Auto-generated method stub
		System.out.println(Colour.ANSE_RED+ "sms Rates");
	}

	@Override
	public void dataRates() {
		
		// TODO Auto-generated method stub
		System.out.println(Colour.ANSE_CYAN+ " data rates");
		
	}
	

}
