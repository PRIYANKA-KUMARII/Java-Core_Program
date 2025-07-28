package com.nit.vector;

import java.util.Iterator;
import java.util.Vector;

public class VecorDemo8 {
	public static void main(String [] args) throws InterruptedException{
		 Vector<String >listOfCity= new Vector<>();
		 listOfCity.add("Surat");
		 listOfCity.add("Pune");
		 listOfCity.add("Ahmadabad");
		 listOfCity.add("Vanaras");
		 listOfCity.add("Hyderabad");
		 Concurrent cons= new Concurrent(listOfCity);
		 cons.start();
		 Iterator<String>itr= listOfCity.iterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
	}

}
