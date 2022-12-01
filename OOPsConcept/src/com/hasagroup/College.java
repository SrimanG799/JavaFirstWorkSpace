package com.hasagroup;

import java.util.Arrays;

public class College {
	ECE[] ece;
	EEE[] eee;
	public College(ECE[] ece, EEE[] eee) {
		super();
		this.ece = ece;
		this.eee = eee;
	}
	@Override
	public String toString() {
		return "College [ece=" + Arrays.toString(ece) + ", eee=" + Arrays.toString(eee) + "]";
	}
	
	
	
	

}
