package com.marsh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Test {
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		Student s1=new Student("Sriman", 1, "iqcreate");
		JAXBContext j=JAXBContext.newInstance(Student.class);
		Marshaller m =j.createMarshaller();
		m.marshal(s1, new FileOutputStream("src//com//marsh//Test.xml"));
		System.out.println("success");
		
	}

}
