package com.fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIn {
	public static void main(String[] args) throws IOException {
		File f1=new File("D:\\IOFolder\\BankDemo.txt");
		
		FileInputStream fis1=new FileInputStream(f1);
		int i=0;
		while((i=fis1.read())!=-1)
		{
			System.out.print((char)i);
			
		}
	}

}

