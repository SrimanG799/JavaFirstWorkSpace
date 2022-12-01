package com.exception;

public class MisinputException extends Exception {
	String message;

	/**
	 * @param message
	 */
	public MisinputException(String message) {
		super(message);
	}
	

}
