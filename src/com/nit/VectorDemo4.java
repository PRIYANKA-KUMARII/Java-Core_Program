package com.nit;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo4 {
	public static void main(String [] args) {
		 long startTime= System.currentTimeMillis();
		 ArrayList<Integer>a1=new ArrayList<Integer>();
		 for(int i=0; i<100000;i++) {
			 a1.add(i);
		 }
		 long endTime=System.currentTimeMillis();
			 System.out.println("Total Time taken by ArrayList class:"+(endTime- startTime)+"ms");
			 startTime=System.currentTimeMillis();
			 Vector<Integer>v1=new Vector<Integer>();
			 for(int i=0; i<100000; i++) {
				 v1.add(i);
			 }
			 endTime=System.currentTimeMillis();
			 System.out.println("Total Time taken by vector class:"+(endTime-startTime)+"ms");
			 
			 
			 
		 }
	}


