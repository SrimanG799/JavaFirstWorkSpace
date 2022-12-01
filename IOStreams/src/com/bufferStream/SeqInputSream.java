package com.bufferStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SeqInputSream {
	public static void main(String[] args) throws IOException {
		FileInputStream Fis1=new FileInputStream("D:\\IOFolder\\FileOne.txt");
		
		
		FileInputStream Fis2=new FileInputStream("D:\\IOFolder\\FileTrwo.txt");
		try {
		SequenceInputStream sir1=new SequenceInputStream(Fis1, Fis2);
		
		int j=0;
		while((j=sir1.read())!=-1)
		{
			{
			System.out.print((char)j);
		}
			System.out.print("\n");
			
		}
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		
}
		
		
	}

}
