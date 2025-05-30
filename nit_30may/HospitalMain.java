package com.nit_30may;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HospitalMain {

	public static void main(String[] args) {
	
		Hospital_Service hs=new Hospital_Service();
		
		ArrayList t1=new ArrayList();
		t1.add("Cardiac");
		t1.add("ENT");
		t1.add("Ortho");
		
		ArrayList t2=new ArrayList();
		t2.add("Pediatric");
		t2.add("Gastro");
		t2.add("Ortho");
		
		
		int code1=hs.addHospital("Yashoda", t1, "Rahul", 12334, "Hyd");
		int code2=hs.addHospital("Krishna", t2, "Raj", 5678, "Mumbai");
		System.out.println(code1);
		System.out.println(code2);
		HashMap<Integer, String> hd = hs.getHospitals();
		
		 for(Entry<Integer, String> entrySet : hd.entrySet())
		 {
			 System.out.println(entrySet.getKey() +" = "+entrySet.getValue());
		 }
		 
		// Hospital hospitalDetails = hs.getHospitalDetails(code1);
		// System.out.println(hospitalDetails);
	}

}
