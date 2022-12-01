package com.bankexc;

public class InsaficientName extends RuntimeException {
	String message;

	public InsaficientName(String message) {
		super(message);
		
	}
	

}
