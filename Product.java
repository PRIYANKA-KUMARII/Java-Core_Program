package com.nit_29May;

public class Product implements Comparable<Product>{
	private Integer Number;
	private String  Name;
	  private Double  Price;
	  
	  public Product(Integer Number, String Name, Double Price) {
		  this.Number= Number;
		  this.Name=Name;
		  this.Price=Price;
		  
	  }

	@Override
	public String toString() {
		return "Product [Number=" + Number + ", Name=" + Name + ", Price=" + Price + "]\n";
	}

	@Override
	public int compareTo(Product o) {
		
		return this.Name.compareTo(o.Name); //return (int)(this.Price-o.Price);
	}
	

	
}
   