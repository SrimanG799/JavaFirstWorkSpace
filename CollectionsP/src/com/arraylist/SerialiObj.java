package com.arraylist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialiObj {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f1=new File("Lisser.txt");
		f1.createNewFile();
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add("sriman");
		a1.add("createiq");
		ArrayList a2=new ArrayList();
		a2.add(2);
		a2.add("kumar");
		a2.add("creatriq");
		ArrayList a3=new ArrayList();
		a3.add(3);
		a3.add("shan");
		a3.add("create iq");
		ArrayList A=new ArrayList();
		A.add(a1);
		A.add(a2);
		A.add(a3);
		FileOutputStream fos=null;
		try
		{
			fos=new FileOutputStream("Lisser.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(A);
			oos.close();
			fos.close();
			System.out.println("success");
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		FileInputStream f2=null;
		try {
			f2=new FileInputStream("Lisser.txt");
			ObjectInputStream ois=new ObjectInputStream(f2);
			A=(ArrayList) ois.readObject();
			
			ois.close();
			f2.close();
			System.out.println(A);
		}
		catch( FileNotFoundException e)
		{
			e.printStackTrace();
	}

	
	}

}
