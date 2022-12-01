package com.innerclasess;
import com.innerclasess.Outer.Inner;

public class Test {
	public static void main(String[] args)
	{
		Outer outer=new Outer();
		//Outer.id=5454;
		outer.printMessage();
		outer.printMessage();
		Outer.Inner innerfunctionality=new Outer().new Inner();
		Outer.Inner ineerfunctionality2= outer.new Inner();
		innerfunctionality.setId(1_45_74);
		innerfunctionality.setMsg("hello every one");
		System.out.println(innerfunctionality.getMsg());
		System.out.println(innerfunctionality.getId());
		
		
		
	}

}
