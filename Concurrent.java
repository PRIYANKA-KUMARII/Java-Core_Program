package com.nit;
import java.util.Iterator;
import java.util.Vector;

public class Concurrent extends Thread {

	private Vector<String>cities;
	
		
	public Concurrent(Vector<String>cities) {
		super();
	
		 this.cities=cities;
	}
		 @Override
		 public void run() {
			  try {
				   Thread.sleep(2000);
			  }
			  catch(InterruptedException e) {
				  e.printStackTrace();
			  
			  }
			  cities.add("Goa");
		 }
	}
	

