package com.exc1;

import java.nio.charset.UnmappableCharacterException;
import java.util.InputMismatchException;

public class UnresolvedExc {
	public static void main(String[] args) {
		System.out.println("hello hai");
		try {
		System.out.println(10);
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		System.out.println("wr r u");
		
	}

}
