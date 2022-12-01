package com.iostream;

import java.io.File;

public class Fileinfo {
	public static void main(String[] args)
	{
		File f4=new File("D:\\javaWorkspace\\File4.txt");
		if(f4.exists())
		{
			System.out.println(f4.getName());
			System.out.println(f4.getAbsolutePath());
			System.out.println(f4.canRead());
			System.out.println(f4.canWrite());
			System.out.println(f4.length());
		}
		else
		{
			System.out.println("the file is not exist");
		}
	}

}
