package com.arraylistMarsh;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

public class ArrayGsTest {
	public static void main(String[] args) throws IOException {
		Student s1=new Student(1, "sriman", 30000);
		Student s2=new Student(2,"kumar",45000);
		Student s3=new Student(3,"shan",50000);
		Student s4=new Student(4,"mahesh",33000);
		ArrayList A=new ArrayList();
		A.add(s1);
		A.add(s2);
		A.add(s3);
		A.add(s4);
		Gson gson=new Gson();
		FileWriter fr=new FileWriter("ArrLGson.json");
		String outp=gson.toJson(A);
		gson.toJson(A,fr);
		fr.flush();
		fr.close();
	}

}
