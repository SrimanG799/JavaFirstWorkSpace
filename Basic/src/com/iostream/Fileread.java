package com.iostream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileread {
	public static void main(String[] args)
	{try
	{
		File f5=new File("D:\\javaWorkspace\\File2.txt");
	
			Scanner myReader=new Scanner(f5);
			while(myReader.hasNext())
			{
				String data=myReader.nextLine();
				System.out.println(data);
				//String[] str=data.split(" ");
				//for(int i=str.length-1;i>=0;i--)
				//{
				//	System.out.print(str[i]);
				//}
					
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
