package com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;



public class TestMar {
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
	Student s1=new Student("sriman", 3, "iqcreatesdd");
	JAXBContext j=JAXBContext.newInstance(Student.class);
	Marshaller m =j.createMarshaller();
	m.marshal(s1, new FileOutputStream("Mavmar.xml"));
	System.out.println("success");
	

}
}