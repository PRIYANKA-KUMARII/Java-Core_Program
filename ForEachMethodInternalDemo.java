package com.nit.Collection_Demo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;
import java.util.function.Consumer;

public class ForEachMethodInternalDemo {
	public static void main(String [] args) {
		 Vector<String>listOfCity= new Vector<>();
		 listOfCity.add("Hyderabad");
		 listOfCity.add("Pune");
		 listOfCity.add("Kolkata");
		 listOfCity.add("Indore");
		 listOfCity.add("Haryana");
		 listOfCity.add("Mumbai");
		 System.out.println("By using 1(toString () Method:");
		 System.out.println(listOfCity.toString());
		 System.out.println("By using 2)Ordinary For Loop:");
		  for(int i=0; i<listOfCity.size(); i++) {
			  System.out.println(listOfCity.get(i));
			  for(String city: listOfCity)
			  {
				  System.out.println("By using 4)Enumeration Interface:");
				  Enumeration<String>elements= listOfCity.elements();
				  while(elements.hasMoreElements()) {
					   System.out.println("By using 5)Iterator Interface:");
					   Iterator<String>itr= listOfCity.iterator();
					   itr.forEachRemaining(City ->System.out.println(city));
					   System.out.println("By using 6) ListIterator Interface:");
					    ListIterator<String>listItr= listOfCity.listIterator();
					    System.out.println("In Forward Direction:");
					    while(listItr.hasNext());
					    {
					    	 System.out.println(listItr.next());
					    }
					    System.out.println("In Backward Direction:");
					    while(listItr.hasPrevious()) {
					    	System.out.println(listItr.previous());
					    }
					    System.out.println(listItr.previous());
				  }
				  System.out.println("By using7)for each method:");
				  listOfCity.forEach(CITY ->System.out.println(CITY));
				  System.out.println("By using 8)Spliterator interface:");
				  Spliterator<String>spliterator= listOfCity.spliterator();
				  spliterator.forEachRemaining(CITY->System.out.println(city));
				  System.out.println("By using 9)Method Reference:");
				  listOfCity.forEach(System.out::println);
				  System.out.println("By usinf 10)Method Refernce:");
				  listOfCity.stream().forEach(System.out::println);
				  
					    	
					    }
					    
					   
		  }
	}
}

				  
		