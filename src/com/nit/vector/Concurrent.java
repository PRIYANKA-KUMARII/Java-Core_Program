package com.nit.vector;

import java.util.Vector;

public class Concurrent {
	private Vector<String>cities;
	public Concurrent(Vector<String>cities) {
		super();
		this.cities=cities;
		
	}
	public void run() {
		 try {
			 Thread.sleep(2000);
		 }
		 catch(InterruptedException e) {
			 e.printStackTrace();
		 }
		 cities.add("Goa");
		 
	}
	public void start() {
		// TODO Auto-generated method stub
		
	}
}