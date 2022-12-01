package com.interfacer;

public class Jio implements Network{

	@Override
	public void callRates() {
		// TODO Auto-generated method stub
		System.out.println(Colour.ANSE_BLUE+"jio call rates");
	}

	@Override
	public void smsRates() {
		// TODO Auto-generated method stub
		System.out.println(Colour.ANSE_CYAN+" jio sms rates");
	}

	@Override
	public void dataRates() {
		// TODO Auto-generated method stub
		System.out.println(Colour.ANSE_RED+"jio data rates");
		
	}

}
