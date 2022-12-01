package com.bankexc;

public class BalanceMissmatchException extends RuntimeException {
	String message;
public	BalanceMissmatchException(String message)
{
	super(message);
}
	
}
