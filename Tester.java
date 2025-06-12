package Comparable_29May;

import java.util.ArrayList;
import java.util.Collections;

public class Tester {
	public static void main(String [] args) {
		ArrayList<Customer> a= new ArrayList<>();
		a.add(new Customer(111,"Dell", 60000d ));
		a.add(new Customer(112, "Hp", 70000d));
		a.add(new Customer(123,"Lenvo", 80000d));
		
		System.out.println("Sorting based on name : ");
		Collections.sort(a, (a1,a2)->a1.getName().compareTo(a2.getName()));
		a.forEach(System.out::println);
		
		System.out.println("Sorting based on Bill : ");
		Collections.sort(a, (a1,a2)->(int)(a1.getBill()-a2.getBill()));
		a.forEach(System.out::println);
		System.out.println("Sorting based on Number : ");
		Collections.sort(a, (a1,a2)->a1.getNumber().compareTo(a2.getNumber()));
		a.forEach(System.out::println);

		
	}

}
