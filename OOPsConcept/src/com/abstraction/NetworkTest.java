package com.abstraction;

public class NetworkTest {
	public static void main(String[] args)
	{
		Jio j=new Jio("jio", "ambani", "4g lte", "269 rs 1gb/day+ unlimited calls 28days", "482rs 2gb/day +unlimited calls 58days",  "556rs 1.5gb/d unlimitedcalls 60days","2000rs 2.5gb/day unlimited callas 365days");
		Idea i=new Idea("Idea", "birla", "4g lte","265 rs 1gb/day+ unlimited calls 28days "," 485rs 2gb/day +unlimited calls 58days", "550rs 2gb/day +unlimited calls 58days","2000rs 2.5gb/day unlimited callas 365days");
		//j.getDetails();
		j.getOfers();
		//i.getDetails();
		i.getOfers();
	}

}
