package com.marsh;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Unmarshaling {
	public static void main(String[] args) throws JAXBException {
		File f=new File("src//com//marsh//Test.xml");
		JAXBContext jb=JAXBContext.newInstance(Student.class);
		Unmarshaller un=jb.createUnmarshaller();
		Student s=(Student) un.unmarshal(f);
		System.out.println(s);
	}

}
