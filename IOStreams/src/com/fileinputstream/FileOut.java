package com.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOut {
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fo1=new FileOutputStream("D:\\IOFolder\\FileTwo");
		String s="out is used to write data into file";
		byte[] b=s.getBytes();
		fo1.write(b);
		fo1.close();
	
	FileInputStream fis1=new FileInputStream("D:\\IOFolder\\FileTwo");
	int i=0;
	while((i=fis1.read())!=-1)
	{
		System.out.print((char)i);
		
	}

}
}