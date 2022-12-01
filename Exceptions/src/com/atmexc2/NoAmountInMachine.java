package com.atmexc2;

public class NoAmountInMachine extends Exception {
	String message;

	/**
	 * @param message
	 */
	public NoAmountInMachine(String message) {
		super(message);
	}
	

}
