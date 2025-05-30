package com.nit_30may;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hospital_Service {
	
		  public static HashMap<Integer, String >hospitalMap=new HashMap<>();
			
			public static ArrayList<Hospital> hospitalList=new ArrayList<Hospital>();
			static int code=100;
			public int addHospital(String hospitalName, List<String> listOFTreatment, String contactPerson, int contactNumber,
					String location)
			{
				Hospital obj =new Hospital(hospitalName, listOFTreatment, contactPerson, contactNumber, location);
				obj.setHospitalCode(code++);
				hospitalList.add(obj);
				return obj.getHospitalCode();
			}
		
			public HashMap<Integer,String> getHospitals()
			{
				
				for(Hospital h : hospitalList)
				{
					hospitalMap.put(h.getHospitalCode(), h.getHospitalName());
				}
				return hospitalMap;
			}
			
		
		public Hospital getHospitalDetails(int code) 
		{
			
			for(Hospital h: hospitalList)
			{
				if(code==h.getHospitalCode())
				{
					return h;
				}
			}
			return null;
		}

	

}
