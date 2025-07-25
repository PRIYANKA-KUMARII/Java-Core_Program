package com.nit.Collection_Demo;

import java.util.Vector;
import java.util.function.Consumer;

public class ForEachMethodInternalDemo2 {
	public static void main(String [] args) {
		 Vector<String>listOfCity= new Vector<>();
		 listOfCity.add("Hyderabad");
		 listOfCity.add("Kolkata");
		 listOfCity.add("Pune");
		 listOfCity.add("Indore");
		 Consumer<String>cons=city ->System.out.println(city.toUpperCase());
		 listOfCity.forEach(cons);
		 
	}

}
