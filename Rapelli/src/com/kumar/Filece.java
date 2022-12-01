package com.kumar;
import java.io.File;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.EOFException;

public class Filece {
	public static void main(String[] args) throws IOException
	{
		File fl=new File("sriman.txt");
		File fl2=new File("Rapelli.txt");
	     fl.createNewFile();//create new file with name of sriman 
	     fl2.createNewFile();//crearte new file with name of rapelli
	     
	     if(fl.exists())//it tells file is created or not (checks the given file is exist )
	     {
	    	 System.out.println("file fl is created");
	    	 
	     }
	     if(fl2.exists())
	     {
	    	 System.out.println("file fl2 is created");
	     }
	     System.out.println(fl.getAbsolutePath());//gives path
	     System.out.println(fl2.getAbsolutePath());
	     System.out.println(fl.length());//size of the information in file
	     System.out.println(fl2.length());
	     System.out.println(fl.canRead());
	     System.out.println(fl.canWrite());
	}

	
	
}

