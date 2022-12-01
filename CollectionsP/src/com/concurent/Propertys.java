package com.concurent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertys {
	public static void main(String[] args) throws IOException {
		
	
	File f=new File("Property.txt") ;
    f.createNewFile();
    Properties p=new Properties();
    p.load(new FileInputStream("Property.txt"));
    System.out.println(" driver  " +p.getProperty("driver"));
    System.out.println("username  "+p.getProperty("username"));
    
    
    
    

}
}
