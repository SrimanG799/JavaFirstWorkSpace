package com.bankexc;

public class InsaficientBalanceInSenderAc extends RuntimeException {
	String message;

	/**
	 * @param message
	 */
	public InsaficientBalanceInSenderAc(String message) {
		
	super (message);
	}
	

}
