package com.fileinputstream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TwoFiles1 {
	public static void main(String[] args) throws IOException {
		
	
	
	File FTwo=new File("D:\\IOFolder\\TwoFil.txt");
	FTwo.createNewFile();
	FileOutputStream fo=new FileOutputStream("D:\\IOFolder\\TwoFil.txt");
	BufferedOutputStream bos=new BufferedOutputStream(fo);
	
	
	FileInputStream Fis1=new FileInputStream("D:\\IOFolder\\FileOne.txt");
	
	
	FileInputStream Fis2=new FileInputStream("D:\\IOFolder\\FileTrwo.txt");
	
	SequenceInputStream sir1=new SequenceInputStream(Fis1, Fis2);
	
	int j=0;
	while((j=sir1.read())!=-1)
	{
		fo.write(j);
	
	}
	}
}
	
	


