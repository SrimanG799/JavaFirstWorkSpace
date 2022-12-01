package com.hasaRealation;

public class BookTest {
	public static void main(String[] args) {
		Author a1=new Author("sriman");
		Author a2=new Author("phasha");
		Author a3=new Author("kumar");
		Adresss ad1=new Adresss("ts", "knr");
		Adresss ad2=new  Adresss("ts", "hyd");
		Adresss ad3=new  Adresss("ap", "vzk");
		Book b1=new Book("java", 500, a1, ad1);
		Book b2=new Book("python", 510,a2, ad2);
		Book b3=new  Book("c#", 330, a3, ad3);
		System.out.println(b1.toString());
		
	}

}
