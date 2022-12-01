package com.removeHs;


public class Price {
	
	String item;
	int price;
	/**
	 * @param item
	 * @param price
	 */
	public Price(String item, int price) {
		this.item = item;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Price [item=" + item + ", price=" + price + "]";
	}
	public int hashCode()
	{
		int hashcode=0;
		hashcode= price*20;
		hashcode+=item.hashCode();
		
		
		return hashcode;
		
	}
	public boolean equals(Object obj)
	{
		
		
		if(obj instanceof Price)
		{
			Price pp= (Price) obj;
		
		return (pp.item.equals(this.item)&&pp.price==this.price);
	}
		else
		{
			return false;
		}
	
	
	
	
	}
}



