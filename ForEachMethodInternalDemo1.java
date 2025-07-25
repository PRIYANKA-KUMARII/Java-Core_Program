package com.nit.Collection_Demo;

import java.util.Vector;
import java.util.function.Consumer;

public class ForEachMethodInternalDemo1 {
	public static void main(String [] args) {
		Vector<String>listOfCity= new Vector<>();
		listOfCity.add("Kolkata");
		listOfCity.add("Pune");
		listOfCity.add("Indore");
		Consumer<String>cons= new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t.toUpperCase());
			}
				
			};
			listOfCity.forEach(cons);
			
		}
		
	}



