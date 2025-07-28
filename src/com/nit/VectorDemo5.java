package com.nit;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorDemo5 {
	public static void main(String [] args) {
		 Vector<String>listOfCity=new Vector<>();
		 listOfCity.add("Surat");
		 listOfCity.add("Pune");
		 listOfCity.add("Ahmadabad");
		 listOfCity.add("Vanaras");
		 Collections.sort(listOfCity);
		 listOfCity.forEach(System.out::println);
		 System.out.println("------------------------");
		 Vector<Integer>listOfNumbers=new Vector<>();
		 listOfNumbers.add(4000);
		 listOfNumbers.add(50000);
		 listOfNumbers.add(6000);
		 listOfNumbers.add(5000);
		 listOfNumbers.add(200);
		 listOfNumbers.add(400);
		 System.out.println("Original Data....");
		 System.out.println(listOfNumbers);
		 
		 System.out.println("Ascending order............");
		 Collections.sort(listOfNumbers);
		 System.out.println("Descending Order................");
		 
		 Collections.sort(listOfNumbers, Collections.reverseOrder());
		 System.out.println(listOfNumbers);
		 Vector<String>listOfFruits= new Vector<>();
		 listOfFruits.add("Orange");
		 listOfFruits.add("Mango");
		 listOfFruits.add("Orange");
		 Object[]fruits=listOfFruits.toArray();
		 System.out.println(Arrays.toString(fruits));
		 
	}

}
