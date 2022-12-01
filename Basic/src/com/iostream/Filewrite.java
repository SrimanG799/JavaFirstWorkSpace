package com.iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filewrite {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("write content in file");
		String mater=sc.nextLine();
		try {
			FileWriter fwr=new FileWriter("hgFile2.txt");
			fwr.write("this is file handling project create and write a file it is available in java.io.package");
			fwr.write("this is second line in program");
			fwr.write("java is a high level programming language and platform indipendent and robust and secure");
			fwr.write(mater);
			fwr.close();
			System.out.println("successfully wrote int the file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
