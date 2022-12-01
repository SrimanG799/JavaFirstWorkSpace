package com.interfacer;

public class NetworkApp {

	public static void main(String[] args)
	{
		
		Airtel airtel=new Airtel();
		Jio jio=new Jio();
		airtel.callRates();
		airtel.dataRates();
		airtel.smsRates();
		jio.callRates();
		jio.dataRates();
		jio.smsRates();
		MyNetwork my=new MyNetwork();
		my.callRates();
		my.dataRates();
		my.smsRates();
	}
}

