package com.bufferStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferFile {
	public static void main(String[] args) throws IOException {
		FileOutputStream fb1=new FileOutputStream("D:\\IOFolder\\BufferFilRW.txt");
		
		BufferedOutputStream os=new BufferedOutputStream(fb1);
		String s="buffer opStream is used to write content in file";
		byte[] b=s.getBytes();
		fb1.write(b);
		fb1.flush();
		fb1.close();
		os.close();
		FileInputStream Fi1=new FileInputStream("D:\\IOFolder\\BufferFilRW.txt");
		BufferedInputStream bis=new BufferedInputStream(Fi1);
		int i=0;
		while((i=Fi1.read())!=-1)
		{
			System.out.print((char)i);
			
		}
			
			
}
}
