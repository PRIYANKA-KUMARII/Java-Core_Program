package com.nit.array;

import java.util.ArrayList;
record Customer(Integer custId, String custName, Double custBill) {
	
}

public class ArrayListDemo1 {
public static void main(String [] args) {
	ArrayList<Customer>listOfCustomer=new ArrayList<>();
	listOfCustomer.add(new Customer(111, "Scott", 12000D));
	listOfCustomer.add(new Customer(222,"Smith", 12000D));
	listOfCustomer.add(new Customer(333, "Alen", 12000D));
	listOfCustomer.add(new Customer(444, "John", 12000D));
	listOfCustomer.forEach(System.out::println);
}
}
