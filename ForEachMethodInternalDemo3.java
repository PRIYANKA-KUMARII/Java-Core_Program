package com.nit.Collection_Demo;

import java.util.Vector;

public class ForEachMethodInternalDemo3 {
	public static void main(String [] args) {
		Vector<String>listOfCity= new Vector<>();
		listOfCity.add("Hyderabad");
		 listOfCity.add("Pune");
		 listOfCity.add("Indore");
		 listOfCity.forEach(CITY ->System.out.println(CITY.toUpperCase()));
	}

}
