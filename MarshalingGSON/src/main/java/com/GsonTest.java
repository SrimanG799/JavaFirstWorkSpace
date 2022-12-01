package com;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class GsonTest {
	public static void main(String[] args) throws IOException {
		Student s1=new Student("sriman", 10, "TkjE");
		Gson gson=new Gson();
		FileWriter fw=new FileWriter("Gson2.json");
		
			
		String output=gson.toJson(s1);
		gson.toJson(s1,fw);
		
		fw.flush();
		fw.close();
		
		System.out.println(output);
		
		
		
		
	}

}
