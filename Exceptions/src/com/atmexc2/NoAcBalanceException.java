package com.atmexc2;

public class NoAcBalanceException extends Exception {
	String message;

	/**
	 * @param message
	 */
	public NoAcBalanceException(String message) {
		
		super(message);
	}

}
