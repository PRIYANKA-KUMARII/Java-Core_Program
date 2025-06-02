package com.nit2_june;

import java.util.Comparator;
import java.util.TreeSet;

record Product(Integer pid, String name)
{
	public Product{
	if(pid<=0){
		throw new IllegalArgumentException("pid is zero or Negative.");
		
	}
	}
}

public  class ProductTester {
	public static void main(String [] args) {
		
		TreeSet<Product> set=new TreeSet<>((p1,p2)->p1.pid()-p2.pid());
		
		set.add(new Product(333, "Charger"));
		set.add(new Product(888, "Mouse"));
		set.add(new Product(222, "Mobile"));
		set.add(new Product(111, "Laptop"));
		
		System.out.println("Product based one id in ascending order :");
		set.forEach(System.out::println);
		
		
		TreeSet<Product> set2=new TreeSet<Product>((p1,p2)->p2.pid()-p1.pid());
		set2.addAll(set);
		
	    System.out.println("Product based one id in descending order :");
	    set2.forEach(System.out::println);	
	    
	    TreeSet<Product> set3=new TreeSet<Product>((p1,p2)->p1.name().compareTo(p2.name()));
	    set3.addAll(set);
	    System.out.println("Sort based on the name in Alphabetical order :");
	    set3.forEach(System.out::println);
	    
	    Comparator<Product> revByName=(p1,p2)->p2.name().compareTo(p1.name());
	    TreeSet<Product> set4=new TreeSet<Product>(revByName);
	    set4.addAll(set);
	    System.out.println("Sort based on the name in Reverse order :");
	    set4.forEach(System.out::println);
	}
		}

			