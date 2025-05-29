package com.nit_29May;

import java.util.ArrayList;
import java.util.Collections;

public class Tester 
{
public static void main(String [] args) {
	ArrayList<Product>a=new ArrayList<>();
	a.add(new Product(137,"Samsung", 70000D));
	a.add(new Product (111,"Laptop",50000D));
	a.add(new Product(121,"Phone", 60000d));
	a.add(new Product(131,"Machine", 70000D));
	a.add(new Product(126,"Apple", 60000d));

	Collections.sort(a);
	System.out.println(a);
	}
}

