package com.employSetGet;

public class FoodOrder {
	int id;
	String name;
	String item;
	String hotel;
	int price;
	int quant;
	int amount;
	
	public FoodOrder(int id,String name,String item,String hotel,int price,int quant)
	{
		this.id=id;
		this.name=name;
		this.item=item;
		this.hotel=hotel;
		this.price=price;
		this.quant=quant;
		this.amount=price*quant;
	}
	void display()
	{
		System.out.println("---Order Details----");
		System.out.println("id      "+id);
		System.out.println("name     "+name);
		System.out.println("item     "+item);
		System.out.println("hotel     "+hotel);
		System.out.println("price      "+price);
		System.out.println("quant     "+quant);
		System.out.println("amount     "+amount);
		System.out.println("------------->>>>>>>");
	}
public  int getId()
{
	return id;
}
public String getName()
{
	return name;
}
public static void main(String[] args)
{
	
}
		
		
		
		
	

}
