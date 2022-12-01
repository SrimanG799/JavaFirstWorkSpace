package com.hasaRealation;

public class Adress {
	String state;
	String dist;
	String mndl;
	String vill;
	String hno;
	Orgadd orga;

	

	public Adress(String state, String dist, String mndl, String vill, String hno, Orgadd orga) {
		super();
		this.state = state;
		this.dist = dist;
		this.mndl = mndl;
		this.vill = vill;
		this.hno = hno;
		this.orga = orga;
	}
		// TODO Auto-generated constructor stub



	@Override
	public String toString() {
		return "Adress [state=" + state + ", dist=" + dist + ", mndl=" + mndl + ", vill=" + vill + ", hno=" + hno
				+ ", orga=" + orga + "]";
	}
	




	}


	
	
	
	
	


