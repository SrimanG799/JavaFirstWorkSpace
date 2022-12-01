package com.iostream;
import java.io.File;
import java.io.IOException;

public class File3 {
	public static void main(String[] args)
	{
	
	
	File f3=new File("D:\\javaWorkspace\\File3.txt");
	try {
		if(f3.createNewFile())
		{
			System.out.println("new file is created nme with File2"  +f3.getName());
		}
		else
		{
			System.out.println("the file is already available " +f3.getName());
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
