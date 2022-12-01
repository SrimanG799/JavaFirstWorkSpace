package com.collectionMarsh;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshaling {
	public static void main(String[] args) throws IOException, JAXBException {
		
		File f=new File("CollMarsh.xml");
		//f.createNewFile();
		FileOutputStream fo=new FileOutputStream(f);
		Student s1=new Student("sriman", 1, "java");
		Student s2=new Student("shan", 2, "java");
		Student s3=new  Student("kumar", 3, "java");
	ArrayList A=new ArrayList();
	A.add(s1);
	A.add(s2);
	A.add(s3);
		System.out.println(A);
		JAXBContext j=JAXBContext.newInstance(Student.class);
		Marshaller mar=j.createMarshaller();
		for (Object object : A) {
			
		//fo.write(object.toString().getBytes());
		mar.marshal(object, fo);
		}
		System.out.println("succeas");
		
		
		
		
		
	}

}
