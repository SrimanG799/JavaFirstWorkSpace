package com.kumar;

import java.io.FileWriter;
import java.io.IOException;

public class FileWr {
	public static void main(String[] args) throws IOException
	{
		FileWriter flw=new FileWriter("D:\\JavaWorkspace\\Rapelli\\sriman.txt");
		flw.write("welcome to the filw writer class is used to create file 4774774");
		flw.write("second line of ececution");
		flw.close();
		System.out.println("success fully writen in the file");

	}

}
