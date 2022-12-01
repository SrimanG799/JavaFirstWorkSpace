package com.hasaRealation;

public class Book {
	String name;
	int price;
	Author author;
	Adresss adress;
	public Book(String name, int price, Author author, Adresss adress) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + ", adress=" + adress + "]";
	}
	
	

}
